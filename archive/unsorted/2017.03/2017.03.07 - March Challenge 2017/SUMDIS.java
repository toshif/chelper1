package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;

public class SUMDIS {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        long[] c = new long[N];

        for (int i = 0; i < N - 1; i++) {
            a[i] = in.nextLong();
        }
        for (int i = 0; i < N - 2; i++) {
            b[i] = in.nextLong();
        }
        for (int i = 0; i < N - 3; i++) {
            c[i] = in.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            int x = i + 1;
            sum += a[i] * x * (N - x);
        }

        out.println(sum);

    }
}
