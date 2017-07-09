package utils.search;

import java.util.function.Function;

/**
 * ３分探索。凸関数の最小値を求める。
 *
 * 極値の"両側"に平らな部分があると使えない (http://d.hatena.ne.jp/komiyam/20120809/1344438215)。
 * 片方か、頂点部分だけ平らなら良い。
 *
 * References :
 * http://naoyat.hatenablog.jp/entry/2012/01/04/231801
 * http://d.hatena.ne.jp/ir5/20090630/1246349028
 * http://codeforces.com/blog/entry/43440
 *
 */
public class TernarySearch {

    /**
     * binary search に帰着させて解く
     *
     * find x which gives the minimum value of the function f.
     *
     * return [pos, val]
     *
     * Time Complexity : O ( log2 N )
     */
    public static long[] findMinBin(long left, long right, Function<Long, Long> f) {
        long lo = left, hi = right;

        while (hi - lo > 1){
            long mid = (hi + lo) / 2;
            if (f.apply(mid) < f.apply(mid + 1))
                hi = mid;
            else
                lo = mid;
        }

        long x = lo;
        if (f.apply(hi) < f.apply(x)) x = hi;

        return new long[]{x, f.apply(x)};
    }

    /**
     * find x which gives the minimum value of the function f.
     *
     * return [pos, val]
     *
     * Time Complexity : O ( log3 N )
     */
    public static long[] findMin(long left, long right, Function<Long, Long> f) {
        long lo = left, hi = right;

        while (hi - lo > 2) {
            long mid1 = lo + (hi - lo) / 3;
            long mid2 = hi - (hi - lo) / 3;

            if (f.apply(mid1) < f.apply(mid2)) {
                hi = mid2;
            } else {
                lo = mid1;
            }
        }

        long x = lo;
        if (lo + 1 < right && f.apply(lo + 1) < f.apply(x)) x = lo + 1;
        if (f.apply(hi) < f.apply(x)) x = hi;

        return new long[]{x, f.apply(x)};
    }

}
