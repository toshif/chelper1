package johnny;

import dcj.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        N = johnny.NumberOfCards();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        for (long i = L; i < R; i++) {
            int degree = 0;
            for (int j = 0; j < N; j++) {
                if (johnny.IsBetter(i, j)) {
                    degree++;
                }
            }
            message.PutLL(masterNodeId, degree);
        }

        message.Send(masterNodeId);
    }

    void doMaster() {
        List<Integer> deg = new ArrayList<>();
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            long[] range = getRange(i);
            long L = range[0];
            long R = range[1];

            message.Receive(i);
            for (int j = 0; j < (R - L); j++) {
                deg.add((int)message.GetLL(i));
            }
        }

        Collections.sort(deg);
        Collections.reverse(deg);

//        System.err.printf("deg=%s\n", deg);

        long degSum = 0;
        int ans = -1;
        int k = 0;
        for (int i = 0; i < N - 1; i++) {
            k++;
            degSum += deg.get(i);

            if (2 * degSum == k * (k - 1) + 2 * k * (N - k)) {
                ans = k;
            }
        }

        if (ans == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(ans);
        }
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
