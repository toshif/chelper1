package fuku;

import sun.misc.GC;
import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.*;

/**
 * Created by chelsea on 26/02/2017.
 */
public class AlmostIntGroupFinder {

    private List[] ans;
    private boolean[] covered;
    private int[] vs;
    private int[] vsSize;

    public static void main(String[] args) {
        new AlmostIntGroupFinder().solve();
    }

    Map<Integer, Integer> m = new TreeMap<>();

    class P implements Comparable<P> {
        double v;
        int[] a;

        @Override
        public int compareTo(P o) {
            return Double.compare(v, o.v);
        }
    }

    public void solve() {

        for (int i = -12; i <= 12; i++) {
            for (int j = -12; j <= 12; j++) {
                int d2 = i * i + j * j;

                if (isZero(Math.sqrt(d2) - (int) (Math.sqrt(d2)))) {
//                    System.err.printf("zero %s \n", d2);
                } else {
                    if (!m.containsKey(d2)) {
                        m.put(d2, 0);
                    }
                    m.put(d2, m.get(d2) + 1);
                }
            }
        }

        int n = m.size();
        vs = new int[n];
        vsSize = new int[n];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
//            System.err.printf("%s : %s -> %s \n", entry.getKey(), entry.getValue(), Math.sqrt(entry.getKey()));
            vs[idx] = entry.getKey();
            vsSize[idx] = entry.getValue();
            idx++;
        }
        ans = new List[n];
        covered = new boolean[n];

        int[] rnd = new int[n];
        for (int i = 0; i < n; i++) {
            rnd[i] = i;
        }

        for (int aaa = 0; aaa < 10; aaa++) {
            shuffleArray(rnd);
            TreeSet<P> m4 = new TreeSet<>();

            for (int q = 0; q < 2; q++) {
                int from = (n / 2) * q;
                int to = Math.min((n / 2) * (q + 1), n);

                for (int i = from; i < to; i++) {
                    double v1 = Math.sqrt(vs[rnd[i]]) - (int) (Math.sqrt(vs[rnd[i]]));

                    for (int j = i; j < to; j++) {
                        double v2 = Math.sqrt(vs[rnd[j]]) - (int) (Math.sqrt(vs[rnd[j]]));

                        for (int k = j; k < to; k++) {
                            double v3 = Math.sqrt(vs[rnd[k]]) - (int) (Math.sqrt(vs[rnd[k]]));

                            for (int l = k; l < to; l++) {
                                double v4 = Math.sqrt(vs[rnd[l]]) - (int) (Math.sqrt(vs[rnd[l]]));

                                for (int o = l; o < to; o++) {
                                    double v5 = Math.sqrt(vs[rnd[o]]) - (int) (Math.sqrt(vs[rnd[o]]));

                                    for (int p = o; p < to; p++) {
                                        double v6 = Math.sqrt(vs[rnd[p]]) - (int) (Math.sqrt(vs[rnd[p]]));

                                        P p6 = createP(v1 + v2 + v3 + v4 + v5 + v6);
                                        p6.a = new int[]{rnd[i], rnd[j], rnd[k], rnd[l], rnd[o], rnd[p]};
                                        m4.add(p6);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            find(m4);
        }

        Set<List> ss = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (ans[i] != null) {
                ss.add(ans[i]);
                System.err.printf("ans %s = %s \n", i, ans[i]);
            }
        }

        for (List s : ss) {
            System.err.printf("set : %s \n", s);
        }

        for (int i = 0; i < n; i++) {
            System.err.printf("covered %s = %s\n", i, covered[i]);
        }

        System.err.println("done");
    }

    void find(TreeSet<P> m4) {
        for (P p : m4) {
            if (isZero(p.v) || isZero(Math.abs(p.v - 1))) {
                System.err.println("p=" + p.a + ", v=" + p.v);
            } else {
                double v2 = 1 - p.v;
                P left = createP(v2 - 1E-12);
                P right = createP(v2 + 1E-12);
                SortedSet<P> t = m4.subSet(left, right);
                if (t.size() > 0) {
                    for (P p1 : t) {
                        List<Integer> ps = new ArrayList<>();
                        Map<Integer, Integer> lm = new HashMap<>();
                        for (Integer v : p.a) {
                            ps.add(v);
                            if (!lm.containsKey(v)) {
                                lm.put(v, 0);
                            }
                            lm.put(v, lm.get(v) + 1);
                        }
                        for (Integer v : p1.a) {
                            ps.add(v);
                            if (!lm.containsKey(v)) {
                                lm.put(v, 0);
                            }
                            lm.put(v, lm.get(v) + 1);
                        }

                        Collections.sort(ps);

                        boolean valid = true;
                        for (Map.Entry<Integer, Integer> entry : lm.entrySet()) {
                            if (vsSize[entry.getKey()] < entry.getValue()) {
                                valid = false;
                            }
                        }

                        double sum = 0;
                        for (Integer v : ps) {
                            sum += Math.sqrt(vs[v]);
                            if (ans[v] == null) {
                                ans[v] = ps;
                            }
                        }

                        int rounded = (int) (sum + 0.1);
                        if (Math.abs(sum - rounded) > 1E-12) {
                            valid = false;
                        }

                        if (valid) {
                            for (Integer v : ps) {
                                covered[v] = true;
                            }
                        }
                        System.err.printf("valid = %s, ps= %s, sum = %s \n", valid, ps, sum);
                    }
                }
            }

        }
    }

    P createP(double v) {
        P p = new P();
        p.v = v - (int) v;
        return p;
    }

    boolean isZero(double v) {
        return Math.abs(v) < 1E-12;
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
