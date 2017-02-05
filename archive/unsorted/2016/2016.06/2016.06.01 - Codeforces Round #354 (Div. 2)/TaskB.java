package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    private double[][] d;
    private int n;
    private int t;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        t = in.nextInt();

        d = new double[n][n];
        for (int i = 0; i < t; i++) {
            fill(1d, 0, 0);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( isFull(d[i][j]) ) cnt++;
            }
        }
        out.print(cnt);
    }

    void fill(double v, int level, int y) {
        if (level == n) return;

        double v2 = d[level][y];
        if (!isFull(v2)) {
            if (1 - v2 >= v) {
                d[level][y] += v;
                return;
            }

            v -= (1 - v2);
            d[level][y] = 1;
        }

        fill(v / 2.0, level+1, y);
        fill(v / 2.0, level+1, y+1);
    }

    boolean isFull(double v) {
        return v >= 1.0;
    }
}
