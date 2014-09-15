package fuku;

import java.util.Arrays;

public class TaroCoins {
    public long getNumber(long N) {
        //System.out.println("Long.toBinaryString(N) = " + Long.toBinaryString(N));
        char[] s = Long.toBinaryString(N).toCharArray();
        int M = s.length;

        long[][] dp = new long[M+1][2];
        dp[0][1] = 1;

        int previ = 0;
        int d = 0;
        for (int i = 1; i < M+1; i++) {
            if ( s[M-(i)] == '0' ) {
                d++;
                continue;
            } else {
                dp[i][1] = dp[previ][0] + dp[previ][1];
                dp[i][0] = d * dp[previ][1] + (d+1) * dp[previ][0];

                d = 0;
                previ = i;
            }

            //System.out.printf("dp %d = %s\n", i, Arrays.toString(dp[i]));
        }

        return dp[M][0] + dp[M][1];
    }
}
