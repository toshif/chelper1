package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(in.next());
        }

        Arrays.sort(a);

        long[] d = new long[5005];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int diff = a[j] - a[i];
                d[diff]++;
            }
        }

        long[] d2 = new long[10_025];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                int td = i + j;
                d2[td] += d[i] * d[j];
            }
        }

        long tot = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (i < j) {
                    tot += d[j] * d2[i];
                }
            }
        }

        double res = tot;
        for (int i = 0; i < 3; i++) {
            res /= (n * (n-1) / 2);
        }

        out.println(res);
    }
}
