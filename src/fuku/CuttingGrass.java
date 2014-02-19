package fuku;

import java.util.*;

// seems this passed but doesn't pass test5
//
// this needs a DP to get the right answer.
// http://apps.topcoder.com/wiki/display/tc/SRM+517
//
public class CuttingGrass {

    class P{
        int h;
        int g;

        @Override
        public String toString() {
            return "h="+h + ",g=" + g;
        }
    }

    public int theMin(int[] init, int[] grow, int H) {
        int N = init.length;

        for (int n = 0; n < N; n++) {
            LinkedList<P> ps = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                P p = new P();
                p.h = init[i] + grow[i] * n;
                p.g = grow[i];
                ps.add(p);
            }

            Collections.sort(ps, new Comparator<P>() {
                @Override
                public int compare(P o1, P o2) {
                    if (o1.h == o2.h) {
                        return o1.g - o2.g;
                    }
                    return o1.h - o2.h;
                }
            });

            LinkedList<P> r = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                P p = ps.removeLast();
                r.add(p);
            }

            Collections.sort(r, new Comparator<P>() {
                @Override
                public int compare(P o1, P o2) {
                    return o2.g - o1.g;
                }
            });

            System.out.println("ps = " + ps);
            System.out.println("r = " + r);

            int h = 0;
            for (int i = 0; i < ps.size(); i++) {
                h += ps.get(i).h;
            }
            for (int i = 0; i < r.size(); i++) {
                h += r.get(i).g * i;
            }

            if (h <= H) {
                return n;
            }
        }

        return -1;
    }
}
