package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = in.nextInt();
        }

        for (int i = 0; i <= n; i++) {
            if (k <= n && k <= i) {
                out.print(ids[k-1]);return;
            }
            k -= i;
            if (k <= n && k <= i) {
                out.print(ids[k-1]);return;
            }
        }
    }
}
