package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        if (x1 == x2) {
            int ay = Math.abs(y2 - y1);
            x3 = x1 + ay;
            y3 = y1;
            x4 = x2 + ay;
            y4 = y2;
        } else if (y1 == y2) {
            int ax = Math.abs(x2 - x1);
            x3 = x1;
            y3 = y1 + ax;
            x4 = x2;
            y4 = y2 + ax;
        } else {
            // x1 != x2 && y 1 != y2

            int ax = Math.abs(x2 - x1);
            int ay = Math.abs(y2 - y1);

            if (ax != ay) {
                out.print(-1);
                return;
            }

            x3 = x1;
            y3 = y2;
            x4 = x2;
            y4 = y1;
        }

        out.printf("%d %d %d %d", x3, y3, x4, y4);
    }
}
