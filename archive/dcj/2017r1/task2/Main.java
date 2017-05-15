package task2;

import dcj.message;

public class Main {

    static long MOD = 1000000007L;

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

//        N = oops.GetN();
        N = weird_editor.GetNumberLength();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        long[] ds = new long[(int) (R - L)];
        for (long i = L; i < R; i++) {
            ds[(int) (i - L)] = weird_editor.GetDigit(i);
        }

        long lb = 0;
        for (int i = 9; i >= 1; i--) {
            if (i != 9) {
                message.Receive(masterNodeId);
                lb = message.GetLL(masterNodeId);
            }
            int start = 0;
            long num = 0;
            long idx = -1;
            if (R <= lb) {
                start = (int) (R - L + 10);
                // num 0, index 0
            } else if (L < lb) {
                start = (int) (lb - L);
            }

            for (int j = start; j < ds.length; j++) {
                if (ds[j] == i) {
                    num++;
                    idx = j + L;
                }
            }

            message.PutLL(masterNodeId, num);
            message.PutLL(masterNodeId, idx);
            message.Send(masterNodeId);

            message.Receive(masterNodeId);
            long offset = message.GetLL(masterNodeId);
            long mo = 0;
            for (int j = 0; j < num; j++) {
                // 10^offset * i MOD
                long v = modPow(10, (int) (N - offset - 1)) % MOD;
                v *= i;
                v %= MOD;
                mo += v;
                mo %= MOD;
                offset++;
            }
            message.PutLL(masterNodeId, mo);
            message.Send(masterNodeId);
        }

    }

    // returns x^y modulo MOD. loops only log2(y) times.
    public static long modPow(int x, int y) {
        long res = 1, a = x;
        while (y > 0) {
            if ((y & 1) > 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            y >>= 1;
        }
        return res;
    }

    void doMaster() {
//        System.err.println("" + (9000000000L % MOD));

        long tmod = 0;
        long tot = 0;
        long cidx = 0;
        for (int a = 9; a >= 1; a--) {
            long[] offset = new long[numOfWorkerNodes];
            for (int i = 0; i < numOfWorkerNodes; i++) {
                if (isEmptyNode(i)) continue;

                message.Receive(i);
                long num = message.GetLL(i);
                long idx = message.GetLL(i);

                offset[i] = tot;

                tot += num;
                if (num != 0) {
                    cidx = idx;
                }
            }

            for (int i = 0; i < numOfWorkerNodes; i++) {
                if (isEmptyNode(i)) continue;

                message.PutLL(i, offset[i]);
                message.Send(i);
            }

            for (int i = 0; i < numOfWorkerNodes; i++) {
                if (isEmptyNode(i)) continue;

                message.Receive(i);
                long mo = message.GetLL(i);
                tmod += mo;
                tmod %= MOD;
            }

            if (a != 1) {
                for (int i = 0; i < numOfWorkerNodes; i++) {
                    if (isEmptyNode(i)) continue;

                    message.PutLL(i, cidx);
                    message.Send(i);
                }
            }
        }


        System.out.println(tmod);
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
