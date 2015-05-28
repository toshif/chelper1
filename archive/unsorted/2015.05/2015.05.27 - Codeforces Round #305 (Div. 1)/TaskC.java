package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(in.next());
        }

        int[] x = new int[q];
        for (int i = 0; i < q; i++) {
            x[i]  = Integer.valueOf(in.next())-1;
        }

        Set<Integer>[] f = new Set[n];
        for (int i = 0; i < n; i++) {
            List<Long> fs = factor(a[i]);
            int m = fs.size();

            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < (1 << m); j++) {
                int tot = 1;
                for (int k = 0; k < m; k++) {
                    if ((j & (1<<k)) > 0) {
                        tot *= fs.get(k);
                    }
                }
                s.add(Integer.valueOf(tot));
            }

            f[i] = s;
        }

        boolean[] on = new boolean[n];
        long score = 0;
        int tot = 0;
        Set[] cnt = new Set[1000_000];
        for (int i = 0; i < 1000_000; i++) {
            cnt[i] = new HashSet<>();
        }
        for (int i = 0; i < q; i++) {
            int x1 = x[i];
            int v = a[x1];
            Set<Integer> fs = f[x1];

            if (on[x1]) {
                // delete
                Set<Integer> is = new HashSet<>();
                for (Integer fsv : fs) {
                    is.addAll(cnt[fsv]);
                    cnt[fsv].remove(x1);
                }
                score -= (is.size() - 1);
                tot--;
            } else {
                // add
                Set<Integer> is = new HashSet<>();
                for (Integer fsv : fs) {
                    if (fsv != 1) {
                        is.addAll(cnt[fsv]);
                    }
                    cnt[fsv].add(x1);
                }
                score += (tot - is.size());
                tot++;
            }
            out.println(score);
            on[x1] = !on[x1];
        }

    }

    static List<Long> factor(long n) {
        List<Long> ret = new ArrayList<Long>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        return ret;
    }
}
