package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskB {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int f = in.nextInt();
        long sum = 0;
        List<Long> vs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long k = in.nextLong();
            long l = in.nextLong();

            sum += Math.min(k, l);
            if (k > l) {
                vs.add(0L);
            } else if (2 * k <= l) {
                vs.add(k);
            } else {
                vs.add(l - k);
            }
        }
        Collections.sort(vs);
        Collections.reverse(vs);
        for (int i = 0; i < f; i++) {
            sum += vs.get(i);
        }

        out.println(sum);
    }
}
