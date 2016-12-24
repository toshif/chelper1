package fuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();

        List<Character> cs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            cs.add(s.charAt(i));
        }

        while (true) {
            // check
            int tr = 0;
            int td = 0;
            for (int i = 0; i < cs.size(); i++) {
                Character c = cs.get(i);
                if (c == 'R') tr++;
                if (c == 'D') td++;
            }
            if (tr == 0) {
                out.println("D");
                return;
            }
            if (td == 0) {
                out.println("R");
                return;
            }


            int r = 0;
            int d = 0;

            List<Character> ns = new ArrayList<>();

            for (int i = 0; i < cs.size(); i++) {
                Character c = cs.get(i);
                if (c == 'R') {
                    if (d > 0) {
                        d--;
                    } else {
                        r++;
                        ns.add(c);
                    }
                }

                if (c == 'D') {
                    if (r > 0) {
                        r--;
                    } else {
                        d++;
                        ns.add(c);
                    }

                }
            }

            List<Character> ns2 = new ArrayList<>();
            for (int i = 0; i < ns.size(); i++) {
                Character c = ns.get(i);

                if (c == 'R') {
                    if (d > 0) {
                        d--;
                    } else {
                        ns2.add(c);
                    }
                }

                if (c == 'D') {
                    if (r > 0) {
                        r--;
                    } else {
                        ns2.add(c);
                    }
                }
            }

            cs = ns2;
        }

    }
}
