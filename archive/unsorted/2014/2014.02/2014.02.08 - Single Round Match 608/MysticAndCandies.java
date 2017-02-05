package fuku;

import java.util.Arrays;

public class MysticAndCandies {
    public int minBoxes(int C, int X, int[] low, int[] high) {
        Arrays.sort(low);
        int need = X;
        int used = 0;
        for (int i = low.length - 1; i >= 0; i--) {
            need -= low[i];
            used++;
            if (need <= 0){
                break;
            }
        }
        int res = used;

        Arrays.sort(high);
        need = C - X;
        used = high.length;
        for (int i = 0; i < high.length; i++) {
            int h = high[i];
            need -= h;
            used--;
            if (need < 0){
                used++;
                break;
            }
        }

        return Math.min(res, used);
    }
}
