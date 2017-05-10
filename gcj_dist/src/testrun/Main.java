package testrun;

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

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

    }

    void doWork() {
        return;
    }

    /**
     * 10^9 loop
     *
     * local RunParallel : 1.7 sec
     * local dcj tool : 1.8 sec
     * server dcj : 1.8 sec
     */
    void doMaster() {
        int x = 1;
        int y = 2;
        for (int i = 0; i < 1000_000_000; i++) {
            x += y;
            y += 100007;
            x *= y;
            y += 23;
        }
        System.out.printf("x=%s, y=%s\n", x, y);
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
