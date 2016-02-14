package utils;

import java.math.BigInteger;

public class nCk_BigInteger {


    static int N_memo = 105;
    static BigInteger[][] memo;

    static BigInteger nCk_BigInteger(int n, int k) {
        if (memo != null) {
            return memo[n][k];
        }

        // init
        memo = new BigInteger[N_memo][N_memo];
        for (int k1 = 0; k1 < N_memo; k1++) {
            memo[0][k1] = BigInteger.ZERO;
        }
        for (int n1 = 0; n1 < N_memo; n1++) {
            memo[n1][0] = BigInteger.ONE;
        }
        for (int n1 = 1; n1 < N_memo; n1++) {
            for (int k1 = 1; k1 < N_memo; k1++) {
                memo[n1][k1] = memo[n1-1][k1-1].add(memo[n1-1][k1]);
            }
        }

        return memo[n][k];
    }

    public static void main(String[] args) {
        int n = 100;
        for (int k = 0; k < 50; k++) {
            System.out.printf("n=%s, k=%s, nCk=%s \n", n, k, nCk_BigInteger(n, k));
        }
    }

}
