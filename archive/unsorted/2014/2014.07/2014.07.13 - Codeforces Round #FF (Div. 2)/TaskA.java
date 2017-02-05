package fuku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int p = in.nextInt();
        int n = in.nextInt();
        HashSet<Integer> m = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            Integer v = Integer.valueOf(in.nextInt() % p);
            if (m.contains(v)) {
                out.print(i);
                return;
            }
            m.add(v);
        }

        out.print(-1);
    }
}
