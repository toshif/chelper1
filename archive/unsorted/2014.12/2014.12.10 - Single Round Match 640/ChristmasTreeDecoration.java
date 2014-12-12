package fuku;

import java.util.Arrays;

public class ChristmasTreeDecoration {
    private int[] col;
    private int[] x;
    private int[] y;
    int N;
    int M;
    int[] id;
    int nid;

    public int solve(int[] col, int[] x, int[] y) {
        this.col = col;
        this.x = x;
        this.y = y;

        for (int i = 0; i < x.length; i++) {
            x[i] -= 1;
            y[i] -= 1;
        }

        N = col.length;
        id = new int[N];
        Arrays.fill(id, -1);

        nid = 0;
        M = x.length;

        for (int i = 0; i < N; i++) {
            if (id[i] != -1) continue;

            nid++;
            dfs(i);
        }

        return nid-1;
    }

    void dfs(int v){
        id[v] = nid;

        for (int i = 0; i < M; i++) {
            int nv = y[i];
            if (x[i] == v && id[nv] == -1 && col[x[i]] != col[nv]) {
                dfs(nv);
            }
        }

        for (int i = 0; i < M; i++) {
            int nv = x[i];
            if (y[i] == v && id[nv] == -1 && col[y[i]] != col[nv]) {
                dfs(nv);
            }
        }

    }
}
