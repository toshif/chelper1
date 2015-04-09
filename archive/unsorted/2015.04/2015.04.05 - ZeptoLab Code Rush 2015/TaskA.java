package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        char[] cs = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (cs[i] != '*') continue;

            A:
            for (int j = 1; j < 110; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i + j * k >= n) continue A;

                    if (cs[i + j * k] == '.') continue A;
                }

                // ok
                out.println("yes");
                return;
            }
        }

        out.println("no");

    }
}
