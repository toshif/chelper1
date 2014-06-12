package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();

        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = in.nextInt();
        }

        for (int i = 0; i < M; i++) {
            in.nextInt();
            in.nextInt();
        }

        Arrays.sort(c);
        System.err.printf("c=%s\n", Arrays.toString(c));

        double tot = 0;
        double di = 0;
        for (int i = 0; i < N -1; i++) {
            tot += c[i] * (N - 1 - i) ;
            di += (N - 1 - i);
        }

        out.print(tot / di);
    }
}
