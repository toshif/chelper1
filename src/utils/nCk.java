package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by toshif on 3/6/14.
 */
public class nCk {

    static Map<Integer, List<Long>> nCkCache = new HashMap<>();

    static final long MOD = 1_000_000_007;

    static long nCkMod(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (n > 3 && k > 3 && k > n / 2) {
            k = n - k;
        }

        if (!nCkCache.containsKey(Integer.valueOf(n))) {
            List<Long> nList = new ArrayList<>();
            nList.add(Long.valueOf(1));
            nList.add(Long.valueOf(n));
            nCkCache.put(Integer.valueOf(n), nList);
        }
        List<Long> nList = nCkCache.get(Integer.valueOf(n));
        if (nList.size() > k) {
            return nList.get(k);
        }

        /**
         * Fermat's little theorem
         * http://en.wikipedia.org/wiki/Proofs_of_Fermat's_little_theorem
         *
         * <pre>
         * a^p = a (mod p)
         * a^(p-1) = 1 (mod p)
         * ..
         * 1/a = a^(p-2) (mod p)
         * </pre>
         */
        for (int i = nList.size(); i < k + 1; i++) {
            Long c1 = nList.get(i - 1);
            Long c2 = c1 * (n - i + 1) % MOD;
            c2 = c2 * modPow(i, MOD - 2) % MOD;
            nList.add(c2);
        }

        return nList.get(k);
    }

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


    /*
     --------------------- main ------------------------

     35Cm (mod 1_000_000_007)

<pre>
35C0: 1
35C1: 35
35C2: 595
35C3: 6545
35C4: 52360
35C5: 324632
35C6: 1623160
35C7: 6724520
35C8: 23535820
35C9: 70607460
35C10: 183579396
35C11: 417225900
35C12: 834451800
35C13: 476337793
35C14: 319959386
35C15: 247943139
35C16: 59928922
35C17: 537567622
35C18: 537567622
35C19: 59928922
35C20: 247943139
35C21: 319959386
35C22: 476337793
35C23: 834451800
35C24: 417225900
35C25: 183579396
35C26: 70607460
35C27: 23535820
35C28: 6724520
35C29: 1623160
35C30: 324632
35C31: 52360
35C32: 6545
35C33: 595
35C34: 35
35C35.: 1
</pre>
      */
    public static void main(String[] args) {
        System.out.println("nCk");

        for (int k = 0; k <= 35; k++) {
            System.out.println("35C" + k + ": " + nCkMod(35, k));
        }
    }
}
