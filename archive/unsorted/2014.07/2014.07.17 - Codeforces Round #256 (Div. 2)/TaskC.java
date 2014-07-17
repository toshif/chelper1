package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    private int n;
    private int[] a;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int gain = find(0, n-1, 0);
        out.print(n + gain);
    }

    int find(int left, int right, int base){
        if (left == right) return 0;

        int mi = 1000_000_000;
        for (int i = left; i <= right; i++) {
            mi = Math.min(mi, a[i]);
        }

        int cnt = 0;
        for (int i = left; i <= right; i++) {
            if (a[i] == mi) {
                cnt++;
            }
        }

        int cost = mi - base;

        int childSum = 0;
        int le = -1;
        for (int i = left; i <= right; i++) {
            if (le == -1) {
                if (mi != a[i]) le = i;
            } else {
                if (mi == a[i]) {
                    int childCnt = find(le, i-1, mi);
                    if (childCnt < 0) childSum += childCnt;
                    le = -1;
                }
            }
        }

        if (le != -1){
            int childCnt = find(le, right, mi);
            if (childCnt < 0) childSum += childCnt;
        }


        int gain = cost - cnt + childSum;
        if (gain < 0) return gain;
        else return 0;
    }

}
