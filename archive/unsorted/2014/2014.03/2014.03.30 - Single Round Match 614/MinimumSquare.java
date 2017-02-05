package fuku;

public class MinimumSquare {
    private int[] x;
    private int[] y;
    private int k;

    public long minArea(int[] x, int[] y, int K) {
        this.x = x;
        this.y = y;
        k = K;

        long lo = 2;
        long hi = 3_000_000_000L;

        while(lo != hi){
            long mid = (hi - lo) / 2 + lo;

            if (ok(mid))
                hi = mid;
            else{
                if (lo == mid) break;
                lo = mid;
            }
        }

        if (ok(lo)) return lo * lo;
        if (ok(hi)) return hi * hi;

        return hi * hi;
    }

    boolean ok(long d){
        for (int i = 0; i < x.length; i++) {
            long ox = x[i];
            long oy = y[i];

            if (in(d, x[i] -1, y[i] -1) >= k) return true;
            if (in(d, x[i] -d+1, y[i] -1) >= k) return true;
            if (in(d, x[i] -1, y[i] -d+1) >= k) return true;
            if (in(d, x[i] -d+1, y[i] -d+1) >= k) return true;
        }

        return false;
    }

    int in(long d, long ox, long oy){
        int tot = 0;
        for (int i = 0; i < x.length; i++) {
            if ( ( ox < x[i] && x[i] < ox + d ) && (oy < y[i] && y[i] < oy + d)) tot++;
        }
        return tot;
    }
}
