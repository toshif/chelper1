package gcj2.b;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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

        static class P implements Comparable<P> {
            double R;
            double C;
            double eff;


            @Override
            public int compareTo(P o) {
                if (this.eff == o.eff) {
                    if (this.R < o.R) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                if ( this.eff < o.eff ) {
                    return -1;
                } else {
                    return 1;
                }
            }

            @Override
            public String toString() {
                return "P{" +
                        "R=" + R +
                        ", C=" + C +
                        ", eff=" + eff +
                        '}';
            }
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            double V = in.nextDouble();
            double X = in.nextDouble();

            double[] R = new double[N];
            double[] C = new double[N];
            List<P> ps = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                R[i] = in.nextDouble();
                C[i] = in.nextDouble();
                P p = new P();
                p.R = R[i];
                p.C = C[i];
                p.eff = p.R * p.C;
                ps.add(p);
            }

            Collections.sort(ps);
            System.err.printf("ps=%s\n", ps);


            String ans = "1";
            return ans;
        }
    }
}


