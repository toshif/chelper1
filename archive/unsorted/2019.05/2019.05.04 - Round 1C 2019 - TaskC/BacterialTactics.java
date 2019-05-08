package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class BacterialTactics {

    private boolean[][] mut;
    private int R;
    private int C;
    private Map<String, Boolean> cache;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        R = in.nextInt();
        C = in.nextInt();
        mut = new boolean[R][C];
        cache = new HashMap<>();
        for (int i = 0; i < R; i++) {
            String s = in.next();
            for (int j = 0; j < C; j++) {
                if ( s.charAt(j) == '#' ) mut[i][j] = true;
            }
        }

        int tot = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mut[i][j]) continue;

                if (win(i, j, 'H', 0)) {
             //       System.err.printf("i=%s, j=%s H \n", i, j);
                    tot++;
                }
                if (win(i, j, 'V', 0)) {
             //       System.err.printf("i=%s, j=%s V \n", i, j);
                    tot++;
                }
            }
        }

        out.println("Case #"  + testNumber + ": " + tot);
    }

    boolean win(int x, int y, char type, int state) {
        String key = "" + x + y + type + state;
        if (cache.containsKey(key)) return cache.get(key);

        int[][] st = trans(state);
        boolean dead = move(x, y, type, st);
        if (dead) {
            cache.put(key, false);
            return false;
        }

        int newState = trans(st);

        boolean canNotWin = false;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (st[i][j] == 0) {
                    if (win(i, j, 'H', newState)) {
                        canNotWin = true;
                    }
                    if (win(i, j, 'V', newState)) {
                        canNotWin = true;
                    }
                }
            }
        }

        cache.put(key, !canNotWin);
        return cache.get(key);
    }

    int[][] trans(int state) {
        int[][] ret = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (((1 << (i * R + j)) & state) > 0) {
                    ret[i][j] = 1;
                }
                else if (mut[i][j]) ret[i][j] = 9;
            }
        }
        return ret;
    }

    int trans(int[][] state) {
        int ret = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (state[i][j] == 1) {
                    ret |= (1 << (i * R + j));
                }
            }
        }
        return ret;
    }

    // return true if dead
    boolean move(int x, int y, char type, int[][] state) {
        state[x][y] = 1;

        if (type == 'H') {
            for (int i = x + 1; i < R; i++) {
                if (state[i][y] == 0) state[i][y] = 1;
                else if (state[i][y] == 1) break;
                else if (state[i][y] == 9) return true;
            }

            for (int i = x - 1; i >= 0; i--) {
                if (state[i][y] == 0) state[i][y] = 1;
                else if (state[i][y] == 1) break;
                else if (state[i][y] == 9) return true;
            }
        }

        if (type == 'V') {
            for (int i = y + 1; i < C; i++) {
                if (state[x][i] == 0) state[x][i] = 1;
                else if (state[x][i] == 1) break;
                else if (state[x][i] == 9) return true;
            }

            for (int i = y - 1; i >= 0; i--) {
                if (state[x][i] == 0) state[x][i] = 1;
                else if (state[x][i] == 1) break;
                else if (state[x][i] == 9) return true;
            }
        }

        return false;
    }
}
