package fuku;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    class Edge {
        int to;
        double cap;
        int rev;

        Edge(int to, double cap, int rev) {
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
    }

    List<Edge>[] g;
    boolean[] used;

    void addEdge(int from, int to, double cap){
        g[from].add(new Edge(to, cap, g[to].size()));
        g[to].add(new Edge(from, 0, g[from].size() - 1));
    }
      
    double dfs(int v, int t, double f){
        if (v == t) return f;
        used[v] = true;
        for (int i = 0; i < g[v].size(); i++) {
            Edge e = g[v].get(i);
            if (!used[e.to] && e.cap > 0){
                double d = dfs(e.to, t, Math.min(f, e.cap));
                if (d > 0) {
                    e.cap -= d;
                    g[e.to].get(e.rev).cap += d;
                    return d;
                }
            }
        }
        return 0;
    }

    double maxFlow(int s, int t) {
        double flow = 0;
        while(true){
            Arrays.fill(used, false);
            double f = dfs(s, t, 1000_000_000.0);
            if (f == 0) return flow;
            flow += f;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();

        int N = n1 + n2 + n3 + 2;
        g = new List[N];
        for (int i = 0; i < N; i++) {
            g[i] = new LinkedList<>();
        }

        used = new boolean[N];

        int offset = 1;
        for (int i = 0; i < n1; i++) {
            int p1 = offset + i;
            addEdge(0, p1, 1.0);
            for (int j = 1; j <= n2; j++) {
                addEdge(p1, offset + n1 + j, 1.0 / t1);
            }
        }

        offset = 1 + n1;
        for (int i = 0; i < n2; i++) {
            int p2 = offset + i;
            for (int j = 1; j <= n3; j++) {
                addEdge(p2, offset + n2 + j, 1.0 / t2);
            }
        }

        offset = 1 + n1 + n2;
        for (int i = 0; i < n3; i++) {
            int p3 = offset + i;
            addEdge(p3, N-1, 1.0 / t3);
        }

        double f = maxFlow(0, N - 1);
        System.err.println("f = " + f);

        int base = t1 + t2 + t3;
        k = Math.max(k - n3, 0);

        int ans = base + (int)((1.0 * k) / f);
        out.print(ans);
    }
}
