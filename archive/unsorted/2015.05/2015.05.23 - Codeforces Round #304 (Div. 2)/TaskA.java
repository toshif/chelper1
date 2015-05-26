package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long k = in.nextInt();
        long n = in.nextInt();
        long w = in.nextInt();

        long t = w * (w + 1) / 2 * k - n;
        t = Math.max(0, t);
        out.println(t);
    }
}
