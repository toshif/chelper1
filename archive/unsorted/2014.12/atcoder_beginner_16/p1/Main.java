package fuku.atcoder_beginner_16.p1;

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
            int M = in.nextInt();
            int D = in.nextInt();

            if (M % D == 0) out.println("YES");
            else out.println("NO");
        }
    }

}
