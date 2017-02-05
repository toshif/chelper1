package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int M = 100000+2;
        long[] a = new long[M];
        for (int i = 0; i < n; i++) {
            a[in.nextInt()]++;
        }

        // 0: unused, 1: used
        long[][] dp = new long[M][2];
        for (int i = 1; i < M; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = a[i] * i + dp[i-1][0];
        }

        long ma = Math.max(dp[M-1][0], dp[M-1][1]);
        out.print(ma);
    }
}
