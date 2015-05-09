package fuku;

import java.util.Set;

public class Similars {

    boolean[] set = new boolean[1<<15];
    int[] on = new int[1<<15];
    int ma = 0;

    public int maxsim(int L, int R) {
        for (int i = 0; i < (1<<14); i++) {
            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                if ((i & (1 <<j)) > 0) cnt++;
            }
            on[i] = cnt;
        }

        for (int i = L; i <= R; i++) {
            String s = "" + i;
            char[] cs = s.toCharArray();
            int flg = 0;
            for (int j = 0; j < cs.length; j++) {
                int d = Integer.valueOf("" + cs[j]);
                flg |= (1 << d);
            }

            // System.err.printf("i=%s, b=%s\n", i, b);
            rec(flg, 0);
        }

        return ma;
    }

    void rec(int flg, int i) {
        if (i == 10) {
            // System.err.printf("flg=%s\n", flg);
            if (set[flg]) {
                // System.err.printf("flg=%s\n", flg);
                ma = Math.max(ma, on[flg]);
            } else {
                set[flg] = true;
            }
            return;
        }

        if ((flg & (1<<i)) == 0) {
            rec(flg, i+1);
        } else {
            rec((flg ^ (1<<i)), i+1);
            rec(flg, i+1);
        }
    }
}
