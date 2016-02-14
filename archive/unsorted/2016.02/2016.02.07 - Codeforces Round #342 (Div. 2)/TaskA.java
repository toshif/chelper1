package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long ma = 0;
        // 1
        ma = Math.max(ma, n / a);

        // 2
        if (b <= n) {
            long x = b - c;
            long m = ( n - b ) / x;
            long rem = n - (m*x);

            // 3
            ma = Math.max(ma, m + (rem / a));
            ma = Math.max(ma, m + (rem / b));

            if (rem >= b) {
                ma = Math.max(ma, m + 1 + ((rem - b + c) / a));
            }
        }

        out.println(ma);
    }
}
