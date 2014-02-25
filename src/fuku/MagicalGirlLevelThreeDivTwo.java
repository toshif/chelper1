package fuku;

import java.util.ArrayList;
import java.util.List;

public class MagicalGirlLevelThreeDivTwo {

    class P {
        int len;
        List<P> ps = new ArrayList<>();
        String val;
    }

    P[] A;

    public int theCount(String[] first, int n, long lo, long hi) {
        A = new P[n];
        int K = first.length;
        for (int i = 0; i < A.length; i++) {
            P p = new P();
            if (i < first.length) {
                p.len = first[i].length();
                p.val = first[i];
            } else {
                // A[i] = A[i-1] + A[i-K-1] + A[i-2K-1


            }
            A[i] = p;
        }

        return 0;
    }
}
