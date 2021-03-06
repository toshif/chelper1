package utils.graph;

import java.util.Arrays;

/**
 * Time Complexity : O(V^2)
 * Memory Space Complexity : O(V^2)
 * <p>
 * http://en.wikipedia.org/wiki/Dijkstra's_algorithm
 * <p/>
 * 1. 最短距離が確定した頂点に隣接する頂点を更新する
 * 2. 1 で確定した「最短距離が確定した頂点」はもう使わない
 * <p/>
 * O ( V^2 )
 * <p/>
 * <p>
 * 負の辺がある場合には使えない。
 */
public class ShortestPath2_Dijkstra {

    public static final long INF = 1_000_000_000_000_000_000L;

    private int V;

    private long[][] cost;

    // 各頂点への最短距離
    public long[] d;

    public ShortestPath2_Dijkstra(int V) {
        this.V = V;
        cost = new long[V][V];
        d = new long[V];

        // 存在しない path は INF
        for (int i = 0; i < cost.length; i++) {
            Arrays.fill(cost[i], INF);
        }

        Arrays.fill(d, INF);
    }

    public void solve(int s) {
        d[s] = 0;

        boolean[] used = new boolean[V];
        while (true) {
            int v = -1;
            // まだ使われてない頂点のうち、sからの距離が最小のものを探す
            for (int i = 0; i < V; i++) {
                if (!used[i] && (v == -1 || d[i] < d[v])) v = i;
            }

            if (v == -1) break;

            used[v] = true;

            for (int i = 0; i < V; i++) {
                d[i] = Math.min(d[i], d[v] + cost[v][i]);
            }
        }
    }

    public void addEdge(int from, int to, long costVal) {
        cost[from][to] = costVal;
    }

    public static void main(String[] args) {
        // Input: Undirected graph
        // 上の　Dijkstra　は Directed graph にも対応している
        String input = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        ShortestPath2_Dijkstra dj = new ShortestPath2_Dijkstra(7);

        // 存在する path の cost 入力
        String[] costE = input.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int p0 = c[0].charAt(0) - 'A';
            int p1 = c[1].charAt(0) - 'A';
            int cs = Integer.parseInt(c[2]);

            dj.addEdge(p0, p1, cs);
            dj.addEdge(p1, p0, cs);
        }

        // solve it. find the minimum cost from node 0.
        dj.solve(0);

        // 解 (A->Gの最小コスト) は A -> C -> D -> F -> E -> G で 16
        System.out.printf("             [A, B, C, D, E, F, G]\n");
        System.out.printf("dijkstra d = %s\n", Arrays.toString(dj.d));
    }
}
