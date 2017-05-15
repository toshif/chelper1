package task1;

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

    private long N;
    private final long D;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

        N = pancakes.GetStackSize();
        D = pancakes.GetNumDiners();

//        N = oops.GetN();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);


        long[] vs = new long[(int)(R - L)];
        for (long i = L; i < R; i++) {
            vs[(int)(i - L)] = pancakes.GetStackItem(i);
        }

        long cnt = 0;
        for (int i = 1; i < vs.length; i++) {
            if (vs[i] < vs[i-1]) cnt++;
        }

        if (L != 0) {
            long l1 = pancakes.GetStackItem(L - 1);
            if (vs[0] < l1) cnt++;
        }

        if (L == 0) {
            cnt++;
        }

        message.PutLL(masterNodeId, cnt);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long tot = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            tot += message.GetLL(i);
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
        Main m = new Main();
        if (m.isMaster()) {
            m.doMaster();
        } else {
            m.doWork();
        }
    }

}
