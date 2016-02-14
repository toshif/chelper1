package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    int n;
    int m;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();

        int lo = 0;
        int hi = 1_000_000_002;
        for (int i = 0; i < 10000; i++) {
            int mi = (lo + hi) / 2;
            if (ok(mi)) {
                hi = mi;
            } else {
                lo = mi;
            }
        }

        if (ok(lo)) out.println(lo);
        else out.print(hi);
    }

    boolean ok(int h) {
        int an = h / 2;
        int bn = h / 3;
        int cn = h / 6;
        int t = an + bn - cn;
        return an >= n && bn >= m && t >= (n+m);
    }
}
