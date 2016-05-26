package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x = n / 7;
        int y = n % 7;
        int cnt = x * 2;
        int mi = cnt + Math.min(2, y);
        int ma = cnt + Math.max(y - 5, 0);
        out.println(ma + " " + mi);
    }
}
