package template;

import dcj.message;

public class Main {

    public static boolean TRACE = false;

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

        N = oops.GetN();

        initRange();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long lo = 2000_000_000_000_000_000L;
        long hi = -2000_000_000_000_000_000L;

        long[] range = getRange();
        for (int i = 0; i < rangeLen[nodeId]; i++) {
            long num = oops.GetNumber(range[0] + i);
            lo = Math.min(lo, num);
            hi = Math.max(hi, num);
        }

        message.PutLL(masterNodeId, lo);
        message.PutLL(masterNodeId, hi);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long lo = 2000_000_000_000_000_000L;
        long hi = -2000_000_000_000_000_000L;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            lo = Math.min(lo, message.GetLL(i));
            hi = Math.max(hi, message.GetLL(i));
        }
        System.out.println(hi - lo);
    }

    boolean isMaster() {
        return nodeId == masterNodeId;
    }

    boolean isEmptyNode(int nodeId) {
        if (nodeId >= numOfWorkerNodes) return true;
        if (rangeLen[nodeId] == 0) return true;

        return false;
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

        if ( TRACE ) {
            printRanges();
        }
    }

    void printRanges() {
        if (!isMaster()) return;

        for (int i = 0; i < numOfWorkerNodes; i++) {
            long[] range = getRange(i);
            System.err.printf("node=%s : range [%s, %s)\n", i, range[0], range[1]);
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
