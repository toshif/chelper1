package fuku;

import java.util.Arrays;

public class NegativeGraphDiv2 {
    private int N;
    private int[] s;
    private int[] t;
    private int[] weight;
    private int charges;
    private long[][] dp;
    private long[][] cost;

    public long findMin(int N, int[] s, int[] t, int[] weight, int charges) {
        this.N = N;
        this.s = s;
        this.t = t;
        this.weight = weight;
        this.charges = charges;
        dp = new long[charges+1][N];
        int M = s.length;

        for (int i = 0; i < M; i++) {
            s[i]--;
            t[i]--;
        }

        for (int i = 0; i <= charges; i++) {
            Arrays.fill(dp[i], INF);
        }

        cost = new long[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(cost[i], INF);
        }
        for (int i = 0; i < s.length; i++) {
            cost[s[i]][t[i]] = weight[i];
        }
        dijkstra(0);

        for (int c = 1; c <= charges; c++) {
            for (int j = 0; j < M; j++) {
                dp[c][t[j]] = Math.min(dp[c][t[j]], dp[c-1][s[j]] - weight[j]);
            }
        }

        long mi = INF;
        for (int i = 0; i <= charges; i++) {
            mi = Math.min(mi, dp[i][N-1]);
        }

        return mi;
    }

    static long INF = 1_000_000_000_000_000_000L;

    void dijkstra(int c){
        Arrays.fill(dp[c], INF);
        long[] d = dp[c];
        d[0] = 0;

        boolean[] used  = new boolean[N];
        while(true){
            int v = -1;

            for (int i = 0; i < N; i++) {
                if (!used[i] && (v == -1 || d[i] < d[v])) v = i;
            }

            if (v == -1) break;

            used[v] = true;

            for (int i = 0; i < N; i++) {
                d[i] = Math.min(d[i], d[v] + cost[v][i]);
            }
        }

        //System.out.println("d = " + Arrays.toString(d));
    }
}
