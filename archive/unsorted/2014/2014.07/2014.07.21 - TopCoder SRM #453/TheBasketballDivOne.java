package fuku;

import java.util.Arrays;

public class TheBasketballDivOne {
    private int n;
    private int m;

    public int find(int n, int m) {
        this.n = n;
        this.m = m;

        int remain = (n * n - n);

        return dfs(remain - m, 1, m);
    }

    int dfs(int remain, int idx, int ma){
        if (idx == n){
            if (remain == 0) return 1;
            else return 0;
        }

        int tot = 0;
        for (int i = 0; i <= ma; i++) {
            tot += dfs(remain - i, idx+1, i);
        }
        return tot;
    }
}
