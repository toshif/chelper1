package gcj;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskX.class.getResourceAsStream("X-small.in");
        Scanner in = new Scanner(inputStream);
        SolX solver = new SolX();

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

class SolX {

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int first = in.nextInt();

        String ans = "";
        return ans;
    }
}
