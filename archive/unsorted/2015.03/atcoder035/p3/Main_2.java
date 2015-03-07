package atcoder.p3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            long INF = 1_000_000_000_000_000L;
            long[][] d = new long[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    d[i][j] = INF;
                    if (i == j) d[i][j] = 0;
                }
            }

            for (int i = 0; i < M; i++) {
                int A = in.nextInt()-1;
                int B = in.nextInt()-1;
                int C = in.nextInt();

                d[A][B] = C;
                d[B][A] = C;
            }

            // fw
            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                    }
                }
            }

            long tot = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    tot += d[i][j];
                }
            }

            int K = in.nextInt();
            for (int i = 0; i < K; i++) {
                int A = in.nextInt()-1;
                int B = in.nextInt()-1;
                int C = in.nextInt();

                // no effect
                if (d[A][B] <= C) {
                    out.println(tot);
                    continue;
                }

                // shorter path
                d[A][B] = C;
                d[B][A] = C;

                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        long newDistance = Math.min(d[j][A] + C + d[B][k],
                                d[j][B] + C + d[A][k]);
                        if (newDistance < d[j][k]) {
                            long diff = d[j][k] - newDistance;
                            d[j][k] = newDistance;
                        }
                    }
                }

                long tot2 = 0;
                for (int i2 = 0; i2 < N; i2++) {
                    for (int j2 = i2+1; j2 < N; j2++) {
                        tot2 += d[i2][j2];
                    }
                }

                tot = tot2;

                out.println(tot2);
            }
        }
    }

}
