package template;

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

        N = oops.GetN();

        initRange();
    }

    void doWork() {
        if (rangeLen[nodeId] == 0) return;

        long[] range = getRange();

        long lo = 2000_000_000_000_000_000L;
        long hi = -2000_000_000_000_000_000L;
        for (long i = range[0]; i < range[1]; i++) {
            long num = oops.GetNumber(i);
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
            if (rangeLen[i] == 0) continue;

            message.Receive(i);
            lo = Math.min(lo, message.GetLL(i));
            hi = Math.max(hi, message.GetLL(i));
        }
        System.out.println(hi - lo);
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
            rangeLenPrefixSum[i] = rangeLenPrefixSum[i-1] + rangeLen[i-1];
        }
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
