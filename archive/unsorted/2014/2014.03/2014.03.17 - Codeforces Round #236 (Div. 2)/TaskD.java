package fuku;

import com.sun.org.apache.regexp.internal.recompile;

import java.util.*;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        Set<Integer> bs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            bs.add(Integer.valueOf(in.nextInt()));
        }

        while (true) {
            int best = 0;
            int br = -1;
            int bg = 1;
            for (int r = 0; r < n; r++) {
                int g = a[0];
                for (int i = 0; i < r; i++) {
                    g = (int)gcd(g, a[i]);
                }

                long[] factors = factor(g);
                int score = 0;
                for (int i = 0; i < factors.length; i++) {
                    if (factors[i] == 1) continue;

                    if (bs.contains(Integer.valueOf((int)factors[i]))) score += (r+1);
                    else score -= (r+1);
                }

                if (score > best) {
                    best = score;
                    br = r;
                    bg = g;
                }
            }

            System.err.println("br=" + br);

            if (br == -1) break;

            for (int i = 0; i <= br; i++) {
                a[i] /= bg;
            }
        }

        System.err.println("a=" + Arrays.toString(a));

        int score = 0;
        for (int i = 0; i < a.length; i++) {
            long[] factors = factor(a[i]);

            for (int j = 0; j < factors.length; j++) {
                if (factors[j] == 1) continue;

                if (bs.contains(Integer.valueOf((int)factors[j]))) score -= 1;
                else score += 1;
            }
        }
        out.println(score);
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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
