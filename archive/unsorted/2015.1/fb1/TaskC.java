package fb1;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskC {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "winning_at_sports.txt";

        URL inFileUrl = TaskC.class.getResource(inFile);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new FileOutputStream(outFile));

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        in.nextLine();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        long dp[][]; // myscore, oppscore
        int my;
        int op;

        long MOD = 1_000_000_007;

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            String line = in.nextLine();
            String[] sc = line.split("-");

            my = Integer.parseInt(sc[0]);
            op = Integer.parseInt(sc[1]);

            System.err.printf("my=%s,op=%s\n", my, op);

            stressfree();
            long a1 = dp[my][op];

            stressfull();
            long a2 = dp[op][op];

            String ans = a1 + " " + a2;
            return ans;
        }

        void stressfree(){
            dp = new long[2005][2005];
            dp[1][0] = 1;

            for (int i = 0; i <= my; i++) {
                for (int j = 0; j <= op; j++) {
                    if (i <= j) continue;

                    if (i-1 >= 0 && i-1 > j) {
                        dp[i][j] += dp[i-1][j];
                        dp[i][j] %= MOD;
                    }

                    if (j-1 >= 0 && i > j-1) {
                        dp[i][j] += dp[i][j-1];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }

        void stressfull(){
            dp = new long[2005][2005];
            dp[0][1] = 1;

            for (int j = 0; j <= op; j++) {
                for (int i = 0; i <= op; i++) {
                    if (i > j) continue;

                    if (i-1 >= 0 && i-1 <= j) {
                        dp[i][j] += dp[i-1][j];
                        dp[i][j] %= MOD;
                    }

                    if (j-1 >= 0 && i <= j-1) {
                        dp[i][j] += dp[i][j-1];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }
    }
}


