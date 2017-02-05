package gcj.round2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskA {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskA.class.getResourceAsStream("A-large.in");
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(new FileOutputStream("./out.txt"));

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            SolA solver = new SolA();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }
}

class SolA {

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int X = in.nextInt();

        int[] sizes = new int[N];
        for (int i = 0; i < N; i++) {
            sizes[i] = in.nextInt();
        }
        Arrays.sort(sizes);

        boolean[] used = new boolean[N];

        int nUsed = 0;
        int tot = 1;
        while(nUsed != N){
            int next = 0;
            int nSize = 0;
            for (int i = 0; i < N; i++) {
                if (!used[i]) { used[i] = true;next = i; nSize = sizes[i]; break; }
            }
            nUsed++;

            if (nUsed == N) break;

            int p2 = 0;
            int s2 = 0;
            for (int i = N-1; i >= 0 ; i--) {
                if (!used[i] && sizes[i] + nSize <= X) {
                    used[i] = true;
                    nUsed++;
                    break;
                }
            }

            if (nUsed == N) break;

            tot++;
        }

        String ans = "" + tot;
        return ans;
    }
}
