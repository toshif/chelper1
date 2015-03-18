package atc2015mar18.p2;

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
            StringBuilder s = new StringBuilder(in.nextLine());
            String t = in.nextLine();

            if (s.length() != t.length()) {
                out.println("-1");
                return;
            }

            int N = s.length();
            for (int i = 0; i <= N+1; i++) {
                if (s.toString().equals(t)) {
                    out.println(i);
                    return;
                }

                s.insert(0, s.charAt(N-1));
                s.deleteCharAt(N);
            }

            out.println(-1);
        }
    }

}
