package fuku;

public class BubbleSortWithReversals {
    private int[] A;
    private int N;

    public int getMinSwaps(int[] A, int K) {
        this.A = A;
        N = A.length;

        int orig = 0;
        orig = calc(0, N-1);

        int[][] dp = new int[K][N];

        for (int i = 0; i < N; i++) {
            dp[0][i] = calc(0, i);
        }

        for (int i = 1; i < K; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < j; k++) {
                    // k - j wo swap
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + calc(k, j) - gain(k, j));
                }
            }
        }

        System.out.println("orig = " + orig);

        return orig + dp[K-1][N-1];
    }

    int gain(int s, int e) {
        int tot = 0;
        for (int i = s; i <= e; i++) {
            int a = A[i];
            for (int j = i+1; j <= e; j++) {
                if (A[j] > a) tot++;
            }
        }
        return tot;
    }

    int calc(int s, int e){
        int tot = 0;
        for (int i = s; i <= e; i++) {
            int a = A[i];
            for (int j = i+1; j <= e; j++) {
                if (A[j] < a) tot++;
            }
        }
        return tot;
    }
}
