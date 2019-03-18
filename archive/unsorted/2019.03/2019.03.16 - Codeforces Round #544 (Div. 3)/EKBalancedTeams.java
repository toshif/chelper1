package fuku;

import utils.io.MyReader;
import utils.sort.ArrayShuffle;

import java.io.PrintWriter;
import java.util.Arrays;

public class EKBalancedTeams {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        ArrayShuffle.shuffle(a);
        Arrays.sort(a);

        int[][] dp = new int[n+1][k+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        Arrays.fill(dp[0], 0);

        for (int j = 1; j <= k; j++) {

            int right = 0;
            for (int left = 0; left < n; left++) {
                if (right == left && right < n - 1) right++;

                if (a[right] - a[left]> 5) continue;
                else {
                    while(right < n && a[right] - a[left] <= 5) {
                        if (left > 0) {
                            dp[right][j] = Math.max(dp[right][j], dp[left - 1][j - 1] + (right - left + 1));
                        } else {
                            if (j == 1) {
                                dp[right][j] = (right - left + 1);
                            }
                        }

                        if (right == n - 1) break;

                        right++;
                    }
                }
            }

        }

        out.println(dp[n-1][k]);
    }
}
