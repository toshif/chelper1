package fuku;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.*;
import java.io.PrintWriter;

public class TaskD {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();

        Map<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String[] ss = s.split(" ");
            Integer a = Integer.valueOf(ss[0]);
            Integer b = Integer.valueOf(ss[1]);

            if (!m.containsKey(a)) {
                m.put(a, 0);
            }
            if (!m.containsKey(b)) {
                m.put(b, 0);
            }

            m.put(a, m.get(a) + 1);
            m.put(b, m.get(b) - 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> as = new ArrayList<>(m.size());
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            as.add(e);
        }
        Collections.sort(as, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey() - o2.getKey();
            }
        });

        boolean closed = true;
        int start = 0;
        int base = 0;
        ArrayList<String> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : as) {
            base += e.getValue();

            if (closed) {
                if (base >= k) {
                    closed = false;
                    start = e.getKey();
                }
            } else {
                if (base < k) {
                    // close
                    closed = true;
                    ans.add("" + start + " " + e.getKey());
                }
            }
        }

        out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            out.println(ans.get(i));
        }

    }
}
