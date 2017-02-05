package fuku;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {

    class P {
        int remain;
        int idx;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        LinkedList<P> r = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            P p = new P();
            p.idx = i + 1;
            p.remain = in.nextInt();
            r.add(p);
        }

        P last = null;
        while (r.size() > 0) {
            last = r.removeFirst();
            if (last.remain <= m) continue;

            last.remain -= m;
            r.addLast(last);
        }

        out.print(last.idx);
    }
}
