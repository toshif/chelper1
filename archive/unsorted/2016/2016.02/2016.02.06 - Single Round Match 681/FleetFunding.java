package fuku;

import java.util.*;

public class FleetFunding {
    private int m;

    public int maxShips(int m, int[] k, int[] a, int[] b) {
        this.m = m;

        int l = 0;
        int r = 1000_000_00;
        for (int i = 0; i < 1000; i++) {
            int mid = (l + r) / 2;
            if (ok(mid, k.clone(), a.clone(), b.clone())) {
                l = mid;
            } else {
                r = mid;
            }
        }

        return l;
    }

    class P implements Comparable<P> {
        int left = 0;
        int right = 0;
        int t;


        @Override
        public int compareTo(P o) {
            return this.right - o.right;
        }
    }

    boolean ok(int x, int[] k, int[] a, int[] b) {
        Set<Integer> s = new HashSet<>();
        List<Integer> ps = new ArrayList<>();
        for (int i = 0; i < k.length; i++) {
            s.add(Integer.valueOf(a[i]));
            s.add(Integer.valueOf(b[i]));
        }
        ps.addAll(s);
        Collections.sort(ps);

        if (!s.contains(m)) return false;

        for (int q = 0; q < ps.size(); q++) {
            Integer p = ps.get(q);
            Integer np;
            if (q < ps.size()-1) {
                np = ps.get(q+1);
            } else {
                np = p+1;
            }


            int len = np - p;
            int cost = len * x;

            List<P> pp = new ArrayList<>();
            for (int i = 0; i < k.length; i++) {
                if (a[i] <= p && p <= b[i]) {
                    P pa = new P();
                    pa.right = b[i];
                    pa.left = a[i];
                    pa.t = i;
                    pp.add(pa);
                }
            }
            Collections.sort(pp);
            for (P pa : pp) {
                if (cost == 0) break;

                int capa = k[pa.t];
                if (capa == 0) continue;
                if (capa < cost) {
                    k[pa.t] = 0;
                    cost -= capa;
                } else {
                    k[pa.t] -= cost;
                    cost = 0;
                }
            }

            if (cost > 0) return false;
        }

        return true;


    }
}
