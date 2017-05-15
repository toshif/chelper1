package almost_sorted;

import dcj.message;

import java.util.Arrays;

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

    long MOD = (long)Math.pow(2, 20);

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

        N = almost_sorted.NumberOfFiles();
        D = almost_sorted.MaxDistance();
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        long L2 = Math.max(0, L - D - 5);
        long R2 = Math.min(N, R + D + 5);

        long[] ids = new long[(int)(R2 - L2)];
        int idx = 0;
        for (long i = L2; i < R2; i++) {
            long fid = almost_sorted.Identifier(i);
            ids[idx] = fid;
            idx++;
        }
        Arrays.sort(ids);

        long checksum = 0;

        int offset = (int)(L - L2);
        for (int i = 0; i < R - L; i++) {
            checksum += ids[offset + i] * (L + i);
            checksum %= MOD;
        }

        message.PutLL(masterNodeId, checksum);
        message.Send(masterNodeId);
    }

    void doMaster() {
        long checksum = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            long cs = message.GetLL(i);
            checksum += cs;
            checksum %= MOD;
        }
        System.out.println(checksum);
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
