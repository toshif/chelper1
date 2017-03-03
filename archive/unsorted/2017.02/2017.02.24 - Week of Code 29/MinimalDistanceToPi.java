package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class MinimalDistanceToPi {

    private long min;
    private long max;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        min = in.nextLong();
        max = in.nextLong();

        for (long i = max; i >= min && i > max - 10_000_000L; i--) {
            findDiv(i);
        }

        out.println(bestS);
    }

    double bestDiff = 10000000;
    String bestS = "";

    void findDiv(long n) {
        if (!(min <= n && n <= max)) return;

        long lo = 0; long hi = 5 * n;
        for (int i = 0; i < 100; i++) {
            if (hi - lo <= 1) break;
            long mi = (lo + hi) / 2;
            if (1.0 * mi / n > Math.PI) {
                hi = mi;
            } else {
                lo = mi;
            }
        }

        double diff = Math.abs(Math.PI - 1.0 * lo / n);
        long a = lo;
        if (diff > Math.abs(Math.PI - 1.0 * hi / n)) {
            diff = Math.abs(Math.PI - 1.0 * hi / n);
            a = hi;
        }

        if (diff  < bestDiff) {
            bestDiff = Math.abs(Math.PI - 1.0 * a / n);
            bestS = a + "/" + n;
        }

    }
}
