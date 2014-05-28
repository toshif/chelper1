package utils.graph;

import com.sun.javafx.geom.Edge;

import java.util.Arrays;

/**
 * http://en.wikipedia.org/wiki/Dijkstra's_algorithm
 *
 * 1. 最短距離が確定した頂点に隣接する頂点を更新する
 * 2. 1 で確定した「最短距離が確定した頂点」はもう使わない
 *
 * O ( V^2 )
 *
 * Created by toshif on 5/28/14.
 */
public class ShortestPath2_Dijkstra {

    int N = 7;

    static int INF = 1_000_000_000;

    int[][] cost = new int[N][N];

    // 各頂点への最短距離
    int d[] = new int[N];

    void dijkstra(int s){
        Arrays.fill(d, INF);
        d[s] = 0;

        boolean[] used  = new boolean[N];
        while(true){
            int v = -1;
            // まだ使われてない頂点のうち、sからの距離が最小のものを探す
            for (int i = 0; i < N; i++) {
                if (!used[i] && (v == -1 || d[i] < d[v])) v = i;
            }

            if (v == -1) break;

            used[v] = true;

            for (int i = 0; i < N; i++) {
                d[i] = Math.min(d[i], d[v] + cost[v][i]);
            }
        }
    }

    public static void main(String[] args){
        ShortestPath2_Dijkstra dj = new ShortestPath2_Dijkstra();

        // Undirected Graph
        String costs = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        // 存在しない path は INF
        int[][] cost = dj.cost;
        for (int i = 0; i < cost.length; i++) {
            Arrays.fill(cost[i], INF);
        }

        // 存在する path は cost を更新する
        String[] costE = costs.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int p0 = c[0].charAt(0) - 'A';
            int p1 = c[1].charAt(0) - 'A';
            int cs = Integer.parseInt(c[2]);

            cost[p0][p1] = cs;
            cost[p1][p0] = cs;
        }

        // 解は A -> c -> D -> F -> E -> G で 16
        dj.dijkstra(0);

        System.out.printf("dijkstra d = %s", Arrays.toString(dj.d));
    }
}
