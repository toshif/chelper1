package atc1.p2;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Solver().solve(in, out);
        out.flush();
    }



    private static class Solver {

        long[] A;

        long[] bonus;
        List<Long>[] boPpl;

        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
            }

            bonus = new long[M];
            boPpl = new List[M];
            for (int i = 0; i < M; i++) {
                boPpl[i] = new ArrayList();

                bonus[i] = in.nextLong();
                int C = in.nextInt();
                for (int j = 0; j < C; j++) {
                    boPpl[i].add(Long.valueOf(in.nextLong()-1));
                }
            }

            // System.err.printf("A=%s\n", Arrays.toString(A));

            long ma = 0;
            for (int i = 0; i < (1 << N); i++) {
                int numppl = 0;
                long score = 0;
                for (int j = 0; j < N; j++) {
                    if ( ((1<<j) & i) > 0) {
                        numppl++;
                        score += A[j];
                    }
                }
                if (numppl != 9) continue;

                for (int j = 0; j < M; j++) {
                    List<Long> ppl = boPpl[j];
                    int cnt = 0;
                    for (int k = 0; k < N; k++) {
                        if ( ((1<<k) & i) > 0) {
                            if ( ppl.contains(Long.valueOf(k)) ) {
                                cnt++;
                            }
                        }
                    }
                    if (cnt >= 3) {
                        score += bonus[j];
                    }
                }

                // System.err.printf("score=%s, i=%s\n", score, Integer.toBinaryString(i));

                ma = Math.max(ma, score);
            }

            out.println(ma);
        }
    }

}
