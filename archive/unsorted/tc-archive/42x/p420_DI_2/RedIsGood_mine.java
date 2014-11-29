
package tc.p420_DI_2;

// implemented by myself without the editorial
// passed sys test locally - need the memory size fix. O ( R * R ) memory space is too large.
public class RedIsGood_mine {

    double getProfit(int R, int B){
        int N = R + B;

        double[][] dp = new double[N+1][R+1];
        dp[N][R] = R - B;

        // turn
        for (int i = N-1; i >= 0 ; i--) {

            // number of reds taken
            for (int r = 0; r < R + 1; r++) {
                int b = i - r;
                int rLeft = R - r;
                int bLeft = B - b;

                if (r < 0 || b < 0 || rLeft < 0 || bLeft < 0) continue;

                if (rLeft == 0) {
                    // should end here
                    dp[i][r] = (r - b);
                    continue;
                }

                int vStop = r - b;
                double pNextR = 1.0 * rLeft / (rLeft + bLeft);
                double expNext = pNextR * dp[i+1][r+1] + (1-pNextR) * dp[i+1][r];

                dp[i][r] = Math.max(vStop, expNext);
                if (Double.isNaN(dp[i][r])) {
                    System.err.printf("i=%s,r=%s,dp=%s\n", i, r, dp[i][r]);
                }
            }
        }

        return dp[0][0];
    }

}
