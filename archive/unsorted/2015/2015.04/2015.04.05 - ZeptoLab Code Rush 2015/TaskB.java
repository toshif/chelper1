package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    int n;
    int M;
    int[] r;
    long tot= 0;

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        n = in.nextInt();

        M = (2 << n) -1;

        r = new int[M+1];
        for (int i = 0; i < M-1; i++) {
            r[i+2] = in.nextInt();
        }

        // System.err.printf("%s\n", Arrays.toString(r));

        rec(1, 0);

        out.println(tot);
    }

    long rec(int node, int depth) {
        if (depth == n+1) {
            return 0;
        }

        long left = rec(2 * node, depth+1);
        long right = rec(2 * node + 1, depth+1);

        long ma = Math.max(left, right);

        tot += (ma - left) + (ma - right);

        return ma + r[node];
    }
}
