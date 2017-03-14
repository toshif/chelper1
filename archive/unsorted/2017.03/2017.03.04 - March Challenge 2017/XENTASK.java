package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.TreeSet;

public class XENTASK {

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = in.nextInt();
        }

        long sum = 0;
        long sum2 = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum += a[i];
                sum2 += b[i];
            } else {
                sum += b[i];
                sum2 += a[i];
            }
        }

        out.println(Math.min(sum, sum2));
    }
}
