package fuku.fb;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskA {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "A-small.in";

        URL inFileUrl = TaskA.class.getResource(inFile);
        InputStream inputStream = new FileInputStream(inFileUrl.getFile());
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new FileOutputStream(outFile));

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
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

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();
            String ns = "" + N;

            char[] cs = ns.toCharArray();
            int M = cs.length;

            long mi = N;
            long ma = N;
            for (int i = 0; i < M; i++) {
                for (int j = i+1; j < M; j++) {
                    if (i == 0 && cs[j] == '0') continue;

                    // swap i j
                    char[] newCs = cs.clone();
                    newCs[j] = cs[i];
                    newCs[i] = cs[j];

                    long v = Long.parseLong(new String(newCs));
                    mi = Math.min(mi, v);
                    ma = Math.max(ma, v);
                }
            }

            String ans = mi + " " + ma;
            return ans;
        }
    }
}


