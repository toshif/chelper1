package fuku;

import utils.data.BIT;
import utils.io.MyReader;
import java.io.PrintWriter;

public class Round1B2019GoogleCodeJam2019 {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int P = in.nextInt();
        int Q = in.nextInt();
        BIT bx = new BIT(Q+1);
        BIT by = new BIT(Q+1);
        for (int i = 0; i < P; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            char d = in.next().toCharArray()[0];
            if (d == 'N') {
                by.add(y+1, 1);
            }
            if (d == 'S') {
                by.add(y, -1);
            }
            if (d == 'E') {
                bx.add(x+1, 1);
            }
            if (d == 'W') {
                bx.add(x, -1);
            }
        }

        int mx = 0;
        long mxv = bx.getHeadSum(0);
        for (int i = 1; i <= Q; i++) {
            if (bx.getHeadSum(i) > mxv) {
                mx = i;
                mxv = bx.getHeadSum(i);
            }
        }

        int my = 0;
        long myv = by.getHeadSum(0);
        for (int i = 1; i <= Q; i++) {
            if (by.getHeadSum(i) > myv) {
                my = i;
                myv = by.getHeadSum(i);
            }
        }

        out.println("Case #" + testNumber + ": " + mx + " " + my);
    }


}
