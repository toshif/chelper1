package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int[] cn = new int[N];
        for (int i = 0; i < N; i++) {
            cn[i] = in.nextInt();
        }

        int mi = 1000_000_000;
        for (int i = 0; i < N; i++) {
            int tot = 0;
            for (int j = 0; j < cn[i]; j++) {
                tot += in.nextInt() * 5 + 15;
            }
            mi = Math.min(mi, tot);
        }

        out.print(mi);
    }
}
