package chef_challenge_feb2017.MAKETRI;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {

        class P implements Comparable<P> {

            long left;

            long right;

            @Override
            public int compareTo(P o) {
                if (Long.compare(left, o.left) != 0) return Long.compare(left, o.left);

                return Long.compare(right, o.right);
            }

        }

        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();
            long L = in.nextLong();
            long R = in.nextLong();

            long[] a = new long[N];
            for (int i = 0; i < N; i++) {
                a[i] = Long.parseLong(in.next());
            }
            Arrays.sort(a);

            List<P> ps = new ArrayList<>();
            for (int i = 0; i < N-1; i++) {
                long l1 = a[i];
                long l2 = a[i+1];

                P p = new P();
                p.left = Math.max(L, l2 - l1 + 1); // inclusive
                p.right = Math.min(R, l2 + l1 - 1); // inclusive

                if (p.left <= p.right) {
                    ps.add(p);
                }
            }
            Collections.sort(ps);

            // merge
            List<P> ps2 = new ArrayList<>();
            P base = ps.get(0);
            for (int i = 1; i < ps.size(); i++) {
                P p = ps.get(i);
                if (base.right >= p.left) {
                    base.right = Math.max(base.right, p.right);
                } else {
                    ps2.add(base);
                    base = p;
                }
            }
            ps2.add(base);

            // count
            long tot = 0;
            for (int i = 0; i < ps2.size(); i++) {
                P p = ps2.get(i);
                tot += p.right - p.left + 1;
            }
            out.println(tot);
        }
    }

}
