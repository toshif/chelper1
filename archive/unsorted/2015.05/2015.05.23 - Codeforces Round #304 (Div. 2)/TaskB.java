package fuku;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int[] col = new int[N];
        for (int i = 0; i < N; i++) {
            col[i] = in.nextInt();
        }

        long tot = 0;
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            Integer v = Integer.valueOf(col[i]);
            while(s.contains(v)) {
                v = Integer.valueOf(v+1);
                tot++;
            }
            s.add(v);
        }
        out.println(tot);
    }
}
