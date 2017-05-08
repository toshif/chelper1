package lispp;

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

        N = lisp_plus_plus.GetLength();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

//        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        char[] cs = new char[(int) (R - L)];
        for (long i = L; i < R; i++) {
            char c = lisp_plus_plus.GetCharacter(i);
            cs[(int) (i - L)] = c;
        }

        // step 1
        long state = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '(') state++;
            else state--;
        }

        message.PutLL(masterNodeId, state);
        message.Send(masterNodeId);

        // step 2
        message.Receive(masterNodeId);
        long offset = message.GetLL(masterNodeId);
        if (offset < 0) {
            message.PutLL(masterNodeId, -2);
            message.Send(masterNodeId);
            return;
        }

        long max = range[0];
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '(') offset++;
            else offset--;

            if (offset >= 0) {
                max++;
            } else {
                break;
            }
        }
        message.PutLL(masterNodeId, max);
        message.Send(masterNodeId);
    }

    void doMaster() {
        // step 1
        long offset = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.PutLL(i, offset);
            message.Send(i);

            message.Receive(i);
            long state = message.GetLL(i);
            offset += state;
        }

        // step 2
        long ma = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            long v = message.GetLL(i);
            ma = Math.max(ma, v);

            if (v != getRange(i)[1]) {
                break;
            }
        }

        if (ma == N && offset == 0) {
            ma = -1;
        }

        System.out.println(ma);
    }

    boolean isEmptyNode(int nodeId) {
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
