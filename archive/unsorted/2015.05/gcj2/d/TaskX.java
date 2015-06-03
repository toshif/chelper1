package gcj2.d;

import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "B-small-attempt2.in";

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

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            double V = in.nextDouble();
            double X = in.nextDouble();

            System.err.printf("N=%s, V=%s, X=%s\n", N, V, X);

            double[] R = new double[N];
            double[] C = new double[N];
            for (int i = 0; i < N; i++) {
                R[i] = in.nextDouble();
                C[i] = in.nextDouble();
            }

            System.err.printf("R=%s\n", Arrays.toString(R));
            System.err.printf("C=%s\n", Arrays.toString(C));

            if (N == 1) {
                if (eq(X, C[0])) {
                    // ok
                    double time = V / R[0];
                    return "" + time;
                } else {
                    return "IMPOSSIBLE";
                }
            }

            if (N == 2) {
                if (C[0] < C[1]) {
                    double tc = C[0];
                    double tr = R[0];
                    C[0] = C[1];
                    R[0] = R[1];
                    C[1] = tc;
                    R[1] = tr;
                }

                if (!(C[1] <= X && X <= C[0])) {
                    return "IMPOSSIBLE";
                }

                boolean hit = false;
                double timeC = 100000000000.0;
                if (eq(C[1], X)) {
                    hit = true;
                    timeC = V / R[1];
                }
                if (eq(C[0], X)) {
                    hit = true;
                    timeC = Math.min(timeC, V / R[0]);
                }

                if (hit) {
                    System.err.printf("timeC\n");
                    return "" + timeC;
                }

                double v0 =  (X - C[1]) / (C[0] - C[1]) * V ;
                double time0 = v0 / R[0];
                double time1 = (V - v0) / R[1];

                System.err.printf("v0=%s, V=%s\n", v0, V);
                System.err.printf("xr=%s\n", (v0 * C[0] + (V- v0) * C[1])/V );
//                System.err.printf("tot V = %s vs real V = %s\n", (time0 * v0 + time1 * (V- v0)));

                System.err.printf("tim0=%s, time1=%s\n", time0, time1);

                double time = Math.max(time0, time1);
                return "" + time;
            }

            String ans = "NP";
            return ans;
        }

        boolean eq(double a, double b){
            return Math.abs(a - b) < 1E-9;
        }
    }
}


