package fuku;

import java.util.Arrays;

/**
 * System Test Passed
 *
 * Solved after check the editorial
 */
public class SignalIntelligence {
    public long encrypt(int[] numbers) {
        int N = numbers.length;
        Arrays.sort(numbers);

        long mi = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long tot = 0;
            long cu = 0;
            long b = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                int x = numbers[j];

                while (x >= cu){
                    tot += b;
                    cu += b;
                    b *= 2;
                }

                cu = 0;
            }

            tot += numbers[i];
            mi = Math.min(mi, tot);
        }

        return mi;
    }
}
