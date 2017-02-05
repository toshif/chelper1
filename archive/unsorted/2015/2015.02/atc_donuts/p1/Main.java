package atc1.p1;

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
            int R = in.nextInt();
            int D = in.nextInt();

            double s = 1. * R * R * Math.PI;
            double ds = 2. * D * Math.PI;

            out.println(s * ds);
        }
    }

}
