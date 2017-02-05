package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    class P implements Comparable<P> {
        long vol;
        int pos;

        @Override
        public int compareTo(P o) {
            if (Long.compare(this.vol, o.vol) != 0) {
                return Long.compare(this.vol, o.vol);
            }
            return -Long.compare(this.pos, o.pos);
        }
    }


    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        P[] ps = new P[n];
        for (int i = 0; i < n; i++) {
            long r = Long.valueOf(in.next());
            long h = Long.valueOf(in.next());
            long v = r * r * h;
            P p = new P();
            p.vol = v;
            p.pos = i;
            ps[i] = p;
        }
        Arrays.sort(ps);

        long[] dpInit = new long[n];
        SegTree dp = new SegTree(dpInit);
        for (int i = 0; i < n; i++) {
            P p = ps[i];
            long x = dp.query(0, p.pos);
            dp.update(p.pos, x - p.vol);
        }
        out.println(-1L * dp.query(0, n-1) * Math.PI);
    }

    public static class SegTree {

        private static class Node {
            // This node holds the value for [left, right] range inclusive
            int left;
            int right;

            boolean isLeaf = false;

            // RMQ specific
            long minVal = -1;

            @Override
            public String toString() {
                return "Node<minVal=" + minVal + ">";
            }
        }

        int N;

        Node[] tree;

        int treeSize;

        /*
         * Initialize : O(N * Log2 N)
         *
         * A is the leaf array to be initialized with.
         */
        public SegTree(long[] A) {
            N = A.length;

            int treeSize = N * (floorLog2(N) + 2);
            tree = new Node[treeSize];
            for (int i = 0; i < treeSize; i++) {
                tree[i] = new Node();
            }

            // root node is atindex = 1
            init(1, 0, N - 1, A);

            // System.err.printf("tree=%s\n", Arrays.toString(tree));
        }

        // internal init
        private void init(int node, int nodeLeft, int nodeRight, long[] A) {
            Node thisNode = tree[node];

            thisNode.left = nodeLeft;
            thisNode.right = nodeRight;

            if (nodeLeft == nodeRight) {
                // leaf
                thisNode.isLeaf = true;

                // RMQ specific
                thisNode.minVal = A[nodeLeft];
                return;
            }

            int mid = (nodeLeft + nodeRight) / 2;

            // Left node
            // left node is at node*2 and holds the value for range [nodeLeft, mid]
            init(node * 2, nodeLeft, mid, A);

            // Right node
            // Right node is at node*2+1 and holds the value for range [mid+1, nodeRight]
            init(node * 2 + 1, mid + 1, nodeRight, A);


            // Calculate minValue from the left and right nodes
            // RMQ specific
            long minVal = Math.min(tree[node * 2].minVal, tree[node * 2 + 1].minVal);
            thisNode.minVal = minVal;
        }

        /**
         * update the value at the index.
         *
         * 0-indexed.
         *
         * For exammple, A=[1,2,3], if want to update the leftmost from 1 to newValue,
         * update(0, newValue)
         */
        public void update(int idx, long newValue){
            updateTree(1, idx, newValue);
        }


        // internal update
        private void updateTree(int node, int idx, long newValue){
            Node thisNode = tree[node];

            // if the current interval doesn't intersect, do nothing
            if (thisNode.right < idx || idx < thisNode.left) return;

            if (thisNode.isLeaf) {
                thisNode.minVal = newValue;
                return;
            }

            updateTree(2*node, idx, newValue);
            updateTree(2*node+1, idx, newValue);

            // RMQ specific
            long minVal = Math.min(tree[node * 2].minVal, tree[node * 2 + 1].minVal);
            thisNode.minVal = minVal;
        }

        /*
         * Returns the minimum value in range [left, right] inclusive
         *
         * left & right are 0-indexed.
         *
         * For example, in case of A=[2,3,1,5], then you want to query the leftmost 3 items range, it will be
         * query(0,2)
         */
        public long query(int left, int right) {
            return queryTree(1, left, right);
        }

        // internal query
        private Long queryTree(int node, int queryLeft, int queryRight) {
            Node thisNode = tree[node];

            // if the current interval doesn't intersect, return null
            if (thisNode.right < queryLeft || queryRight < thisNode.left) return null;

            // if the current interval is included
            if (queryLeft <= thisNode.left && thisNode.right <= queryRight) return thisNode.minVal;

            int mid = (thisNode.left + thisNode.right) / 2;

            // check the left and right nodes
            Long leftNodeValue = queryTree(2 * node, queryLeft, queryRight);
            Long rightNodeValue = queryTree(2 * node + 1, queryLeft, queryRight);

            if (leftNodeValue == null) {
                return rightNodeValue;
            }

            if (rightNodeValue == null) {
                return leftNodeValue;
            }

            // RMQ specific
            return Math.min(leftNodeValue, rightNodeValue);
        }

    }

    // copied from Tips
    public static int floorLog2(long a) {
        for (int i = 0; i < 70; i++) {
            if ((a >> (i + 1)) == 0) {
                return i;
            }
        }

        return -1;
    }
}
