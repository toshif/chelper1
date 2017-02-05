package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        String s = in.nextLine();
        String su = in.nextLine();
        int len = su.length();

        int count = 0;
        int idx = 0;
        while(idx >= 0) {
            int ni = s.indexOf(su, idx);
            if (ni >= 0) count++;
            if (ni < 0) break;
            idx = ni + len;
        }

        out.println(count);

    }
}
