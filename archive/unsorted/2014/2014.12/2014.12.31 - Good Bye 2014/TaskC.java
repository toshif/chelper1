package fuku;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> stack = new LinkedList<>();
        int[] order = new int[m];
        for (int i = 0; i < m; i++) {
            order[i] = in.nextInt()-1;
            if (!set.contains(Integer.valueOf(order[i]))) {
                stack.add(Integer.valueOf(order[i]));
                set.add(Integer.valueOf(order[i]));
            }
        }

        long tot = 0;
        for (int i = 0; i < m; i++) {
            int i1 = stack.indexOf(Integer.valueOf(order[i]));
            for (int j = 0; j < i1; j++) {
                tot += w[stack.get(j)];
            }
            Integer tgt = stack.remove(i1);
            stack.addFirst(tgt);
        }

        out.print(tot);
    }
}
