package utils.search;

import java.util.function.Predicate;

/**
 * 2分探索。
 * <p>
 * Time Complexity: O ( log2 N )
 * <p>
 * https://ja.wikipedia.org/wiki/%E4%BA%8C%E5%88%86%E6%8E%A2%E7%B4%A2
 */
public class BinarySearch {

    /**
     * idx: [0,    1,    2,     3,     ...]
     * val: [true, true, false, false, ...]
     * <p>
     * という関数の idx = 1 を返す。
     */
    public static long findHighestTrue(long left, long right, Predicate<Long> f) {
        long lo = left, hi = right;

        while (hi - lo > 1) {
            long mid = lo + (hi - lo) / 2;
            if (f.test(mid)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }

        if (f.test(hi)) return hi;
        else return lo;
    }

    /**
     * idx: [0,     1,     2,    3,    ...]
     * val: [false, false, true, true, ...]
     * <p>
     * という関数の idx = 2 を返す。
     */
    public static long findLowestTrue(long left, long right, Predicate<Long> f) {
        long lo = left, hi = right;

        while (hi - lo > 1) {
            long mid = lo + (hi - lo) / 2;
            if (f.test(mid)) {
                hi = mid;
            } else {
                lo = mid;
            }
        }

        if (f.test(lo)) return lo;
        else return hi;

    }



}
