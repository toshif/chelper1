package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int from = -1;
        int end = -1;
        for (int i = 0; i < n-1; i++) {
            if (a[i] > a[i+1]){
                if (from == -1) {
                    from = i;
                }
                if (end != -1 && end != i) {
                    out.println("no");
                    return;
                }
                end = i+1;
            }
        }

        if (from == -1){
            out.println("yes");
            out.printf("%d %d", 1, 1);
            return;
        }

        int[] b = a.clone();

        for (int i = from; i <= end; i++) {
            int d = i - from;
            b[i] = a[end - d];
        }

        for (int i = 0; i < n-1; i++) {
            if (b[i] > b[i+1]) {
                out.println("no");
                return;
            }
        }

        out.println("yes");
        out.printf("%d %d", from+1, end+1);

    }
}
