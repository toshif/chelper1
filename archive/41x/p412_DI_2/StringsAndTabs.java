
package tc.p412_DI_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * impl by myself
 * passed sys test
 *
 * よく読んで実装問題
 */
public class StringsAndTabs {

    String[] transformTab(String[] tab, int[] stringsA, int[] stringsB, int d){
        int NA = tab.length;
        int L = tab[0].length();

        int N = stringsB.length;
        int[] ord = new int[N];
        boolean[] used = new boolean[N];
        int[] sb = new int[N];

        // order by pitch
        for (int i = 0; i < N; i++) {
            int ma_i = -1000;
            int ma = -1000;
            for (int j = N - 1; j >= 0; j--) {
                if ( used[j] ) continue;

                if (ma < stringsB[j]) {
                    ma = stringsB[j];
                    ma_i = j;
                }
            }

            used[ma_i] = true;
            ord[i] = ma_i;
            sb[i] = stringsB[ma_i];
        }

        int[][] ans = new int[N][L];
        for (int i = 0; i < N; i++) {
            Arrays.fill(ans[i], -1);
        }



        for (int i = 0; i < L; i++) {


            // collect sounds
            LinkedList<Integer> l = new LinkedList<>();
            for (int j = 0; j < NA; j++) {
                int v = d + stringsA[j];
                char c = tab[j].charAt(i);

                if (c == '-') continue;

                if ('0' <= c && c <= '9') v += (c - '0');
                else v += (c - 'A' + 10);

                l.add(v);
            }
            Collections.sort(l);
            Collections.reverse(l);

            boolean fail = false;

            // convert to play
            Arrays.fill(used, false);

            A:
            for (Integer s : l) {
                boolean found = false;
                for (int j = 0; j < N; j++) {
                    if (used[j]) continue;

                    if (sb[j] <= s && s <= sb[j] + 35){
                        found = true;
                        used[j] = true;
                        ans[j][i] = s - sb[j];
                        continue A;
                    }
                }

                if (!found) {
                    fail = true;
                }
            }

            if (fail){
                for (int j = 0; j < N; j++) {
                    ans[j][i] = -2; // FAIL
                }
            }
        }

        String[] ret = new String[N];
        for (int i = 0; i < N; i++) {
            String row = "";
            for (int j = 0; j < L; j++) {
                int v = ans[i][j];
                String c = "";
                if (v == -1) c = "-";
                else if (v == -2) c = "x";
                else if (0 <= v && v <= 9) c ="" + v;
                else c = "" + (char)('A' + (v-10));

                row += c;
            }

            ret[ord[i]] = row;
        }

        for (int i = 0; i < N; i++) {
            System.err.printf("%s\n", ret[i]);
        }


        return ret;
    }

}

