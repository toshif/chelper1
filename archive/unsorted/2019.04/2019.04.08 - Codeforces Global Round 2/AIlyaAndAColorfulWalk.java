package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class AIlyaAndAColorfulWalk {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        int left = c[0];
        int right = c[n-1];
        int ma = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if ( c[i] != left) {
                ma = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (c[i] != right) {
                ma = Math.max(ma, n - 1 - i);
                break;
            }
        }
        out.println(ma);
    }
}
