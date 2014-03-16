package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int binit = 1;
        int bcost = 1000 * 1000 * 10;

        for (int i = 1; i < 1000; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if(a[j] != (j * k + i)) cost ++;
            }
            if (cost < bcost) {
                binit = i;
                bcost = cost;
            }
        }
        System.err.println("binit=" + binit);

        out.println(bcost);
        for (int i = 0; i < n; i++) {
            int h = binit + i * k;
            if (h > a[i]) out.printf("+ %d %d\n", i+1, h - a[i]);
            if (h < a[i]) out.printf("- %d %d\n", i+1, a[i] - h);
        }
    }
}
