package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int p = in.nextInt();

            int c = 0;
            A:
            for (int d = 1; ; d++) {
                for (int j = 0; j < d; j++) {
                    for (int k = j; k < n; k += d) {
                        c++;
                        out.printf("%d %d\n", k + 1, ((k + d) % (n)) + 1);
                        if (c >= 2 * n + p) break A;
                    }
                }
            }
        }

    }
}
