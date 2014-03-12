package fuku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * All test passed. wrote by myself but wasn't within the time.
 *
 * Let's see if this passes the system test once it becomes a practice problem.
 */
public class SpecialCells {
    public int guess(int[] x, int[] y) {
        Set<Integer> xs = new HashSet<>();
        Set<Integer> ys = new HashSet<>();
        for (int i = 0; i < x.length; i++) {
            xs.add(Integer.valueOf(x[i]));
            ys.add(Integer.valueOf(y[i]));
        }

        int[] xsa = new int[xs.size()];
        int c = 0;
        for (int i : xs) {
            xsa[c++] = i;
        }
        c = 0;
        int[] ysa = new int[ys.size()];
        for (int i : ys) {
            ysa[c++] = i;
        }

        int[][] g = new int[xsa.length][ysa.length];
        int[][] g2 = new int[xsa.length][ysa.length];
        for (int i = 0; i < x.length; i++) {
            int gx = 0, gy = 0;
            for (int j = 0; j < xsa.length; j++) {
                if (xsa[j] == x[i]) gx = j;
            }
            for (int j = 0; j < ysa.length; j++) {
                if (ysa[j] == y[i]) gy = j;
            }
            g[gx][gy] = 1;
            g2[gx][gy] = 1;
        }

        int nx = xsa.length;
        int ny = ysa.length;

        while (true) {
            boolean found = false;
            for (int iy = 0; iy < ny; iy++) {
                for (int ix = 0; ix < nx; ix++) {
                    for (int jy = 0; jy < ny; jy++) {
                        for (int jx = 0; jx < nx; jx++) {
                            if (g[ix][iy] == 1 && ( g2[ix][iy] == 1 &&  g2[jx][jy] == 1 ) && (g2[ix][jy] == 0 && g2[jx][iy] == 0 )) {
                                if (g[ix][jy] == 0 || g[jx][iy] == 0) {
                                    g2[ix][jy] = 1;
                                    g2[jx][iy] = 1;

                                    g2[ix][iy] = 0;
                                    g2[jx][jy] = 0;

                                    found = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!found) break;
        }


        int t = 0;
        for (int i = 0; i < nx; i++) {
            for (int j = 0; j < ny; j++) {
                if (g[i][j] == g2[i][j] && g[i][j] == 1) t++;
            }
        }

        return t;
    }
}
