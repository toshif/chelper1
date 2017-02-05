package at34.p2;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            long N = in.nextLong();

            LinkedList<Long> ans = new LinkedList<>();
            for (int i = 0; i < 200; i++) {
                long x = N - i;
                long r = x + f(x);
                if (r == N) {
                    ans.add(x);
                }
            }

            Collections.sort(ans);

            out.println(ans.size());
            for (int i = 0; i < ans.size(); i++) {
                out.println(ans.get(i));
            }
        }

        long f(long x) {
            String s = "" + x;
            long t = 0;
            for (int i = 0; i < s.length(); i++) {
                t += s.charAt(i) - '0';
            }
            return t;
        }
    }

}
