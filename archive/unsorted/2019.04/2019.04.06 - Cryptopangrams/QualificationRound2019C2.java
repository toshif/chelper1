package fuku;

import utils.io.MyReader;
import utils.prime.SieveOfEratosthenes;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class QualificationRound2019C2 {

    static boolean[] isPrime;

    static {
        isPrime = SieveOfEratosthenes.getPrimeCheckArray(10_005);
    }

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        String N = in.next();
        int L = in.nextInt();
        long[] ci = new long[L];
        for (int i = 0; i < L; i++) {
            ci[i] = in.nextLong();
        }
        A:
        for (int i = 2; i < 10_005; i++) {
            if (!isPrime[i]) continue;

            Set<Long> ss = new HashSet<>();
            List<Long> res = new ArrayList<>();

            long prev = i;
            ss.add(prev);
            res.add(prev);
            for (int j = 0; j < L; j++) {
                if (ci[j] % prev != 0) continue A;

                prev = ci[j] / prev;
                ss.add(prev);
                res.add(prev);
            }


            List<Long> cs = ss.stream().sorted().collect(Collectors.toList());
            Map<Long, String> m = new HashMap<>();
            for (int i2 = 0; i2 < cs.size(); i2++) {
                m.put(cs.get(i2), "" + (char) ('A' + i2));
            }
            String ans = "";
            for (int j = 0; j < res.size(); j++) {
                ans += m.get(res.get(j));
            }

            out.println("Case #" + testNumber + ": " + ans);

            return;
        }
    }
}
