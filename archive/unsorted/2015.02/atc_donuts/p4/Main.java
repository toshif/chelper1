package atc1.p4;

import java.io.PrintWriter;
import java.util.Arrays;
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
            int K = in.nextInt();

            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = in.nextInt();
            }
            Arrays.sort(C);

            int[] d = new int[N-1];
            for (int i = 0; i < N-1; i++) {
                d[i] = C[i+1] - C[i];
            }

            Arrays.sort(d);
            int req = N - K;
            int tot = 0;
            for (int i = 0; i < req; i++) {
                tot += d[i];
            }

            out.println(tot);

            int Q = in.nextInt();
            int[] qs = new int[Q];
            for (int i = 0; i < Q; i++) {
                qs[i] = in.nextInt();
            }

            for (int i = 0; i < Q; i++) {
                out.println(tot);
            }
        }
    }

}
