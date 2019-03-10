package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        long c = 0;
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int d = in.nextInt();

            int js = (int)((c - s) / d);
            js--;
            js = Math.max(0, js);

            for (int j = js; j < js + 10000; j++) {
                long day = s + j * d;
                if (day > c) {
                    c = day;
                    break;
                }
            }
        }

        out.println(c);
    }
}
