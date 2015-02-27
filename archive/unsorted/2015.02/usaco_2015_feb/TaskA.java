import java.io.*;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskA {
    public static void main(String[] args) throws IOException {
        String filename = "censor";

        String inFile = filename + ".in";
        String outFile = filename + ".out";

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        Scanner in = new Scanner(new BufferedReader(new FileReader(inFile)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {

        public void solve(Scanner in, PrintWriter out) {
            char[] cs = in.nextLine().toCharArray();
            int M = cs.length;

            String T = in.nextLine();
            int N = T.length();

            StringBuilder ans = new StringBuilder();
            A:
            for (int i = 0; i < M; i++) {
                ans.append(cs[i]);

                if (ans.length() < N) continue;
                if (T.equals(ans.substring(ans.length() - N))) {
                    ans.delete(ans.length() - N, ans.length());
                }
            }

            System.err.printf("s=%s\n", ans);
            out.println(ans);
        }
    }
}


