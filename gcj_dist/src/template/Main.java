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

//        N = ...
    }

    void doWork() {
        message.PutLL(masterNodeId, 1L);
        message.PutLL(masterNodeId, 5L);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long ma = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            message.Receive(i);
            long lo = message.GetLL(i);
            long hi = message.GetLL(i);
            ma = Math.max(ma, hi - lo);
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
        if (rangeLen == null) {
            long[] rangeLen = new long[numOfWorkerNodes];
            for (int i = 0; i < rangeLen.length; i++) {
                rangeLen[i] = N / numOfWorkerNodes;
            }
            for (int i = 0; i < N % numOfWorkerNodes; i++) {
                rangeLen[i]++;
            }

            long[] rangesPrefixSum = new long[numOfWorkerNodes];
            rangesPrefixSum[0] = 0;
            for (int i = 1; i < numOfWorkerNodes; i++) {
                rangesPrefixSum[i] = rangesPrefixSum[i-1] + rangeLen[i-1];
            }
        }
        return new long[]{rangeLenPrefixSum[nodeId], rangeLenPrefixSum[nodeId] + rangeLen[nodeId]};
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
