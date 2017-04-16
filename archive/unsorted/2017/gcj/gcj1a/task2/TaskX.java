package gcj1a.task2;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "B-large.in";

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
            int testNumber = i + 1;
            System.err.println("------------------");
            System.err.println("test " + testNumber);
            Solver solver = new Solver();
            String ans = solver.solve(testNumber, in, out);
            out.println("Case #" + testNumber + ": " + ans);
            System.err.println("Case #" + testNumber + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int P = in.nextInt();
            long[] R = new long[N];
            for (int i = 0; i < N; i++) {
                R[i] = in.nextLong();
            }
            long[][] Q = new long[N][P];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < P; j++) {
                    Q[i][j] = in.nextLong();
                }
                Arrays.sort(Q[i]);
            }
            boolean[][] used = new boolean[N][P];

//            System.err.println("in=" + Arrays.toString(R));
//            for (int i = 0; i < N; i++) {
//                System.err.println(Arrays.toString(Q[i]));
//            }

            long cnt = 0;

            // serves
            A:
            for (int s = 1; s < 1100_000; s++) {
                while (true) {
                    int[] idx = new int[N];
                    for (int i = 0; i < N; i++) {
                        long req = 1L * R[i] * s;

                        boolean ok = false;
                        for (int j = 0; j < P; j++) {
                            if (used[i][j]) continue;

                            if (9 * req <= 10 * Q[i][j] && 10 * Q[i][j] <= 11 * req) {
                                ok = true;
                                idx[i] = j;
                                break;
                            }
                        }
                        if (!ok) continue A;
                    }

                    for (int i = 0; i < N; i++) {
                        used[i][idx[i]] = true;
                    }

//                    System.err.println("used=" + Arrays.toString(idx) + ",s=" + s);

                    cnt++;
                }
            }

            return "" + cnt;
        }
    }
}


