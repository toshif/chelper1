package gcj1a.task1;

import java.io.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "A-large.in";

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
            out.print("Case #" + testNumber + ": " + ans);
            System.err.print("Case #" + testNumber + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int R = in.nextInt();
            int C = in.nextInt();
            in.nextLine();

            char[][] cs = new char[R][C];
            for (int i = 0; i < R; i++) {
                String s = in.nextLine();
                cs[i] = s.toCharArray();
            }

            Set<Character> done = new HashSet<>();

            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {

                    int okI = -1;
                    int okJ = -1;
                    char ch = 'a';
                    int size = 0;
                    for (int i = 1; i + r <= R; i++) {
                        A:
                        for (int j = 1; j + c <= C; j++) {


                            B:
                            for (char ch2 = 'A'; ch2 <= 'Z'; ch2++) {
                                if (done.contains(ch2)) continue;

                                boolean found = false;
                                for (int k = r; k < i + r; k++) {
                                    for (int l = c; l < j + c; l++) {
                                        if (cs[k][l] == ch2) found = true;

                                        if (cs[k][l] != '?' && cs[k][l] != ch2) continue B;

                                    }
                                }

                                if (!found) continue;

                                int tSize = i * j;
                                if (size < tSize) {
                                    size = tSize;
                                    okI = i;
                                    okJ = j;
                                    ch = ch2;
                                }
                            }

                        }
                    }

                    if (okI != -1) {
                        for (int k = r; k < okI + r; k++) {
                            for (int l = c; l < okJ + c; l++) {
                                cs[k][l] = ch;
                            }
                        }
                        done.add(ch);
                    }
                }
            }

            String ans = "\n";
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    ans += cs[i][j];
                }
                ans += "\n";
            }

            return ans;
        }
    }
}


