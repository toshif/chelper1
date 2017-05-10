package mutexes;

import dcj.message;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * worker nodes  : 0 .. (numOfNodes-2)
     * master node : numOfNodes-1
     */
    private int numOfNodes;
    private int numOfWorkerNodes;
    private int masterNodeId;
    private int nodeId;

    private int N0;
    private int N1;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

        N0 = (int) mutexes.NumberOfOperations(0);
        N1 = (int) mutexes.NumberOfOperations(1);
    }

    int INF = 1_000_000_000;

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        long[] op0 = new long[N0];
        long[] op1 = new long[N1];
        for (int i = 0; i < N0; i++) {
            op0[i] = mutexes.GetOperation(0, i);
        }
        for (int i = 0; i < N1; i++) {
            op1[i] = mutexes.GetOperation(1, i);
        }

        int mi = INF;

        Set<Integer> s0 = new HashSet<>();
        for (long i = 0; i < L; i++) {
            Integer o0 = Integer.valueOf((int) op0[(int)i]);

            if (o0 < 0) {
                s0.remove(o0);
            } else {
                s0.add(o0);
            }
        }

        // 400
        for (long i = L; i < R; i++) {
            Integer o0 = Integer.valueOf((int) op0[(int) i]);

            if (o0 < 0) {
                s0.remove(o0);
                continue;
            }

            // o0 > 0
            Set<Integer> s1 = new HashSet<>();

            // 4 * 10^4
            for (int j = 0; j < N1; j++) {
                Integer o1 = Integer.valueOf((int) op1[j]);

                if (o1 < 0) {
                    s1.remove(o1);
                    continue;
                }

                if (o0 == o1) {
                    s1.add(o1);
                    continue;
                }

                if (s0.contains(o1) && s1.contains(o0)) {
                    mi = Math.min(mi, (int) i + 1 + j + 1);
                    break;
                }

                s1.add(o1);
            }

            s0.add(o0);
        }


        message.PutLL(masterNodeId, mi);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long mi = INF;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            long mil = message.GetLL(i);
            mi = Math.min(mi, mil);
        }

        if (mi == INF) {
            System.out.println("OK");
        } else {
            System.out.println("" + mi);
        }
    }

    boolean isEmptyNode(int nodeId) {
        if (nodeId >= numOfWorkerNodes) return true;
        long[] range = getRange(nodeId);
        return range[0] == range[1];
    }

    long[] getRange(int nodeId) {
        long L = N0 * nodeId / numOfWorkerNodes;
        long R = N0 * (nodeId + 1) / numOfWorkerNodes;
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
