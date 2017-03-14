package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class BandwidthOfAMatrix {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();
        int cnt = 0;
        for (int i = 0; i < N * N; i++) {
            int v = in.nextInt();
            if (v == 1) cnt++;
        }

        for (int i = N; i > 0; i--) {
            if (i == N) {
                cnt -= N;
            } else {
                cnt -= 2 * i;
            }

            if (cnt <= 0) {
                out.println(N - i);
                return;
            }
        }
    }
}
