package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int v = in.nextInt();

        int c = 0;
        while (a > 0) {
            c++;
            int d = Math.min(k - 1, b);
            b -= d;
            int cap = v * (d + 1);
            a -= cap;
        }

        out.print(c);
    }
}
