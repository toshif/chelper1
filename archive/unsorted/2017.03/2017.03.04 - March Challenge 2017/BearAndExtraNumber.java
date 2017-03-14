package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BearAndExtraNumber {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();

        long[] vs = new long[N];
        for (int i = 0; i < N; i++) {
            vs[i] = in.nextLong();
        }
        Arrays.sort(vs);

        for (int i = 0; i < N - 1; i++) {
            if (vs[i] == vs[i + 1]) {
                out.println(vs[i]);
                return;
            }
        }

        if (vs[0] + 1 != vs[1]) {
            out.println(vs[0]);
            return;
        }

        if (vs[N - 1] - 1 != vs[N - 1]) {
            out.println(vs[N - 1]);
            return;
        }

        for (int i = 1; i < N - 1; i++) {
            if (!(vs[i] - 1 == vs[i-1] && vs[i] + 1 == vs[i+1])) {
                out.println(vs[i]);
                return;
            }
        }

    }
}
