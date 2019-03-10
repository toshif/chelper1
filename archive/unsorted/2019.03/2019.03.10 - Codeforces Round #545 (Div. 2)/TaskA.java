package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int ma = 0;
        int prevTotal = 0;
        int currentType = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int v = a[i];
            if (v == currentType) {
                total += 1;
            } else {
                prevTotal = total;
                currentType = v;
                total = 1;
            }
            ma = Math.max(ma, Math.min(prevTotal, total) * 2);
        }

        out.println(ma);
    }
}
