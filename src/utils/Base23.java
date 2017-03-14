package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by toshif on 3/6/14.
 */
public class Base23 {

    public static final long RADIX = 23;

    /**
     * Returns the base-23 array for the given number n
     */
    public static long[] toBase23(long n){
        List<Long> ret = new ArrayList<>();
        while(n != 0) {
            ret.add(n % RADIX);
            n /= RADIX;
        }

        // convert to long[]
        long[] arr = new long[Math.max(1, ret.size())];
        for (int i = 0; i < ret.size(); i++) {
            arr[i] = ret.get(i);
        }

        return arr;
    }

    public static long fromBase23(long[] a) {
        long ret = a[0];
        long base = RADIX;
        for (int i = 1; i < a.length; i++) {
            ret += (base * a[i]);
            base *= RADIX;
        }
        return ret;
    }


}
