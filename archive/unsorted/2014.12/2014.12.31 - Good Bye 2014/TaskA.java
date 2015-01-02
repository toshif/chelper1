package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt() -1;
        int[] an = new int[n];
        for (int i = 0; i < n-1; i++) {
            an[i] = in.nextInt();
        }

        int next = 0;
        while(next <= t && next <= n){
            if (next == t) {
                out.println("YES");
                return;
            }
            next += an[next];
        }

        out.println("NO");
    }
}
