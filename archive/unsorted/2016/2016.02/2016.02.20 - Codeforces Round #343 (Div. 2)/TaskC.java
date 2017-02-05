package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    static long MOD = 1_000_000_007;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int MID = 0;
        int M = 2005;
        long[][] p = new long[M][M];
        p[MID][MID] = 1;

        for (int i = 0; i < M-1; i++) {
            for (int j = 0; j < M-1; j++) {
                // add open
                p[i+1][j+1] += p[i][j];
                p[i+1][j+1] %= MOD;

                // close
                if (j - 1 >= 0) {
                    p[i + 1][j - 1] += p[i][j];
                    p[i + 1][j - 1] %= MOD;
                }
            }
        }

        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int a = 0;
        int minA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') a++;
            if (s.charAt(i) == ')') a--;
            minA = Math.min(minA, a);
        }
        int aa = Math.abs(a);

        int k = n - m;
        if (k < aa) {
            out.println(0);
            return;
        }

        long tot = 0;
        for (int i = 0; i <= k; i++) {
            for (int j = Math.abs(minA); j <= i; j++) {
                int remainOpen = j + a;
                if (remainOpen < 0) continue;

                tot += (p[MID + i][MID + j] * p[MID + k-i][MID + remainOpen]) % MOD;
                tot %= MOD;
            }
        }

        out.println(tot);
    }

}
