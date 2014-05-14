package utils;

import java.util.Arrays;

/**
 * 素数判定アルゴリズム
 *
 * Sieve Of Eratosthenes
 * エラトステネスのふるい
 *
 * http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 *
 * 1-N までの数を素数か判定した結果の配列を返す
 *
 * Index:  [0, 1, 2, 3, 4, 5, 6, ..]
 * Return: [N, N, Y, Y, N, Y, N, ..]
 */
public class SieveOfEratosthenes {

    static boolean[] getPrimeCheckArray(int N){
        boolean[] ret = new boolean[N];
        Arrays.fill(ret, true);

        ret[0] = false;
        ret[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (!ret[i]) continue;

            for (int j = 2; i * j < N; j++) {
                ret[i * j] = false;
            }
        }

        return ret;
    }

    public static void main(String[] args){
        boolean[] isPrime = getPrimeCheckArray(100);

        for (int i = 0; i < 100; i++) {
            System.out.printf("%s is prime num ? = %s\n", i, isPrime[i]
                    );
        }

        isPrime = getPrimeCheckArray(1_000_000);
        System.out.println("123457 isPrime ? = " + isPrime[123457]);
    }

}
