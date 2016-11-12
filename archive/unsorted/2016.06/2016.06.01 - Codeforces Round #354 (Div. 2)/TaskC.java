package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    private int k;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        k = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int m = Math.max(calc(s, 'a'), calc(s, 'b'));
        out.print(m);
    }

    int calc(String s, char a) {
        int[] c = new int[s.length()];
        int cnt= 0;
        int ma = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a == s.charAt(i)) {
                cnt++;
            }
            c[i] = cnt;

            int l = 0;
            int r = i;
            for (int j = 0; j < 100; j++) {
                if (l == r) {
                    break;
                }
                int m = (l + r)/2;
                int mbase = (s.charAt(m) == a) ? 1 : 0;
                if (c[i] - c[m] + mbase > k) {
                    l = m;
                } else {
                    r = m;
                }
            }


            int lbase = (s.charAt(l) == a) ? 1 : 0;
            if (c[i] - c[l] + lbase <= k) {
                ma = Math.max(ma, i - l + 1);
//                System.err.printf("i=%s, l=%s, ma=%s\n", i, l, ma);
            }
            int rbase = (s.charAt(r) == a) ? 1 : 0;
            if (c[i] - c[r] + rbase <= k) {
                ma = Math.max(ma, i - r + 1);
//                System.err.printf("i=%s, r=%s, ma=%s\n", i, r, ma);
            }
        }
        return ma;
    }
}
