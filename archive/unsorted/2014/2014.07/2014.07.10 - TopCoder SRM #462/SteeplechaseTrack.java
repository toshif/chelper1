package fuku;

import java.util.Arrays;

/**
 * System Test Passed
 */
public class SteeplechaseTrack {
    public int maxComplexity(String[] fences, String[] tracks, int N) {
        int M = fences.length;
        int[][] dp = new int[N+1][M];

        for (int i = 0; i < N + 1; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int i = 0; i < M; i++) {
            int v = fences[i].charAt(1) - '0';
            // System.out.printf("fs = %s\n", fences[i].charAt(1));

            if (v == 0) continue;

            dp[0][i] = v + (fences[i].charAt(0) - '0');
            // System.out.printf("i = %s, dp i = %s\n", i, dp[0][i]);
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dp[i-1][j] == -1) continue;

                for (int k = 0; k < M; k++) {
                    int v = tracks[j].charAt(k) - '0';
                    if (v  == 0) continue;

                    dp[i][k] = Math.max(dp[i][k], dp[i-1][j] + v + (fences[k].charAt(0) - '0'));
                }
            }
        }

        for (int i = 0; i < N + 1; i++) {
            // System.out.println(i + " = " + Arrays.toString(dp[i]));
        }

        int ma = -1;
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < M; j++) {
                int v = fences[j].charAt(2) - '0';
                if (dp[i][j] == -1) continue;
                if (v == 0) continue;

                ma = Math.max(ma, dp[i][j] + v);
            }
        }

        return ma;
    }
}
