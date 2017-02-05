package fuku;

import java.util.Arrays;

public class BuildingTowers {
    private long n;
    private long k;
    private int[] x;
    private int[] t;

    public long maxHeight(int N, int K, int[] x, int[] t) {
        n = N;
        k = K;
        this.x = x;
        this.t = t;

        int M = x.length;
        long[] rt = new long[M];
        for (int i = 0; i < M; i++) {
            rt[i] = t[i];
        }

        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                long d = Math.abs(x[j] - x[i]);
                long low = Math.min(rt[i], rt[j]);
                long mi = d * K + low;

                if (rt[i] > mi) {
                    rt[i] = mi;
                }

                if (rt[j] > mi) {
                    rt[j] = mi;
                }
            }
        }

        // System.err.printf("rt=%s\n", Arrays.toString(rt));

        long ma = 0;
        long left = 0;
        long remain = N - 1;
        for (int i = 0; i < M; i++) {
            long d = x[i] - 1;
            if (i != 0) {
                d = x[i] - x[i - 1];
            }

            long right = Math.min(rt[i], left + K * d);
            long bsr = bs(left, right, d);
            ma = Math.max(bsr, ma);
            left = right;

            remain = N - x[i];
        }

        ma = Math.max(ma, left + remain * k);

        return ma;
    }

    long bs(long left, long right, long d) {
        long hi = 2_000_000_000_000_000_000L;
        long lo = 0;
        long mi = 0;
        for (int i = 0; i < 1000; i++) {
            if (hi == lo) break;

            mi = lo + (hi - lo) / 2;
            long lreq = Math.abs(mi - left) / k;
            if (lreq * k != Math.abs(mi - left)) lreq++;

            long rreq = Math.abs(mi - right) / k;
            if (rreq * k != Math.abs(mi - right)) rreq++;

            boolean ok = (lreq + rreq) <= d;
            if (ok) {
                lo = mi;
            } else {
                hi = mi;
            }
        }

        return mi;
    }
}
