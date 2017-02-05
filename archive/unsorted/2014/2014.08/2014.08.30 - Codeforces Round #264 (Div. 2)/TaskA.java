package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int s = in.nextInt();

        LinkedList<Integer> sw = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            int c = in.nextInt();

            if (d < s || (d == s && c == 0)) {
                if (c == 0) sw.add(0);
                else sw.add(100 -c);
            }
        }

        Collections.sort(sw);

        if (sw.size() == 0) out.print(-1);
        else out.print(sw.getLast());
    }
}
