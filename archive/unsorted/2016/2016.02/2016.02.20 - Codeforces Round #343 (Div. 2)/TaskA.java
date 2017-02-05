package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        in.nextLine();
        char[][] c = new char[n][n];
        for (int i = 0; i < n; i++) {
            char[] cs = in.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                c[i][j] = cs[j];
            }
        }

        // row
        int tot = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (c[i][j] != 'C') continue;
                for (int k = j+1; k < n; k++) {
                    if (c[i][k] == 'C') tot++;
                }
            }
        }

        // col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (c[j][i] != 'C') continue;
                for (int k = j+1; k < n; k++) {
                    if (c[k][i] == 'C') tot++;
                }
            }
        }

        out.println(tot);
    }
}
