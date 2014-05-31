package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    int M = 2500;
    int[][] grid = new int[M][M];

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = -1;
        int y = 1000;

        int maxy = 1000;
        int miny = 1000;

        int n = in.nextInt();
        int sign = 1;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();

            for (int j = 0; j < a; j++) {
                x++;
                y += sign;
                grid[x][y] = sign;

                maxy = Math.max(maxy, y);
                miny = Math.min(miny, y);
            }

            y += sign;
            sign *= -1;
        }

        for (int i = maxy; i >= miny; i--) {
            boolean hit = false;
            String row = "";
            for (int j = 0; j <= x; j++) {
                if (grid[j][i] != 0) hit = true;

                if (grid[j][i] == -1) row += "\\";
                if (grid[j][i] == 0) row += " ";
                if (grid[j][i] == 1) row += "/";
            }
            if (hit) out.println(row);
        }
    }
}
