package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] m = new int[370];
        int[] f = new int[370];
        for (int i = 0; i < n; i++) {
            String mf = in.next().trim();
            int a = Integer.valueOf(in.next());
            int b = Integer.valueOf(in.next());
            for (int j = a; j <= b; j++) {
                if ("M".equals(mf)) {
                    m[j]++;
                } else {
                    f[j]++;
                }
            }
        }

        int ma = 0;
        for (int i = 0; i < 370; i++) {
            ma = Math.max(ma, Math.min(m[i], f[i]) * 2);
        }

        out.println(ma);

    }
}
