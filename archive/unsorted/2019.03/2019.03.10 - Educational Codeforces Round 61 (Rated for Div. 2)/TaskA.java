package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (c > 0 && a == 0) {
            out.println(0);
            return;
        }

        if (a != d) {
            out.println(0);
            return;
        }

        out.println(1);
    }
}
