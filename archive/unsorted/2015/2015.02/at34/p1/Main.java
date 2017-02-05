package at34.p1;

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
            int N = in.nextInt();
            double ma = 0;
            for (int i = 0; i < N; i++) {
                double tot = 0;
                for (int j = 0; j < 5; j++) {
                    if (j != 4) {
                        tot += in.nextInt();
                    } else {
                        tot += in.nextInt() * 1.0 * 110 / 900;
                    }
                }

                ma = Math.max(ma, tot);
            }

            out.println(ma);
        }
    }

}
