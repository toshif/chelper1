
package tc.p421_DI_2;

import java.util.Arrays;

// passed sys test
// implemented after read the editorial
public class CakesEqualization {

    double fairDivision(int[] weights, int maxCuts){
        int N = weights.length;
        double[] w = new double[N];
        for (int i = 0; i < N; i++) {
            w[i] = weights[i];
        }
        int[] numCuts = new int[N];
        Arrays.fill(numCuts, 1);

        double ret = 1E100;
        for (int i = 0; i < maxCuts+1; i++) {
            // find highest & lowest
            double ma = 0;
            int ma_i = -1;
            double mi = 1000_000_000;
            for (int j = 0; j < N; j++) {
                if (ma < w[j]/numCuts[j]) {
                    ma = w[j]/numCuts[j];
                    ma_i = j;
                }
                mi = Math.min(mi, w[j]/numCuts[j]);
            }

            double diff = ma - mi;
            ret = Math.min(diff, ret);

            numCuts[ma_i]++;
        }

        return ret;
    }

}

