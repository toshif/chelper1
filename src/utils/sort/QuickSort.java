package utils.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Reference impl.
 *
 * Created by toshif on 6/23/14.
 */
public class QuickSort {

    void quickSort(int[] a) {
        sort1(a, 0, a.length - 1);
    }

    /**
     * a の l ~ r の範囲を sort する
     *
     * divide and conquer
     */
    void sort1(int[] a, int l, int r) {
        if (l >= r) return;

        int v = partition(a, l, r);

        sort1(a, l, v - 1);
        sort1(a, v + 1, r);
    }

    /**
     * <pre>
     * l ~ r を v より小さい範囲(vより左側)と、大きい範囲(vより右側)に分けて、その v の index を返す。
     *
     * この v を pivot と呼ぶ。どれをpivot にしてもよいので、右端の値を pivot として選ぶ。
     *
     * 定本 Cプログラマのための　アルゴリズムとデータ構造　を参照した。
     * </pre>
     */
    int partition(int[] a, int l, int r) {
        int pivot = a[r];

        int i = l;
        int j = r - 1;
        while (true) {
            // i を右へ
            while (a[i] < pivot) i++;

            // j を左へ
            while (i < j && a[j] >= pivot) j--;

            if (i >= j) break;

            swap(a, i, j);
        }

        // pivot より小さい値で止まった場合、もう一つ右の pivot より大きい値のものを i とする
        if (a[i] < pivot) i++;

        // pivot と 交換
        swap(a, i, r);

        return i;
    }

    void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {3, 7, 20, 102, 53, 111, 4, 2, 23, 30};

        QuickSort sort = new QuickSort();
        sort.quickSort(a);

        System.out.println("a = " + Arrays.toString(a));

        // ランダムな array のソートでチェック
        if (1 == 1) {
            int N = 10000;
            a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = (int) (Math.random() * 10_000_000);
            }
            int[] b = a.clone();

            Arrays.sort(a);
            sort.quickSort(b);

            boolean isMatch = true;
            for (int i = 0; i < N; i++) {
                if (a[i] != b[i]) {
                    isMatch = false;
                }
            }
            System.out.println("isMatch = " + isMatch);
        }
    }
}
