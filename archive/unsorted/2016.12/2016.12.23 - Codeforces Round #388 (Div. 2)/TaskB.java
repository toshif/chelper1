package fuku;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            get(x[i], y[i], x[(i + 1) % 3], y[(i + 1) % 3], x[(i + 2) % 3], y[(i + 2) % 3]);
        }

        out.println(s.size());
        for (String s1 : s) {
            out.println(s1);
        }
    }

    Set<String> s = new HashSet<>();

    void get(int x1, int y1, int x2, int y2, int x3, int y3) {
        int xd = x1 - x2;
        int yd = y1 - y2;

        s.add((x3 - xd) + " " + (y3 - yd));
        s.add((x3 + xd) + " " + (y3 + yd));
    }
}
