package fuku.round1C;

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

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int first = in.nextInt();

        String ans = "";
        return ans;
    }
}
