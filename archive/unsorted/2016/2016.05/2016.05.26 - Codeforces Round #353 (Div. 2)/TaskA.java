package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {


    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (c < 0) {
            a *= -1;
            b *= -1;
            c *= -1;
        }

        if (b < a || (c == 0 && a != b)) {
            out.print("NO"); return;
        }

        if (b == a) {
            out.print("YES"); return;
        }

        if ((b - a) % c == 0) {
            out.print("YES");
        } else {
            out.print("NO");
        }

    }
}
