package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CNastyaIsTransposingMatrices {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] x = new int[n][m];
        Map<Integer, Integer> x0 = new HashMap<>();
        Map<Integer, Integer> x1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int v = in.nextInt();
                x[i][j] = v;

                Map<Integer, Integer> lm = x0;
                if ((i + j) % 2 != 0) lm = x1;

                if (!lm.containsKey(v)) {
                    lm.put(v, 0);
                }
                lm.put(v, lm.get(v) + 1);
            }
        }
        int[][] y = new int[n][m];
        Map<Integer, Integer> y0 = new HashMap<>();
        Map<Integer, Integer> y1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int v = in.nextInt();
                y[i][j] = v;

                Map<Integer, Integer> lm = y0;
                if ((i + j) % 2 != 0) lm = y1;

                if (!lm.containsKey(v)) {
                    lm.put(v, 0);
                }
                lm.put(v, lm.get(v) + 1);
            }
        }

        if (x[0][0] != y[0][0] || x[n-1][m-1] != y[n-1][m-1]) {
            out.println("NO");
            return;
        }

        for (Map.Entry<Integer, Integer> e : x0.entrySet()) {
            if (!y0.containsKey(e.getKey()) || e.getValue() != y0.get(e.getKey())) {
                out.println("NO");
                return;
            }
        }

        for (Map.Entry<Integer, Integer> e : x1.entrySet()) {
            if (!y1.containsKey(e.getKey()) || e.getValue() != y1.get(e.getKey())) {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
    }
}
