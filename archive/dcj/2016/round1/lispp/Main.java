package lispp;

import dcj.message;

public class Main {

    /**
     * worker nodes  : 0 .. (numOfNodes-2)
     * master node : numOfNodes-1
     */
    private int numOfNodes;
    private int numOfWorkerNodes;
    private int masterNodeId;
    private int nodeId;

    private long[] rangeLen;
    private long[] rangeLenPrefixSum;

    private long N;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

        N = lisp_plus_plus.GetLength();

        initRange();
    }

    void doWork() {
        if (rangeLen[nodeId] == 0) return;

        long[] range = getRange();
        char[] cs = new char[(int) rangeLen[nodeId]];
        for (int i = 0; i < rangeLen[nodeId]; i++) {
            cs[i] = lisp_plus_plus.GetCharacter(range[0] + i);
        }

        // step 1
        long state = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '(') state++;
            else state--;
        }

        message.PutLL(masterNodeId, state);
        message.Send(masterNodeId);

        // step 2
        message.Receive(masterNodeId);
        long offset = message.GetLL(masterNodeId);
        if (offset < 0) {
            message.PutLL(masterNodeId, -2);
            message.Send(masterNodeId);
            return;
        }

        long max = range[0];
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '(') offset++;
            else offset--;

            if (offset >= 0) {
                max++;
            } else {
                break;
            }
        }
        message.PutLL(masterNodeId, max);
        message.Send(masterNodeId);
    }

    void doMaster() {
        // step 1
        long offset = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (rangeLen[i] == 0) continue;

            message.PutLL(i, offset);
            message.Send(i);

            message.Receive(i);
            long state = message.GetLL(i);
            offset += state;
        }

        // step 2
        long ma = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (rangeLen[i] == 0) continue;


            message.Receive(i);
            long v = message.GetLL(i);
            ma = Math.max(ma, v);
        }

        if (ma == N) {
            ma = -1;
        }

        System.out.println(ma);
    }

    boolean isMaster() {
        return nodeId == masterNodeId;
    }

    // the input range for this node. from [0] inclusive to [1] exclusive.
    // if [0] == [1], it's an empty range
    long[] getRange() {
        return getRange(nodeId);
    }

    long[] getRange(int nodeId) {
        return new long[]{rangeLenPrefixSum[nodeId], rangeLenPrefixSum[nodeId] + rangeLen[nodeId]};
    }

    void initRange() {
        rangeLen = new long[numOfWorkerNodes];
        for (int i = 0; i < rangeLen.length; i++) {
            rangeLen[i] = N / numOfWorkerNodes;
        }
        for (int i = 0; i < N % numOfWorkerNodes; i++) {
            rangeLen[i]++;
        }

        rangeLenPrefixSum = new long[numOfWorkerNodes];
        rangeLenPrefixSum[0] = 0;
        for (int i = 1; i < numOfWorkerNodes; i++) {
            rangeLenPrefixSum[i] = rangeLenPrefixSum[i - 1] + rangeLen[i - 1];
        }
    }

    // pseudo random
    static long xorshift64star(long x) {
        x ^= x >> 12;
        x ^= x << 25;
        x ^= x >> 27;
        return x * 0x2545F4914F6CDD1DL;
    }

    // hash : map the given v to a value in [0 .. n-1]
    static int hash(long v, int n) {
        return (int) (Math.abs(xorshift64star(v)) % (long) n);
    }


    public static void main(String[] args) {
        Main m = new Main();
        if (m.isMaster()) {
            m.doMaster();
        } else {
            m.doWork();
        }
    }

}
