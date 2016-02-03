package fuku.task2;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX_back1 {
    public static void main(String[] args) throws IOException {
        String inFile = "carnival_coins.txt";

        URL inFileUrl = TaskX_back1.class.getResource(inFile);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

        System.err.printf("Class = [%s]\n", TaskX_back1.class);
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

            double[][] D = new double[N][N+1];
            D[0][0] = 1 - P;
            D[0][1] = P;
            for (int i = 0; i < N-1; i++) {
                for (int j = 0; j < N; j++) {
                    D[i+1][j] += D[i][j] * (1.0-P);
                    D[i+1][j+1] += D[i][j] * P;
                }
            }
            double[] T = new double[N];
            for (int i = 0; i < N; i++) {
                double tot = 0.0;
                for (int j = K; j <= N; j++) {
                    tot += D[i][j];
                }
                T[i] = tot;
            }

            double[] G = new double[N+1];
            for (int i = 0; i < N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i + j > N) continue;

                    double pt = T[j-1];
                    G[i+j] = Math.max(G[i+j], G[i] + pt);
                }
            }

            String ans = "" + G[N];
            return ans;
        }
    }
}


