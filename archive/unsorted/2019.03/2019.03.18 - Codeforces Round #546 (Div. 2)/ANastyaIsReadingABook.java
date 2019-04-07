package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class ANastyaIsReadingABook {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] s = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
            f[i] = in.nextInt();
        }

        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            if (s[i] <= k && k <= f[i]) {
                out.println(n - i);
                return;
            }
        }

    }
}
