package fuku.atbig14.p2;

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
            int X = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            long tot = 0;
            for (int i = 0; i < N; i++) {
                if ((X & (1<<i)) > 0) tot += a[i];
            }
            out.println(tot);
        }
    }

}
