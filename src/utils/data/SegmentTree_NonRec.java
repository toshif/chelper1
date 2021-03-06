package utils.data;

/**
 * Segment Tree の 再帰を使わない実装。
 * <p>
 * 再帰より定数倍早い。
 * <p>
 * References:
 * http://d.hatena.ne.jp/komiyam/20131202/1385992406
 * http://proc-cpuinfo.fixstars.com/2017/07/optimize-segment-tree/
 */
public class SegmentTree_NonRec {

    private int N;

    private long[] A;

    private long[] tree;

    /*
     * Initialize : O(N * Log2 N)
     *
     * A is the leaf array to be initialized with.
     */
    public SegmentTree_NonRec(long[] A) {
        this.A = A;

        // A 以上の最小の2のべき乗の数 15 -> 16, 16 -> 16, 17 -> 32
        // 計算を簡単にするために、N を 2 のべき乗にしておく
        N = Integer.highestOneBit(A.length);
        if (N != A.length) {
            N *= 2;
        }

        int treeSize = 2 * N;
        tree = new long[treeSize];

        init();
    }

    private void init() {
        for (int i = 0; i < A.length; ++i) tree[i + N] = A[i];
        for (int i = N - 1; i > 0; --i) tree[i] = Math.min(tree[i * 2], tree[i * 2 + 1]);
    }

    /**
     * update the value at the index.
     * <p>
     * 0-indexed.
     * <p>
     * For exammple, A=[4,5,6], if want to update the leftmost from 4 to newValue,
     * update(0, newValue)
     */
    public void update(int idx, long newValue) {
        for (int i = idx + N; i > 0; i >>= 1) {
            if (i == idx + N) {
                // leaf
                tree[i] = newValue;
            } else {
                tree[i] = Math.min(tree[2 * i], tree[2 * i + 1]);
            }
        }
    }

    /*
    * Returns the minimum value in range [left, right] inclusive
    *
    * left & right are 0-indexed.
    *
    * For example, in case of A=[2,3,1,5], then you want to query the leftmost 3 items range, it will be
    * query(0,2)
    */
    public long query(int left, int right) {
        long ret = 1_000_000_000_000_000_000L;

        int L = left + N;
        int R = right + 1 + N;
        for (; L < R; L >>= 1, R >>= 1) {
            if ((R & 1) > 0) {
                --R;
                ret = Math.min(ret, tree[R]);
            }
            if ((L & 1) > 0) {
                ret = Math.min(ret, tree[L]);
                L++;
            }
        }

        return ret;
    }

}
