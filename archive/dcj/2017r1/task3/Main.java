package task3;

import dcj.message;

import java.util.Arrays;
import java.util.List;

public class Main {

    long MOD = 1000000007L;

    /**
     * worker nodes  : 0 .. (numOfNodes-2)
     * master node : numOfNodes-1
     */
    private int numOfNodes;
    private int numOfWorkerNodes;
    private int masterNodeId;
    private int nodeId;

    private long N;
    private final long N1;
    private final long N2;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;


        N1 = todd_and_steven.GetToddLength();
        N2 = todd_and_steven.GetStevenLength();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        for (long i = L; i < R; i++) {
//            long num = oops.GetNumber(i);
        }

//        message.PutLL(masterNodeId, lo);
//        message.PutLL(masterNodeId, hi);
//        message.Send(masterNodeId);
    }

    void doMaster() {
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

//            message.Receive(i);
//            lo = Math.min(lo, message.GetLL(i));
        }
//        System.out.println(hi - lo);
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