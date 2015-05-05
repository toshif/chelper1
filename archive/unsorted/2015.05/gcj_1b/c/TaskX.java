package gcj_1b.c;

import java.io.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "X-small.in";

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

        class P {
            double d;
            double s;
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] D = new int[N];
            int[] M = new int[N];
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                D[i] = in.nextInt();
                M[i] = in.nextInt();
                H[i] = in.nextInt();
            }

            List<P> ps = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < H[i]; j++) {
                    P p = new P();
                    p.d = D[i];
                    int m = (M[i] + j);
                    p.s = 1 / m;
                }

            }

            String ans = "1";
            return ans;
        }
    }
}


