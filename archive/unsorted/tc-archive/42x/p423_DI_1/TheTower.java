
package tc.p423_DI_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class TheTower {

    int[] count(int[] x, int[] y) {
        int N = x.length;

        int[] ret = new int[N];
        Arrays.fill(ret, 1000_000_000);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // meet point
                int x1 = x[i];
                int y1 = y[j];

                LinkedList<Integer> moves = new LinkedList<>();
                for (int k = 0; k < N; k++) {
                    int x2 = x[k];
                    int y2 = y[k];

                    int move = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                    moves.add(move);
                }
                Collections.sort(moves);
                int sum = 0;
                for (int k = 0; k < N; k++) {
                    sum += moves.get(k);
                    ret[k] = Math.min(ret[k], sum);
                }

            }
        }

        return ret;
    }

}

