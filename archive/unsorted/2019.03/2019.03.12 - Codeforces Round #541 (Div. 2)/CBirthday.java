package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class CBirthday {

    private int n;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int lo = 0;
        int hi = (int)1E-9;
        for (int i = 0; i < 100; i++) {
            int mi = lo + (hi - lo) / 2;
            if (find(a, mi)) {
                hi = mi;
            } else {
                lo = mi;
            }

            if (lo == hi) break;
        }

        int ans = lo;
        if (find(a, hi)) ans = hi;


    }

    boolean find(int[] a, int d) {
        boolean[] used = new boolean[n];
        used[0] = true;
        int prev = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] - a[prev] > d) {
                if (prev == i - 1) return false;

                prev = i - 1;
                used[prev] = true;
            }
        }

        prev = n - 1;
        int potprev = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (used[i]) continue;

            if (a[prev] - a[i] < d) {
                potprev = i;
            } else {
                if (prev == potprev) return false;

                prev = potprev;
            }
        }

        return true;
    }
}
