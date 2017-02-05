package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskD {

    class P {
        int id;
        long l;
        long r;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        List<P> ps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            P p = new P();
            p.id = i + 1;
            p.l = Long.parseLong(in.next());
            p.r = Long.parseLong(in.next());
            ps.add(p);
        }
        Collections.sort(ps, new Comparator<P>() {
            @Override
            public int compare(P o1, P o2) {
                if (Long.compare(o1.l, o2.l) != 0) return Long.compare(o1.l, o2.l);
                return Integer.compare(o1.id, o2.id);
            }
        });

        long ma = 0;
        String maStr = "";
        TreeSet<P> t = new TreeSet<>(new Comparator<P>() {
            @Override
            public int compare(P o1, P o2) {
                if (Long.compare(o1.r, o2.r) != 0) return Long.compare(o1.r, o2.r);
                return Integer.compare(o1.id, o2.id);
            }
        });
        int tot = 0;
        P ke = null;
        for (int i = 0; i < n; i++) {
            P p = ps.get(i);
            while (!t.isEmpty()) {
                P f = t.first();
                if (f.r < p.l) {
                    P pf = t.pollFirst();
                    if (pf == ke) {
                        ke = null;
                    }
                    tot--;
                } else {
                    break;
                }
            }

            if (ke != null && ke.r < p.r) {
                ke = t.higher(ke);
            }
            t.add(p);
            tot++;

            if (tot < k) {
                ke = null;
            }

            if (tot == k) {
                ke = t.first();
            }

            if (ke != null) {
                long val = ke.r - p.l + 1;
                if (ma < val) {
                    ma = val;
                    maStr = "";
                    SortedSet<P> tail = t.tailSet(ke);
                    for (P p10 : tail) {
                        if (!maStr.isEmpty())
                            maStr += " ";

                        maStr += p10.id;
                    }
                }
            }
        }

        if (ma == 0) {
            for (int i = 0; i < k; i++) {
                if (!maStr.isEmpty())
                    maStr += " ";

                maStr += (i + 1);
            }
        }

        out.println("" + ma);
        out.println(maStr);
    }
}
