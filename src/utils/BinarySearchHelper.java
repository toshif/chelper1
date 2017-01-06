package utils;

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
        int lo = left, hi = right;

        if (a.get(hi) <= e) return -1;

        while (hi - lo > 1) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) <= e) {
                lo = mid;
            } else {
                hi = mid;
            }
        }

        if (a.get(lo) > e) return lo;
        else return hi;
    }

    public static int higher(long[] a, long e) {
        return higher(a, e, 0, a.length - 1);
    }

    public static int higher(long[] a, long e, int left, int right) {
        int lo = left, hi = right;

        if (a[hi] <= e) return -1;

        while (hi - lo > 1) {
            int mid = (lo + hi) / 2;
            if (a[mid] <= e) {
                lo = mid;
            } else {
                hi = mid;
            }
        }

        if (a[lo] > e) return lo;
        else return hi;
    }

    /**
     * @return the index of the greatest element strictly less than the given "e"
     * -1 if such an element doesn't exist.
     */
    public static int lower(List<Long> a, Long e) {
        return lower(a, e, 0, a.size() - 1);
    }

    public static int lower(List<Long> a, Long e, int left, int right) {
        int lo = left, hi = right;

        if (a.get(lo) >= e) return -1;

        while (hi - lo > 1) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) >= e) {
                hi = mid;
            } else {
                lo = mid;
            }
        }

        if (a.get(hi) < e) return hi;
        else return lo;
    }

    public static int lower(long[] a, long e) {
        return lower(a, e, 0, a.length - 1);
    }

    public static int lower(long[] a, long e, int left, int right) {
        int lo = left, hi = right;

        if (a[lo] >= e) return -1;

        while (hi - lo > 1) {
            int mid = (lo + hi) / 2;
            if (a[mid] >= e) {
                hi = mid;
            } else {
                lo = mid;
            }
        }

        if (a[hi] < e) return hi;
        else return lo;
    }


}
