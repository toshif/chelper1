package fuku;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

/*
  This is slow and exceeds the time limit

  http://codeforces.com/contest/396/problem/B
 */
public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] cnOrig = new int[n];
        int[] cn = new int[n];
        for (int i = 0; i < n; i++) {
            cn[i] = in.nextInt();
            cnOrig[i] = cn[i];
        }
        Arrays.sort(cn);

        int m = cn[n-1];
        int cnidx = 0;

        Map<Long, String> record = new HashMap<>();

        long now = 1;
        long next = 2;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (long i = 2; i <= m; i++) {
            if (i == next) {
                now = next;
                while(true) {
                    next++;
                    if ( isPrime(next) ) {
                        break;
                    }
                }
            }

            BigInteger c = BigInteger.valueOf(now * next);

            BigInteger e = a.multiply(c).add(b);
            BigInteger f = b.multiply(c);

            a = e;
            b = f;

            if (cn[cnidx] == i) {
                // record
                record.put(i, a.toString() + "/" + b.toString());
                cnidx++;
            }
        }

        System.err.println("record=" + record);

        for (int i = 0; i < cnOrig.length; i++) {
            out.println(record.get((long)cnOrig[i]));
        }

    }

    boolean isPrime(long n){
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
