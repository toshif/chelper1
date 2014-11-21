
package tc.p420_DI_2;

// passed sys test
public class RedIsGood {

    double getProfit(int R, int B){
        int N = R + B;

        // memory size 2 * R
        double[][] dp = new double[2][R+1];
        dp[N % 2][R] = R - B;

        // turn
        for (int i = N-1; i >= 0 ; i--) {
            int i_idx = i % 2;

            // number of reds taken
            for (int r = 0; r < R + 1; r++) {
                int b = i - r;
                int rLeft = R - r;
                int bLeft = B - b;

                if (r < 0 || b < 0 || rLeft < 0 || bLeft < 0) continue;

                if (rLeft == 0) {
                    // should end here
                    dp[i_idx][r] = (r - b);
                    continue;
                }

                int vStop = r - b;
                double pNextR = 1.0 * rLeft / (rLeft + bLeft);
                double expNext = pNextR * dp[(i_idx+1) % 2][r+1] + (1-pNextR) * dp[(i_idx+1) % 2][r];

                dp[i_idx][r] = Math.max(vStop, expNext);
            }
        }

        return dp[0][0];
    }

}
