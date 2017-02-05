package fuku;

/**
 * solved by myself
 *
 * System Test Passed
 */
public class BouncingBalls {
    public double expectedBounces(int[] x, int T) {
        int N = x.length;
        long cnt = 0;
        long tot = 0;
        for (int i = 0; i < (1 << N); i++) {
            tot++;
            for (int j = 0; j < N; j++) {
                int left = ((1<<j) & i);
                for (int k = j+1; k < N; k++) {
                    int right = ((1<<k) & i);

                    if (left > 0 && right == 0){
                        if ( 2 * T >=  Math.abs(x[j] - x[k]) ) {
                            cnt++;
                        }
                    }
                }
            }
        }

        return 1.0 * cnt / tot;
    }
}
