package atc_practice.p1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {

        int H;
        int W;

        int m = 100;

        public void solve(Scanner in, PrintWriter out) {

            H = in.nextInt();
            W = in.nextInt();

            int[][] g = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    g[i][j] = in.nextInt();
                }
            }

            if (totDistance(g) == 0) {
                out.println(0);
                return;
            }

            aStar(g, 1);
            out.println(m);
        }

        Map<String, Integer> cache = new HashMap<String, Integer>();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int aStar (int[][] g, int turn) {
            String key = getKey(g);
            if (cache.containsKey(key)) {
                Integer h = cache.get(key);
                m = Math.min(m, turn + h);
                return h;
            }

            int mi = 1000;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    int d = distance(g, i, j);
                    if (d != 0) {
                        // should move to somewhere
                        for (int k = 0; k < 4; k++) {
                            int x = i + dx[k];
                            int y = j + dy[k];

                            if (x < 0 || H <= x || y < 0 || W <= y) continue;

                            swap(g, i, j, x, y);

                            int totDis = totDistance(g);
                            if (totDis == 0) {
                                m = Math.min(m, turn);
                                mi = 0;
                            } else {
                                if (turn + totDis > 24) {
                                    //
                                } else {
                                    mi = Math.min(mi, aStar(g, turn + 1));
                                }
                            }

                            swap(g, i, j, x, y);
                        }
                    }
                }
            }

            cache.put(key, mi);
            return mi;
        }

        void swap(int[][] g, int x, int y, int x2, int y2){
            int t = g[x][y];
            g[x][y] = g[x2][y2];
            g[x2][y2] = t;
        }

        String getKey(int[][] g) {
            String s = "";
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    s += g[i][j] + " ";
                }
            }
            return s;
        }

        int totDistance(int[][] g) {
            int tot = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    tot += distance(g, i, j);
                }
            }

            return tot;
        }

        int distance(int[][] g, int x, int y) {
            int v = g[x][y]-1;

            if (v == -1) {
                v = W * H - 1;
            }

            int h = v / W;
            int w = v % W;

            return Math.abs(h - x) + Math.abs(w - y);
        }

        int[][] clone(int[][] g) {
            int[][] g2 = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    g2[i][j]= g[i][j];
                }
            }
            return g2;
        }
    }

}
