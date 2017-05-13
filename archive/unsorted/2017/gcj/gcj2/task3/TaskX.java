package gcj.task3;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "X-small.in";

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

        private int R;
        private int C;
        private char[][] g;
        private P[][] ps;

        class P {
            boolean hor = false;
            boolean ver = false;
            char c;
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            R = in.nextInt();
            C = in.nextInt();
            g = new char[R][C];
            ps = new P[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    ps[i][j] = new P();
                }
            }
            in.nextLine();
            for (int i = 0; i < R; i++) {
                g[i] = in.nextLine().toCharArray();
            }

            for (int i = 0; i < R; i++) {
                P prev = null;
                for (int j = 0; j < C; j++) {
                    if (g[i][j] == '#') {
                        prev = null;
                        continue;
                    }
                    if (g[i][j] == '.') {
                        continue;
                    }
                    if (prev == null) {
                        prev = ps[i][j];
                        continue;
                    }

                    prev.ver = true;
                    ps[i][j].ver = true;
                }
            }

            for (int i = 0; i < C; i++) {
                P prev = null;
                for (int j = 0; j < R; j++) {
                    if (g[i][j] == '#') {
                        prev = null;
                        continue;
                    }
                    if (g[i][j] == '.') {
                        continue;
                    }
                    if (prev == null) {
                        prev = ps[i][j];
                        continue;
                    }

                    prev.hor = true;
                    ps[i][j].hor = true;

                    if (prev.hor && prev.ver) {
                        return "IMPOSSIBLE";
                    }
                    if (ps[i][j].hor && ps[i][j].ver) {
                        return "IMPOSSIBLE";
                    }
                }
            }

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    render(i, j);
                }
            }

            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            for (int i = 0; i < R; i++) {
                B:
                for (int j = 0; j < C; j++) {
                    if (g[i][j] != '.') continue;

                    boolean found = false;
                    A:
                    for (int k = 0; k < 4; k++) {
                        int ni = i;
                        int nj = j;

                        while(true) {
                            ni += dx[k];
                            nj += dy[k];

                            if (!(0<= ni && ni < R && 0 <= nj && nj < C)) continue A;

                            if (g[ni][nj] == '-' || g[ni][nj] == '|') {
                                if (k == 0 || k == 2) {
                                    ps[ni][nj].ver = true;
                                    render(ni, nj);
                                } else {
                                    ps[ni][nj].hor = true;
                                    render(ni, nj);
                                }
                            }
                        }
                    }
                }
            }

            String ans = "1";
            return ans;
        }

        void render(int i, int j) {
            if (ps[i][j].hor) {
                int cj = j - 1;
                while(0 <= cj && ( cj == '.' || cj == 'x' )) {
                    g[i][cj] = 'x';
                    cj--;
                }
                cj = j + 1;
                while(cj < C && (cj == '.' || cj == 'x')) {
                    g[i][cj] = 'x';
                    cj++;
                }
            }

            if (ps[i][j].ver) {
                int ri = i - 1;
                while(0 <= ri && ( ri == '.' || ri == 'x' )) {
                    g[i][ri] = 'x';
                    ri--;
                }
                ri = j + 1;
                while(ri < R && (ri == '.' || ri == 'x')) {
                    g[ri][j] = 'x';
                    ri++;
                }
            }
        }
    }
}


