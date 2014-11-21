
package tc.p420_DI_2;

public class RedIsGood_first {

    double getProfit(int R, int B){
        int N = R + B;

        double[][] dp = new double[N+1][R+1];
        dp[0][0] = 1;

        double exp = 0;

        // turn
        for (int i = 0; i < N; i++) {

            // number of reds taken
            for (int r = 0; r < R + 1; r++) {
                int b = i - r;
                int rLeft = R - r;
                int bLeft = B - b;

                if (r < 0 || b < 0) continue;

                if (rLeft == 0) {
                    // should end here
                    System.err.printf("end r=%s, b=%s, p=%s \n", r, b, dp[i][r]);
                    exp += dp[i][r] * (r - b);
                    continue;
                }

                double pNextR = 1.0 * rLeft / (rLeft + bLeft);
                if (pNextR < 0.5 ) {
                    // should end
                    System.err.printf("end r=%s, b=%s, p=%s \n", r, b, dp[i][r]);
                    exp += dp[i][r] * (r - b);
                    continue;
                } else {
                    // should take next
                    dp[i+1][r+1] += pNextR * dp[i][r];
                    dp[i+1][r] += (1.0-pNextR) * dp[i][r];
                }

            }
        }

        for (int i = 0; i < R + 1; i++) {
            exp += dp[N][i] * (R-B);
        }

        return exp;
    }

}

