package fuku;

public class ShadowSculpture {

    private int N;

    boolean isempty = true;

    int[] dx = {1, -1, 0, 0, 0, 0};
    int[] dy = {0, 0, 1, -1, 0, 0};
    int[] dz = {0, 0, 0, 0, 1, -1};

    boolean[][][] visited;
    private boolean[][] xy;
    private boolean[][] yz;
    private boolean[][] zx;

    private boolean[][] okxy;
    private boolean[][] okyz;
    private boolean[][] okzx;

    public String possible(String[] XY, String[] YZ, String[] ZX) {
        N = XY.length;
        xy = tob(XY);
        yz = tob(YZ);
        zx = tob(ZX);

        visited = new boolean[N][N][N];

        okxy = new boolean[N][N];
        okyz = new boolean[N][N];
        okzx = new boolean[N][N];

        if (isempty) return "Possible";

        // find one
        int ox = -1, oy = 0, oz = 0;
        A:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (xy[i][j]) {
                    for (int k = 0; k < N; k++) {
                        if (yz[j][k] && zx[k][i]) {
                            ox = i;
                            oy = j;
                            oz = k;
                            break A;
                        }
                    }
                }
            }
        }

        if (ox == -1) {
            return "Impossible";
        }

        dfs(ox, oy, oz);

        if (ok(xy, okxy) && ok(yz, okyz) && ok(zx, okzx) ) {
            return "Possible";
        }

        return "Impossible";
    }

    void dfs(int x, int y, int z){
        okxy[x][y] = true;
        okyz[y][z] = true;
        okzx[z][x] = true;

        visited[x][y][z] = true;

        for (int i = 0; i < 6; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            int nz = z + dz[i];

            if (nx < 0 || N <= nx || ny < 0 || N <= ny || nz < 0 || N <= nz) continue;

            if (visited[nx][ny][nz]) continue;

            if ( xy[nx][ny] && yz[ny][nz] && zx[nz][nx] ) {
                dfs(nx, ny, nz);
            }
        }
    }

    boolean ok(boolean[][] ab, boolean[][] okab) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (ab[i][j]) {
                    if (!okab[i][j]) return false;
                }
            }
        }
        return true;
    }

    boolean[][] tob(String[] XY){
        boolean[][] ret = new boolean[N][N];

        for (int i = 0; i < XY.length; i++) {
            for (int j = 0; j < N; j++) {
                ret[i][j] = XY[i].charAt(j) == 'Y';
                if (ret[i][j]) isempty = false;
            }
        }

        return ret;
    }
}
