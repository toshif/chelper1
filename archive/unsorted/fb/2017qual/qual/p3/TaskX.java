package fb.qual.p3;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "fighting_the_zombie.txt";

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
            System.err.println("test " + (i + 1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i + 1) + ": " + ans);
            System.err.println("Case #" + (i + 1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int s = in.nextInt();
            in.nextLine();
            String line = in.nextLine();
            String[] ss = line.split(" ");
            double ma = 0;
            for (int i = 0; i < ss.length; i++) {
                ma = Math.max(ma, calc(h, ss[i]));
            }

            String ans = "" + ma;
            return ans;
        }

        double calc(long h, String s1) {
            long z = 0;
            String del = null;
            if (s1.contains("+")) del = "\\+";
            if (s1.contains("-")) del = "-";
            if (del != null) {
                String[] t = s1.split(del);
                z = Long.parseLong(del.replace("\\", "") + t[1]);
                s1 = t[0];
            }

            String[] t2 = s1.split("d");
            int n = Integer.parseInt(t2[0]);
            int dice = Integer.parseInt(t2[1]);

            long[][] dp = new long[30][1000];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 250; j++) {
                    if (dp[i][j] == 0) continue;

                    for (int k = 1; k <= dice; k++) {
                        dp[i + 1][j + k] += dp[i][j];
                        if (dp[i + 1][j + k] < 0) {
                            System.err.println("" + dp[i + 1][j + k]);
                            throw new RuntimeException("oh no overflow");
                        }
                    }
                }
            }

            long tot = 0;
            long win = 0;
            for (int i = 0; i < 300; i++) {
                tot += dp[n][i];
                if (i + z >= h) win += dp[n][i];
            }

            return 1. * win / tot;
        }
    }
}


