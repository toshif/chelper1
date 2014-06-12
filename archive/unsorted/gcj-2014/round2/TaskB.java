package gcj.round2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
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

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        LinkedList<Integer> as = new LinkedList<>();
        LinkedList<Integer> work = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Integer a = Integer.valueOf(in.nextInt());
            as.add(a);
            work.add(a);
        }

        Collections.sort(work);

        int tot = 0;
        for (Integer w : work) {
            int m = as.size();
            int iw = as.indexOf(w);

            int cost = Math.min(iw, (m -1) - iw);
            tot += cost;

            as.remove(iw);
        }

        String ans = "" + tot;
        return ans;
    }
}
