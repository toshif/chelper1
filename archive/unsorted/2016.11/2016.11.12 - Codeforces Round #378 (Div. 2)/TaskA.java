package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        int cnt = 0;
        int ma = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt++;
            char c = s.charAt(i);
            if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
                ma = Math.max(ma, cnt);
                cnt = 0;
            }
        }
        cnt++;
        ma = Math.max(ma, cnt);
        out.println(ma);
    }
}
