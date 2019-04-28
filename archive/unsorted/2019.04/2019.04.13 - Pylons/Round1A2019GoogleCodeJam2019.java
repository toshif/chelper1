package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class Round1A2019GoogleCodeJam2019 {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int R = in.nextInt();
        int C = in.nextInt();

        boolean flip = false;
        if (R <= C) {
            flip = true;
            int tmp = C;
            C = R;
            R = tmp;
        }

        // R > C
        if (R <= 3) {
            out.println("Case #" + testNumber + ": IMPOSSIBLE");
            return;
        }

        int[][] s = new int[R * C][2];
        int next = 0;
        boolean[] used = new boolean[R];
        int last = -1;
        for (int i = 0; i < R; i++) {
            int bi = i;
            if (i != 0) {
                boolean ok = false;
                for (int x = 0; x < R; x++) {
                    int j = (x + i) % R;
                    if (used[j]) continue;
                    if (Math.abs(last - j) == (C - 1)) continue;
                    if (last == j) continue;

                    // ok
                    bi = j;
                    ok = true;
                    break;
                }
            }
//            System.err.println("chossing bi=" + bi);
            used[bi] = true;
            for (int j = 0; j < C; j++) {
                s[next][0] = j + 1;
                s[next][1] = ((bi + 2 * j) % R) + 1;
                last = ((bi + 2 * j) % R);
                next++;
            }
        }

        out.println("Case #" + testNumber + ": POSSIBLE");
        for (int i = 0; i < s.length; i++) {
            if (flip) {
                out.println(s[i][0] + " " + s[i][1]);
            } else {
                out.println(s[i][1] + " " + s[i][0]);
            }
        }

    }
}
