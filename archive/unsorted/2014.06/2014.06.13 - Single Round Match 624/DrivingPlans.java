package fuku;

import java.util.*;

public class DrivingPlans {
    public int count(int N, int[] A, int[] B, int[] C) {
        this.N = N;
        d = new P[N];
        int M = A.length;
        for (int i = 0; i < M; i++) {
            Edge edge = new Edge();
            edge.from = A[i]-1;
            edge.to = B[i]-1;
            edge.cost = C[i];
            es.add(edge);

            Edge edge2 = new Edge();
            edge2.from = B[i]-1;
            edge2.to = A[i]-1;
            edge2.cost = C[i];
            es.add(edge2);
        }

        bellmanFord(0);

        System.out.println(Arrays.toString(d));

        return 0;
    }

    class P {
        int cost = INF;
        int num = 0;
        Set<Integer> froms = new HashSet<>();
    }

    // edges
    List<Edge> es = new ArrayList<>();

    int N;

    static int INF = 1_000_000_000;

    // 各頂点への最短距離
    P d[];

    void bellmanFord(int s){
        int E = es.size();
        d[s].cost = 0;

        while(true){
            boolean update = false;
            for (int i = 0; i < E; i++) {
                Edge e = es.get(i);
                if(d[e.from].cost != INF){
                    if (d[e.to].cost > d[e.from].cost + e.cost) {
                        d[e.to].cost = d[e.from].cost + e.cost;
                        update = true;
                    }
                }
            }
            if (!update) break;
        }
    }

    static class Edge {
        int from;
        int to;
        int cost;

        @Override
        public String toString() {
            return String.format("Edge<from=%s,to=%s,cost=%s>",from, to, cost);
        }
    }
}
