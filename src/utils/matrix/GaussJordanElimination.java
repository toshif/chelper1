package utils.matrix;

import java.util.Arrays;

/**
 * Gauss Jordan の消去法。
 *
 * 連立一次方程式を解くのに使われる。
 *
 * http://en.wikipedia.org/wiki/Gaussian_elimination
 *
 * Created by toshif on 5/26/14.
 */
public class GaussJordanElimination {

    final double EPS = 1E-8;

    int N = 3;

    /**
     * A x = b を解く(ベクトル x を求める)。
     *
     * (Aは正方行列、b はベクトル)
     * の A と b をつなげたものを B とする。
     */
    double[][] B = new double[N][N+1];

    // 解が一意
    // 一意でないとき false をセット
    boolean isUnique = true;

    double[] gaussJordan(){
        // i 番目の column の係数を 1 にし、それ以外の式から引いて係数をゼロにする
        for (int i = 0; i < N; i++) {
            printB();

            // 絶対値の大きい
            int pivot = i;
            for (int j = i; j < N; j++) {
                if (Math.abs(B[j][i]) > Math.abs(B[pivot][i])) pivot = j;
            }

            swap(pivot, i);

            // row i 以降の全ての row で column i = 0
            // 解なし / 一意でない
            if (Math.abs(B[i][i]) < EPS){
                isUnique = false;
                continue;
            }

            // 係数を1にする
            for (int j = i + 1; j < N + 1; j++) B[i][j] /= B[i][i];
            B[i][i] = 1.0;

            // column i を row i 以外 係数ゼロにする
            for (int j = 0; j < N; j++) {
                double c = B[j][i];
                if (i != j) {
                    for (int k = 0; k < N + 1; k++) {
                       B[j][k] -= c * B[i][k];
                    }
                }
            }
        }

        // done
        printB();

        // 解なし / 一意でない
        if (!isUnique) return null;

        double[] ans = new double[N];
        for (int i = 0; i < N; i++) {
            ans[i] = B[i][N];
        }

        return ans;
    }

    /** swap the row i and row j
     */
    void swap(int i, int j){
        double[] tmp = B[i];
        B[i] = B[j];
        B[j] = tmp;
    }

    void printB(){
        for (int j = 0; j < N; j++) {
            System.out.printf("B[%d] = %s\n", j, Arrays.toString(B[j]));
        }
        System.out.println("----");
    }

    void init1(){
        /**
         * <code>
         *   x  - 2y + 3z  = 6
         *   4x - 5y + 6z  = 12
         *   7x - 8y + 10z = 21
         * </code>
         */
        B[0] = new double[]{1, -2, 3, 6};
        B[1] = new double[]{4, -5, 6, 12};
        B[2] = new double[]{7, -8, 10, 21};
    }

    void init2(){
        // 解が一意でない
        /**
         * <code>
         *   x  - 2y + 3z  = 6
         *   4x - 5y + 6z  = 12
         *   4x - 5y + 6z = 12
         * </code>
         */
        B[0] = new double[]{1, -2, 3, 6};
        B[1] = new double[]{4, -5, 6, 12};
        B[2] = new double[]{4, -5, 6, 12};
    }

    static int[] getIntArray(double[] darray){
        int[] ret = new int[darray.length];
        for (int i = 0; i < darray.length; i++) {
            // by default, it rounds to the closest long
            ret[i] = (int) Math.round(darray[i]);
        }
        return ret;
    }

    public static void main(String[] args){
        System.out.println("---------- init1 -----------");

        GaussJordanElimination gj = new GaussJordanElimination();
        gj.init1();
        double[] ans = gj.gaussJordan();

        System.out.println("answer = " + Arrays.toString(ans));
        System.out.println("answer in int = " + Arrays.toString(getIntArray(ans)));

        System.out.println("---------- init2 -----------");

        gj.init2();
        ans = gj.gaussJordan();

        System.out.println("answer = " + Arrays.toString(ans));
    }

}
