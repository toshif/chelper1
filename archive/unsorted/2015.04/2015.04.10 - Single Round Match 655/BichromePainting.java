package fuku;

import java.util.Arrays;

public class BichromePainting {
    private String[] board;
    private int k;

    public String isThatPossible(String[] board, int k) {
        this.board = board;
        this.k = k;
        int N = board.length;

        if (k == 1) return "Possible";

        if (ok(board)) return "Possible";
        if (ok(flip(board))) return "Possible";

        String[] b = new String[N];
        Arrays.fill(b, "");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i] += board[j].charAt(i);
            }
        }

        if (ok(b)) return "Possible";
        if (ok(flip(b))) return "Possible";

        return "Impossible";
    }

    String[] flip(String[] b) {
        int N = b.length;
        String[] b2 = new String[N];
        for (int i = 0; i < N; i++) {
            b2[i] = board[N-1-i];
        }
        return b2;
    }

    boolean ok(String[] b){
        int N = b.length;
        for (int i = 0; i < N; i++) {
            String s = b[i];
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == 'B') {
                    if (!(k <= j || j + k < N)) {
                        // return false;
                    }
                }
            }
        }

        char[][] c = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                c[i][j] = b[i].charAt(j);
            }
        }

        // check col j
        for (int j = 0; j < N; j++) {
            for (int i = 1; i < k; i++) {
                if (c[i-1][j] != c[i][j]) {
                    // isAllSame = false;

                    // next same
                    if (i-1+k < N) {
                        for (int l = 1; l < k; l++) {
                            if (c[i-1+l][j] != c[i+l][j]) {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }

        }

        return true;
    }

}
