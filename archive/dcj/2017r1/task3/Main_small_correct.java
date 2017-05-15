package task3;

import dcj.message;

import java.util.Arrays;

public class Main_small_correct {

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

    Main_small_correct() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;


        N1 = todd_and_steven.GetToddLength();
        N2 = todd_and_steven.GetStevenLength();
    }

    void doWork() {

    }

    void doMaster() {

        long[] vs = new long[(int)(N1 + N2)];
        int idx = 0;
        for (int i = 0; i < N1; i++) {
            long v = todd_and_steven.GetToddValue(i);
            vs[idx] = v;
            idx++;
        }
        for (int i = 0; i < N2; i++) {
            long v = todd_and_steven.GetStevenValue(i);
            vs[idx] = v;
            idx++;
        }
        Arrays.sort(vs);
        long sum = 0;
        for (int i = 0; i < vs.length; i++) {
            sum += (i ^ vs[i]);
            sum %= MOD;
        }
        System.out.println(sum);
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
