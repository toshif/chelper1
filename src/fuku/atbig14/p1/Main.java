package fuku.atbig14.p1;

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
            int a = in.nextInt();
            int b = in.nextInt();

            if (a % b == 0) out.println(0);
            else out.println(b - a % b);
        }
    }

}
