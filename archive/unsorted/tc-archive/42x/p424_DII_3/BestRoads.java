
package tc.p424_DII_3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// sys test passed
// used min spanning tree
public class BestRoads {

    private String[] roads;
    private int m;

    class Edge implements Comparable<Edge> {
        int weight;
        int from;
        int to;

        public Edge(int weight, int from, int to) {
            this.weight = weight;
            this.from = from;
            this.to = to;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    // The number of vertices
    int V;

    // ID for each tree for each vertex belongs to.
    // Initially has to be {0, 1, 2, 3, ...}
    int[] id;

    int[] ret;

    /**
     * Finds a minimum spanning tree for a connected weighted graph.
     *
     * = i.e. finds a subset of the edges that forms a tree that includes every vertex,
     * where the total weight of all the edges in the tree is minimized.
     *
     * @return the minimum weight
     */
    int kruskal(List<Edge> edges) {
        Collections.sort(edges);

        int totalWeight = 0;

        // remaining number of vertices to be added to a tree to construct an all connected tree
        int remain = V - 1;

        List<Edge> toBeRemoved = new LinkedList<>();

        for (Edge edge : edges) {
            int id1 = id[edge.from];
            int id2 = id[edge.to];

            if (id1 == id2) {
                // from vertex and to vertex are already in the same tree
                continue;
            }

            // merge id2 tree into id1
            for (int i = 0; i < V; i++) {
                if (id[i] == id2) id[i] = id1;
            }

            ret[edge.from]++;
            ret[edge.to]++;

            totalWeight += edge.weight;
            remain--;
            toBeRemoved.add(edge);
            m--;

            if (remain == 0 || m == 0) break;
        }

        System.err.println("remain = " + remain);
        if (remain > 0) {
            return -1;
        }

        edges.removeAll(toBeRemoved);

        while (m > 0 && !edges.isEmpty()){
            Edge edge = edges.remove(0);
            m--;

            ret[edge.from]++;
            ret[edge.to]++;
        }

        return totalWeight;
    }

    int[] numberOfRoads(String[] roads, int M){
        this.roads = roads;
        m = M;

        int N = roads.length;

        // --- !! Must initialize !! ---
        V = roads.length;
        id = new int[V];
        for (int i = 0; i < V; i++) {
            id[i] = i;
        }
        ret = new int[V];
        // ------------ init -----------

        List<Edge> edges = new LinkedList<>();
        int prio = 1;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (roads[i].charAt(j) == 'Y'){
                    edges.add(new Edge(prio++, i, j));
                }
            }
        }

        int weight = kruskal(edges);
        if (weight == -1 || m > 0) {
            return new int[]{};
        }

        return ret;
    }

}

