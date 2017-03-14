package utils.prime;

import java.math.BigInteger;


/**
 * This implementation checks if the given long number (64 bits) is a prime with Miller-Rabin.
 *
 * This is a deterministic algorithm with 100 % accuracy.
 *
 * Time Complexity : O ( k (log2 n)^3  )
 *
 * https://en.wikipedia.org/wiki/Miller%E2%80%93Rabin_primality_test
 *
 * https://rosettacode.org/wiki/Miller%E2%80%93Rabin_primality_test#Java
 *
 */
public class PrimeCheck_MillerRabin {

    public static boolean isPrime(long n) {
        if (n <= 12) {
            return (n == 2 || n == 3 || n == 5 || n == 7 || n == 11);
        }

        long d = n - 1;
        int s = 0;
        while (d % 2 == 0) {
            d >>= 1;
            s++;
        }

        int[] primesToTest = getPrimesToTest(n);
        for (int a : primesToTest) {
            if (composite(a, d, n, s)) {
                return false;
            }
        }
        return true;
    }

    private static int[] getPrimesToTest(long n) {
        if (n < 2_000_000_000_000L) {
            return new int[]{2, 3, 5, 7, 11};
        }
        if (n < 341_550_071_728_321L) {
            return new int[]{2, 3, 5, 7, 11, 13, 17};
        }
        if (n < 3_825_123_056_546_413_051L) {
            return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23};
        }
        return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
    }

    private static boolean composite(int al, long dl, long nl, int s) {
        BigInteger a = BigInteger.valueOf(al);
        BigInteger d = BigInteger.valueOf(dl);
        BigInteger n = BigInteger.valueOf(nl);

        if (a.modPow(d, n).equals(BigInteger.ONE)) {
            return false;
        }
        for (int i = 0; i < s; i++) {
            // if pow(a, 2**i * d, n) == n-1
            if (a.modPow(BigInteger.valueOf(2).pow(i).multiply(d), n).equals(n.subtract(BigInteger.ONE))) {
                return false;
            }
        }
        return true;
    }
}