
package tc.p419_DII_3;

import java.util.Arrays;

// passed sys test
// impl by myself
/*
DFS で cycle を detect し、2つ以上その path にあれば　isOk = false として、 ok の component をカウントしていく。
 */
public class CactusCount {

    private int[][] g;
    private int n;
    boolean[][] used;
    int[] visitedv;

    int countCacti(int n, String[] edges){
        this.n = n;
        g = new int[n][n];
        used = new boolean[n][n];
        visitedv = new int[n];
        cycle = new int[n];
        Arrays.fill(cycle, -1);

        String s = "";
        for (String e : edges) {
            s += e;
        }

        if (s.isEmpty()) {
            return n;
        }

        String[] edge = s.split(",");
        for (String e : edge) {
            String[] es = e.split(" ");
            int v1 = Integer.parseInt(es[0]) -1;
            int v2 = Integer.parseInt(es[1]) -1;
            if ( v1 > v2 ) {
                int t = v1;
                v1 = v2;
                v2 = t;
            }
            g[v1][v2] = 1;
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (visitedv[i] > 0) continue;

            System.err.printf("-- start with %d \n", i);
            isOk = true;
            dfs(i);
            if (isOk) {
                System.err.printf("-- %d is ok\n", i);
                cnt++;
            }
        }

        return cnt;
    }

    boolean isOk = true;

    int[] cycle;

    int dfs(int v){
        visitedv[v]++;

        int ret = -1;
        for (int i = 0; i < n; i++) {
            if ((g[v][i] == 1 && !used[v][i]) || (g[i][v] == 1 && !used[i][v])) {
                used[i][v] = true;
                used[v][i] = true;

                if (visitedv[i] > 0) {
                    // found a cycle
                    if (ret != -1) {
                        isOk = false;
                    }
                    ret = i;
                    System.err.printf("found a cycle %s -> %s \n", v, i);
                } else {
                    System.err.printf("visiting %s -> %s \n", v, i);
                    int d = dfs(i);
                    if (d >= 0) {
                        if (ret != -1) {
                            isOk = false;
                        } else {
                            ret = d;
                        }
                    }
                }
            }
        }

        if (ret == v) return -1;
        return ret;
    }

}

