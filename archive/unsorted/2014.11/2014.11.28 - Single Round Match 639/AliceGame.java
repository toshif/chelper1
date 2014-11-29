package fuku;

public class AliceGame {
    public long findMinimumValue(long x, long y) {
        long s = x + y;
        long n = (long)Math.sqrt(s);

        if (n * n != s) return -1;

        long tx = x;
        long tn = n;
        long cnt = 0;
        for (int i = (int)n; i >= 0; i--) {
            if (tx == 0) break;

            if (2*i-1 <= tx) {
                cnt++;
                tx -= (2*i-1);
            }
        }

        return cnt;
    }
}
