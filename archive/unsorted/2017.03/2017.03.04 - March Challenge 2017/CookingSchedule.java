package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.*;

public class CookingSchedule {


    private int K;

    class P implements Comparable<P> {
        int d;

        @Override
        public int compareTo(P o) {
            if (Integer.compare(d, o.d) != 0) return Integer.compare(d, o.d);

            return Integer.compare(hashCode(), o.hashCode());
        }
    }

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();
        K = in.nextInt();
        String s = in.next();

        int diff = 0;
        int diff2 = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                diff += s.charAt(i) == '0' ? 1 : 0;
                diff2 += s.charAt(i) == '1' ? 1 : 0;
            } else {
                diff += s.charAt(i) == '1' ? 1 : 0;
                diff2 += s.charAt(i) == '0' ? 1 : 0;
            }
        }

        if (diff <= K || diff2 <= K) {
            out.println(1);
            return;
        }

        List<P> ps = new ArrayList<>();
        int cnt = 1;
        for (int i = 1; i < N; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                P p = new P();
                p.d = cnt;
                if (p.d > 1) {
                    ps.add(p);
                }
                cnt = 0;
            }
            cnt++;
        }
        P p = new P();
        p.d = cnt;
        if (p.d > 1) {
            ps.add(p);
        }
        Collections.sort(ps);
        Collections.reverse(ps);

        int lo = 2; int hi = 2_000_000;
        for (int i = 0; i < 50; i++) {
            if (hi - lo <= 1) break;
            int mid = (lo + hi) /2;
            if (ok(ps, mid)) {
                hi = mid;
            } else {
                lo = mid;
            }
        }

        int ans = hi;
        if (ok(ps, lo)) ans = lo;

        out.println(Math.max(2, ans));
    }

    boolean ok(List<P> ps, int b) {
        int tot = 0;
        for (int i = 0; i < ps.size(); i++) {
            tot += ps.get(i).d / (b + 1);
            if (tot > K) return false;
        }
        return true;
    }
}
