package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt(); in.nextLine();
        String s = in.nextLine();

        int tot = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                int x = 0;
                int y = 0;
                for (int k = 0; k < sub.length(); k++) {
                    if ('U' == sub.charAt(k)) x++;
                    if ('D' == sub.charAt(k)) x--;
                    if ('L' == sub.charAt(k)) y++;
                    if ('R' == sub.charAt(k)) y--;
                }
                if (x == 0 && y == 0) tot++;
            }
        }

        out.println(tot);
    }
}
