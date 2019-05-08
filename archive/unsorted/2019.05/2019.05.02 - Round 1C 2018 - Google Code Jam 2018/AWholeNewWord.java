package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class AWholeNewWord {

    private String[] s;
    private int n;
    private int[] cs;
    private int L;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        n = in.nextInt();
        L = in.nextInt();

        s = new String[n];
        cs = new int[26];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
            char[] c = s[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                cs[c[j] - 'A']++;
            }
        }

        for (String s2: s) {
            for (int i = 0; i < L; i++) {
                Character okChar = ok(s2, i);
                if (okChar != null) {
                    char[] cs2 = s2.toCharArray();
                    cs2[i] = okChar;
                    out.println("Case #" + testNumber + ": " + new String(cs2));
                    return;
                }
            }
        }

        for (String s1: s) {
            for (int idx = 0; idx < L; idx++) {
                A:
                for (int i = idx + 1; i < L; i++) {
                    char[] cv = s1.toCharArray();
                    cv[idx] = s1.charAt(i);
                    cv[i] = s1.charAt(idx);
                    String newS = new String(cv);
                    for (int j = 0; j < n; j++) {
                        if (s[j].equals(newS)) continue A;
                    }

                    out.println("Case #" + testNumber + ": " + newS);
                    return;
                }
            }
        }

        out.println("Case #" + testNumber + ": -");
    }

    Character ok(String s1, int idx) {
        int[] cs1 = cs.clone();
        String prefix = s1.substring(0, idx);
        boolean[] used = new boolean[26];
        for (int i = 0; i < n; i++) {
            char a = s[i].charAt(idx);
            if (s1.equals(s[i])) {
                for (int j = 0; j < L; j++) {
                    cs1[s1.charAt(j) - 'A']--;
                }
                used[a - 'A'] = true;
                continue;
            }
            if (s[i].startsWith(prefix)) {
                used[a - 'A'] = true;
                for (int j = 0; j < idx; j++) {
                    cs1[s[i].charAt(j) - 'A']--;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (used[i]) continue;

            if (cs1[i] > 0) return (char)('A' + i);
        }

        return null;
    }
}
