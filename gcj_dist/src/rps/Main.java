package rps;

import dcj.message;

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
    }

    static class P {
        long id;
        char move;
    }

    void doWork() {
        if (isEmptyNode(nodeId)) return;

        long[] range = getRange(nodeId);
        long L = range[0];
        long R = range[1];

        System.err.printf("nodeId=%s, L=%s, R=%s\n", nodeId, L, R);

        List<P> vs = new ArrayList<>();
        for (long i = L; i < R; i++) {
            char move = rps.GetFavoriteMove(i);

            P p = new P();
            p.id = i;
            p.move = move;
            vs.add(p);
        }

        vs = reduce(vs);

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
