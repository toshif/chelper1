package fuku;

import utils.io.MyReader;
import utils.prime.PrimeCheck_MillerRabin;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class MegaprimeNumbers {

    private long first;
    private long last;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        first = in.nextLong();
        last = in.nextLong();

        rec("", 0);

        Set<Long> ss2 = null;
        if (first > 1_000_000_000L) {
            TreeSet<Long> ss9 = new TreeSet<>(ss.subSet(200_000_000L, true, 900_000_000L, true));

            TreeSet<Long> vs = new TreeSet<>();
            long a = first / 1_000_000_000L;
            if (ss.contains(Long.valueOf(a))) {
                for (Long s : ss9) {
                    vs.add(a * 1_000_000_000L + s);
                }
            }
            if (ss.contains(Long.valueOf(a + 1))) {
                for (Long s : ss9) {
                    vs.add((a + 1) * 1_000_000_000L + s);
                }
            }
            ss2 = vs.subSet(first, true, last, true);
        } else {
            ss2 = ss.subSet(first, true, last, true);
        }

        long cnt = 0;
        for (Long v : ss2) {
            if (PrimeCheck_MillerRabin.isPrime(v)) {
//            if (BigInteger.valueOf(v).isProbablePrime(2)) {
                System.err.println("" + v);
                cnt++;
            }
        }
        out.println(cnt);
    }

    TreeSet<Long> ss = new TreeSet<>();

    void rec(String s, int depth) {
        if (depth == 9) return;
        int[] a = new int[]{2, 3, 5, 7};
        for (int i = 0; i < a.length; i++) {
            Long v = Long.valueOf(s + a[i]);
            if (v % 2 != 0 || v == 2) {
                ss.add(v);
            }
            rec(s + a[i], depth + 1);
        }
    }
}
