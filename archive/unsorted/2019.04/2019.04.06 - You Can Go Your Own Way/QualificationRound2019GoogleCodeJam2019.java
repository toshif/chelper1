package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class QualificationRound2019GoogleCodeJam2019 {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        String ans = solve2(in);
        out.println("Case #" + testNumber + ": " + ans);
    }

    private String solve2(MyReader in) {
        String N = in.nextLine();
        String a = "";
        String b = "";
        A:
        for (int i = 0; i < N.length(); i++) {
            int v = Integer.valueOf("" + N.charAt(i));
            int x = v / 2;
            int y = (v + 1) / 2;

            // 3, 4
            // 4, 4
            // 4, 5
            if (x == 4 || y == 4) {
                x--;
                y++;
            }

            if (!(a.length() == 0 && x == 0)) {
                a += x;
            }
            b += y;
        }

        return a + " " + b;
    }
}
