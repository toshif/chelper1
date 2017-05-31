package utils.graph;

import java.util.*;

/**
 * http://en.wikipedia.org/wiki/Ford%E2%80%93Fulkerson_algorithm
 * <p>
 * Time Complexity : O(E maxflow) -> だが、通常は O(E) 程度。
 * Memory Space Complexity : O(E + V)
 * <p>
 * Created by toshif on 2015/05/10.
 */
public class MaxFlow_FordFulkerson {

    private int V;

    private List<Edge>[] capacity;

    // residual graph. using Map for a bit of efficiency.
    // key: to vertex, value: Edge
    private Map<Integer, Edge>[] residual;

    public long maxFlow = 0;

    MaxFlow_FordFulkerson(int V) {
        this.V = V;
        capacity = new List[V];
        residual = new Map[V];
        dfsUsed = new boolean[V];

        for (int i = 0; i < V; i++) {
            capacity[i] = new ArrayList<>();
            residual[i] = new HashMap<>();
        }
    }

    public void addEdge(int from, int to, int val) {
        capacity[from].add(new Edge(from, to, val));
    }

    // s -> t への max flow を探す
    public void solve(int s, int t) {
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
                residual[i].put(e.to, new Edge(e.from, e.to, e.val));
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
        long minVal = augPath.get(0).val;
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
    public List<Edge> getFlowResult() {
        List<Edge> ret = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            List<Edge> edges = capacity[i];
            for (Edge capE : edges) {
                Edge resE = residual[i].get(capE.to);
                if (resE.val < capE.val) {
                    ret.add(new Edge(capE.from, capE.to, capE.val - resE.val));
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        // Input: Directed graph
        // 蟻本の例
        String input = "A,B,10 A,C,2 B,C,6 B,D,6 C,E,5 D,C,3 D,E,8";

        MaxFlow_FordFulkerson ff = new MaxFlow_FordFulkerson(5);

        // 存在する path の capacity 入力
        String[] costE = input.split(" ");
        for (int i = 0; i < costE.length; i++) {
            String[] c = costE[i].split(",");

            int from = c[0].charAt(0) - 'A';
            int to = c[1].charAt(0) - 'A';
            int cap = Integer.parseInt(c[2]);

            ff.addEdge(from, to, cap);
        }

        // solve it. find the maximum flow from vertex 0 to vertex 4.
        ff.solve(0, 4);

        // 解 (A->Eの maximum flow) は 11
        System.out.printf("max flow = %s\n", ff.maxFlow);

        // max flow 時の flow のリスト
        System.out.printf("flows = %s\n", ff.getFlowResult());
    }

}
