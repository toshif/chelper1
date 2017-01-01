package fuku;

import java.io.PrintWriter;
import java.util.*;

public class TaskD {

    class P implements Comparable<P> {
        int idx;
        TreeSet<Long> vs = new TreeSet<>();
        long ma;

        @Override
        public int compareTo(P o) {
            return Long.compare(ma, o.ma);
        }

        @Override
        public boolean equals(Object obj) {
            return ma == ((P) obj).ma;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        // idx -> list
        HashMap<Integer, P> ts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer idx = Integer.valueOf(in.next());
            Long val = Long.valueOf(in.next());

            if (!ts.containsKey(idx)) {
                P p = new P();
                p.idx = idx;
                ts.put(idx, p);
            }
            P p = ts.get(idx);
            p.vs.add(val);
            p.ma = val;
        }

        TreeSet<P> ps = new TreeSet<>();
        ps.addAll(ts.values());

        // query
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int k = Integer.valueOf(in.next());
            List<P> exs = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                Integer idx = Integer.valueOf(in.next());
                if (!ts.containsKey(idx)) continue;

                P p = ts.get(idx);
                ps.remove(p);
                exs.add(p);
            }

            if (ps.isEmpty()) {
                out.println("0 0");
                ps.addAll(exs);
                continue;
            }

            // find the max
            P last = ps.last();
            P second = ps.lower(last);

            Long bid = 0L;
            if (second != null) {
                bid = last.vs.higher(second.ma);
            } else {
                bid = last.vs.first();
            }

            out.println(last.idx + " " + bid);

            ps.addAll(exs);
        }


    }
}
