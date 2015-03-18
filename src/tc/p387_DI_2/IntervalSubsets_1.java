
package tc.p387_DI_2;

import java.util.Arrays;

public class IntervalSubsets_1 {

    int N;
    boolean[] used;
    boolean[] used2;
    int id = 0;
    boolean[][] g;
    int[] group;
    int[] d;
    int[] startNode;
    int[] count;

    int numberOfSubsets(int[] start, int[] finish){
        N = start.length;
        used = new boolean[N];
        used2 = new boolean[N];

        g = new boolean[N][N];
        group = new int[N];
        d = new int[N];
        startNode = new int[N+10];
        count = new int[N+10];
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                boolean intersect = false;
                if (start[i] <= start[j] && start[j] <= finish[i]) intersect = true;
                if (start[j] <= start[i] && start[i] <= finish[j]) intersect = true;

                if (intersect) {
                    g[i][j] = true;
                    g[j][i] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (used[i]) continue;

            id++;
            dfs(i);
            startNode[id] = i;
        }

        System.err.printf("group=%s\n", Arrays.toString(group));

        for (int i = 0; i < N; i++) {
            count[group[i]]++;
        }


        System.err.printf("count=%s\n", Arrays.toString(count));

        int tot = 1;
        for (int i = 1; i <= id; i++) {
            if (count[i] == 1) {
                // has to use it
                continue;
            }

            int startN = start[i];
            int totLocal = 0;
            d[startN] = 1;
            used2[startN] = true;
            totLocal += dfs2(startN, true, 2);
            used2[startN] = false;
            totLocal += dfs2(startN, false, 2);
            tot *= totLocal;
        }

        return tot;
    }

    // find connected groups
    void dfs(int node) {
        used[node] = true;
        group[node] = id;
        for (int i = 0; i < N; i++) {
            if (used[i]) continue;

            if (g[node][i]) dfs(i);
        }
    }

    int dfs2(int node, boolean use, int depth) {
        int tot = 0;
        if (use) {
            // if this node is used, all the next nodes shouldn't be used
        } else {
            // chose only one of the children
        }
        return tot;
    }

}

