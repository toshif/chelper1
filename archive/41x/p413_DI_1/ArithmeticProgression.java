
package tc.p413_DI_1;

import java.util.Arrays;

/**
 * impl after the editorial
 *
 * floating point の計算をさけるために、p/q で保持して計算する。
 *
 */
public class ArithmeticProgression {

    double minCommonDifference(int a0, int[] seq){
        int N = seq.length;

        // to avoid floating point, have d = p / q with longs.
        long p = 0, q = 1;

        for (int i = 0; i < N; i++) {
            // an = a0 + d * (i+1)
            // <=> d = (an - a0) / (i+1)
            long an = a0 + (i+1) * p / q;
            if (an != seq[i]){
                p = (seq[i] - a0);
                q = i+1;
            }
        }

        // check
        if (p < 0) return -1;

        for (int i = 0; i < N; i++) {
            long an = a0 + (i+1) * p / q;
            if (an != seq[i]){
                return -1;
            }
        }

        return 1.0 * p / q;
    }

}

