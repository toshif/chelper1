package fuku.task2;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "X-small.in";

        URL inFileUrl = TaskX.class.getResource(inFile);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

        System.err.printf("Class = [%s]\n", TaskX.class);
        System.err.printf("Input File = [%s]\n", inFileUrl);
        System.err.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.err.println("------------------");
            System.err.println("test " + (i+1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.err.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        int N;
        int K;
        double P;

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            N = in.nextInt();
            K = in.nextInt();
            P = in.nextDouble();

            if (testNumber != 4) return "";

            final int PRE = 1000;

            BigDecimal[][] D = new BigDecimal[N][N+1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N+1; j++) {
                    D[i][j] = new BigDecimal(0.0, new MathContext(PRE));
                }
            }
            D[0][0] = new BigDecimal(1 - P, new MathContext(PRE));
            D[0][1] = new BigDecimal(P, new MathContext(PRE));
            for (int i = 0; i < N-1; i++) {
                System.err.println("i=" + i);
                for (int j = 0; j < N; j++) {
                    D[i+1][j] = D[i+1][j].add(D[i][j].multiply(new BigDecimal(1.0-P, new MathContext(PRE)))).setScale(PRE, BigDecimal.ROUND_HALF_UP);
                    D[i+1][j+1] = D[i+1][j+1].add(D[i][j].multiply(new BigDecimal(P, new MathContext(PRE)))).setScale(PRE, BigDecimal.ROUND_HALF_UP);
                }
            }
            BigDecimal[] T = new BigDecimal[N];
            for (int i = 0; i < N; i++) {
                BigDecimal tot = new BigDecimal(0, new MathContext(PRE));
                for (int j = K; j <= N; j++) {
                    tot = tot.add(D[i][j]);
                }
                T[i] = tot;
            }

            double me = 0;
            for (int i = 0; i < N; i++) {
                double e = 0;
                int set1 = i+1;
                int set2 = N % set1;
                int numSet1 = N / set1;

                e += numSet1 * T[set1-1].doubleValue();
                if (set2 > 0) {
                    e += T[set2 -1].doubleValue();
                }

                me = Math.max(me, e);
            }

            String ans = "" + me;
            return ans;
        }
    }
}


