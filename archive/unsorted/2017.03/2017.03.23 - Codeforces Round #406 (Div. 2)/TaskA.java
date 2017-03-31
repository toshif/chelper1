package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskA {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            int x = b + i * a;
            s.add(x);
        }

        for (int i = 0; i < 100000; i++) {
            int x2 = d + i * c;

            if (s.contains(x2)) {
                out.println(x2);
                return;
            }
        }

        out.println(-1);
    }
}
