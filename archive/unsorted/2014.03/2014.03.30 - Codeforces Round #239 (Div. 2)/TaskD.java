package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    long MOD = 1000000007;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt() -1;
        }

        long[] cost = new long[n];
        for (int i = 0; i <n; i++) {
            if (p[i] == i) {
                cost[i] = 2;
                continue;
            }

            long t = 0;
            for (int j = p[i]; j < i; j++) {
                t += cost[j];
                t %= MOD;
            }
            t += 2;
            t %= MOD;
            cost[i] = t;
        }

        long tot = 0;
        for (int i = 0; i < n; i++) {
            tot += cost[i];
            tot %= MOD;
        }

        out.print(tot);
    }
}
