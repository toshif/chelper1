package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskD {

    class P implements Comparable<P> {
        int idx;
        List<Long> valsList = new ArrayList<>();
        long ma = 0;

        public P(int idx, long val) {
            this.idx = idx;
            this.valsList.add(val);
            this.ma = val;
        }

        @Override
        public int compareTo(P o) {
            return Long.compare(this.ma, o.ma);
        }

        @Override
        public boolean equals(Object obj) {
            return ma == ((P)obj).ma;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        HashMap<Integer, P> ts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer idx = Integer.valueOf(in.next());
            long val = Long.valueOf(in.next());

            if (ts.get(idx) != null) {
                P p = ts.get(idx);
                p.valsList.add(val);
                p.ma = p.valsList.get(p.valsList.size()-1);
            } else {
                P p = new P(idx, val);
                ts.put(idx, p);
            }
        }

        TreeSet<P> ps = new TreeSet<>();
        ps.addAll(ts.values());

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int k = Integer.valueOf(in.next());
            ArrayList<P> exs = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                Integer idx = Integer.valueOf(in.next());
                if (!ts.containsKey(idx)) continue;

                P p1 = ts.get(idx);
                exs.add(p1);
                ps.remove(p1);
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
                Long secondVal = second.valsList.get(second.valsList.size()-1);
                bid = binarySearch_Higher(last.valsList, secondVal);
            } else {
                bid = last.valsList.get(0);
            }

            out.println(last.idx + " " + bid);

            ps.addAll(exs);
        }


    }

    Long binarySearch_Higher(List<Long> list, Long e) {
        int lo = 0; int hi = list.size()-1;

        for (int i = 0; i < 100; i++) {
            if (lo == hi) break;

            int mid = ( lo + hi ) / 2;
            Long midVal = list.get(mid);

            if (midVal < e) {
                if (lo == mid) break;
                lo = mid;
            } else {
                if (hi == mid) break;
                hi = mid;
            }
        }

        if (list.get(lo) > e) return list.get(lo);

        return list.get(hi);
    }
}
