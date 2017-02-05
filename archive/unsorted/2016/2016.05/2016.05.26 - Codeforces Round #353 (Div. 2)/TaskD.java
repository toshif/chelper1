package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskD {

    class C {
        Integer l;
        Integer r;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        Map<Integer, C> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(in.next());
            m.put(a[i], new C());
        }

        TreeSet<Integer> s = new TreeSet<>();
        s.add(a[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            Integer v = Integer.valueOf(a[i]);
            Integer r = s.ceiling(v);
            Integer l = s.floor(v);

            if (l == null) {
                sb.append(r + " ");
                m.get(r).l = v;
            }
            if (r == null) {
                sb.append(l + " ");
                m.get(l).r = v;
            }

            if ( r != null && m.get(r).l == null ) {
                sb.append(r + " ");
                m.get(r).l = v;
            }

            if ( l != null && m.get(l).r == null ) {
                sb.append(l + " ");
                m.get(l).r = v;
            }

            s.add(v);
        }
        out.println(sb.toString());

    }
}
