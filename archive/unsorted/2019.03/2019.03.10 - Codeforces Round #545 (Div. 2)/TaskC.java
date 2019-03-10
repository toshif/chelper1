package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TaskC {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] x = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = in.nextInt();
            }
        }

        int[][] cl = new int[n][m];
        int[][] ch = new int[n][m];
        int[][] rl = new int[n][m];
        int[][] rh = new int[n][m];

        search(x, cl, ch, n, m, false);

        int[][] x2 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x2[j][i] = x[i][j];
            }
        }
        search(x2, rl, rh, m, n, true);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print((Math.max(cl[i][j], rl[i][j]) + 1 + Math.max(ch[i][j], rh[i][j])) + " ");
            }
            out.println();
        }
    }

    void search(int[][] x, int[][] cl, int[][] ch, int n, int m, boolean flip) {
        for (int i = 0; i < n; i++) {
            int[] a = x[i];
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < m; j++) {
                s.add(a[j]);
            }
            ArrayList<Integer> as = new ArrayList<>(s);
            Collections.sort(as);

            for (int j = 0; j < m; j++) {
                int idx = Collections.binarySearch(as, a[j]);

                if (!flip) {
                    cl[i][j] = idx;
                    ch[i][j] = as.size() - idx - 1;
                } else {
                    cl[j][i] = idx;
                    ch[j][i] = as.size() - idx - 1;
                }
            }
        }

    }
}
