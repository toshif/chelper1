package utils.graph;

import java.util.*;

/**
 * Priority Queue を使った Dijkstra の実装。
 * <p>
 * Time Complexity : O(V log2(V)) for most cases. Worst O(V^2)
 * Memory Space Complexity : O(E + V)
 * <p>
 * これも極めて密結合な graph の場合、 worst では O(V^2) かかってしまうが、
 * 疎結合の tree ( sparse tree ) で　O(E) ~ O(V) なら、
 * 各 node からの遷移は O(1) なので O ( V ( 1 + log2(V) ) )　= O (V log2 V) で動く。
 * <p>
 * http://en.wikipedia.org/wiki/Dijkstra's_algorithm
 * 1. 最短距離が確定した頂点に隣接する頂点を更新する
 * 2. 1 で確定した「最短距離が確定した頂点」はもう使わない
 * 最短距離が確定した頂点を探すときに Priority Queue を使っている。
 * <p>
 * Created by toshif.
 */
public class ShortestPath2_Dijkstra_w_PriorityQueue {

    public static final long INF = 1_000_000_000_000_000_000L;

    private int V;

    private List<Edge>[] edges;

    // 各頂点への最短距離
    public long[] d;

    public ShortestPath2_Dijkstra_w_PriorityQueue(int V) {
        this.V = V;
        edges = new List[V];
        d = new long[V];

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
                long distance = d[v] + e.val;
                if (distance < d[to]) {
                    d[to] = distance;
                    queue.add(new Node(to, distance));
                }
            }
        }
    }

    public void addEdge(int from, int to, long cost) {
        edges[from].add(new Edge(from, to, cost));
    }

    private static class Node implements Comparable<Node> {

        int idx;

        long distance;

        public Node(int idx, long distance) {
            this.idx = idx;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o2) {
            if (Long.compare(this.distance, o2.distance) != 0) return Long.compare(this.distance, o2.distance);

            return Integer.compare(this.idx, o2.idx);
        }
    }

    public static void main(String[] args) {
        // Input: Undirected graph
        // 下の　Dijkstra　は Directed graph にも対応している
        String input = "A,B,2 A,C,5 B,C,4 B,D,6 B,E,10 C,D,2 D,F,1 E,F,3 E,G,5 F,G,9";

        ShortestPath2_Dijkstra_w_PriorityQueue dj = new ShortestPath2_Dijkstra_w_PriorityQueue(7);

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
        System.out.printf("               [A, B, C, D, E, F, G]\n");
        System.out.printf("dk with pq d = %s\n", Arrays.toString(dj.d));
    }


}
