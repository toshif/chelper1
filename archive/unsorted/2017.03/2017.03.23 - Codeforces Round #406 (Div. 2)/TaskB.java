package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int k = in.nextInt();
            Set<Integer> s = new HashSet<>();
            boolean ok = false;
            for (int j = 0; j < k; j++) {
                int v = in.nextInt();
                if (s.contains(-v)) {
                    ok = true;
                }
                s.add(v);
            }

            if (!ok) {
                out.println("YES");
                return;
            }
        }

        out.println("NO");
    }
}
