package fuku;

import utils.io.MyReader;
import utils.sort.ArrayShuffle;
import utils.sort.ArrayUtils;

import java.io.PrintWriter;
import java.util.Arrays;

public class CBalancedTeam {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        ArrayShuffle.shuffle(a);
        Arrays.sort(a);

        if (n == 1) {
            out.println(1);
            return;
        }

        int ma = 0;
        int right = 1;
        for (int left = 0; left < n; left++) {
            if (right == left && right < n - 1) right++;

            if (a[right] - a[left]> 5) continue;
            else {
                while(right < n && a[right] - a[left] <= 5) {
                   ma = Math.max(ma, right - left + 1);

                   if (right == n - 1) break;

                   right++;
                }
            }
        }

        out.println(ma);
    }
}
