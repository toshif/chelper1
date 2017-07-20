package utils.big_num;

/**
 * F(0) = 0
 * F(1) = 1
 * F(2) = 1
 * F(n) = F(n-1) + F(n-2)
 * <p>
 * Time Complexity : O(log n)
 * <p>
 * Reference : https://www.nayuki.io/page/fast-fibonacci-algorithms
 */
public class FastFibonacci_Mod {

    public static long MOD = 1_000_000_007;

    public static long fastFibonacciMatrix(long n) {
        long[] matrix = {1, 1, 1, 0};
        return matrixPow(matrix, n)[1];
    }

    private static long[] matrixPow(long[] matrix, long n) {
        long[] result = {1, 0, 0, 1};
        while (n != 0) {
            if (n % 2 != 0)
                result = matrixMultiply(result, matrix);
            n /= 2;
            matrix = matrixMultiply(matrix, matrix);
        }
        return result;
    }

    private static long[] matrixMultiply(long[] x, long[] y) {
        return new long[]{
                ((x[0] * y[0]) % MOD + (x[1] * y[2]) % MOD) % MOD,
                ((x[0] * y[1]) % MOD + (x[1] * y[3]) % MOD) % MOD,
                ((x[2] * y[0]) % MOD + (x[3] * y[2]) % MOD) % MOD,
                ((x[2] * y[1]) % MOD + (x[3] * y[3]) % MOD) % MOD
        };
    }

}
