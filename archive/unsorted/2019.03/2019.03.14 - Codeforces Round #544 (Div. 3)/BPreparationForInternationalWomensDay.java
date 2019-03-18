package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class BPreparationForInternationalWomensDay {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int[] mods = new int[k];
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            mods[v % k]++;
        }

        int tot = 0;
        tot += mods[0] / 2;
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                tot += Math.min(mods[i], mods[k - i]);
            } else {
                tot += mods[i] / 2;
            }
        }

        out.println(tot * 2);
    }
}
