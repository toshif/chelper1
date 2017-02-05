package fb.qual.p1;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "progress_pie.txt";

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
            int p = in.nextInt();
            int x = in.nextInt() - 50;
            int y = in.nextInt() - 50;

            double pr = 1.0 * p / 100 * 2 * Math.PI;

            double a = Math.sqrt(1. * x * x + 1. * y * y);
            if (a > 50) return "white";

            double ux = x / a;
            double uy = y / a;

            double c = 0;
            if (0 <= x && 0 <= y) {
                c = Math.asin(ux);
            }
            if (0 <= x && y <= 0) {
                c = Math.PI - Math.asin(ux);
            }
            if (x <= 0 && y <= 0) {
                c = Math.asin(-ux) + Math.PI;
            }
            if (x <= 0 && 0 <= y) {
                c = 2 * Math.PI - Math.asin(-ux);
            }

            if (c < pr) return "black";
            else return "white";
        }
    }
}


