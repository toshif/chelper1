package utils.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Indexed Tree ( = aka Fenwick Tree )
 *
 * 1-based index.
 *
 * [1] http://en.wikipedia.org/wiki/Fenwick_tree
 * [2] http://hos.ac/slides/20140319_bit.pdf
 * [3] http://d.hatena.ne.jp/naoya/20090606/1244284915
 * [4] http://community.topcoder.com/tc?module=Static&d1=tutorials&d2=binaryIndexedTrees
 *
 * Created by toshif on 8/16/14.
 */
public class BIT {

    long[] data;
    private int n;

    public BIT(int n){
        this.n = n;
        data = new long[n+1];
    }

    /**
     * Adds val to the index idx
     *
     * log2(n)
     */
    void add(int idx, long val){
        while (idx <= n) {
            data[idx] += val;
            idx += (idx & -idx);
        }
    }

    /**
     * Gets the sum of 1, 2, ... idx (inclusive)
     *
     * log2(n)
     */
    long getHeadSum(int idx){
        long sum = 0;
        while(idx > 0){
            sum += data[idx];
            idx = idx & (idx - 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        BIT bit = new BIT(100);
        bit.add(1, 10);
        bit.add(2, 1);
        bit.add(5, 1);
        bit.add(50, 3);
        bit.add(100, 7);

        for (int i = 1; i <= 6; i++) {
            System.out.printf("bit head sum %d = %d \n", i, bit.getHeadSum(i));
        }

        System.out.printf("bit head sum %d = %d \n", 49, bit.getHeadSum(49));
        System.out.printf("bit head sum %d = %d \n", 50, bit.getHeadSum(50));
        System.out.printf("bit head sum %d = %d \n", 99, bit.getHeadSum(99));
        System.out.printf("bit head sum %d = %d \n", 100, bit.getHeadSum(100));
    }

}
