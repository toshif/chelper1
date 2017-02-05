package fuku.task3;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "the_price_is_correct.txt";

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
            long P = in.nextLong();
            long[] B = new long[N];
            long[] SB = new long[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Long.parseLong(in.next());
                SB[i] = sum;
            }

            long tot = 0;
            for (int i = -1; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    long left = 0;
                    if (i != -1) left = SB[i];
                    long right = SB[j];
                    if (right - left <= P) tot++;
                }
            }

            return "" + tot;
        }
    }
}


