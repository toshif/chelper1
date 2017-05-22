package fuku;

import utils.io.MyReader;
import utils.modPow;
import utils.sort.ArrayShuffle;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

public class TaskC {

    public static final long MOD2 = 1_000_000_007;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextLong();
        }
        ArrayShuffle.shuffle(x);
        Arrays.sort(x);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            int a = i;
            int b = n - 1 - i;
            if (a > 0) {
                ans += (modPow.modPow(2, a) - 1) * x[i];
                ans %= MOD2;
            }
            if (b > 0) {
                ans -= (modPow.modPow(2, b) - 1) * x[i];
                ans %= MOD2;
            }
        }

        ans += MOD2;
        ans %= MOD2;
        out.println(ans);
    }
}
