package fuku;

import com.fasterxml.jackson.databind.node.BigIntegerNode;
import utils.io.MyReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class QualificationRoundC {

    private BigInteger[] ci;
    private List<BigInteger> cs;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        String N = in.next();
        int L = in.nextInt();
        ci = new BigInteger[L];
        for (int i = 0; i < L; i++) {
            ci[i] = new BigInteger(in.next());
        }

        HashSet<BigInteger> ss = new HashSet<>();
        for (int i = 0; i < L; i++) {
            for (int j = i + 1; j < L; j++) {
                BigInteger gcd = ci[i].gcd(ci[j]);
                if (!gcd.equals(BigInteger.ONE)) {
                    ss.add(gcd);
                }
            }
        }
        for (int x = 0; x < 30; x++) {
            if (ss.size() == 26) break;

            for (int i = 0; i < L; i++) {
                BigInteger v = ci[i];
                HashSet<BigInteger> ss2 = new HashSet();
                ss2.addAll(ss);
                ss2.forEach(e -> {
                    BigInteger[] dr = v.divideAndRemainder(e);
                    if (dr[1].equals(BigInteger.ZERO) && !ss.contains(dr[0])) {
                        ss.add(dr[0]);
                    }

                });
            }
        }
        cs = ss.stream().sorted().collect(Collectors.toList());
        Map<BigInteger, String> m = new HashMap<>();
        for (int i = 0; i < cs.size(); i++) {
            m.put(cs.get(i), "" + (char)('A' + i));
        }

        BigInteger[] f0 = factor(ci[0]);
        List<BigInteger> res = f2(f0[0]);
        if (res == null) {
            res = f2(f0[1]);
        }
        String ans = "";
        for (BigInteger b: res) {
            ans += m.get(b);
        }
        out.println("Case #" + testNumber + ": " + ans);
    }

    BigInteger[] factor(BigInteger b) {
        for (int i = 0; i < cs.size(); i++) {
            BigInteger[] dr = b.divideAndRemainder(cs.get(i));
            if (dr[1].equals(BigInteger.ZERO)) {
                return new BigInteger[]{cs.get(i), dr[0]};
            }
        }
        throw new RuntimeException("ooops");
    }

    List<BigInteger> f2(BigInteger b0) {
        List<BigInteger> bb = new ArrayList<>();
        bb.add(b0);
        BigInteger prev = b0;
        for (int i = 0; i < ci.length; i++) {
            BigInteger[] dr = ci[i].divideAndRemainder(prev);
            if (!dr[1].equals(BigInteger.ZERO)) {
                return null;
            }
            bb.add(dr[0]);
            prev = dr[0];
        }
        return bb;
    }
}
