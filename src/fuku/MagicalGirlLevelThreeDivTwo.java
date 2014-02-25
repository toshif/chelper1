package fuku;

import java.util.ArrayList;
import java.util.List;

public class MagicalGirlLevelThreeDivTwo {

    class P {
        long len;
        List<P> ps = new ArrayList<>();
        String val;
    }

    P[] A;

    int find(P p, long lo, long hi){
        if (p.ps.size() == 0) {
            int tot = 0;
            for (int i = (int)lo; i < p.val.length() && i <= hi; i++) {
                if (p.val.charAt(i) == '1') tot++;
            }
            return tot;
        }

        int tot = 0;
        long off = 0;

        for (P p1 : p.ps) {
            if (off <= lo && lo < off + p1.len) {
                if (hi < off + p1.len){
                    tot += find(p1, lo - off, hi -off);
                } else {
                    tot += find(p1, lo - off, p1.len -1);
                }
            }
            if (lo < off && off <= hi){
                tot += find(p1, off, Math.min(hi - off, p1.len - 1));
            }
            off += p1.len;
        }

        return tot;
    }

    public int theCount(String[] first, int n, long lo, long hi) {
        A = new P[n+1];
        int K = first.length;
        for (int i = 0; i < A.length; i++) {
            P p = new P();
            if (i < first.length) {
                p.len = first[i].length();
                p.val = first[i];
            } else {
                // A[i] = A[i-1] + A[i-K-1] + A[i-2K-1]

                long len = 0;
                for (int j = i -1; j >= 0 ; j -= K) {
                    p.ps.add(A[j]);
                    len += A[j].len;
                }
                p.len = len;
            }
            A[i] = p;
        }

        return find(A[n], lo, hi);
    }
}
