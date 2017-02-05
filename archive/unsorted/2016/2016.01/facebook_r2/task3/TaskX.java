package fuku.task3;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "snakes_and_ladders.txt";

        URL inFileUrl = TaskX.class.getResource(inFile);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

        System.err.printf("Class = [%s]\n", TaskX.class);
        System.err.printf("Input File = [%s]\n", inFileUrl);
        System.err.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.err.println("------------------");
            System.err.println("test " + (i+1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.err.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        long MOD = 1_000_000_007;

        class P implements Comparable<P> {
            long x;
            long h;

            @Override
            public int compareTo(P o) {
                return Long.compare(this.x, o.x);
            }
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();

            ArrayList<P> l = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                P p = new P();
                p.x = Long.valueOf(in.next());
                p.h = Long.valueOf(in.next());
                l.add(p);
            }
            Collections.sort(l);

            Map<Long, List<Long>> m = new HashMap<>();
            Map<Long, Integer> xi = new HashMap<>();
            long[] xs = new long[N];
            long[] hs = new long[N];
            for (int i = 0; i < N; i++) {
                xs[i] = l.get(i).x;
                hs[i] = -1 * l.get(i).h;

                xi.put(Long.valueOf(xs[i]), i);

                Long hv = Long.valueOf(hs[i]);
                if (!m.containsKey(hv)) {
                    m.put(hv, new ArrayList<>());
                }
                m.get(hv).add(xs[i]);
            }

            SegTree segTree = new SegTree(hs);

            long tot = 0;

            for (Map.Entry<Long, List<Long>> entry : m.entrySet()) {
                Long h = entry.getKey();
                List<Long> xss = entry.getValue();
                for (int i = 0; i < xss.size(); i++) {
                    Long a = Long.valueOf(xss.get(i));
                    int ai = xi.get(a);
                    for (int j = i+1; j < xss.size(); j++) {
                        Long b = Long.valueOf(xss.get(j));
                        int bi = xi.get(b);
                        long hm = segTree.query(ai, bi);

                        if (hm < h) continue;

                        // ok
                        long xpq = (b-a) * (b-a);
                        xpq %= MOD;
                        tot += xpq;
                        tot %= MOD;
                    }
                }
            }

            String ans = "" + tot;
            return ans;
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
}


