package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskE {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int tot = 0; int tot2 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            tot += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
            tot2 += b[i];
        }

        if (tot != tot2) {
            out.println("NO");
            return;
        }


        FordFulkerson f = new FordFulkerson(2 * n + 2);
        for (int i = 0; i < n; i++) {
            f.capacity[0].add(new FordFulkerson.Edge(0, 2 + i, a[i]));
        }
        for (int i = 0; i < n; i++) {
            f.capacity[2+n+i].add(new FordFulkerson.Edge(2 + n + i, 1, b[i]));
        }
        for (int i = 0; i < n; i++) {
            f.capacity[2+i].add(new FordFulkerson.Edge(2+i, 2+n+i, 1000));
        }
        for (int i = 0; i < m; i++) {
            int p1 = in.nextInt()-1;
            int p2 = in.nextInt()-1;
            f.capacity[2+p1].add(new FordFulkerson.Edge(2+p1, 2+n+p2, 1000));
            f.capacity[2+p2].add(new FordFulkerson.Edge(2+p2, 2+n+p1, 1000));
        }

        f.solve(0, 1);

//        System.err.printf("maxflow=%s\n", f.maxFlow);
//        System.err.printf("flows=%s\n", f.getFlowResult());

        if (tot == f.maxFlow) {
            out.println("YES");

            List<FordFulkerson.Edge> flow = f.getFlowResult();
            int[][] ret = new int[n][n];
            for (FordFulkerson.Edge e : flow) {
                if (e.from == 0 || e.to == 1) continue;

                ret[e.from-2][e.to-2-n] = e.val;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(ret[i][j] + " ");
                }
                out.println();
            }
        } else {
            out.println("NO");
        }
    }

    static class FordFulkerson {

        int V;
        List<Edge>[] capacity;
        // residual graph. using Map for a bit of efficiency.
        // key: to vertex, value: Edge
        private Map<Integer, Edge>[] residual;
        int maxFlow = 0;

        FordFulkerson(int V) {
            this.V = V;
            capacity = new List[V];
            residual = new Map[V];
            dfsUsed = new boolean[V];

            for (int i = 0; i < V; i++) {
                capacity[i] = new ArrayList<>();
                residual[i] = new HashMap<>();
            }
        }

        // s -> t への max flow を探す
        void solve(int s, int t) {
            initBeforeSolve();

            while (true) {
                initDfs();
                boolean reachable = dfs(s, t);

                if (!reachable) break;

                updateResidual();
            }
        }

        private void initBeforeSolve() {
            for (int i = 0; i < V; i++) {
                for (Edge e : capacity[i]) {
                    residual[i].put(Integer.valueOf(e.to), new Edge(e.from, e.to, e.val));
                }
            }
        }

        private boolean[] dfsUsed;
        private LinkedList<Edge> augPath = new LinkedList<>();

        private void initDfs() {
            Arrays.fill(dfsUsed, false);
            augPath.clear();
        }

        // v->t への増加パス (augmenting path) を探す
        // true if reachable from v to t
        private boolean dfs(int v, int t) {
            dfsUsed[v] = true;

            if (v == t) {
                return true;
            }

            for (Edge e : residual[v].values()) {
                if (dfsUsed[e.to]) continue;
                if (e.val == 0) continue;

                boolean reachable = dfs(e.to, t);
                if (reachable) {
                    augPath.addFirst(e);
                    return true;
                }
            }

            return false;
        }

        // updating the residual graph
        private void updateResidual() {
            int minVal = augPath.get(0).val;
            for (Edge e : augPath) {
                minVal = Math.min(minVal, e.val);
            }

            // System.err.printf("flow %s with %s\n", minVal, augPath);

            maxFlow += minVal;

            for (Edge e : augPath) {
                // その辺に流す = 減らす
                e.val -= minVal;

                // 逆辺を増やす
                Integer from = Integer.valueOf(e.from);
                if (!residual[e.to].containsKey(from)) {
                    // if not yet present, create a new
                    residual[e.to].put(from, new Edge(e.to, from, 0));
                }
                Edge rev = residual[e.to].get(from);
                rev.val += minVal;
            }
        }

        // max flow のとき(一意でない)、flow がある辺のリストを返す. val は flow の量.
        List<Edge> getFlowResult() {
            List<Edge> ret = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                List<Edge> edges = capacity[i];
                for (Edge capE : edges) {
                    Edge resE = residual[i].get(Integer.valueOf(capE.to));
                    if (resE.val < capE.val) {
                        ret.add(new Edge(capE.from, capE.to, capE.val - resE.val));
                    }
                }
            }

            return ret;
        }

        static class Edge {
            int from;
            int to;
            int val;

            public Edge(int from, int to, int val) {
                this.from = from;
                this.to = to;
                this.val = val;
            }

            @Override
            public String toString() {
                return "Edge{" + from + "->" + to + ", val=" + val + '}';
            }
        }

    }
}
