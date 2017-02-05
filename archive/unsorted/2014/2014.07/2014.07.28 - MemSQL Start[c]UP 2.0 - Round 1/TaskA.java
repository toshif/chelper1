package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        in.nextLine();
        String s = in.nextLine();

        String[] pok = new String[]{"vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"};

        A:
        for (String p : pok) {
            if (p.length() != s.length()) continue;

            for (int i = 0; i < p.length(); i++) {
                if ( s.charAt(i) == '.' ) continue;
                if ( p.charAt(i) != s.charAt(i) ) continue A;
            }

            // found
            out.println(p);
            return;
        }
    }
}
