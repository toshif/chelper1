
package tc.p423_DI_2;

// sys test passed
// impl after read the editorial
/*
(position, next player) という state が WIN するか、LOSE するかを再帰的に決定する.

 // the position's outcome is WIN if there's a move from it that leads to a position with outcome LOSE;
 // the position's outcome is LOSE if all moves from it lead to positions with outcome WIN;

という WIN-LOSE の関係を見つけられるかが鍵。

 */
public class TheEasyChase {

    private int n;
    private int rowWhite;
    private int colWhite;
    private int rowBlack;
    private int colBlack;

    int[] dx = {1, 0, -1, 0, 2, 0, -2, 0};
    int[] dy = {0, 1, 0, -1, 0, 2, 0, -2};

    String winner(int n, int rowWhite, int colWhite, int rowBlack, int colBlack) {
        this.n = n;
        this.rowWhite = rowWhite;
        this.colWhite = colWhite;
        this.rowBlack = rowBlack;
        this.colBlack = colBlack;

        // index: white's place, black's place, next player (0:white, 1:black)
        // value of states: 0 - unknown, 1 - win, 2 - lose
        int[][][][][] states = new int[n][n][n][n][2];
        int[][][][][] moves = new int[n][n][n][n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {

                        for (int m = 0; m < 2; m++) {
                            int d1 = Math.abs(i - k);
                            int d2 = Math.abs(j - l);

                            if (d1 == 0 && d2 == 0) {
                                states[i][j][k][l][m] = 2;
                                moves[i][j][k][l][m] = 0;
                            }
                        }
                    }
                }
            }
        }

        // the position's outcome is WIN if there's a move from it that leads to a position with outcome LOSE;
        // the position's outcome is LOSE if all moves from it lead to positions with outcome WIN;
        // outcome for all other positions is DRAW.

        int currentmove = 0;

        while (true) {
            boolean updates = false;

            // white move, then black move
            for (int m = 0; m < 2; m++) {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < n; l++) {

                                // already known, skip
                                if (states[i][j][k][l][m] != 0) continue;

                                int nextp = (m + 1) % 2;

                                boolean knowsAll = true;
                                boolean foundToWin = false;

                                int maMove = 0;
                                int miMove = 987654321;

                                int mm = (m == 0) ? 4 : 8;
                                B:
                                for (int o = 0; o < mm; o++) {
                                    int ni = i, nj = j, nk = k, nl = l;

                                    if (m == 0) {
                                        ni += dx[o];
                                        nj += dy[o];
                                    } else {
                                        nk += dx[o];
                                        nl += dy[o];
                                    }

                                    if (!(within(ni) && within(nj) && within(nk) && within(nl))) {
                                        continue B;
                                    }

                                    int nv = states[ni][nj][nk][nl][nextp];
                                    int nmove = moves[ni][nj][nk][nl][nextp];

                                    if (nv == 2) {
                                        // found a way to win
                                        foundToWin = true;
                                        miMove = Math.min(miMove, nmove + 1);
                                    }

                                    if (nv == 1) {
                                        // lose
                                        maMove = Math.max(maMove, nmove + 1);
                                    }

                                    if (nv == 0) {
                                        // still unknown
                                        knowsAll = false;
                                    }
                                }

                                if (foundToWin) {
                                    states[i][j][k][l][m] = 1;
                                    moves[i][j][k][l][m] = miMove;
                                    updates = true;
                                } else if (knowsAll) {
                                    // didn't continue A - must lose
                                    states[i][j][k][l][m] = 2;
                                    moves[i][j][k][l][m] = maMove;
                                    updates = true;
                                }
                            }
                        }
                    }
                }
            }

            if (!updates) break;
        }

        int res = states[rowWhite - 1][colWhite - 1][rowBlack - 1][colBlack - 1][0];
        int move = moves[rowWhite - 1][colWhite - 1][rowBlack - 1][colBlack - 1][0];

        if (res == 1) {
            return "WHITE " + move;
        } else {
            return "BLACK " + move;
        }
    }

    boolean within(int x) {
        if (x < 0) return false;
        if (n <= x) return false;

        return true;
    }

}

