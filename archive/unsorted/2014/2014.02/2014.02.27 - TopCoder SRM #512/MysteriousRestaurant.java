package fuku;

import java.util.Arrays;

// System Test Passed
// http://apps.topcoder.com/wiki/display/tc/SRM+512
public class MysteriousRestaurant {
    public int maxDays(String[] prices, int budget) {
        int n = prices.length;
        int m = prices[0].length();

        int[][] p = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = prices[i].charAt(j);
                int cost = 0;
                if ('0' <= c && c <= '9') cost = c - '0';
                if ('A' <= c && c <= 'Z') cost = c - 'A' + 10;
                if ('a' <= c && c <= 'z') cost = c - 'a' + 36;
                p[i][j] = cost;
            }
            System.err.println(Arrays.toString(p[i]));
        }

        int h = 0;
        for (int i = 1; i <= n; i++) {
            h = i;
            int gt = 0;
            for (int j = 0; j < 7 && j < i; j++) {
                int mi = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    int tot = 0;
                    for (int l = j; l < i; l += 7) {
                        tot += p[l][k];
                    }
                    mi = Math.min(mi, tot);
                }
                gt += mi;
            }
            if (gt >  budget) {
                h -= 1;
                break;
            }
        }

        return h;
    }
}
