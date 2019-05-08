package fuku;

import utils.Permutation;
import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class PowerArrangers {

    private int F;

    public void solve(int testNumber, MyReader in, PrintWriter out) {

        int t = in.nextInt();
        F = in.nextInt();

        for (int i = 0; i < t; i++) {
            sol(in, out);
            String result = in.next();
            if (!result.equals("Y")) throw new RuntimeException("oops");
        }

    }

    void sol(MyReader in, PrintWriter out) {
        Permutation p = new Permutation(5);
        Map<String, String> m = new HashMap<>();
        int[] pp = null;
        while ((pp = p.nextPermutation()) != null) {
            String s = "";
            for (int i = 0; i < 5; i++) {
                s += (char)(pp[i] + 'A');
            }

            m.put(s.substring(0, 4), s);
        }

        int[] ret = new int[5];

        int cnt = 0;
        A:
        for (int i = 0; i < 119; i++) {
            String prefix = "";
            for (int j = 0; j < 4; j++) {
                cnt++;
                if (cnt > F) break A;
                out.println(1 + (5 * i) + j);
                out.flush();
                char c = in.next().toCharArray()[0];
                ret[c - 'A']++;
                prefix += c;
            }
            m.remove(prefix);

            if (i == 118) {
                for (String key : m.keySet()) {
                    if (key.startsWith(prefix)) {
                        m.remove(key);
                        break;
                    }
                }
            }
        }

        String ans = "";
        for (Map.Entry<String, String> e : m.entrySet()) {
            ans = e.getValue();
        }
        out.println(ans);
        out.flush();

    }
}
