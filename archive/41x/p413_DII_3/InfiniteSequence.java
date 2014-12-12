
package tc.p413_DII_3;

import java.util.HashMap;

// impl by myself
// passed sys test
public class InfiniteSequence {

    private long n;
    private int p;
    private int q;

    long calc(long n, int p, int q){
        this.n = n;
        this.p = p;
        this.q = q;

        // an = a[n/p] + a[n/q]
        return get(n);
    }

    HashMap<Long, Long> cache = new HashMap<>();

    long get(long x){
        if (x <= 0) return 1;

        if (cache.containsKey(Long.valueOf(x))) return cache.get(Long.valueOf(x));

        if (x >= 1) {
            long ret = get(x / p) + get(x / q);
            cache.put(Long.valueOf(x), ret);
            return ret;
        }

        return 1;
    }



}

