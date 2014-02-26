package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskA {

    final long MOD = 1000000007;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        Map<Long, Long> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            List<Long> fa = factor(a);
            for (Long f : fa) {
                if (!m.containsKey(f)) m.put(f, 1L);
                else m.put(f, m.get(f) + 1L);
            }
        }

        System.err.println("m=" + m);

        long ret = 1;
        for (Long vn : m.values()) {
            ret *= nCkMod((int)(n + (vn -1)), vn.intValue());
            ret %= MOD;
        }

        out.println(ret);
    }

    static List<Long> factor(Long n) {
        List<Long> ret = new ArrayList<Long>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        return ret;
    }

    Map<Integer, List<Long>> nCkCache = new HashMap<>();

    long nCkMod(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (n > 3 && k > 3 && k > n / 2) {
            k = n - k;
        }

        if (!nCkCache.containsKey(n)) {
            List<Long> nList = new ArrayList<>();
            nList.add(Long.valueOf(1));
            nList.add(Long.valueOf(n));
            nCkCache.put(n, nList);
        }
        List<Long> nList = nCkCache.get(n);
        if (nList.size() > k) {
            return nList.get(k);
        }

        for (int i = nList.size(); i < k + 1; i++) {
            Long c1 = nList.get(i - 1);
            Long c2 = c1 * (n - i + 1) % MOD;
            c2 = c2 * modPow(i, MOD - 2) % MOD;
            nList.add(c2);
        }

        return nList.get(k);
    }

    long modPow(long x, long y) {
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
