package fuku.fb;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskC {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "laser_maze.txt";

        URL inFileUrl = TaskC.class.getResource(inFile);
        InputStream inputStream = new FileInputStream(inFileUrl.getFile());
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new FileOutputStream(outFile));

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i + 1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i + 1) + ": " + ans);
            System.out.println("Case #" + (i + 1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int M = in.nextInt();
            int N = in.nextInt();

            char[][] g = new char[M][N];

            int[] start = {0, 0};
            int[] goal = {0, 0};

            char[] dir = {'<', '^', '>', 'v'};
            int[] dx = {0, -1, 0, 1};
            int[] dy = {-1, 0, 1, 0};

            char[][][] bg = new char[4][M][N];

            in.nextLine();
            for (int i = 0; i < M; i++) {
                String row = in.nextLine();
                for (int j = 0; j < N; j++) {
                    g[i][j] = row.charAt(j);
                    if (g[i][j] == 'S') start = new int[]{i, j};
                    if (g[i][j] == 'G') goal = new int[]{i, j};

                    for (int k = 0; k < 4; k++) {
                        bg[k][i][j] = g[i][j];
                    }
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (g[i][j] == dir[k]){
                            // init: (i, j) - direction k
                            for (int t = 0; t < 4; t++) {
                                // time t passed
                                int d = (t + k) % 4;

                                bg[t][i][j] = dir[d];

                                A:
                                for (int l = 1; l < 200; l++) {
                                    int x = i + dx[d] * l;
                                    int y = j + dy[d] * l;

                                    if (x < 0 || M <= x || y < 0 || N <= y) break A;

                                    boolean isWall = g[x][y] == '#';
                                    for (int i1 = 0; i1 < 4; i1++) {
                                        if ( dir[i1] == g[x][y] ) isWall = true;
                                    }

                                    if (isWall) break A;
                                    else bg[t][x][y] = '*'; // laser
                                }
                            }
                        }
                    }

                }
            }

            for (int i = 0; i < 4; i++) {
                System.out.println("===");
                for (int j = 0; j < M; j++) {
                    System.out.println("" + Arrays.toString(bg[i][j]));
                }
                System.out.println("===");
            }

            boolean[][] current = new boolean[M][N];
            current[start[0]][start[1]] = true;

            for (int turn = 1; turn < 500; turn++) {
                boolean[][] next = new boolean[M][N];

                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < N; j++) {
                        if (current[i][j]) {
                            for (int k = 0; k < 4; k++) {
                                int x = i + dx[k];
                                int y = j + dy[k];

                                if (x < 0 || M <= x || y < 0 || N <= y) continue;

                                int t = turn % 4;
                                if (bg[t][x][y] == '.' || bg[t][x][y] == 'S' || bg[t][x][y] == 'G' ) {
                                    next[x][y] = true;
                                }
                            }
                        }
                    }
                }

                if (next[goal[0]][goal[1]]) {
                    // goal
                    return "" + turn;
                }

                current = next;
            }

            return "impossible";
        }
    }
}


