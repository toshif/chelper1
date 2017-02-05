
package tc.p417_DII_3;

import java.util.Arrays;

/*
sys test passed

確率の問題

独立する二つの変数のとる値を、レンジで確率を計算する。

平面上の面積で計算する。

 */
public class TripleJump {

    private int lower;
    private int upper;

    double[] getProbabilities(int lower, int upper, int first, int[] opponents) {
        this.lower = lower;
        this.upper = upper;
        Arrays.sort(opponents);
        for (int i = 0; i < opponents.length; i++) {
            opponents[i] -= first;
            opponents[i] -= 2 * lower;
        }

        System.err.printf("opponents=%s\n", Arrays.toString(opponents));

        int n = opponents.length;
        double[] ret = new double[n+1];
        for (int i = 0; i < n+1; i++) {
            double sPrev = (i == 0) ? -1E8 : opponents[i-1];
            double s = (i == n) ? 1E8 : opponents[i];

            double p = f(s) - f(sPrev);
            ret[n-i] = p;
        }

        System.err.printf("ret=%s\n", Arrays.toString(ret));

        return ret;
    }

    double f(double s) {
        double t = upper - lower;
        if (s <= 0) return 0;
        if (s <= t) return s * s / 2 / ( t * t );
        if (s <= 2 * t) return (s * s / 2 - (s - t) * (s - t)) / (t * t);

        return 1;
    }

}

