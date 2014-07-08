package utils;

import java.util.Arrays;

/**
 * Created by toshif
 */
public class Permutation {

    private int[] arr;

    private int N;

    private int[] indexes;

    private int pStack = 1;

    /**
     * init with the given array
     */
    public Permutation(int[] arr) {
        init(arr);
    }

    /**
     * Initialize with the size n of natural numbers 0, 1, 2, ... n-1.
     */
    public Permutation(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        init(arr);
    }

    private void init(int[] arr) {
        this.arr = arr;
        N = arr.length;
        indexes = new int[N];
        Arrays.fill(indexes, -1);
    }

    /**
     * @return the next permutation in lexicographical order.
     * return null if already run out all the permutations.
     */
    public int[] nextPermutation() {
        if (pStack == -1) {
            // already ran out the permutations
            return null;
        }

        next();

        if (pStack == -1) {
            // just ran out all the permutations
            return null;
        }

        int[] ret = new int[N];
        for (int i = 0; i < N; i++) {
            ret[i] = arr[indexes[i]];
        }

        return ret;
    }

    private void next() {
        pStack--;

        while (true) {
            // ran out all the permutations
            if (pStack == -1) break;

            // found the next permutation
            if (pStack == N) break;

            boolean found = false;
            int base = indexes[pStack];
            int nextVal = base + 1;
            for (; nextVal < N; nextVal++) {
                boolean isUsed = false;
                for (int j = pStack - 1; j >= 0; j--) {
                    if (indexes[j] == nextVal) isUsed = true;
                }

                if (!isUsed) {
                    found = true;
                    break;
                }
            }

            if (found) {
                indexes[pStack] = nextVal;
                pStack++;
            } else {
                indexes[pStack] = -1;
                pStack--;
            }
        }
    }

    /**
     * number of permutations
     * <p/>
     * <code>
     * 0	1
     * 1	1
     * 2	2
     * 3	6
     * 4	24
     * 5	120
     * 6	720
     * 7	5,040
     * 8	40,320
     * 9	362,880
     * 10	3,628,800
     * 11	39,916,800
     * 12	479,001,600
     * 13	6,227,020,800
     * 14	87,178,291,200
     * </code>
     *
     * @param args
     */
    public static void main(String[] args) {
        Permutation p = new Permutation(4);
        //Permutation p = new Permutation(new int[]{3, 10, 22, 26});

        for (int i = 1; i <= 30; i++) {
            int[] ret = p.nextPermutation();
            System.out.printf("%d-th = %s\n", i, Arrays.toString(ret));
        }
    }
}
