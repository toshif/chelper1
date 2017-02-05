package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[in.nextInt()-1] = i;
        }
        long tot = 0;
        for (int i = 0; i < n-1; i++) {
            tot += Math.abs(f[i] - f[i+1]);
        }
        out.println(tot);
    }
}
