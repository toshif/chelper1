package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskC {

    private int[] a;
    private int[][] t;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        long before = 0;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            before += a[i];
        }
        t = new int[n][];
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            t[i] = new int[d];
            for (int j = 0; j < d; j++) {
                t[i][j] = in.nextInt() - 1;
            }
        }

        out.println(before + " " + dfs(0));
    }

    long dfs(int v) {
        long tot = a[v];
        for (int i = 0; i < t[v].length; i++) {
            tot += 2 * dfs(t[v][i]);
        }
        return tot;
    }
}
