package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        in.nextLine();
        char[] s = in.nextLine().toCharArray();

        int i = 0;
        int b = 0;
        boolean found = false;
        for (i = 0; i < 100; i++) {
            int r = n - p * i;
            if (r < 0) break;
            if (r % q == 0) {
                // got it
                found = true;
                b = r / q;
                break;
            }
        }

        if (!found) {
            out.println(-1);
            return;
        }

        out.println(i + b);
        int idx = 0;
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < p; k++) {
                out.print(s[idx++]);
            }
            out.println();
        }
        for (int j = 0; j < b; j++) {
            for (int k = 0; k < q; k++) {
                out.print(s[idx++]);
            }
            out.println();
        }
    }
}
