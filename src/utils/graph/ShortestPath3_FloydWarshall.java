package utils.graph;

import java.util.Arrays;

/**
 * 全点対最短経路　を求める
 * <p/>
 * O( V^3 )
 * <p/>
 * Created by toshif on 5/28/14.
 */
public class ShortestPath3_FloydWarshall {

    static int N = 7;

    static int INF = 1_000_000_000;

    // 各頂点間の最短距離
    int d[][] = new int[N][N];

    void floydWarshall() {
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        ShortestPath3_FloydWarshall fw = new ShortestPath3_FloydWarshall();

        // Undirected Graph
        String costs = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        // 存在しない path は INF
        // d[i][i] = 0
        int[][] d = fw.d;
        for (int i = 0; i < N; i++) {
            Arrays.fill(d[i], INF);
            d[i][i] = 0;
        }

        // 存在する path は cost を更新する
        String[] costE = costs.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int p0 = c[0].charAt(0) - 'A';
            int p1 = c[1].charAt(0) - 'A';
            int cs = Integer.parseInt(c[2]);

            d[p0][p1] = cs;
            d[p1][p0] = cs;
        }

        // 解は A -> c -> D -> F -> E -> G で 16
        fw.floydWarshall();

        System.out.println("floyd warshall");

        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(fw.d[i]));
        }


    }
}
