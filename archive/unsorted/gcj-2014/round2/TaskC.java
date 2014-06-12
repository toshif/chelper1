package gcj.round2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskC {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskC.class.getResourceAsStream("C-small.in");
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(new FileOutputStream("./out.txt"));

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            SolC solver = new SolC();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }
}

class SolC {

    class Edge {
        long to;
        int cap;
        int rev;
    }

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int W = in.nextInt();
        int H = in.nextInt();
        int B = in.nextInt();

        for (int i = 0; i < B; i++) {
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
        }

        for (int x = 0; x < W; x++) {
            for (int y = 0; y < H; y++) {

            }
        }

        String ans = "";
        return ans;
    }
}
