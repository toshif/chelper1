package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;

public class IntervalGame {

    private long[] ss;
    private int[] b;
    private long[] a;
    private int n;
    private int m;

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();

        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        ss = new long[n];
        long stmp = 0;
        for (int i = 0; i < n; i++) {
            stmp += a[i];
            ss[i] = stmp;
        }

        long[] prev = new long[n];
        long[] current = new long[n];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = m - 1; i >= 0; i--) {
            Arrays.fill(current, 0);
            int range = b[i];

            deque.clear();
            for (int j = 0; j < n; j++) {
                if (j + range - 1 > n - 1) break;

                long rangeVal = ss[j + range - 1] - (j == 0 ? 0 : ss[j - 1]);

                if (i != m - 1) {
                    int prevRange = b[i + 1];

                    // init for the first item
                    if (j == 0) {
                        for (int k = 1; k < range - prevRange; k++) {
                            while (!deque.isEmpty() && prev[k] >= prev[deque.getLast()]) {
                                deque.removeLast();
                            }
                            deque.addLast(k);
                        }
                    } else {

                        // Remove the elements which are out of this window
                        while ((!deque.isEmpty()) && deque.getFirst() < j + 1) {
                            deque.removeFirst();
                        }

                        // Remove all elements smaller than the currently
                        // being added element (remove useless elements)
                        while ((!deque.isEmpty()) && prev[deque.getLast()] < prev[j + range - prevRange - 1]) {
                            deque.removeLast();
                        }

                        deque.addLast(j + range - prevRange - 1);
                    }

                    // get it from the deque
                    long maxValInPrevRange = prev[deque.getFirst()];
                    rangeVal -= maxValInPrevRange;
                }

                current[j] = rangeVal;
            }

            System.arraycopy(current, 0, prev, 0, n);
        }

        long ma = 0;
        for (int j = 0; j < n; j++) {
            ma = Math.max(ma, prev[j]);
        }
        out.println(ma);
    }
}
