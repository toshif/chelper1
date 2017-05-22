package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        // a / b
        long a = 0; long b = 0;
        for (int i = 0; i < n; i++) {
            a += in.nextInt();
            b++;
        }

        int plus = 0;
        while (Math.round(1.0 * a / b) < k) {
            plus++;
            a += k;
            b++;
        }

        out.println(plus);
    }
}
