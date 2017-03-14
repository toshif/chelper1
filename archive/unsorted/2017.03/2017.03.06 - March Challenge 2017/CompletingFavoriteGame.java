package fuku;

import utils.Permutation;
import utils.io.MyReader;

import java.io.PrintWriter;

public class CompletingFavoriteGame {

    private int n;
    private int h;
    private int[] t;
    private int[][] e;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        n = in.nextInt();
        h = in.nextInt();

        t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        e = new int[n][];
        for (int i = 0; i < n; i++) {
            int mx = in.nextInt();
            int[] ms = new int[mx];
            for (int j = 0; j < mx; j++) {
                ms[j] = in.nextInt() - 1;
            }
            e[i] = ms;
        }

        ps = new P[n][h + 1];

        rec(0);
        P rp = ps[0][0];
        int days = rp.days;
        if (rp.hours > 0) days++;
        out.println(days);
    }

    P[][] ps;

    class P {
        int days = 1000000;
        int hours = 100000;
        int child = 0;
    }

    // days , hours
    void rec(int v) {
        int[] eds = e[v];
        int en = eds.length;

        for (int i = 0; i < en; i++) {
            rec(eds[i]);
        }

        P p0prev = null;
        for (int offset = 0; offset <= h; offset++) {
            P p0 = new P();
            p0.days = 0;
            p0.hours = offset;
            if (p0.hours + t[v] <= h) {
                p0.hours += t[v];
            } else {
                p0.days++;
                p0.hours = t[v];
            }

            if (offset > 0) {
//                P prev = ps[v][offset - 1];
//                int c = prev.child;
//                if (ps[c][])
                if (compare(p0, p0prev) == 0) {
                    ps[v][offset] = ps[v][offset - 1];
                    continue;
                }
            }

            p0prev = p0;

            P[] dp = new P[1 << en];
            dp[0] = p0;

            for (int i = 0; i < (1 << en); i++) {
                P p2 = dp[i];
                for (int j = 0; j < en; j++) {
                    if ((i & (1 << j)) > 0) continue;

                    P p2n = new P();
                    p2n.days = p2.days;
                    p2n.hours = p2.hours;
                    if (i == 0) {
                        p2n.child = j;
                    } else {
                        p2n.child = p2.child;
                    }

                    int ed2 = eds[j];
                    P pc = ps[ed2][p2n.hours];
                    p2n.days += pc.days;
                    p2n.hours = pc.hours;

                    int target = (i | (1 << j));
                    P pt = dp[target];
                    if (pt == null || compare(p2n, pt) < 0) {
                        dp[target] = p2n;
                    }
                }
            }

            P p = dp[(1 << en) - 1];
            ps[v][offset] = p;
        }
    }

    int compare(P p1, P p2) {
        if (Integer.compare(p1.days, p2.days) != 0) return Integer.compare(p1.days, p2.days);

        return Integer.compare(p1.hours, p2.hours);
    }
}
