package fuku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    static final ArrayList<C> cs;

    static {
        cs = new ArrayList<>();

        cs.add(new C(new int[]{1, 1}, new int[]{1, -1}, new int[]{0, -1}));
        cs.add(new C(new int[]{1, 1}, new int[]{-1, 1}, new int[]{-1, 0}));
        cs.add(new C(new int[]{1, -1}, new int[]{-1, -1}, new int[]{-1, 0}));
        cs.add(new C(new int[]{-1, 1}, new int[]{-1, -1}, new int[]{0, -1}));

        cs.add(new C(new int[]{1, 0}, new int[]{0, 1}, new int[]{-1, 1}));
        cs.add(new C(new int[]{-1, 0}, new int[]{0, 1}, new int[]{1, 1}));
        cs.add(new C(new int[]{-1, 0}, new int[]{0, -1}, new int[]{1, -1}));
        cs.add(new C(new int[]{1, 0}, new int[]{0, -1}, new int[]{-1, -1}));
    }

    static class C {
        int[] d1;
        int[] d2;

        int[] d3;

        C(int[] d1, int[] d2, int[] d3) {
            this.d3 = d3;
            this.d1 = d1;
            this.d2 = d2;
        }
    }

    static class P {
        int x;
        int y;

        P(){

        }

        P(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean same(P op) {
            return (x == op.x && y == op.y);
        }
    }

    int n;
    int m;

    int[][] g;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();
        in.nextLine();

        g = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            for (int j = 0; j < m; j++) {
                g[i][j] = s.charAt(j);
            }
        }

        int tot = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == '0')
                    tot += check(i, j);
            }
        }

        out.print(tot);

    }

    Map<String, Boolean> cache = new HashMap<>();

    P p1 = new P();
    P p2 = new P();

    P p3 = new P();

    int check(int x, int y) {
        int tot = 0;

        A:
        for (C c : cs) {

            p1.x = x;
            p1.y = y;

            p2.x = x;
            p2.y = y;

            B:
            for (int a = 1; ; a++) {
                p1.x += c.d1[0];
                p1.y += c.d1[1];

                p2.x += c.d2[0];
                p2.y += c.d2[1];

                if (p1.x < 0 || n <= p1.x || p1.y < 0 || m <= p1.y) continue A;
                if (p2.x < 0 || n <= p2.x || p2.y < 0 || m <= p2.y) continue A;

                if (g[p1.x][p1.y] == '1') continue A;
                if (g[p2.x][p2.y] == '1') continue A;

                // check vertical
                boolean isOK = false;
                String h = String.format("%d__%d__%d__%d", p1.x, p1.y, p2.x, p2.y);
                if (cache.containsKey(h)) {
                    isOK = cache.get(h);
                } else {
                    p3.x = p1.x;
                    p3.y = p1.y;

                    while (!p3.same(p2)) {
                        if (g[p3.x][p3.y] == '1') continue B;

                        p3.x += c.d3[0];
                        p3.y += c.d3[1];
                    }

                    // good
                    isOK = true;
                    cache.put(h, true);
                }

                if (isOK)
                    tot++;
            }
        }

        return tot;
    }
}
