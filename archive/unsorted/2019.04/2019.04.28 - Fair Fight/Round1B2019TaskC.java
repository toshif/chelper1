package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class Round1B2019TaskC {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            D[i] = in.nextInt();
        }

        long tot = 0;
        for (int i = 0; i < N; i++) {
            int mc = 0;
            int md = 0;
            for (int j = i; j < N; j++) {
                mc = Math.max(mc, C[j]);
                md = Math.max(md, D[j]);
                if (Math.abs(mc - md) <= K) tot++;
            }
        }

        out.println("Case #" + testNumber + ": " + tot);
    }
}
