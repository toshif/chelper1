package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long L = 0;
        long R = 0;
        long ma = 0;
        int mai = 0;
        long mi = 0;
        int mii = 0;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();

            L += l;
            R += r;

            long v = l - r;
            if ( v > ma ) { ma = v; mai = i; }
            if ( v < mi ) { mi = v; mii = i; }
        }

        long v0 = Math.abs(L - R);
        long v1 = Math.abs(L - R - 2 * ma);
        long v2 = Math.abs(L - R - 2 * mi);

        if (v1 <= v0 && v2 <= v0) out.print(0);
        else if (v1 > v2) out.print(mai + 1);
        else if (v1 < v2) out.print(mii + 1);
        else out.print(mai + 1);
    }
}
