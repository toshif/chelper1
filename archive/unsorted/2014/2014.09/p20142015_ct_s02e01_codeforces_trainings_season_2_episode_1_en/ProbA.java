package p20142015_ct_s02e01_codeforces_trainings_season_2_episode_1_en;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author fuku
 */
public class ProbA {

    public static void main(String[] args) {
        SolX solver = new SolX();
        solver.solve(0,  new Scanner(System.in), new PrintWriter(System.out));
    }

    public static void mainA(String[] args) throws FileNotFoundException {
        InputStream inputStream = ProbA.class.getResourceAsStream("A-small.in");
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(System.out);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.err.println("------------------");
            System.err.println("test " + (i+1));
            SolX solver = new SolX();
            solver.solve(i, in, out);
        }
        out.close();
    }

    private static class SolX {

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] rem = new int[K];
            rem[0] = 1;
            for (int i = 0; i < N; i++) {
                int v = Math.abs(in.nextInt()) % K;

                int[] prev = rem.clone();
                rem = new int[K];

                for (int j = 0; j < K; j++) {
                    if (prev[j] != 0) {
                        rem[(j + v) % K] = 1;
                        rem[(j + K - v) % K] = 1;
                    }
                }
            }

            if (rem[0] == 1) {
                out.println("Divisible");
            } else {
                out.println("Not divisible");
            }
            out.close();
        }
    }

}

