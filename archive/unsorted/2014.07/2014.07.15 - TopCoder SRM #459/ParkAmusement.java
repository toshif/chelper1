package fuku;

import java.util.ArrayList;

/**
 * 自力で解いた
 *
 * System Test Passed
 *
 */
public class ParkAmusement {

    private int N;
    private int startLanding;
    private int K;
    private char[][] g;
    private ArrayList<Integer> es;
    private ArrayList<Integer> ps;
    private int[] nums;

    public double getProbability(String[] landings, int startLanding, int K) {
        this.startLanding = startLanding;
        this.K = K;
        N = landings.length;

        es = new ArrayList<>();
        ps = new ArrayList<>();
        g = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = landings[i].charAt(j);
                if (g[i][j] == 'E') {
                    es.add(i);
                }
                if (g[i][j] == 'P') {
                    ps.add(i);
                }
            }
        }

        nums = new int[N];
        for (int i = 0; i < N; i++) {
            int num = 0;
            for (int j = 0; j < N; j++) {
                if ( g[i][j] == '1' ) {
                    num++;
                }
            }

            nums[i] = num;
        }

        double tot = 0;
        double it = 0;
        for (int i = 0; i < N; i++) {
            double e = exp(i);
            tot += e;
            if ( i == startLanding ) it = e;
        }

        return it / tot;
    }

    double exp(int start){
        double[][] dp = new double[K+1][N];

        dp[0][start] = 1;
        for (int i = 0; i < K; i++) {

            // j -> k
            for (int j = 0; j < N; j++) {
                int num = nums[j];
                if (num == 0) continue;

                for (int k = 0; k < N; k++) {
                    if (g[j][k] == '1') {
                        dp[i+1][k] += dp[i][j] / (1.0 * num);
                    }
                }
            }
        }

        double tot = 0;
        for (Integer e : es) {
            tot += dp[K][e];
        }

        return tot;
    }
}
