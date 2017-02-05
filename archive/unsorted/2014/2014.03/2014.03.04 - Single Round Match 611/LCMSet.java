package fuku;

import java.util.ArrayList;
import java.util.List;

public class LCMSet {

    List<List<Long>> a;
    List<List<Long>> b;

    public String equal(int[] A, int[] B) {
        a = new ArrayList<>();
        b = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            a.add(factor(Long.valueOf(A[i])));
        }
        for (int i = 0; i < B.length; i++) {
            b.add(factor(Long.valueOf(B[i])));
        }

        for (List<Long> t : a) {
            if ( ! check(t, b) ) return "Not equal";
        }
        for (List<Long> t : b) {
            if ( ! check(t, a) ) return "Not equal";
        }

        return "Equal";
    }

    boolean check(List<Long> t, List<List<Long>> r){
        int[] used = new int[t.size()];

        int c= 1;
        A:
        for (List<Long> rs : r) {
            c++;
            for (Long x : rs) {
                boolean inc = false;
                for (int j = 0; j < t.size(); j++) {
                    if (t.get(j).longValue() == x) inc = true;
                }
                if (!inc) continue A;
            }

            B:
            for (int i = 0; i < rs.size(); i++) {
                for (int j = 0; j < t.size(); j++) {
                    if (rs.get(i).longValue() == t.get(j).longValue() && used[j] != c) {
                        used[j] = c;
                        continue B;
                    }
                }
            }
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i] == 0) {
                return false;
            }
        }

        return true;
    }

    static List<Long> factor(Long n) {
        List<Long> ret = new ArrayList<Long>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        return ret;
    }
}
