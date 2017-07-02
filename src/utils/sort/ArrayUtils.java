package utils.sort;

/**
 */
public class ArrayUtils {

    /**
     * reverse the order of the given array ( int )
     */
    public static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
    }

    /**
     * reverse the order of the given array ( long )
     */
    public static void reverse(long[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            long tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
    }

}
