package gcj2017.task1;

import java.io.*;
import java.net.URL;
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
            String s = in.next();
            int k = in.nextInt();

            int cnt = 0;
            char[] cs = s.toCharArray();
            for (int i = 0; i < cs.length; i++) {
                if (i + k - 1 == cs.length) break;

                if (cs[i] == '-') {
                    cnt++;
                    for (int j = 0; j < k; j++) {
                        if (cs[i + j] == '-') {
                            cs[i + j] = '+';
                        } else {
                            cs[i + j] = '-';
                        }
                    }
                }
            }

            for (int i = 0; i < cs.length; i++) {
                if (cs[i] != '+') {
                    return "IMPOSSIBLE";
                }
            }

            return "" + cnt;
        }
    }
}


