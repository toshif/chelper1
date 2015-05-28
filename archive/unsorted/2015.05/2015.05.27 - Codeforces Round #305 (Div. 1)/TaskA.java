package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

// passed sys test
public class TaskA {
    long m;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        m = in.nextLong();

        long h1 = in.nextLong();
        long a1 = in.nextLong();
        long x1 = in.nextLong();
        long y1 = in.nextLong();

        long h2 = in.nextLong();
        long a2 = in.nextLong();
        long x2 = in.nextLong();
        long y2 = in.nextLong();

        long[] f1 = getFS(h1, a1, x1, y1);
        long[] f2 = getFS(h2, a2, x2, y2);

        System.err.printf("f1=%s\n", Arrays.toString(f1));
        System.err.printf("f2=%s\n", Arrays.toString(f2));

        long c = f1[0];
        long d = f1[1];
        long e = f2[0];
        long f = f2[1];

        if (d != -1) {
            d = d - c;
        }
        if (f != -1) {
            f = f - e;
        }

        if (c == -1 || e == -1) {
            out.println(-1);
            return;
        }

        if (d == -1 && f == -1) {
            if (c == e) {
                out.println(c);
                return;
            } else {
                out.println(-1);
                return;
            }
        }

        if (d == -1) {
            if (c - e >= 0 && (c-e)%f == 0) {
                out.println(c);
                return;
            } else {
                out.println(-1);
                return;
            }
        }

        if (f == -1) {
            if (e - c >= 0 && (e-c)%d == 0) {
                out.println(e);
                return;
            } else {
                out.println(-1);
                return;
            }
        }

        if (c == e) {
            out.println(c);
            return;
        }

        for (int i = 0; i < 2 * 1000_000; i++) {
            long g = c - e;

            if (d * i + g < 0) continue;
            if ((d * i + g ) % f == 0) {
                out.println(c + d * i);
                return;
            }
        }

        out.println(-1);
    }

    long[] getFS(long h, long a, long x, long y){
        long[] ret = new long[2];
        Arrays.fill(ret, -1);

        boolean first = true;
        long ta = h;
        for (int i = 1; i < 2 * 1000_000; i++) {
            ta = ( ta * x + y ) % m;
            if (ta == a) {
                if (first) {
                    ret[0] = i;
                    first = false;
                } else {
                    ret[1] = i;
                    break;
                }
            }
        }

        return ret;
    }
}
