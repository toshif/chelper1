package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class RobotProgrammingStrategy {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int A = in.nextInt();
        String[] cs = new String[A];
        for (int i = 0; i < A; i++) {
            cs[i] = in.next();
        }

        String ans = "";
        boolean[] beat = new boolean[A];
        for (int i = 0; i < 500; i++) {
            boolean isP = false;
            boolean isR = false;
            boolean isS = false;
            for (int j = 0; j < A; j++) {
                if (beat[j]) continue;

                char c = cs[j].charAt(i % cs[j].length());
                if (c == 'P') isP = true;
                if (c == 'R') isR = true;
                if (c == 'S') isS = true;
            }

            if (isP && isR && isS) {
                out.println("Case #"  +testNumber+ ": IMPOSSIBLE");
                return;
            }

            char c = 'Z';
            if (isR && isP) c = 'P';
            if (isR && isS) c = 'R';
            if (isP && isS) c = 'S';

            if (c == 'Z') {
                if (isR) c = 'P';
                if (isP) c = 'S';
                if (isS) c = 'R';
            }

            ans += c;

            int doneCnt = 0;
            for (int j = 0; j < A; j++) {
                char op = cs[j].charAt(i % cs[j].length());
                if (c == 'P' && op == 'R') beat[j] = true;
                if (c == 'R' && op == 'S') beat[j] = true;
                if (c == 'S' && op == 'P') beat[j] = true;

                if (beat[j]) doneCnt++;
            }

            if (doneCnt == A) break;
        }

        for (int i = 0; i < A; i++) {
            if ( !beat[i] ) {
                out.println("Case #"  +testNumber+ ": IMPOSSIBLE");
                return;
            }
        }

        out.println("Case #"  +testNumber+ ": " + ans);
    }
}
