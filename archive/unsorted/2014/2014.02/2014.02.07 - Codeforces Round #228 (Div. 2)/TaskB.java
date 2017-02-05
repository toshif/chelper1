package fuku;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        in.nextLine();
        char[][] g = new char[N][N];
        for (int i = 0; i < N; i++) {
            String s = in.nextLine();
            for (int j = 0; j < N; j++) {
                g[i][j] = s.charAt(j);
            }
//            System.out.println(Arrays.toString(g[i]));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (g[i][j] == '#') {
                    if (j - 1 < 0 || j + 1 >= N || i + 2 >= N) {
                        out.println("NO");
                        return;
                    }
                    if (g[i + 1][j] == '#' && g[i + 1][j - 1] == '#' && g[i + 1][j + 1] == '#' && g[i + 2][j] == '#') {
                        g[i][j] = '.';
                        g[i + 1][j] = '.';
                        g[i + 1][j - 1] = '.';
                        g[i + 1][j + 1] = '.';
                        g[i + 2][j] = '.';
                    } else {
                        out.println("NO");
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (g[i][j] == '#') {
                    out.println("NO");
                    return;
                }
            }
        }

        out.println("YES");
    }

}
