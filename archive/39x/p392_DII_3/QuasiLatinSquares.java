
package tc.p392_DII_3;

import java.util.HashSet;
import java.util.Set;

// passed sys test
// Back-tracking. Faster than expected.
public class QuasiLatinSquares {

    int[][] m;
    private int n;
    private int d;

    int counter = 0;

    String[] makeSquare(int n, int d){
        this.n = n;
        this.d = d;
        m = new int[n][n];

        dfs(0, 0);

        String[] ret = new String[n];
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += m[i][j];

                if (j != n-1) s += " ";
            }
            ret[i] = s;
        }

        for (int i = 0; i < n; i++) {
            System.err.printf("%s\n", ret[i]);
        }

        System.err.printf("counter=%s\n", counter);

        return ret;
    }

    boolean dfs(int r, int c) {
        counter++;

        for (int i = 0; i < d; i++) {
            m[r][c] = i;

            // check r
            Set<Integer> s = new HashSet<>();

            s.clear();
            for (int j = 0; j <= c; j++) {
                s.add(Integer.valueOf(m[r][j]));
            }
            int remain = (n - (c+1));
            if (remain < d - s.size() ) continue;

            // check c
            s.clear();
            for (int j = 0; j <= r; j++) {
                s.add(Integer.valueOf(m[j][c]));
            }
            remain = (n - (r+1));
            if (remain < d - s.size() ) continue;

            // ok to put i on r, c.
            // check next cell

            if (r == n-1 && c == n-1) return true;

            int next = n * r + c + 1;
            if ( dfs(next / n, next % n) ) {
                return true;
            } else {
                continue;
            }
        }

        return false;
    }

}

