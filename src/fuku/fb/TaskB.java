package fuku.fb;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskB {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "new_years_resolution.txt";

        URL inFileUrl = TaskB.class.getResource(inFile);
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
            long gp = in.nextLong();
            long gc = in.nextLong();
            long gf = in.nextLong();

            int N = in.nextInt();

            long[] p = new long[N];
            long[] c = new long[N];
            long[] f = new long[N];

            for (int i = 0; i < N; i++) {
                p[i] = in.nextLong();
                c[i] = in.nextLong();
                f[i] = in.nextLong();
            }

            for (int i = 0; i < (1 << N); i++) {
                long psum = 0;
                long csum = 0;
                long fsum = 0;
                for (int j = 0; j < N; j++) {
                    if (((1<<j) & i) > 0) {
                        psum += p[j];
                        csum += c[j];
                        fsum += f[j];
                    }
                }

                if (psum == gp && csum == gc && fsum == gf) {
                    return "yes";
                }
            }

            return "no";
        }
    }
}


