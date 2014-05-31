package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int ans = 1;
        int cap = m;
        for (int i = 0; i < n; i++) {
            int g = in.nextInt();
            if (cap >= g) {
                cap -= g;
            } else {
                cap = m;
                ans++;

                if (g > m){
                    ans += (g / m);
                    g = g - (g / m) * m;
                }

                cap -= g;
            }

        }

        out.println(ans);
    }
}
