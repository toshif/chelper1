package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        long tot = 0;
        for (int i = 0; i < n-1; i++) {
            tot += (long)a[i] * (i+2);
        }
        tot += (long)a[n-1] * (n-1+1);

        out.print(tot);

    }
}
