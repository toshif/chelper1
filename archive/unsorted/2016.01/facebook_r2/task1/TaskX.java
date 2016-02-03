package fuku.task1;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "boomerang_decoration.txt";

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

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            N = in.nextInt();
            in.nextLine();
            String As = in.nextLine();
            String Bs = in.nextLine();

            // if (testNumber != 2) return " ";

            int[] costL = cost(As.toCharArray(), Bs.toCharArray());
            int[] costR = cost(new StringBuilder(As).reverse().toString().toCharArray(), new StringBuilder(Bs).reverse().toString().toCharArray());

            int min = 1_000_000_00;
            for (int i = 0; i <= N; i++) {
                min = Math.min(min, Math.max(costL[i], costR[N-i]));
            }

            String ans = "" + min;
            return ans;
        }

        int[] cost(char[] A, char[] B) {
            int[] ret = new int[N+1];

            int[] layers = new int[N];
            int ls = 1;
            for (int i = 0; i < N; i++) {
                if (i > 0 && B[i] != B[i-1]) {
                    ls++;
                }
                layers[i] = ls;
            }
            int tot = 0;
            ret[0] = 0;
            for (int i = 1; i <= N; i++) {
                if (A[i-1] != B[i-1]) {
                    ret[i] = layers[i-1];
                } else {
                    if (i == 0) {
                        ret[i] = 0;
                    } else {
                        ret[i] = ret[i-1];
                    }
                }
            }
            return ret;
        }
    }
}


