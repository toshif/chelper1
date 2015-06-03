package gcj2.a;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

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

        int cnt = 0;
        boolean fail = false;

        // v, >, ^, <
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        int R;
        int C;
        char[][] g;
        boolean[][] used;

        public String solve(int testNumber, Scanner in, PrintWriter out) {

            R = in.nextInt();
            C = in.nextInt();
            in.nextLine();
            g = new char[R][C];
            used = new boolean[R][C];
            for (int i = 0; i < R; i++) {
                String s = in.nextLine();
                for (int j = 0; j < C; j++) {
                    g[i][j] = s.charAt(j);
                }

                System.err.printf("%s\n", Arrays.toString(g[i]));
            }

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (g[i][j] == '.') continue;

                    if (used[i][j]) continue;

                    check(i, j);

                    if (fail) {
                        return "IMPOSSIBLE";
                    }
                }
            }

            String ans = "" + cnt;
            return ans;
        }

        void check(int r, int c) {
            if (used[r][c]) {
                // ok
                return;
            }

            used[r][c] = true;

            char ca = g[r][c];
            int idx = -1;
            int ni = getIdx(ca);
            if (ni != -1) idx = ni;

            int x = r;
            int y = c;
            boolean edge = false;
            while(true) {
                x += dx[idx];
                y += dy[idx];

                if (x < 0 || R <= x || y < 0 || C <= y) {
                    edge = true;
                    break;
                }

                int idx2 = getIdx(g[x][y]);
                if (idx2 != -1) {
                    // found another
                    break;
                }
            }

            if (!edge) {
                // ok
                return;
            }

            // need to fix
            A:
            for (int idx3 = 0; idx3 < 4; idx3++) {
                x = r;
                y = c;
                while(true) {
                    x += dx[idx3];
                    y += dy[idx3];

                    // System.err.printf("x=%s, y=%s\n", x, y);

                    if (x < 0 || R <= x || y < 0 || C <= y) {
                        edge = true;
                        continue A;
                    }

                    int idx2 = getIdx(g[x][y]);
                    if (idx2 != -1) {
                        // found another
                        cnt++;
                        return;
                    }
                }

            }

            // fail
            fail = true;
        }

        int getIdx(char ca) {
            int idx = -1;
            if (ca == 'v') idx = 0;
            if (ca == '>') idx = 1;
            if (ca == '^') idx = 2;
            if (ca == '<') idx = 3;
            return idx;
        }
    }
}


