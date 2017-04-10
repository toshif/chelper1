package gcj2017.task2;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "B-large.in";

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
            long N = in.nextLong();
            String s = "" + N;
            char[] cs = s.toCharArray();
            A:
            while(true) {
                if (cs[0] <= '0') {
                    break;
                }

                for (int i = 0; i < cs.length - 1; i++) {
                    if (cs[i] > cs[i+1]) {
                        cs[i] = (char)(cs[i] - 1);
                        for (int j = 1; i + j < cs.length; j++) {
                            cs[i + j] = '9';
                        }
                        continue A;
                    }
                }

                break;
            }

            String ans = new String(cs);
            if (ans.charAt(0) == '0') {
                ans = ans.substring(1);
            }
            return ans;
        }
    }
}


