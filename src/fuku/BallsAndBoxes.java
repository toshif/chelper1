package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class BallsAndBoxes {

    class P implements Comparable<P> {
        int idx;
        int b;
        int i;

        @Override
        public int compareTo(P o) {
            if (Integer.compare(b, o.b) != 0) return Integer.compare(b, o.b);
            if (Integer.compare(i, o.i) != 0) return Integer.compare(i, o.i);
            return Integer.compare(idx, o.idx);
        }
    }

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] A = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }
        int[] C = new int[m];
        for (int C_i = 0; C_i < m; C_i++) {
            C[C_i] = in.nextInt();
        }
        int[][] B = new int[n][m];
        List<P>[] ps = new List[n];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new ArrayList<>();
        }
        for (int B_i = 0; B_i < n; B_i++) {
            for (int B_j = 0; B_j < m; B_j++) {
                B[B_i][B_j] = in.nextInt();

                P p = new P();
                p.idx = B_j;
                p.b = B[B_i][B_j];
                p.i = B_i;

                ps[B_i].add(p);
            }
        }

        ConcurrentSkipListSet<P>[] box = new ConcurrentSkipListSet[m];
        Set<Integer>[] check = new HashSet[m];

        for (int i = 0; i < m; i++) {
            box[i] = new ConcurrentSkipListSet<>();
            check[i] = new HashSet<>();
        }

        for (int i = 0; i < ps.length; i++) {
            Collections.sort(ps[i]);
            Collections.reverse(ps[i]);

            for (int j = 0; j < Math.min(A[i], m); j++) {
                P p = ps[i].get(j);
                box[p.idx].add(p);
                check[p.idx].add(p.i);
            }
        }

        // move
        for (int a = 0; a < 10; a++) {
            for (int i = 0; i < m; i++) {
                B:
                for (P p : box[i]) {
                    A:
                    for (int j = 0; j < m; j++) {
                        if (i == j) continue;

                        if (check[j].contains(p.i)) {
                            continue A;
                        }

                        long plus = B[p.i][j] - p.b;
                        plus += cost(box[i].size(), C[i]) - cost(box[i].size() - 1, C[i]);
                        plus -= cost(box[j].size() + 1, C[j]) - cost(box[j].size(), C[j]);

                        if (plus > 0) {
                            box[i].remove(p);
                            check[i].remove(p.i);

                            P p2 = new P();
                            p2.b = B[p.i][j];
                            p2.i = p.i;
                            box[j].add(p2);
                            check[j].add(p2.i);
                            continue B;
                        }
                    }
                }
            }

            // remove
            for (int i = 0; i < m; i++) {
                for (P p : box[i]) {
                    long plus = - p.b;
                    plus += cost(box[i].size(), C[i]) - cost(box[i].size() - 1, C[i]);

                    if (plus >= 0) {
                        box[i].remove(p);
                        check[i].remove(p.i);
                    }
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < m; i++) {
            for (P p : box[i]) {
                sum += p.b;
            }

            sum -= cost(box[i].size(), C[i]);
        }

        out.println(sum);
    }

    int cost(int x, int c) {
        if (x <= c) return 0;
        return (x - c) * (x - c);
    }
}
