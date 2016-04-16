package gcj2016qr.taskA;

import java.io.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            long N = in.nextInt();

            Set<Character> s = new HashSet<>();
            for (int i = 1; i <= 10_000_000; i++) {
                char[] cs = Long.valueOf(N * (long) i).toString().toCharArray();
                for (int j = 0; j < cs.length; j++) {
                    s.add(Character.valueOf(cs[j]));
                }

                if (s.size() == 10) {
                    return "" + ((long)i * N);
                }
            }
            
            String ans = "INSOMNIA";
            return ans;
        }
    }
}


