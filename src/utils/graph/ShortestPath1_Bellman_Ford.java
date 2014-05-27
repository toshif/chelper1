package utils.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Bellman-Ford method
 *
 * 単一始点最短路　を探す
 *
 * コストは O (V x E)
 *
 * Created by toshif on 5/20/14.
 */
public class ShortestPath1_Bellman_Ford {

    static class Edge {
        int from;
        int to;
        int cost;

        @Override
        public String toString() {
            return String.format("Edge<from=%s,to=%s,cost=%s>",from, to, cost);
        }
    }

    // number of vertexes
    int N = 7;

    int INF = 1_000_000_000;

    // edges
    List<Edge> es = new ArrayList<>();

    // 各頂点への最短距離
    int d[] = new int[N];

    // s から各頂点への最短距離を計算
    void bellmanFord(int s){
        int E = es.size();
        Arrays.fill(d, INF);
        d[s] = 0;

        while(true){
            boolean update = false;
            for (int i = 0; i < E; i++) {
                Edge e = es.get(i);
                if(d[e.from] != INF && d[e.to] > d[e.from] + e.cost){
                    d[e.to] = d[e.from] + e.cost;
                    update = true;
                }
            }
            if (!update) break;
        }
    }

    public static void main(String[] args){
        ShortestPath1_Bellman_Ford bf = new ShortestPath1_Bellman_Ford();

        // Undirected Graph
        String costs = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        String[] costE = costs.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            Edge edge = new Edge();
            edge.from = c[0].charAt(0) - 'A';
            edge.to = c[1].charAt(0) - 'A';
            edge.cost = Integer.parseInt(c[2]);

            bf.es.add(edge);

            Edge edge2 = new Edge();
            edge2.to = c[0].charAt(0) - 'A';
            edge2.from = c[1].charAt(0) - 'A';
            edge2.cost = Integer.parseInt(c[2]);

            bf.es.add(edge2);
        }
        System.out.println("bf.es = " + bf.es);

        // 解は A -> c -> D -> F -> E -> G で 16
        bf.bellmanFord(0);

        System.out.printf("d = %s", Arrays.toString(bf.d));
    }

}
