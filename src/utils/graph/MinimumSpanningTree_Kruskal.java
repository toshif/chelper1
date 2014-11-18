package utils.graph;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by toshi on 2014/11/18.
 */
public class MinimumSpanningTree_Kruskal {

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

            totalWeight += edge.weight;
            remain--;

            if (remain == 0) break;
        }

        System.err.println("remain = " + remain);

        return totalWeight;
    }

    void _main(){
        // --- !! Must initialize !! ---
        V = 7;
        id = new int[V];
        for (int i = 0; i < V; i++) {
            id[i] = i;
        }
        // ------------ init -----------


        // Wikipedia's example - http://en.wikipedia.org/wiki/Kruskal's_algorithm
        // bi-directional weighted graph
        int[][] edgeMatrix = new int[][]{
                {0, 7, 0, 5, 0, 0, 0},
                {7, 0, 0, 0, 7, 0, 0},
                {0, 0, 0, 0, 5, 0, 0},
                {5, 0, 0, 0, 0, 6, 0},
                {0, 7, 5, 0, 0, 0, 9},
                {0, 0, 0, 6, 0, 0, 0},
                {0, 0, 0, 0, 9, 0, 0}};

        List<Edge> edges = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            for (int j = i+1; j < V; j++) {
                if (edgeMatrix[i][j] == 0) continue;

                edges.add(new Edge(edgeMatrix[i][j], i, j));
            }
        }

        int minimumWeight = kruskal(edges);
        System.err.println("minimum weight of the spanning tree : " + minimumWeight);
    }

    public static void main(String[] args) {
        new MinimumSpanningTree_Kruskal()._main();
    }


}
