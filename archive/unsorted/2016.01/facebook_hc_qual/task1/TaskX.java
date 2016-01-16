package fuku.task1;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "boomerang_constellations.txt";

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

        class P {
            long x;
            long y;

            public P(long x, long y) {
                this.x = x;
                this.y = y;
            }
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            P[] ps = new P[N];
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                ps[i] = new P(x, y);
            }

            Map<Long, Long>[] cs = new Map[N];
            for (int i = 0; i < N; i++) {
                cs[i] = new HashMap<>();
            }
            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    long dx = ps[i].x - ps[j].x;
                    long dy = ps[i].y - ps[j].y;

                    Long dd = Long.valueOf(dx * dx + dy * dy);

                    if ( !cs[i].containsKey(dd) ) {
                        cs[i].put(dd, 0L);
                    }
                    if ( !cs[j].containsKey(dd) ) {
                        cs[j].put(dd, 0L);
                    }

                    cs[i].put(dd, cs[i].get(dd) + 1);
                    cs[j].put(dd, cs[j].get(dd) + 1);
                }
            }

            long tot = 0;
            for (Map<Long, Long> m : cs) {
                for (Long vs : m.values()) {
                    if (vs <= 1) continue;

                    // good
                    tot += (vs * (vs-1)) / 2;
                }
            }

            String ans = "" + tot;
            return ans;
        }
    }
}


