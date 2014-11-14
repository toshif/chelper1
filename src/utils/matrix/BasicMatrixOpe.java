package utils.matrix;

import java.util.Arrays;

/**
 *  A set of basic matrix operations like add, multiply, pow.
 *
 *  A[i][j] : i = row, j = column
 *
 *  If you want to create this matrix A, A[1][0] = 1, A[1][1] = 2, A[2][1] = 3 and so on.
 *  [0, 0, 0]
 *  [1, 2, 0]
 *  [0, 3, 4]
 *
 *  FYI - used in p428_DI_2 and it passed the sys test.
 *
 */
public class BasicMatrixOpe {

    public static void main(String[] args) {
        new BasicMatrixOpe().example();
    }

    void example() {
        long[][] E = unit();
        print(E);

        long[][] A = new long[N][N];
        for (int i = 1; i < N; i++) {
            A[i][i] = i;
            A[i][i-1] = N - i;
        }
        print(A);

        // B = A . A
        long[][] B = mul(A, A);
        print(B);

        // C = A + B
        long[][] C = add(A, B);
        print(C);

        // D = A ^ 100000
        long[][] D = pow(A, 100000);
        print(D);
    }
    /*
     * ----------------
     */

    final long MOD = 1234567891L;

    final int N = 3;

    /**
     *  add matrix : A + B
     */
    long[][] add(long[][] A, long[][] B){
        long[][] C = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
                C[i][j] %= MOD;
            }
        }
        return C;
    }

    /**
     *  multiply matrix : A . B
     */
    long[][] mul(long[][] A, long[][] B){
        long[][] C = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    C[i][j] %= MOD;
                }

            }
        }
        return C;
    }

    /**
     *  multiply matrix by a scalar : cA
     */
    long[][] mul(long[][] A, long c){
        long[][] C = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = (c * A[i][j]) % MOD;
            }
        }
        return C;
    }

    /**
     *  power of matrix : A ^ k
     *
     *  O(log(n))
     *
     *  Using:
     *   even: A^2p = (A^p)^2
     *   odd: A^2p+1 = A^2p . A
     *
     */
    long[][] pow(long[][] A, int k){
        if (k == 0) {
            return unit();
        }

        if (k % 2 == 0) {
            return pow(mul(A, A), k/2);
        } else {
            return mul(pow(A, k-1), A);
        }
    }

    /**
     *  unit E
     */
    long[][] unit(){
        long[][] E = new long[N][N];
        for (int i = 0; i < N; i++) {
            E[i][i] = 1;
        }
        return E;
    }

    /**
     *  sum of A + A^2 + ... + A^k.
     *
     *  O(log(n))
     *
     *  Using:
     *    even: A + A^2 + ... + A^2p = (E + A^p) (A + A^2 + ... + A^p)
     *    odd: A + A^2 + ... + A^2p+1 = (A + ... + A^2p) + A^(2p+1)
     */
    long[][] psum(long[][] A, int k){
        if (k == 0) {
            return new long[N][N];
        }

        if (k % 2 == 0) {
            return mul(add(unit(), pow(A, k/2)), psum(A, k/2));
        } else {
            return add(psum(A, k-1), pow(A, k));
        }
    }

    void print(long[][] A){
        System.err.printf("---- matrix %s -----\n", A.toString());
        for (int i = 0; i < A.length; i++) {
            System.err.println(Arrays.toString(A[i]));
        }
        System.err.println("-----------------------------");
    }
}
