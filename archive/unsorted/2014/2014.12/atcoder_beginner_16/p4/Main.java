package fuku.atcoder_beginner_16.p4;

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
            int Ax = in.nextInt();
            int Ay = in.nextInt();
            int Bx = in.nextInt();
            int By = in.nextInt();

            Ax -= Bx;
            Ay -= By;

            int N = in.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt() - Bx;
                y[i] = in.nextInt() - By;
            }

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                int prev = i==0 ? N-1 : i-1;

                int cross1 = Ax * y[i] - x[i] * Ay;
                int cross2 = Ax * y[prev] - x[prev] * Ay;

                if (cross1 * cross2 < 0) cnt++;
            }

            out.println(1 + (cnt / 2));
        }
    }

}
