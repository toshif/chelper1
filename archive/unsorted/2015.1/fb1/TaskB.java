package fb1;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskB {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "autocomplete.txt";

        URL inFileUrl = TaskB.class.getResource(inFile);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new FileOutputStream(outFile));

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        class Trie {
            Trie[] child = new Trie['z' - 'a' + 1];
        }

        Trie root = new Trie();

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            in.nextLine();
            long tot = 0;

            for (int i = 0; i < N; i++) {
                String s = in.nextLine();
                // System.err.printf("s=%s\n", s);

                char[] cs = s.toCharArray();
                boolean stillCommon = true;
                Trie next = root;
                for (int j = 0; j < cs.length; j++) {
                    int t = (cs[j] - 'a');
                    if (stillCommon) tot++;
                    if (next.child[t] == null){
                        stillCommon = false;
                        next.child[t] = new Trie();
                    }
                    next = next.child[t];
                }
            }

            String ans = "" + tot;
            return ans;
        }
    }
}


