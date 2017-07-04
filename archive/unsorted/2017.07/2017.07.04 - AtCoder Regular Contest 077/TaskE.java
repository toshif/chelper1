package fuku;

import utils.data.BIT;
import utils.io.MyReader;

import java.io.PrintWriter;

public class TaskE {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt() - 1;
        }

        BIT bit = new BIT(m + 5);
        long[] fq = new long[m + 5];

        for (int i = 0; i < n - 1; i++) {
            long cost = (a[i + 1] - a[i] - 1 + 2 * m) % m;
            fq[a[i + 1]] += cost;

            if (a[i] == a[i+1]) {}
            else if (a[i] < a[i + 1]) {
                bit.add(a[i] + 1, 1);
                bit.add(a[i + 1], -1);
            } else {
                bit.add(a[i] + 1, 1);
                bit.add(m, -1);

                bit.add(0, 1);
                bit.add(a[i + 1], -1);
            }
        }

        long base = 0;
        for (int i = 0; i < n - 1; i++) {
            int from = a[i];
            if (a[i + 1] < a[i]) from = -1;
            base += (a[i + 1] - from + m) % m;
        }

        long mi = base;
        long tot = base;
        for (int x2 = 1; x2 < m; x2++) {
            int x = x2 - 1;
            tot += fq[x];
            tot -= bit.getHeadSum(x);
//            System.err.printf("x2 = %s, tot = %s\n", x2, tot);
            mi = Math.min(mi, tot);
        }

        out.println(mi);
    }
}
