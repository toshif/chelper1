package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {

    private Map<Integer, Integer> map;

    class P implements Comparable<P> {
        int bv = 0;
        int cv = 0;
        int i = 0;


        @Override
        public int compareTo(P o) {
            int cmp1 = getV(bv).compareTo(getV(o.bv));
            if (cmp1 != 0) return cmp1;

            return getV(cv).compareTo(getV(o.cv));
        }

        Integer getV(int iv) {
            if (!map.containsKey(iv)) return 0;

            return map.get(iv);
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer v = Integer.valueOf(in.nextInt());
            if (!map.containsKey(v)) {
                map.put(v, 0);
            }
            map.put(v, map.get(v) + 1);
        }

        int m = in.nextInt();
        int[] b = new  int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            c[i] = in.nextInt();
        }
        List<P> ps = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            P p = new P();
            p.bv = b[i];
            p.cv = c[i];
            p.i = i;
            ps.add(p);
        }
        Collections.sort(ps);
        Collections.reverse(ps);
        out.print(ps.get(0).i+1);
    }
}
