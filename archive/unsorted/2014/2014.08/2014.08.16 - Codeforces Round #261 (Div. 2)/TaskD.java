package fuku;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.SortedMap;
import java.util.TreeMap;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (n == 1) {
            out.print(0);
            return;
        }

        int[] fl = new int[n];
        int[] fr = new int[n];

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer oi = Integer.valueOf(a[i]);
            if (!m.containsKey(oi)){
                m.put(oi, 0);
            }

            m.put(oi, m.get(oi) + 1);
            fl[i] = m.get(oi);
        }

        m.clear();
        for (int i = n-1; i >= 0; i--) {
            Integer oi = Integer.valueOf(a[i]);
            if (!m.containsKey(oi)){
                m.put(oi, 0);
            }

            m.put(oi, m.get(oi) + 1);
            fr[i] = m.get(oi);
        }

        long tot = 0;
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = n-1; i >= 1; i--) {
            Integer oi = Integer.valueOf(fr[i]);
            if (!tree.containsKey(oi)){
                tree.put(oi, 0);
            }
            tree.put(oi, tree.get(oi) + 1);

            Integer flv = Integer.valueOf(fl[i - 1]);
            SortedMap<Integer,Integer> sortedMap = tree.headMap(flv);
            long sum = 0;
            for (Integer v : sortedMap.values()) {
                sum += v;
            }
            tot += sum;
        }

        out.print(tot);
    }
}
