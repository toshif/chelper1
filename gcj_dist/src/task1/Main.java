package task1;

import dcj.message;

public class Main {

    /**
     * worker nodes  : 0 .. (numOfNodes-2)
     * master node : numOfNodes-1
     */
    private int numOfNodes;
    private int masterNodeId;
    private int nodeId;

    static long MOD = 1000000007;

    private long N;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        masterNodeId = 0;

        N = again.GetN();
    }

    void doWork() {
        long i = nodeId;
        long as = 0;
        long bs = 0;
        while (i < N) {
            as += again.GetA(i);
            bs += again.GetB(i);
            as %= MOD;
            bs %= MOD;
            i += numOfNodes;
        }
        message.PutLL(masterNodeId, as);
        message.PutLL(masterNodeId, bs);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long[] aa = new long[numOfNodes];
        long[] bb = new long[numOfNodes];
        for (int i = 0; i < numOfNodes; i++) {
            message.Receive(i);
            aa[i] = message.GetLL(i);
            bb[i] = message.GetLL(i);
        }

        long sum = 0;
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                if ((i + j) % numOfNodes == 0) continue;

                sum += aa[i] * bb[j];
                sum %= MOD;
            }
        }

        System.out.println(sum);
    }


    boolean isMaster() {
        return nodeId == masterNodeId;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.doWork();

        if (m.isMaster()) {
            m.doMaster();
        }
    }

}
