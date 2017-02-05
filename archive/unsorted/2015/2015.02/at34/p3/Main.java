package at34.p3;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();

            long ans = 1;
            long MOD = 1_000_000_007;
            int N = 10_000;
            int[] p = new int[N];
            for (int i = B+1; i <= A; i++) {
                long[] fs = factor(i);
                for (int j = 0; j < fs.length; j++) {
                    if (fs[j] >= N) {
                        ans *= 2;
                        ans %= MOD;
                    } else {
                        p[(int)fs[j]]++;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                ans *= (p[i] + 1);
                ans %= MOD;
            }

            out.println(ans);
        }
    }

    static long[] factor(long n) {
        List<Long> ret = new ArrayList<Long>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        // convert to long[]
        long[] arr = new long[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            arr[i] = ret.get(i);
        }

        return arr;
    }

}
