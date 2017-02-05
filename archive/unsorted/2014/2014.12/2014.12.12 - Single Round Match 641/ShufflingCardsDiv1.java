package fuku;

import java.util.Arrays;

public class ShufflingCardsDiv1 {

    int[] dp;
    int pass;
    int N;

    public int shuffle(int[] permutation) {
        int N2 = permutation.length;
        N = N2 / 2;

        boolean ok = true;
        int odd = 0;
        for (int i = 0; i < N2; i++) {
            if (permutation[i] != (i+1)) ok = false;

            if (permutation[i] % 2 == 1 && ((i+1) % 2 == 1)) odd++;
        }
        if (ok) return 0;

        dp = new int[N+1];
        Arrays.fill(dp, -1);
        pass = N / 2;

        System.err.printf("N=%s, odd=%s, pass=%s\n", N, odd, pass);

        dfs(N-pass, 1);

        return dp[odd];
    }

    void dfs(int odd, int d){
        if (dp[odd] != -1) return;
        dp[odd] = d;

        int even = N - odd;
        for (int p = 0; p <= pass && p <= odd; p++) {
            if (even < pass -p) continue;

        }
        if (odd <= N-pass) {
            for (int i = 0; i <= pass; i++) {
                dfs(odd + i, d+1);
            }
        } else {
            dfs(N-pass, d+1);
        }
    }
}
