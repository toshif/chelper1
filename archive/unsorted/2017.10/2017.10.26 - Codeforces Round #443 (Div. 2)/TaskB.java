package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        long k = in.nextLong();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (k >= n - 1) {
            out.println(n);
            return;
        }

        int win = 0;
        int idx = 1;
        int p = a[0];
        while(true) {
            idx %= n;
            if (p > a[idx]) {
                win++;
                idx++;
            } else {
                win = 1;
                p = a[idx];
                idx++;
            }

            if (win == k) {
                out.println(p);
                return;
            }
        }
    }
}
