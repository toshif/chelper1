package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        int mistep = 0;
        long buns = Long.MAX_VALUE;
        int lo = a[0];
        for (int step = 0; step < 2 * 10000; step++) {
            for (int i = 0; i < n; i++) {
                long diff = 0;

                int base = a[i];
                int h = 0;
                for (int j = i - 1; j >= 0; j--) {
                    h++;
                    diff += Math.abs(a[j] - ( base - h * step) ) ;
                }
                int lt = base - h * step;

                h = 0;
                for (int j = i+1; j < n; j++) {
                    h++;
                    diff += Math.abs(a[j] - ( base + h * step));
                }

                if (diff < buns) {
                    buns = diff;
                    mistep = step;
                    lo = lt;
                }
            }
        }

        out.println(buns);
        out.print(lo + " " + mistep);


    }
}
