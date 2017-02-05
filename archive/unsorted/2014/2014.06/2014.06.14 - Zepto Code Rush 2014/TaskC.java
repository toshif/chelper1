package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {

    private long[][] g;
    private int k;
    int ini = 0;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        k = in.nextInt();
        int w = in.nextInt();
        ini = n * m;

        in.nextLine();
        String[] ks = new String[k];
        for (int i = 0; i < k; i++) {
            String k1 = "";
            for (int j = 0; j < n; j++) {
                k1 += in.nextLine().trim();
            }
            ks[i] = k1;
        }

        g = new long[k][k];
        for (int i = 0; i < k; i++) {
            char[] k1 = ks[i].toCharArray();
            for (int j = i+1; j < k; j++) {
                char[] k2 = ks[j].toCharArray();

                long cost = 0;
                for (int l = 0; l < k1.length; l++) {
                    if (k1[l] != k2[l]) cost += w;
                }
                cost = Math.min(cost, n * m);

                g[i][j] = cost;
                g[j][i] = cost;
            }

            System.err.println(Arrays.toString(g[i]));
        }

        int mai = 0;
        long ma = 0;
        for (int i = 0; i < k; i++) {
            long mi = 1_000_000_000;
            for (int j = 0; j < k; j++) {
                if (i == j) continue;

                mi = Math.min(mi, g[i][j]);
            }
            if (ma < mi){
                ma = mi;
                mai = i;
            }
        }

        System.err.println("starting .. " + mai);
        List<String> ss = find(mai);
        for (String s : ss) {
            out.println(s);
        }
    }

    List<String> find(int s){
        LinkedList<String> ret = new LinkedList<>();
        boolean[] used = new boolean[k];
        int un = 0;

        long tot = ini;
        used[s] = true;
        ret.add((s+1) + " " + 0);
        un++;
        while(un < k){
            long mi = 1_000_000_000;
            int x = 0;
            int y = 0;
            for (int i = 0; i < k; i++) {
                if (!used[i]) continue;

                for (int j = 0; j < k; j++) {
                    if (i == j) continue;
                    if (used[j]) continue;

                    if (g[i][j] < mi) {
                        x = i;
                        y = j;
                        mi = g[i][j];
                        // i -> j
                    }
                }
            }

            int prev = x;
            if (g[x][y] == ini) prev = -1;
            ret.add((y+1) + " " + (prev+1));
            used[y] = true;

            tot += g[x][y];
            un++;
        }

        ret.addFirst("" + tot);
        return ret;
    }
}
