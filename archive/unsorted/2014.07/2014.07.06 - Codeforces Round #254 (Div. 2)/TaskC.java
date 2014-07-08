package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    private int[][] g;
    private int n;
    private int[] v;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        int m = in.nextInt();

        v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }

        g = new int[n][n];
        for (int i = 0; i < m; i++) {
            int p1 = in.nextInt() - 1;
            int p2 = in.nextInt() - 1;
            int e = in.nextInt();

            g[p1][p2] = e;
            g[p2][p1] = e;
        }

        double ma = -1000;
        used = new boolean[n];
        set = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (used[i]) continue;

            used[i] = true;
            Arrays.fill(set, false);

            dfs(i);

            int besti = findBest();
            while(besti != -1) {
                set[besti] = false;
                besti = findBest();
            }
            System.err.println("-----");

            double d = calc();

            ma = Math.max(ma, d);
        }

        out.println(ma);
    }

    double calc(){

        long tv = 0;
        long te = 0;

        for (int i = 0; i < n; i++) {
            if (!set[i]) continue;

            tv += v[i];

            for (int j = i + 1; j < n; j++) {
                if (set[j]){
                    te += g[i][j];
                }
            }
        }

        if (te == 0) return 0.0;

        return 1.0 * tv / te;
    }

    boolean[] used;
    boolean[] set;

    void dfs(int i){
        for (int j = 0; j < n; j++) {
            if ( g[i][j] > 0 && !set[j]) {
                used[j] = true;
                set[j] = true;
                dfs(j);
            }
        }
    }

    int findBest(){

        int besti = -1;
        double ma = -100;
        for (int i = 0; i < n; i++) {
            if (!set[i]) continue;

            long te = 0;
            for (int j = 0; j < n; j++) {
                if (set[j] && g[i][j] > 0) {
                    te += g[i][j];
                }
            }

            if (te > v[i] && (te * 1.0 / v[i]) > ma) {
                ma = (te * 1.0 / v[i]);
                besti = i;
            }
        }

        return besti;
    }

}
