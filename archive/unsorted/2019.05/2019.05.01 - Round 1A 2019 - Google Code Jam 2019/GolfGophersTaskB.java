package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class GolfGophersTaskB {

    private int n;
    private int m;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int t = in.nextInt();
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < t; i++) {
            sol(in, out);
            int result = in.nextInt();
            if (result != 1) throw new RuntimeException("oops");
        }

    }

    public void test() {
        System.out.println();
    }

    void sol(MyReader in, PrintWriter out) {
        int ma = 0;
        for (int i = 0; i < n; i++) {
            String outStr = "";
            for (int j = 0; j < 18; j++) {
                outStr += "18 ";
            }
            out.println(outStr);
            out.flush();

            int tot = 0;
            for (int j = 0; j < 18; j++) {
                tot += in.nextInt();
            }
            ma = Math.max(ma, tot);
        }
        out.println(ma);
        out.flush();
    }
}
