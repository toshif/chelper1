package utils.graph;

import java.util.Arrays;

/**
 * 全点対最短経路　を求める
 * <p/>
 * O( V^3 )
 * <p/>
 *
 */
public class ShortestPath3_FloydWarshall {

    private int N;

    public static long INF = 1_000_000_000_000_000_000L;

    // 各頂点間の最短距離
    public long d[][];

    public ShortestPath3_FloydWarshall(int N) {
        this.N = N;
        this.d = new long[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(d[i], INF);
            d[i][i] = 0;
        }
    }

    public void floydWarshall() {
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
    }

    public void addEdge(int from, int to, long cost) {
        d[from][to] = cost;
    }

    public static void main(String[] args) {
        ShortestPath3_FloydWarshall fw = new ShortestPath3_FloydWarshall(7);

        // Undirected Graph
        String costs = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        String[] costE = costs.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int p0 = c[0].charAt(0) - 'A';
            int p1 = c[1].charAt(0) - 'A';
            int cs = Integer.parseInt(c[2]);

            fw.addEdge(p0, p1, cs);
            fw.addEdge(p1, p0, cs);
        }

        // 解は A -> c -> D -> F -> E -> G で 16
        fw.floydWarshall();

        System.out.println("floyd warshall");

        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(fw.d[i]));
        }
    }
}
