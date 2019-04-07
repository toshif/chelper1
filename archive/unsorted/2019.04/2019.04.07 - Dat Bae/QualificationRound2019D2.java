package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class QualificationRound2019D2 {

    static int[] fs = new int[]{1, 2, 4, 8, 16};

    static String[] base = new String[5];

    static String[] sig;

    static String genS(int len, int cycle) {
        String s = "";
        int rem = cycle;
        int next = 1;
        while(s.length() < len) {
            rem--;
            s += next;

            if (rem == 0) {
                rem = cycle;
                next ^= 1;
            }
        }
        return s;
    }

    static {
        String[] vs = new String[5];
        for (int i = 0; i < 5; i++) {
            int cycle = fs[i];
            vs[i] = genS(16, cycle);
            base[i] = genS(1030, cycle);
        }
        sig = genSig(vs);
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int B = in.nextInt();
        int F = in.nextInt();
        in.nextLine();

        String[] res = new String[5];
        for (int i = 0; i < 5; i++) {
            out.println(base[i].substring(0, N));
            out.flush();
            res[i] = in.nextLine();
        }

        String[] resSig = genSig(res);
        int next = 0;
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < resSig.length; i++) {
            if (resSig[i].equals(sig[next % 16])) {
                next++;
                continue;
            } else {
                while(!resSig[i].equals(sig[next % 16])) {
                    missing.add(next);
                    next++;
                }
                next++;
            }
        }
        while(missing.size() < B) {
            missing.add(next);
            next++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < B; i++) {
            sb.append(missing.get(i));
            if (i != B -1 ) {
                sb.append(" ");
            }
        }
        out.println(sb.toString());
        out.flush();

        int result = in.nextInt();
        if (result != 1) {
            throw new RuntimeException("oops");
        }
    }

    static String[] genSig(String[] vs) {
        int len = vs[0].length();
        StringBuilder[] mySig = new StringBuilder[len];
        for (int i = 0; i < len; i++) {
            mySig[i] = new StringBuilder();
        }
        for (int i = 1; i < 1 << 5; i++) {
            int[] tot = new int[len];
            for (int j = 0; j < 5; j++) {
                if ((i & (1 << j)) > 0) {
                    String s = vs[j];
                    for (int k = 0; k < len; k++) {
                        if (s.charAt(k) == '1') {
                            tot[k]++;
                        }
                    }
                }
            }
            for (int j = 0; j < len; j++) {
                mySig[j].append(tot[j]);
            }
        }
        return Arrays.stream(mySig).map(StringBuilder::toString).toArray(String[]::new);
    }
}
