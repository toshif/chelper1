package utils.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 2部マッチング　を max flow を用いて解く.
 * <p>
 * Created by toshif on 2015/05/10.
 */
public class BipartiteMatching {

    private int V;

    private MaxFlow_FordFulkerson ff;

    // 0: source, 1: target (sink), 2+: other vertexes
    public BipartiteMatching(int V) {
        this.V = V;
        ff = new MaxFlow_FordFulkerson(V);
    }

    public void addEdge(int from, int to) {
        ff.addEdge(from, to, 1);
    }

    // return the max number of matching edges
    public long sovle() {
        ff.solve(0, 1);
        return ff.maxFlow;
    }

    // マッチしたペアの辺のリストを返す
    public List<Edge> getMatchResult() {
        List<Edge> ret = new ArrayList<>();

        List<Edge> flows = ff.getFlowResult();
        for (Edge e : flows) {
            if (e.from != 0 && e.to != 1 && e.val > 0) {
                // not from the sournce and not to the sink
                ret.add(e);
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        // Input: Directed graph
        // 蟻本の例
        String input = "A,D A,E B,D B,F C,E";

        BipartiteMatching bi = new BipartiteMatching(10);

        int offset = 2;
        String[] costE = input.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int p0 = c[0].charAt(0) - 'A' + offset;
            int p1 = c[1].charAt(0) - 'A' + offset;

            bi.addEdge(p0, p1);

            // 作られる graph は undirected でも良い.
            // bi.addEdge(p1, p0);
        }

        // add edges from the source (=0)
        bi.addEdge(0, 2);
        bi.addEdge(0, 3);
        bi.addEdge(0, 4);

        // add edges to the sink (=1)
        bi.addEdge(5, 1);
        bi.addEdge(6, 1);
        bi.addEdge(7, 1);

        // solve it. find the max number of matching edges
        long match = bi.sovle();

        System.out.printf("max num of matching edges = %s\n", match);
        System.out.printf("matching edges = %s\n", bi.getMatchResult());
    }

}
