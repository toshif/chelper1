package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int[] ns = new int[n];
        int[] ms = new int[m];

        for (int i = 0; i < n; i++) {
            ns[i] = in.nextInt();
        }
        Arrays.sort(ns);
        //System.err.println("ns=" + Arrays.toString(ns));
        for (int i = 0; i < m; i++) {
            ms[i] = in.nextInt();
        }
        Arrays.sort(ms);
        //System.err.println("ms=" + Arrays.toString(ms));

        long ma = 0;
        for (int i = 0; i < n; i++) {
            long from = (long)ns[i] - (long)i;
            long to = (long)ns[i] + (long)(n-1 - i);

            long tot = 0;
            for (int j = 0; j < m; j++) {
                if (to < ms[j]) break;

                if (from <= ms[j] && ms[j] <= to) tot++;
            }

            //System.err.printf("from=%s,to=%s,tot=%s\n", from, to, tot);
            ma = Math.max(ma, tot);
        }
        out.println(ma);
    }
}
