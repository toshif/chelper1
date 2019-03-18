package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class CConnect {

    private int n;
    private boolean[][] m;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        n = in.nextInt();
        int r1 = in.nextInt()-1, c1 = in.nextInt()-1;
        int r2 = in.nextInt()-1, c2 = in.nextInt()-1;
        m = new boolean[n][n];
        used = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            char[] cs = in.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                m[i][j] = cs[j] == '1';
                if (m[i][j]) used[i][j] = true;
            }
        }

        g = new int[n][n];

        int id = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[i][j]) {
                    id++;
                    dfs(i, j, id);
                }
            }
        }

        if (g[r1][c1] == g[r2][c2]) {
            out.println(0);
            return;
        }

        long cost = 1_000_000_000L;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] != g[r1][c1]) continue;

                for (int i2 = 0; i2 < n; i2++) {
                    for (int j2 = 0; j2 < n; j2++) {
                        if (g[i2][j2] != g[r2][c2]) continue;

                        long cost2 = (i - i2) * (i - i2) + (j - j2) * (j - j2);
                        cost = Math.min(cost, cost2);
                    }
                }
            }
        }

        out.println(cost);
    }

    boolean[][] used;
    int[][] g;

    void dfs(int x, int y, int id) {
        used[x][y] = true;
        g[x][y] = id;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (!used[nx][ny]) {
                    dfs(x + dx[i], y + dy[i], id);
                }
            }

        }
    }
}
