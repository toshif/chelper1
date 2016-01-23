package fuku.task3;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "yachtzee.txt";

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
        long[] C;

        public String solve(int testNumber, Scanner in, PrintWriter out) {

            N = in.nextInt();
            long A = in.nextLong();
            long B = in.nextLong();

            C = new long[N];
            for (int i = 0; i < N; i++) {
                C[i] = Long.parseLong(in.next());
            }

            // TW
            BigInteger TW = BigInteger.ZERO;
            long L = 0;
            for (int i = 0; i < N; i++) {
                L += C[i];
                BigInteger bc = BigInteger.valueOf(C[i]);
                TW = TW.add(bc.multiply(bc));
            }

            // TA
            BigInteger TA = TW.multiply(BigInteger.valueOf(A / L));
            TA = TA.add(calc(A % L));

            // TB
            BigInteger TB = TW.multiply(BigInteger.valueOf(B / L));
            TB = TB.add(calc(B % L));

            BigDecimal d = new BigDecimal(TB.subtract(TA), new MathContext(200));
            d = d.divide(BigDecimal.valueOf(2 * (B - A)), new MathContext(200));

            String ans = "" + d.doubleValue();
            return ans;
        }

        // A remaining
        BigInteger calc(long A) {
            if (A == 0) return BigInteger.ZERO;

            BigInteger TA = BigInteger.ZERO;
            long tot = 0;
            for (int i = 0; i < N; i++) {
                BigInteger bc = BigInteger.valueOf(C[i]);

                if (tot + C[i] >= A) {
                    // end
                    BigInteger r = new BigInteger("" + (A - tot));
                    TA = TA.add(r.multiply(r));
                    break;
                }

                tot += C[i];
                TA = TA.add(bc.multiply(bc));
            }
            return TA;
        }
    }
}


