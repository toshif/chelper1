package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class LollipopShop {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            sol(in, out);
        }

    }

    void sol(MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] cnt = new int[n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();

            int[] pref = new int[d];
            for (int j = 0; j < d; j++) {
                pref[j] = in.nextInt();
                cnt[pref[j]]++;
            }

            int minCnt = 100000;
            int minIdx = -1;
            for (int j = 0; j < d; j++) {
                if (used[pref[j]]) continue;
                if (cnt[pref[j]] < minCnt) {
                    minCnt = cnt[pref[j]];
                    minIdx = pref[j];
                }
            }

            if (minIdx != -1) {
                used[minIdx] = true;
            }

            out.println(minIdx);
            out.flush();
        }
    }
}
