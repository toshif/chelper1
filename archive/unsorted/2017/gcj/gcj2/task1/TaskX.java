package gcj.task1;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "A-large.in";

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
            int testNumber = i + 1;
            System.err.println("------------------");
            System.err.println("test " + testNumber);
            Solver solver = new Solver();
            String ans = solver.solve(testNumber, in, out);
            out.println("Case #" + testNumber + ": " + ans);
            System.err.println("Case #" + testNumber + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        int M = 107;

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int P = in.nextInt();
            int[] g = new int[N];
            int[][] dp = new int[200_00_10][4];
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < 4; j++) {
                    dp[i][j] = -1;
                }
            }
            int[] c = new int[3];
            int tot = 0;
            for (int i = 0; i < N; i++) {
                g[i] = in.nextInt() % P;
                if (g[i] > 0) {
                    c[g[i]-1]++;
                } else {
                    tot++;
                }
            }

            int s0 = st(c[0], c[1], c[2]);
            dp[s0][0] = 0;
            for (int i = 200_00_00; i >= 0; i--) {
                for (int j = 0; j < 4; j++) {
                    if (dp[i][j] == -1) continue;

                    int[] dec = de(i);
                    for (int k = 0; k < 3; k++) {
                        int rem = ( j + (k+1) ) % P;
                        if (dec[k] > 0) {
                            dec[k]--;
                            int s1 = st(dec);
                            int ns = dp[i][j];
                            if (j == 0) ns++;

                            dp[s1][rem] = Math.max(dp[s1][rem], ns);
                            dec[k]++;
                        }
                    }

                }
            }

            long ma = 0;
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < 4; j++) {
                    ma = Math.max(ma, dp[i][j]);
                }
            }

            String ans = "" + (ma + tot);
            return ans;
        }

        int st(int[] c){
            return st(c[0], c[1], c[2]);
        }

        int st(int a, int b, int c){
            return a + b * M + c * M * M;
        }

        int[] de(int v) {
            int[] c = new int[3];
            for (int i = 0; i < 3; i++) {
                c[i] = v % M;
                v /= M;
            }
            return c;
        }
    }
}


