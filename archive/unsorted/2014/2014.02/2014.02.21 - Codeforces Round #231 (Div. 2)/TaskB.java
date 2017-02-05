package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int p = in.nextInt();
        int x = in.nextInt();

        for (int i = 1; i <=9 ; i++) {
            int[] a = new int[p];
            a[0] = i;
            int off = 0;
            for (int j = 0; j < p-1; j++) {
                int b =a[j] * x + off;
                a[j+1] = b % 10;
                off = b / 10;
            }
            if (a[p-1] != 0 && a[p-1] * x + off == a[0]) {
                // answer
                for (int j = a.length-1; j >= 0; j--) {
                    out.print(a[j]);
                }
                return;
            }
        }

        out.print("Impossible");

    }
}
