package task4;

import dcj.message;

public class Main_small_correct {

    /**
     * worker nodes  : 0 .. (numOfNodes-2)
     * master node : numOfNodes-1
     */
    private int numOfNodes;
    private int numOfWorkerNodes;
    private int masterNodeId;
    private int nodeId;

    private long N;

    Main_small_correct() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

        N = query_of_death.GetLength();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        long bIdx = -1;
        long bIdxV = -1;
        long sum = 0;
        A:
        for (long i = L; i < R; i++) {
            long v = query_of_death.GetValue(i);
            sum += v;
            for (int j = 0; j < 100; j++) {
                long v2 = query_of_death.GetValue(i);
                if (v != v2) {
                    bIdx = i;
                    bIdxV = v;
                    break A;
                }
            }
        }

        message.PutLL(masterNodeId, sum);
        message.PutLL(masterNodeId, bIdx);
        message.PutLL(masterNodeId, bIdxV);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long tot = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            long sum = message.GetLL(i);
            long bIdx = message.GetLL(i);
            long bIdxV = message.GetLL(i);

            if (bIdx == -1) {
                tot += sum;
            } else {
                long[] range = getRange(i);
                long L = range[0];
                long R = range[1];

                for (long a = L; a < R; a++) {
                    if (a != bIdx) {
                        long v = query_of_death.GetValue(a);
                        tot += v;
                    } else {
                        tot += bIdxV;
                    }
                }
            }
        }

        System.out.println(tot);
    }

    boolean isEmptyNode(int nodeId) {
        if (nodeId >= numOfWorkerNodes) return true;
        long[] range = getRange(nodeId);
        return range[0] == range[1];
    }

    long[] getRange(int nodeId) {
        long L = N * nodeId / numOfWorkerNodes;
        long R = N * (nodeId + 1) / numOfWorkerNodes;
        return new long[]{L, R};
    }

    boolean isMaster() {
        return nodeId == masterNodeId;
    }

    public static void main(String[] args) {
        Main_small_correct m = new Main_small_correct();
        if (m.isMaster()) {
            m.doMaster();
        } else {
            m.doWork();
        }
    }

}
