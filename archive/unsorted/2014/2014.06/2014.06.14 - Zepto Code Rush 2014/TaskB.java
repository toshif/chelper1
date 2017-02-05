package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        char[][] g = new char[n][m];
        for (int i = 0; i < n; i++) {
            g[i] = in.nextLine().trim().toCharArray();
            System.err.printf("%s\n", Arrays.toString(g[i]));
        }

        // column s
        for (int s = 0; s < m; s++) {
            int tot = 0;
            for (int i = 0; i < n; i++) {
                if ( g[i][s] == 'U' && i % 2 == 0 ) tot++;
            }
            for (int i = 1; i < n; i++) {
                if (s+i < m && g[i][s+i] == 'L') tot++;
                if (s-i >= 0 && g[i][s-i] == 'R') tot++;
            }

            out.print(tot + " ");
        }
    }
}
