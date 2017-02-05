package fuku;

import java.util.Arrays;

public class WolvesAndSheep {
    int[][] g;

    int R;
    int C;

    int[] ru;
    int[] cu;

    public int getmin(String[] field) {
        R = field.length;
        C = field[0].length();

        ru = new int[R-1];
        cu = new int[C-1];

        g = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                g[i][j] = field[i].charAt(j);
            }
        }

        // r -> c
        for (int i = 0; i < R - 1; i++) {
            // can remove ?
            ru[i] = 1;
            if (!ok()) ru[i] = 0;
        }
        for (int i = 0; i < C - 1; i++) {
            cu[i] = 1;
            if (!ok()) cu[i] = 0;
        }

        int n1 = 0;
        for (int i = 0; i < ru.length; i++) {
            if (ru[i] == 0) n1++;
        }
        for (int i = 0; i < cu.length; i++) {
            if (cu[i] == 0) n1++;
        }

        Arrays.fill(ru, 0);
        Arrays.fill(cu, 0);

        // c -> r
        for (int i = 0; i < C - 1; i++) {
            cu[i] = 1;
            if (!ok()) cu[i] = 0;
        }
        for (int i = 0; i < R - 1; i++) {
            ru[i] = 1;
            if (!ok()) ru[i] = 0;
        }

        int n2 = 0;
        for (int i = 0; i < ru.length; i++) {
            if (ru[i] == 0) n2++;
        }
        for (int i = 0; i < cu.length; i++) {
            if (cu[i] == 0) n2++;
        }

        return Math.min(n1, n2);
    }

    boolean ok(){
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (g[i][j] == 'W'){
                    int[] rRange = range(i, ru);
                    int[] cRange = range(j, cu);

                    for (int k = rRange[0]; k <= rRange[1]; k++) {
                        for (int l = cRange[0]; l <= cRange[1]; l++) {
                            if (g[k][l] == 'S') return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    int[] range(int i, int[] use){
        int lo = i;
        int hi = i;
        for (int j = i; j > 0; j--) {
            if (use[j-1] != 1) break;
            lo = j -1;
        }
        for (int j = i; j < use.length; j++) {
            if (use[j] != 1) break;
            hi = j +1;
        }

        //System.out.println("use = " + Arrays.toString(use));
        //System.out.printf("i=%s,lo=%s,hi=%s\n", i, lo, hi);
        return new int[]{lo, hi};
    }
}
