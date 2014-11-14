
package tc.p428_DI_2;

public class TheLongPalindrome {

    int count(int n, int k){
        long[][] A = new long[27][27];
        for (int i = 1; i < 27; i++) {
            A[i][i] = i;
            A[i][i-1] = 27 - i;
        }
        long[][] B = psum(A, n / 2);
        B = mul(B, 2);
        if (n % 2 != 0) {
            B = add(B, pow(A, (n + 1)/2));
        }

        long ret = 0;
        for (int i = 1; i <= k; i++) {
            ret += B[i][0];
            ret %= MOD;
        }

        return (int)ret;
    }

    /**
     * ---------------------
     */

    final long MOD = 1234567891L;

    final int N = 27;


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
}

