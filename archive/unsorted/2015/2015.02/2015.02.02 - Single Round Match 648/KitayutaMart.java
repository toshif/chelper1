package fuku;

public class KitayutaMart {
    public int lastPrice(int N, int K) {
        long n = N;
        long k = K;

        long t = -1;
        long remain = 0;
        int max = Math.min(1_000_000, K);
        boolean isMax = false;
        for (int i = 0; i < max; i++) {
            long li = (long) i;
            long li2 = (long) i+1;
            long nt = li * (li+1) / 2;
            long nt2 = li2 * (li2+1) / 2;

            if (nt < n && n <= nt2) {
                t = li2;
                remain = n - nt;
                break;
            }

            if (i == max-1) {
                isMax = true;
                t = li2;
                remain = n - nt2;
            }
        }

        long ans = 1;
        if (!isMax) {
            long A = remain-1;
            ans = (t - A) % MOD;
            ans *= modPow(2, A);
        } else {
            long base = remain / (long)K;
            long add = remain - base * k;

            if (add == 0) {
                ans *= k * modPow(2, base);
            } else {
                long A2 = add;
                ans = ((long) N - A2) % MOD;
                ans *= modPow(2, base + A2);
            }
        }

        ans %= MOD;
        return (int)ans;
    }

    static final long MOD = 1_000_000_007;

    // returns x^y modulo MOD. loops only log2(y) times.
    static long modPow(long x, long y) {
        long res = 1, a = x;
        while (y > 0) {
            if ((y & 1) > 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            y >>= 1;
        }
        return res;
    }
}
