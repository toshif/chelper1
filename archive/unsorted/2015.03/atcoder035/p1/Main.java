package atcoder.p1;

import java.io.PrintWriter;
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
            String s = in.nextLine();
            char[] cs = s.toCharArray();
            int N = cs.length;

            for (int i = 0; i < N; i++) {
                int j = N - 1 - i;

                if (cs[i] == '*' || cs[j] == '*') continue;
                if (cs[i] != cs[j]) {
                    out.println("NO");
                    return;
                }
            }

            out.println("YES");
        }
    }

}
