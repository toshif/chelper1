package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        long cnt = 0;
        for (int x = 1; x <= n; x++) {
            long x1 = 0L + x + a + b;
            long y = x1 - a - c;
            long z = x1 - b - d;
            long e = x1 - c - d;

            if (!(1 <= y && y <= n)) continue;
            if (!(1 <= z && z <= n)) continue;
            if (!(1 <= e && e <= n)) continue;
            cnt += n;
        }

        out.print(cnt);

    }
}
