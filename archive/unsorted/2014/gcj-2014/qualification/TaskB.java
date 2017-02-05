package gcj.qual;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskB {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskB.class.getResourceAsStream("B-large.in");
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(new FileOutputStream("./out.txt"));

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            SolB solver = new SolB();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }
}

class SolB {

    double[] D = new double[10_000_000];

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        double C = in.nextDouble();
        double F = in.nextDouble();
        double X = in.nextDouble();

        double mi = X / 2.0;
        D[0] = 0;
        for (int i = 1; i < D.length; i++) {
            D[i] = D[i-1] + C / ( 2.0 + (i-1) * F);
            double A = D[i] + X / (2.0 + i * F);
            mi = Math.min(mi, A);
        }

        String ans = "" + mi;
        return ans;
    }
}
