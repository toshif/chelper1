package atc2015mar14.p3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = in.nextInt();
            }

            Arrays.sort(score);

            int Q = in.nextInt();
            for (int i = 0; i < Q; i++) {
                int k = in.nextInt();

                if (score[N-1] == 0) {
                    out.println(0);
                    continue;
                }

                if (k == 0) {
                    out.println(score[N-1]+1);
                    continue;
                }

                int ti = (N-1) - (k-1);
                int x = score[ti];

                if (ti == 0) {
                    out.println(0);
                    continue;
                }

                // is x ok ?
                if (ti != 0 && score[ti-1] == x) {
                    x += 1;
                }

                if (x == 1) x = 0;

                out.println(x);
            }


        }
    }

}
