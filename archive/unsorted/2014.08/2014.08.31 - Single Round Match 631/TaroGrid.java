package fuku;

public class TaroGrid {
    public int getNumber(String[] grid) {
        int N = grid.length;
        char[][] g = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = grid[i].charAt(j);
            }
        }

        int ma = 0;
        // col
        for (int i = 0; i < N; i++) {

            // 0: white, 1: black
            for (int k = 0; k < 2; k++) {
                char c = 'W';
                if (k == 1) c = 'B';

                int con = 0;

                // row
                for (int j = 0; j < N; j++) {
                    if (g[j][i] == c) {
                        con++;
                        ma = Math.max(con, ma);
                    } else {
                        con = 0;
                    }

                }

            }

        }

        return ma;
    }
}
