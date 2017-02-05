package fuku;

import sun.print.resources.serviceui;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < n * m; i++) {
            int c = in.nextInt();
//            System.err.println("c=" + c);
            if (c == 11) a2++;
            if (c == 1 || c == 10) a1++;
        }

        int[][] t = new int[n][m];


        int h = 0;
        if (a2 > 0) {
            A:
            for (int i = 0; i < n; i++) {
                h = i;
                for (int j = m - 1; j >= 0; j--) {
                    t[i][j] = 2;
                    a2--;
                    if (a2 == 0) break A;
                }
            }
        }

        if (a1 > 0) {
            B:
            for (int i = h; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (t[i][j] == 0) {
                        int v = 1;
                        if (i > 0 && t[i-1][j] == 1) {
                            v = -1;
                        }
                        t[i][j] = v;
                        a1--;
                        if (a1 == 0) break B;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int c = t[i][j];
                String dom = "00";
                if (c == 2) {
                    dom = "11";
                } else if (c ==1) {
                    dom = "10";
                } else if (c == -1) {
                    dom = "01";
                }
                out.print(dom + " ");
            }
            out.println();
        }
    }
}
