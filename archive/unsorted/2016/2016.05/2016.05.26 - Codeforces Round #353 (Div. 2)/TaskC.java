package fuku;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        Map<Long, Long> m = new HashMap<>();
        long sum = 0;
        long ma = 0;
        for (int i = 0; i < n; i++) {
            long v = Long.valueOf(in.next());
            sum += v;
            Long su = Long.valueOf(sum);
            if (!m.containsKey(su)) {
                m.put(su, 0L);
            }
            m.put(su, m.get(su) + 1L);
            ma = Math.max(ma, m.get(su));
        }

        out.print(n - ma);

    }
}
