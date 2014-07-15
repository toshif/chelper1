package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        int k = in.nextInt();
        int[] w = new int['z' - 'a' + 1];
        int ma = 0;

        for (int i = 0; i < w.length; i++) {
            w[i] = in.nextInt();
            ma = Math.max(ma, w[i]);
        }

        long tot = 0;
        for (int i = 0; i < s.length(); i++) {
            tot += w[( s.charAt(i) - 'a' )] * (i + 1);
        }

        int k1 = s.length();
        for (int i = 1; i <= k; i++) {
            tot += ma * (k1 + i);
        }

        out.print(tot);
    }
}
