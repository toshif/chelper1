package utils.search;

import java.util.List;

public class BinarySearchHelper {

    /**
     * @return the index of the least element strictly greater than the given "e".
     * -1 if such an element doesn't exist.
     */
    public static int higher(List<Long> a, Long e) {
        return higher(a, e, 0, a.size() - 1);
    }

    public static int higher(List<Long> a, Long e, int left, int right) {
        if (a.get(right) <= e) return -1;
        return (int)BinarySearch.findLowestTrue(left, right, x -> a.get(x.intValue()) > e);
    }

    public static int higher(long[] a, long e) {
        return higher(a, e, 0, a.length - 1);
    }

    public static int higher(long[] a, long e, int left, int right) {
        if (a[right] <= e) return -1;
        return (int)BinarySearch.findLowestTrue(left, right, x -> a[x.intValue()] > e);
    }

    /**
     * @return the index of the greatest element strictly less than the given "e"
     * -1 if such an element doesn't exist.
     */
    public static int lower(List<Long> a, Long e) {
        return lower(a, e, 0, a.size() - 1);
    }

    public static int lower(List<Long> a, Long e, int left, int right) {
        if (a.get(left) >= e) return -1;
        return (int)BinarySearch.findHighestTrue(left, right, x -> a.get(x.intValue()) < e);
    }

    public static int lower(long[] a, long e) {
        return lower(a, e, 0, a.length - 1);
    }

    public static int lower(long[] a, long e, int left, int right) {
        if (a[left] >= e) return -1;
        return (int)BinarySearch.findHighestTrue(left, right, x -> a[x.intValue()] < e);
    }


}
