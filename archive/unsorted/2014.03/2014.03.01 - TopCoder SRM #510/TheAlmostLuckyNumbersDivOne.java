package fuku;

import java.util.ArrayList;
import java.util.List;

// didn't pass
//
// http://apps.topcoder.com/wiki/display/tc/SRM+510
public class TheAlmostLuckyNumbersDivOne {
    public long find(long a, long b) {
        return find(b) - find(a-1);
    }

    long find(long n) {
        List<Integer> ns = new ArrayList<>();
        while (n != 0) {
            ns.add((int) (n % 10));
            n /= 10;
        }
        int nl = ns.size();
        System.err.println("ns=" + ns);
        System.err.println("nl=" + nl);

        long tot = 0;
        for (int i = 0; i < ns.get(ns.size()-1)-1; i++) {
            tot += geta(i, nl);
        }

        boolean clear = true;
        for (int i = ns.size() - 1; i >= 0; i--) {
            int x = ns.get(i);
            if (x  !=  4 && x != 7 ) {
                if (clear)
                    clear = false;
                else
                    break;
            }
            tot += geta(x, i);
        }

        System.err.println("tot=" + tot);
        return tot;
    }

    long geta(int i, int nl){
        long tot = 0;
        if (i == 4 || i == 7) {
            long a = (long) Math.pow(2, nl - 1);
            tot += a;

            if (nl > 1) {
                long b = (long) Math.pow(2, nl - 2);
                b *= 8 * nl - 1;
                tot += b;
            }
        } else {
            long a = (long) Math.pow(2, nl - 1);
            tot += a;
        }
        return tot;
    }
}
