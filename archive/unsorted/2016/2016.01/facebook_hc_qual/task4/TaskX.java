package fuku.task4;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "text_editor.txt";

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

        class Tr {
            Tr[] sub = new Tr[27];

            boolean leaf = false;

            boolean isNode() {
                for (int i = 0; i < 27; i++) {
                    if (sub[i] != null) return true;
                }
                return false;
            }
        }

        int N;

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            N = in.nextInt();
            int K = in.nextInt();
            in.nextLine();

            // create
            Tr root = new Tr();
            for (int i = 0; i < N; i++) {
                char[] wrd = in.nextLine().toCharArray();
                Tr next = root;
                for (int j = 0; j < wrd.length; j++) {
                    next = createTrie(next, wrd[j]);
                }
                next.leaf = true;
            }

            // rec
            int[] rec = rec(root);
            String ans = "" + ( 2 * ( rec[K] - 1)  + K );
            return ans;
        }

        Tr createTrie(Tr t, char c) {
            if ( t.sub[c - 'a'] == null ) {
                t.sub[c - 'a'] = new Tr();
            }
            return t.sub[c - 'a'];
        }

        int[] rec(Tr t) {
            int[] ret = new int[N+1];
            int INF = 1_000_000_000;
            Arrays.fill(ret, INF);

            if (t.leaf && !t.isNode()) {
                ret[1] = 1;
                return ret;
            }

            for (int i = 0; i < 27; i++) {
                Tr trs = t.sub[i];
                if (trs == null) continue;

                int[] prev = ret.clone();
                int[] subret = rec(trs);
                for (int j = 1; j < N+1; j++) {
                    //if ( prev[j] == INF && subret[j] != INF) {
                    // ret[j] = subret[j];
                    //}
                    ret[j] = Math.min(ret[j], subret[j]);

                    for (int k = 1; k < N+1; k++) {
                        if ( prev[k] != INF && subret[j] != INF) {
                            ret[j + k] = Math.min(ret[j + k], subret[j] + prev[k]);
                        }
                    }
                }
            }

            for (int i = 1; i < N+1; i++) {
                if ( ret[i] != INF ) {
                    ret[i] += 1;
                }
            }

            if (t.leaf) {
                int[] prev = ret.clone();
                for (int i = 1; i < N; i++) {
                    ret[i+1] = prev[i];
                }
                ret[1] = 1;
            }

            return ret;
        }
    }
}


