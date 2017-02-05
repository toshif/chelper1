package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[][] b = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String s = in.nextLine();
            for (int j = 0; j < 4; j++) {
                char c = s.charAt(j);
                b[i][j] = c;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                char c = b[i][j];
                if (c != '.') continue;

                char[][] b2 = b.clone();
                b2[i][j] = 'x';

                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if (b2[k][l] != 'x') continue;

                        // horizontal
                        if (k - 1 >= 0 && k + 1 <= 3) {
                            if (b2[k - 1][l] == 'x' && b2[k + 1][l] == 'x') {
                                out.println("YES");
                                return;
                            }
                        }

                        // vertical
                        if (l - 1 >= 0 && l + 1 <= 3) {
                            if (b2[k][l - 1] == 'x' && b2[k][l + 1] == 'x') {
                                out.println("YES");
                                return;
                            }
                        }

                        // diag
                        if (k - 1 >= 0 && l - 1 >= 0 && k + 1 <= 3 && l + 1 <= 3) {
                            if (b2[k - 1][l - 1] == 'x' && b2[k + 1][l + 1] == 'x') {
                                out.println("YES");
                                return;
                            }
                            if (b2[k - 1][l + 1] == 'x' && b2[k + 1][l - 1] == 'x') {
                                out.println("YES");
                                return;
                            }
                        }

                    }
                }

                b2[i][j] = '.';
            }
        }

        out.println("NO");
    }
}
