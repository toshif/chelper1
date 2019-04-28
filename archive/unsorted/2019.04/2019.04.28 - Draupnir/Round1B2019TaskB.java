package fuku;

import utils.io.MyReader;
import utils.matrix.GaussJordanElimination;
import utils.modPow;

import java.io.PrintWriter;
import java.util.Scanner;

public class Round1B2019TaskB {

    private int w;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int T = in.nextInt();
        w = in.nextInt();

        for (int i = 0; i < T; i++) {
            sol(in, out);
            out.flush();
            int result = in.nextInt();
            if (result != 1) {
                throw new RuntimeException("oops");
            }
        }
    }

    void sol( MyReader in, PrintWriter out) {
        long[] res = new long[7];

        GaussJordanElimination g = new GaussJordanElimination(6);
        g.shouldPrintDebug = false;
        g.B[0] = new double[]{2, 1, 1, 1, 1, 1, 0};
        g.B[1] = new double[]{4, 2, 1, 1, 1, 1, 0};
        g.B[2] = new double[]{8, 2, 2, 1, 1, 1, 0};
        g.B[3] = new double[]{16, 4, 2, 2, 1, 1, 0};
        g.B[4] = new double[]{32, 4, 2, 2, 2, 1, 0};
        g.B[5] = new double[]{64, 8, 4, 2, 2, 2, 0};


        for (int i = 1; i <= 6; i++) {
            out.println(i);
            out.flush();
            res[i] = in.nextLong();
            g.B[i-1][6] = res[i];
        }

        ;
        int[] ans = GaussJordanElimination.getIntArray(g.gaussJordan());

        String ansStr = "";
        for (int i = 0; i < 6; i++) {
            ansStr += ans[i] + " ";
        }
        out.println(ansStr);
        out.flush();
    }
}
