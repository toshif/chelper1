package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        char[] c = s.toCharArray();
        boolean[] used = new boolean[c.length];
        int tot = 0;

        String n = "nineteen";
        int idx = 0;
        A:
        while(true){
            for (int i = 0; i < c.length; i++) {
                if (used[i]) continue;

                if (c[i] == n.charAt(idx)) {
                    used[i] = true;
                    idx++;

                    if (idx == n.length()) {
                        idx = 1;
                        tot++;
                    }
                    continue A;
                }
            }
            break;
        }

        out.println(tot);
    }
}
