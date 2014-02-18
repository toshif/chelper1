package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int[][] w = new int[N][N];
        double[][] a = new double[N][N];
        double[][] b = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                w[i][j] = in.nextInt();
                if (i == j) a[i][j] = w[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                a[i][j] = (w[i][j] + w[j][i]) / 2.0;
                a[j][i] = a[i][j];

                b[i][j] = w[i][j] - a[i][j];
                b[j][i] = - b[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                out.print(a[i][j] + " ");
            }
            out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                out.print(b[i][j] + " ");
            }
            out.println();
        }
    }
}
