
package tc.p416_DI_2;

import java.util.Arrays;

/*
passed sys test

impl after read the editorial

DP 、元の dp を変数を”差分”という形にして条件を簡単化、その後 DP の条件式を書くと簡単な式になる。

 */
public class CustomDice {

    int countDice(int M){
        int x = 6 * M - 21;
        if (x < 0) return 0;

        long MOD = 1000000007;

        int N = 6000100;
        long[][] dp = new long[7][N];

        for (int i = 0; i < N; i++) {
            dp[1][i] = i+1;
        }

        for (int v = 2; v <= 6; v++) {
            for (int s = 0; s < N; s++) {
                dp[v][s] += dp[v-1][s] % MOD;
                if (s - v >= 0) {
                    dp[v][s] += dp[v][s-v] % MOD;
                }
            }
        }

        return (int)(dp[6][x] * 30L % MOD);
    }

}

