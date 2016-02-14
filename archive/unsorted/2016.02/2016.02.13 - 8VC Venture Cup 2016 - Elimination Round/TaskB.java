package fuku;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt(); in.nextLine();
        String s = in.nextLine();
        int[] a = new int[3];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') a[0]++;
            if (c == 'B') a[1]++;
            if (c == 'G') a[2]++;
        }

        search(a[0], a[2], a[1]);

        String ans = "";
        if (y[2]) ans += "B";
        if (y[1]) ans += "G";
        if (y[0]) ans += "R";

        out.println(ans);
    }

    boolean[] y = new boolean[3];

    Set<String> done = new HashSet<>();

    void search(int r, int g, int b) {
        String key = r + "_" + g + "_" + b;
        if (done.contains(key)) return;

        if (r == 1 && g == 0 && b == 0) { y[0] = true; return; }
        if (r == 0 && g == 1 && b == 0) { y[1] = true; return; }
        if (r == 0 && g == 0 && b == 1) { y[2] = true; return; }

        done.add(key);

        if (r > 1) {
            search(r-1, g, b);
        }
        if (g > 1) {
            search(r, g-1, b);
        }
        if (b > 1) {
            search(r, g, b-1);
        }

        if (r > 0 && g > 0) search(r-1, g-1, b+1);
        if (r > 0 && b > 0) search(r-1, g+1, b-1);
        if (g > 0 && b > 0) search(r+1, g-1, b-1);
    }
}
