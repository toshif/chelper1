package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int tot = 0;
        StringBuilder b = new StringBuilder();
        if (n % 2 != 0) {
            tot++;
            n -= 3;
            b.append("3");
        }

        int n2 = n / 2;
        for (int i = 0; i < n2; i++) {
            if (b.length() != 0) b.append(" ");
            b.append("2");
        }

        out.println(tot + n2);
        out.println(b.toString());
    }
}
