package atc2015mar14.p2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();
            in.nextLine();
            for (int i = 0; i < N; i++) {
                String S = in.nextLine();
                // System.err.printf("\n---\nS=%s\n", S);
                if (check(S)) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }

        }

        boolean check(String s) {
            StringBuilder ind = new StringBuilder("indeednow");
            if (s.length() != ind.length()) return false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int ix = ind.indexOf("" + c);
                if (ix == -1) return false;

                ind.deleteCharAt(ix);
                // System.err.printf("ind=%s\n", ind);
            }

            // System.err.printf("ind end =%s\n", ind);

            return true;
        }
    }



}
