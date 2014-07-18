package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        char[] cs = s.toCharArray();
        String t = in.nextLine();
        char[] ts = t.toCharArray();

        int[] scnt = new int[27];
        int[] tcnt = new int[27];
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            scnt[c - 'a']++;
        }
        for (int i = 0; i < ts.length; i++) {
            char c = ts[i];
            tcnt[c - 'a']++;
        }

        for (int i = 0; i < 27; i++) {
            if (scnt[i] < tcnt[i]) {
                out.print("need tree");
                return;
            }
        }

        // try automaton
        boolean autoOk = true;
        int fromIndex = 0;
        for (int i = 0; i < ts.length; i++) {
            char c = ts[i];
            fromIndex = s.indexOf(c, fromIndex);
            if (fromIndex == -1) {
                autoOk = false;
                break;
            } else {
                fromIndex++;
            }
        }

        boolean arrayOk = true;
        for (int i = 0; i < 27; i++) {
            if (scnt[i] != tcnt[i]) {
                arrayOk = false;
                break;
            }
        }

        if (autoOk) {
            out.print("automaton");
        } else if (arrayOk) {
            out.print("array");
        } else {
            out.print("both");
        }
    }
}
