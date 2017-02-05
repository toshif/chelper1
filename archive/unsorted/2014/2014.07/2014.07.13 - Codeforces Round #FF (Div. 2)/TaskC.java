package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (n == 2) {
            out.println(2);
            return;
        }

        int[] inc = new int[n];
        int c = 1;
        inc[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i-1]) {
                c++;
            } else {
                c = 1;
            }
            inc[i] = c;
        }

        System.err.printf("inc=%s\n", Arrays.toString(inc));

        int[] dec = new int[n];
        c = 1;
        dec[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            if (a[i] < a[i+1]) {
                c++;
            } else {
                c = 1;
            }
            dec[i] = c;
        }

        System.err.printf("dec=%s\n", Arrays.toString(dec));

        int ma = 0;
        for (int i = 1; i < n-1; i++) {
            if (a[i-1] + 1 < a[i+1]) {
                ma = Math.max(ma, inc[i-1] + dec[i+1] + 1);
            }
        }

        for (int i = 0; i < n-1; i++) {
            ma = Math.max(ma, inc[i] +1);
        }

        for (int i = n-1; i > 0; i--) {
            ma = Math.max(ma, dec[i] +1);
        }

        out.print(ma);
    }
}
