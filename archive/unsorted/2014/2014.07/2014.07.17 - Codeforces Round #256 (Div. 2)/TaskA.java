package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int cups = in.nextInt();
        cups += in.nextInt();
        cups += in.nextInt();

        int medals = in.nextInt();
        medals += in.nextInt();
        medals += in.nextInt();

        int n = in.nextInt();

        int rc = cups / 5;
        if (cups % 5 != 0) rc++;

        int rm = medals / 10;
        if (medals % 10 != 0) rm++;

        if (rc + rm <= n) out.print("YES");
        else out.print("NO");
    }
}
