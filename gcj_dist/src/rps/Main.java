package rps;

import java.util.ArrayList;
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

    private long[] rangeLen;
    private long[] rangeLenPrefixSum;

    private long N;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
        numOfWorkerNodes = numOfNodes - 1;
        masterNodeId = numOfNodes - 1;

        if (numOfNodes == 100) {
            numOfWorkerNodes = 64;
        } else {
            numOfWorkerNodes = 8;
        }

        N = (long)Math.pow(2, rps.GetN());

        initRange();
    }

    static class P {
        long id;
        char move;
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange();

        List<P> vs = new ArrayList<>();
        for (long i = range[0]; i < range[1]; i++) {
            char move = rps.GetFavoriteMove(i);

            P p = new P();
            p.id = i;
            p.move = move;
            vs.add(p);
        }

        reduce(vs);

        message.PutLL(masterNodeId, vs.get(0).id);
        message.PutChar(masterNodeId, vs.get(0).move);
        message.Send(masterNodeId);
    }

    List<P> reduce(List<P> vs) {
        while (vs.size() > 1) {
            List<P> next = new ArrayList<>();
            for (int i = 0; i < vs.size(); i += 2) {
                P p1 = vs.get(i);
                P p2 = vs.get(i + 1);

                if (p1.move == 'P' && p2.move == 'S') next.add(p2);
                if (p1.move == 'P' && p2.move == 'R') next.add(p1);
                if (p1.move == 'P' && p2.move == 'P') next.add(p1);
                if (p1.move == 'R' && p2.move == 'S') next.add(p1);
                if (p1.move == 'R' && p2.move == 'R') next.add(p1);
                if (p1.move == 'R' && p2.move == 'P') next.add(p2);
                if (p1.move == 'S' && p2.move == 'S') next.add(p1);
                if (p1.move == 'S' && p2.move == 'R') next.add(p2);
                if (p1.move == 'S' && p2.move == 'P') next.add(p1);
            }
            vs = next;
        }
        return vs;
    }

    void doMaster() {
        List<P> vs = new ArrayList<>();

        for (int i = 0; i < numOfWorkerNodes; i++) {
            if (isEmptyNode(i)) continue;

            message.Receive(i);
            long id = message.GetLL(i);
            char move = message.GetChar(i);

            P p = new P();
            p.id = id;
            p.move = move;
            vs.add(p);
        }

        vs = reduce(vs);

        System.out.println(vs.get(0).id);
    }

    boolean isMaster() {
        return nodeId == masterNodeId;
    }

    boolean isEmptyNode(int nodeId) {
        if (nodeId >= numOfWorkerNodes) return true;
        if (rangeLen[nodeId] == 0) return true;

        return false;
    }

    // the input range for this node. from [0] inclusive to [1] exclusive.
    // if [0] == [1], it's an empty range
    long[] getRange() {
        return getRange(nodeId);
    }

    long[] getRange(int nodeId) {
        return new long[]{rangeLenPrefixSum[nodeId], rangeLenPrefixSum[nodeId] + rangeLen[nodeId]};
    }

    void initRange() {
        rangeLen = new long[numOfWorkerNodes];
        for (int i = 0; i < rangeLen.length; i++) {
            rangeLen[i] = N / numOfWorkerNodes;
        }
        for (int i = 0; i < N % numOfWorkerNodes; i++) {
            rangeLen[i]++;
        }

        rangeLenPrefixSum = new long[numOfWorkerNodes];
        rangeLenPrefixSum[0] = 0;
        for (int i = 1; i < numOfWorkerNodes; i++) {
            rangeLenPrefixSum[i] = rangeLenPrefixSum[i - 1] + rangeLen[i - 1];
        }
    }

    // pseudo random
    static long xorshift64star(long x) {
        x ^= x >> 12;
        x ^= x << 25;
        x ^= x >> 27;
        return x * 0x2545F4914F6CDD1DL;
    }

    // hash : map the given v to a value in [0 .. n-1]
    static int hash(long v, int n) {
        return (int) (Math.abs(xorshift64star(v)) % (long) n);
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
