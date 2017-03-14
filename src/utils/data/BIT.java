package utils.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Indexed Tree ( = aka Fenwick Tree )
 * <p>
 * 0-based index.
 * <p>
 * [1] http://en.wikipedia.org/wiki/Fenwick_tree
 * [2] http://hos.ac/slides/20140319_bit.pdf
 * [3] http://d.hatena.ne.jp/naoya/20090606/1244284915
 * [4] http://community.topcoder.com/tc?module=Static&d1=tutorials&d2=binaryIndexedTrees
 * <p>
 * Created by toshif on 8/16/14.
 */
public class BIT {

    private long[] data;
    private int n;

    public BIT(int n) {
        this.n = n;
        data = new long[n + 2];
    }

    /**
     * Adds val to the index (0-based)
     * <p>
     * log2(n)
     */
    public void add(int idx, long val) {
        int idx2 = idx + 1;
        while (idx2 <= n + 1) {
            data[idx2] += val;
            idx2 += (idx2 & -idx2);
        }
    }

    /**
     * Gets the sum of 0, 1, 2, ... idx (inclusive)
     * <p>
     * log2(n)
     */
    public long getHeadSum(int idx) {
        int idx2 = idx + 1;

        long sum = 0;
        while (idx2 > 0) {
            sum += data[idx2];
            idx2 = idx2 & (idx2 - 1);
        }

        return sum;
    }

}
