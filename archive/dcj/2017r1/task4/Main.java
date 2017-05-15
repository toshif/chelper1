package task4;

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

        N = query_of_death.GetLength();
    }

    void doWork() {
        if (N == 1) return;
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        int retry = 5;
        if (R - L < 1000) {
            retry = 100;
        }

        long[] sums = new long[retry];
        A:
        for (int i = 0; i < retry; i++) {
            long sum = 0;
            for (long j = L; j < R; j++) {
                long v = query_of_death.GetValue(j);
                sum += v;
            }
            sums[i] = sum;
        }

        long broken = 0;
        for (int i = 1; i < retry; i++) {
            if (sums[i] != sums[0]) broken = 1;
        }

        message.PutLL(masterNodeId, sums[0]);
        message.PutLL(masterNodeId, broken);
        message.Send(masterNodeId);

        if (broken > 0) return;

        // step 2
        message.Receive(masterNodeId);
        long L2 = message.GetLL(masterNodeId);
        long R2 = message.GetLL(masterNodeId);

        long[] sum = getSum(L2, R2);
        message.PutLL(masterNodeId, sum[0]);
        message.PutLL(masterNodeId, sum[1]);
        message.PutLL(masterNodeId, sum[2]);
        message.Send(masterNodeId);
    }

    long[] getSum(long L2, long R2) {
        long bIdx = -1;
        long bIdxV = -1;
        long sum = 0;
        B:
        for (long i = L2; i < R2; i++) {
            long v = query_of_death.GetValue(i);
            sum += v;
            for (int j = 0; j < 100; j++) {
                long v2 = query_of_death.GetValue(i);
                if (v != v2) {
                    bIdx = i;
                    bIdxV = v;
                    break B;
                }
            }
        }
        return new long[]{sum, bIdx, bIdxV};
    }

    void doMaster() {
        if (N == 1) {
            System.out.println(query_of_death.GetValue(0));
            return;
        }
        long tot = 0;
        long L2 = 0;
        long R2 = 0;
        int nActive = 0;
        int brokenNode = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            nActive++;

            message.Receive(i);
            long sum = message.GetLL(i);
            long broken = message.GetLL(i);

            if (broken == 0) {
                tot += sum;
            } else {
                brokenNode = i;
                nActive--;

                long[] range = getRange(i);
                L2 = range[0];
                R2 = range[1];
            }
        }

        long N2 = R2 - L2;
        initRange2(N2, nActive);
        int nIdx = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;
            if (brokenNode == i) continue;

            long[] range2 = getRange2(nIdx);
            message.PutLL(i, range2[0]);
            message.PutLL(i, range2[1]);
            message.Send(i);

            nIdx++;
        }

        nIdx = 0;
        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;
            if (brokenNode == i) continue;

            message.Receive(i);
            long sum = message.GetLL(i);
            long bIdx = message.GetLL(i);
            long bIdxV = message.GetLL(i);

            if (bIdx == -1) {
                tot += sum;
            } else {
                long[] range = getRange2(nIdx);
                long L = range[0];
                long R = range[1];

                for (long a = L; a < R; a++) {
                    if (a != bIdx) {
                        long v = query_of_death.GetValue(a);
                        tot += v;
                    } else {
                        tot += bIdxV;
                    }
                }
            }

            nIdx++;
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

    private long[] rangeLen;
    private long[] rangeLenPrefixSum;

    long[] getRange2(int nodeId) {
        return new long[]{rangeLenPrefixSum[nodeId], rangeLenPrefixSum[nodeId] + rangeLen[nodeId]};
    }

    void initRange2(long N2, int activeNodes) {
        rangeLen = new long[activeNodes];
        for (int i = 0; i < rangeLen.length; i++) {
            rangeLen[i] = N2 / activeNodes;
        }
        for (int i = 0; i < N2 % activeNodes; i++) {
            rangeLen[i]++;
        }

        rangeLenPrefixSum = new long[activeNodes];
        rangeLenPrefixSum[0] = 0;
        for (int i = 1; i < activeNodes; i++) {
            rangeLenPrefixSum[i] = rangeLenPrefixSum[i - 1] + rangeLen[i - 1];
        }
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
