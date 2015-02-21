package fuku;

import java.util.*;

public class CartInSupermarketEasy {
    private int n;
    private int k;

    public int calc(int N, int K) {
        n = N;
        k = K;

        rec(0, 1, 0);

        return mi;
    }

    int mi = 10000;

    int[][] memo = new int[500][500];

    void rec(int r, int ns, int depth) {
        // System.err.printf("r=%s, ns=%s, depth=%s\n", r, ns, depth);

        if ( memo[r][ns] != 0 && memo[r][ns] <= depth) return;

        memo[r][ns] = depth;

        if (depth > n) return;
        if (r > n) return;

        if (r == n) mi = Math.min(mi, depth);

        for (int i = 0; i <= ns; i++) {
            if ( ns + (ns-i) > n ) continue;
            if ( ns + (ns-i) > k+1 ) continue;

            rec(r + i, ns + (ns-i), depth+1);
        }
    }
}
