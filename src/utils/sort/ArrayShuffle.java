package utils.sort;

import java.util.Random;

/**
 * Fisher-Yates shuffle
 * <p>
 * TimeComplexity: O(N)
 * <p>
 * https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
 */
public class ArrayShuffle {

    private static final Random RND = new Random();

    public static int[] shuffle(int[] a) {
        for (int i = 0, n = a.length; i < n; i++) {
            int ind = RND.nextInt(n - i) + i;
            int tmp = a[i];
            a[i] = a[ind];
            a[ind] = tmp;
        }
        return a;
    }

    public static long[] shuffle(long[] a) {
        for (int i = 0, n = a.length; i < n; i++) {
            int ind = RND.nextInt(n - i) + i;
            long tmp = a[i];
            a[i] = a[ind];
            a[ind] = tmp;
        }
        return a;
    }


}
