package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long mi = 1000_000_000_00L;
        long miNum = 0L;
        long ma = 0L;
        long maNum = 0L;

        for (int i = 0; i < n; i++) {
            long v = in.nextLong();
            if (v < mi){
                mi = v;
                miNum = 1;
            } else if (v == mi) {
                miNum++;
            }

            if (v > ma){
                ma = v;
                maNum = 1;
            } else if (v == ma) {
                maNum++;
            }
        }

        if (mi != ma) {
            out.printf("%s %s", ma - mi, maNum * miNum);
        } else {
            out.printf("%s %s", 0, maNum * (maNum-1L) / 2L);
        }
    }
}
