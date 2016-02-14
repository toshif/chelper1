package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] g = new int[n][n];

        int x = 0;
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < n; j++) {
                x++;
                g[j][i] = x;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = k-1; j < n; j++) {
                x++;
                g[i][j] = x;
                if (j == k-1) {
                    sum += x;
                }
            }
        }

        out.println(sum);

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b.append(g[i][j]);
                if (j != n-1) {
                    b.append(" ");
                } else {
                    b.append("\n");
                }
            }
        }
        out.println(b.toString());
    }
}
