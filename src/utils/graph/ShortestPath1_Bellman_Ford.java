package utils.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Bellman-Ford method
 * <p>
 * 単一始点最短路　を探す. 各辺の重みが負でもよい。
 * <p>
 * Time Complexity: O (V x E)
 * <p>
 * 負の閉路の判定もできる。
 */
public class ShortestPath1_Bellman_Ford {

    // number of vertexes
    private int N;

    // 各頂点への最短距離
    public long d[];

    // 負の閉路を含むなら true がセットされる
    public boolean infLoop = false;

    // edges
    private List<Edge> es = new ArrayList<>();

    public long INF = 1_000_000_000_000_000_000L;

    public ShortestPath1_Bellman_Ford(int N) {
        this.N = N;
        this.d = new long[N];
    }

    public void addEdge(int from, int to, long cost) {
        es.add(new Edge(from, to, cost));
    }

    // s から各頂点への最短距離を計算
    public void bellmanFord(int s) {
        int E = es.size();
        Arrays.fill(d, INF);
        d[s] = 0;

        for (int i = 0; i < N; i++) {
            boolean updated = false;
            for (int j = 0; j < E; j++) {
                Edge e = es.get(j);
                if (d[e.from] != INF && d[e.to] > d[e.from] + e.cost) {
                    d[e.to] = d[e.from] + e.cost;
                    updated = true;
                }
            }
            if (!updated) break;
            if (i == N && updated) {
                // N 回目にも更新があるなら負の閉路が存在
                infLoop = true;
            }
        }
    }

    public static void main(String[] args) {
        ShortestPath1_Bellman_Ford bf = new ShortestPath1_Bellman_Ford(7);

        // Undirected Graph
        String costs = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        String[] costE = costs.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int from = c[0].charAt(0) - 'A';
            int to = c[1].charAt(0) - 'A';
            int cost = Integer.parseInt(c[2]);

            bf.addEdge(from, to, cost);
            bf.addEdge(to, from, cost);
        }

        // 解は A -> c -> D -> F -> E -> G で 16
        bf.bellmanFord(0);

        System.out.printf("distances = %s \n", Arrays.toString(bf.d));
        System.out.printf("infLoop exists ? = %s \n", bf.infLoop);
    }

}
