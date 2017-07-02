package utils.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Find the lowest common ancestor using Square Root Decomposition.
 *
 * Time Complexity
 * - Construct : O( N )
 * - Query : O( sqrt N )
 * <p>
 * https://www.topcoder.com/community/data-science/data-science-tutorials/range-minimum-query-and-lowest-common-ancestor/#Lowest%20Common%20Ancestor%20(LCA)
 */
public class LCA_SqrtDec {

    // the number of nodes
    private int N;

    // the father of node i in the tree
    public int[] T;

    // the level of node i
    private int[] L;

    // the ancestor that is situated on the last level of the upper next section
    private int[] P;

    // the height of tree
    private int H;

    private List<Integer>[] edges;

    private int root;

    public LCA_SqrtDec(int N) {
        this.N = N;
        T = new int[N];
        Arrays.fill(T, -1);
        L = new int[N];
        P = new int[N];
        edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList();
        }
    }

    public void addEdge(int from, int to) {
        edges[from].add(to);
        T[to] = from;
    }

    // pre-calculation. you must call this after addEdge as a prep for queries.
    public void preCalc() {
        for (int i = 0; i < N; i++) {
            if (T[i] == -1) root = i;
        }

        findHeight(root, 0);
        int nr = Math.max(1, (int)(Math.sqrt(H)));
        dfs(root, nr);
    }

    private void findHeight(int node, int depth) {
        L[node] = depth;
        for (Integer next: edges[node]) {
            findHeight(next, depth + 1);
        }
        H = Math.max(H, depth);
    }

    private void dfs(int node, int nr) {
        //if node is situated in the first
        //section then P[node] = 1
        //if node is situated at the beginning
        //of some section then P[node] = T[node]
        //if none of those two cases occurs, then
        //P[node] = P[T[node]]
        if (L[node] < nr)
            P[node] = 1;
        else if (L[node] % nr != 0)
            P[node] = T[node];
        else
            P[node] = P[T[node]];


        for (Integer child : edges[node]) {
            dfs(child, nr);
        }
    }

    public int LCA(int x, int y) {
        //as long as the node in the next section of
        //x and y is not one common ancestor
        //we get the node situated on the smaller
        //lever closer
        while (P[x] != P[y])
            if (L[x] > L[y])
                x = P[x];
            else
                y = P[y];

        //now they are in the same section, so we trivially compute the LCA
        while (x != y)
            if (L[x] > L[y])
                x = T[x];
            else
                y = T[y];
        return x;
    }

    public static void main(String[] args) {
        LCA_SqrtDec lca = new LCA_SqrtDec(13);
        lca.addEdge(0, 1);
        lca.addEdge(0, 2);
        lca.addEdge(0, 3);
        lca.addEdge(2, 4);
        lca.addEdge(2, 5);
        lca.addEdge(2, 6);
        lca.addEdge(5, 7);
        lca.addEdge(5, 8);
        lca.addEdge(6, 9);
        lca.addEdge(6, 10);
        lca.addEdge(9, 11);
        lca.addEdge(9, 12);
        lca.preCalc();

        System.out.printf("LCA of node 5 & 6 = %s\n", lca.LCA(5, 6));
        System.out.printf("LCA of node 7 & 11 = %s\n", lca.LCA(7, 11));
        System.out.printf("LCA of node 9 & 10 = %s\n", lca.LCA(9, 10));
        System.out.printf("LCA of node 1 & 11 = %s\n", lca.LCA(1, 11));
    }

}
