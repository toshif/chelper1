package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int tot = 0;
        boolean nonZero = false;
        int firstNonZero = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            tot += a[i];
            if (a[i] != 0) {
                if (!nonZero) firstNonZero = i;
                nonZero = true;
            }
        }

        if (!nonZero) {
            out.println("NO");
            return;
        }

        if (tot != 0) {
            out.println("YES");
            out.println("1");
            out.println("1 " + n);
            return;
        }

        // tot = 0
        out.println("YES");
        out.println("2");
        out.println("1 " + (firstNonZero+1));
        out.println((firstNonZero+2) + " " + n);
    }
}
