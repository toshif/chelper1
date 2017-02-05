package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] fs = new int[s+1];
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            int t = in.nextInt();
            fs[f] = Math.max(fs[f], t);
        }
        int time = 0;
        for (int i = fs.length - 1; i >= 1; i--) {
            int t = fs[i];
            if (time < t) time = t;
            time++;
        }
        out.println(time);
    }
}
