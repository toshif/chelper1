package gcj.qual;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskD {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskD.class.getResourceAsStream("D-large.in");
        Scanner in = new Scanner(inputStream);
        SolD solver = new SolD();

        PrintWriter out = new PrintWriter(new FileOutputStream("./out.txt"));

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }
}

class SolD {

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        double[] na = new double[N];
        double[] ken = new double[N];

        for (int i = 0; i < N; i++) {
            na[i] = in.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            ken[i] = in.nextDouble();
        }

        Arrays.sort(na);
        Arrays.sort(ken);

        System.out.println("na = " + Arrays.toString(na));
        System.out.println("ken = " + Arrays.toString(ken));

        boolean[] used = new boolean[N];
        int np = 0;
        A:
        for (int i = 0; i < N; i++) {
            double nv = na[i];
            for (int j = 0; j < N; j++) {
                if (!used[j] && nv < ken[j]) {
                    used[j] = true;
                    continue A;
                }
            }
            np++;
        }


        int d = 0;
        A:
        for (int i = 0; i < N; i++) {
            d = i;
            if (na[i] > ken[N-1-i]) break;
        }
        int dnp1 = N - d;
        dnp1 = 0;

        Arrays.fill(used, false);
        int kp = 0;
        A:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!used[j] && ken[i] < na[j]) {
                    used[j] = true;
                    continue A;
                }
            }
            kp++;
        }
        int dnp2 = N - kp;

        int dnp = Math.max(dnp1, dnp2);

        String ans = dnp + " " + np;
        return ans;
    }
}
