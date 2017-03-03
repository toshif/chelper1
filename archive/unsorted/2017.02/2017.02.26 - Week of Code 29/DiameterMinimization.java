package fuku;

import utils.graph.ShortestPath2_Dijkstra_w_PriorityQueue;
import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DiameterMinimization {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int m2 = m - 1;

        Dijkstra dijkstra = new Dijkstra(n);

        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();

            g[i].add((i + 1) % n);

            int d = n;
            for (int j = 0; j < m2; j++) {
                d /= 2;
                int sign = j % 2 == 0 ? 1 : -1;
                g[i].add((i + sign * d + n) % n);
            }

            for (int j = 0; j < m; j++) {
                dijkstra.edges[i].add(new Dijkstra.Edge(i, g[i].get(j), 1));
            }

        }

        dijkstra.solve(0);
        int ma = 0;
        for (int i = 0; i < n; i++) {
            ma = Math.max(ma, dijkstra.d[i]);
        }

        out.println(ma);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(g[i].get(j) + " ");
            }
            out.println();
        }


    }



    public static class Dijkstra {
        static final int INF = 1_000_000_000;
        int V;
        public List<Edge>[] edges;
        public int[] d;

        public Dijkstra(int V) {
            this.V = V;
            edges = new List[V];
            d = new int[V];

            for (int i = 0; i < V; i++) {
                edges[i] = new ArrayList<>();
            }

            Arrays.fill(d, INF);
        }

        public void solve(int s) {
            d[s] = 0;

            PriorityQueue<Node> queue = new PriorityQueue<>();
            queue.add(new Node(s, 0));

            boolean[] used = new boolean[V];

            // loop O(V) times
            while (!queue.isEmpty()) {

                // take O(log2 V)
                Node node = queue.poll();
                int v = node.idx;

                // if already calculated for the vertex, no need to do again
                if (used[v]) continue;

                used[v] = true;

                // loop O(1) times
                for (Edge e : edges[v]) {
                    int to = e.to;
                    int distance = d[v] + e.cost;
                    if (distance < d[to]) {
                        d[to] = distance;
                        queue.add(new Node(to, distance));
                    }
                }
            }
        }

        static class Node implements Comparable<Node> {

            int idx;

            int distance;

            public Node(int idx, int distance) {
                this.idx = idx;
                this.distance = distance;
            }

            @Override
            public int compareTo(Node o2) {
                Node o1 = this;

                if (o1.distance != o2.distance) return o1.distance - o2.distance;

                return o1.idx - o2.idx;
            }
        }

        public static class Edge {
            int from;
            int to;
            int cost;

            public Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }
        }
    }
}
