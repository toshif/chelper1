package utils.graph;

import utils.data.SegmentTree_NonRec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class LCA_SegTree {

    // the number of nodes
    private int N;

    // the father of node i in the tree
    public int[] T;

    // the level of node i
    private int[] E;
    private long[] L;
    private int[] H;

    private List<Integer>[] edges;

    private int root;

    int idx = 0;

    SegmentTree_RMQ_Index segTree;

    public LCA_SegTree(int N) {
        this.N = N;
        T = new int[N];
        Arrays.fill(T, -1);
        E = new int[2 * N];
        L = new long[2 * N];
        H = new int[N];
        edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList();
        }
    }

    public void addEdge(int from, int to) {
        edges[from].add(to);
        T[to] = from;
    }

    private void dfs(int node, int level) {
        E[idx] = node;
        L[idx] = level;
        H[node] = idx;
        idx++;

        for (Integer child : edges[node]) {
            dfs(child, level + 1);

            E[idx] = node;
            L[idx] = level;
            idx++;
        }
    }

    public void preCalc() {
        for (int i = 0; i < N; i++) {
            if (T[i] == -1) root = i;
        }

        dfs(root, 0);
        segTree = new SegmentTree_RMQ_Index(L);
    }

    public int LCA(int x, int y) {
        int left = Math.min(H[x], H[y]);
        int right = Math.max(H[x], H[y]);
        return E[segTree.query(left, right)];
    }

    private static class SegmentTree_RMQ_Index {

        private int N;

        long[] A;

        private long[] tree;

        private int[] treeIdx;

        /*
         * Initialize : O(N * Log2 N)
         *
         * A is the leaf array to be initialized with.
         */
        public SegmentTree_RMQ_Index(long[] A) {
            this.A = A;

            N = Integer.highestOneBit(A.length);
            if (N != A.length) {
                N *= 2;
            }

            int treeSize = 2 * N;
            tree = new long[treeSize];
            treeIdx = new int[treeSize];
            init();
        }

        private void init() {
            Arrays.fill(tree, 1000_000_000_000_000L);
            for (int i = 0; i < A.length; ++i) {
                tree[i + N] = A[i];
                treeIdx[i + N] = i;
            }
            for (int i = N - 1; i > 0; --i) {
                tree[i] = Math.min(tree[i * 2], tree[i * 2 + 1]);
                treeIdx[i] = tree[i * 2] < tree[i * 2 + 1] ? treeIdx[i * 2] : treeIdx[i * 2 + 1];
            }
        }

        /*
        * Returns the minimum value in range [left, right] inclusive
        *
        * left & right are 0-indexed.
        *
        * For example, in case of A=[2,3,1,5], then you want to query the leftmost 3 items range, it will be
        * query(0,2)
        */
        public int query(int left, int right) {
            int L = left + N;
            int R = right + 1 + N;

            long minVal = 1000_000_000_000_000_000L;
            int retIdx = treeIdx[L];

            for (; L < R; L >>= 1, R >>= 1) {
                if ((R & 1) > 0) {
                    --R;
                    if (minVal > tree[R]) {
                        minVal = tree[R];
                        retIdx = treeIdx[R];
                    }
                }
                if ((L & 1) > 0) {
                    if (minVal > tree[L]) {
                        minVal = tree[L];
                        retIdx = treeIdx[L];
                    }
                    L++;
                }
            }

            return retIdx;
        }

    }

    public static void main(String[] args) {
        LCA_SegTree lca = new LCA_SegTree(13);
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

        System.out.printf("LCA of node 5 & 6 = %s\n", lca.LCA(5, 6)); // 2
        System.out.printf("LCA of node 7 & 11 = %s\n", lca.LCA(7, 11)); // 2
        System.out.printf("LCA of node 9 & 10 = %s\n", lca.LCA(9, 10)); // 6
        System.out.printf("LCA of node 1 & 11 = %s\n", lca.LCA(1, 11)); // 0
    }


}
