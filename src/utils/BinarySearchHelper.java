package utils;

import java.util.List;

public class BinarySearchHelper {

    /**
     * @return the index of the least element strictly greater than the given "e".
     *         -1 if such an element doesn't exist.
     *
     */
    public static int higher(List<Long> a, Long e) {
        int lo = 0, hi = a.size()-1;

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

    /**
     * @return the index of the greatest element strictly less than the given "e"
     *         -1 if such an element doesn't exist.
     */
    public static int lower(List<Long> a, Long e) {
        int lo = 0, hi = a.size()-1;

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


}
