package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int l = 0;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if (v == 1) l = i;
            if (v == n) h = i;
        }

        int ma = Math.max(l, h);
        ma = Math.max(ma, n - 1 - l);
        ma = Math.max(ma, n - 1 - h);

        out.print(ma);
    }
}
