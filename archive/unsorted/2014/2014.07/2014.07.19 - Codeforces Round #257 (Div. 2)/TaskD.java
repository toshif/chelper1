package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        Vertex[] ns = new Vertex[n];
        for (int i = 0; i < n; i++) {
            ns[i] = new Vertex(i);
        }

        for (int i = 0; i < m; i++) {
            int from = in.nextInt() -1;
            int to = in.nextInt() -1;
            int weight = in.nextInt();

            ns[from].adj.add(new Edge(ns[to], weight));
            ns[to].adj.add(new Edge(ns[from], weight));
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(ns[i].adj, new Comparator<Edge>() {
                @Override
                public int compare(Edge o1, Edge o2) {
                    return (int)(o1.weight - o2.weight);
                }
            });
        }

        computePaths(ns[0]);

        long canRemoveCnt = 0;
        for (int i = 0; i < k; i++) {
            int to = in.nextInt() -1;
            long trainWeight = in.nextLong();

            if (trainWeight >= ns[to].minDistance) {
                canRemoveCnt++;
            }
        }

        out.print(canRemoveCnt);
    }

    class Vertex implements Comparable<Vertex>
    {
        public LinkedList<Edge> adj = new LinkedList<>();
        public long minDistance = 1_000_000_000_000_000L;
        int idx = 0;
        public Vertex(int idx) { this.idx = idx; }
        public String toString() { return "" + idx; }
        public int compareTo(Vertex other)
        {
            return Long.compare(minDistance, other.minDistance);
        }
    }

    class Edge
    {
        public final Vertex target;
        public final long weight;
        public Edge(Vertex argTarget, long argWeight)
        { target = argTarget; weight = argWeight; }
    }

    public void computePaths(Vertex source)
    {
        source.minDistance = 0;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adj)
            {
                Vertex v = e.target;
                long weight = e.weight;
                long distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);
                    v.minDistance = distanceThroughU ;
                    vertexQueue.add(v);
                }
            }
        }
    }

}
