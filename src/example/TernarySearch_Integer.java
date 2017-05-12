package example;

import utils.io.MyReader;

import java.io.PrintWriter;

/**
 * Integer ternary search は binary search に帰着させて解ける.
 *
 * Example problems:
 *
 * http://codeforces.com/problemset/problem/774/A
 *
 */
public class TernarySearch_Integer {

    public static void main(String[] args) {
        new TernarySearch_Integer().solve();
    }

    public void solve() {
        // ternary search : find the minimum f
        long lo = 0, hi = 1000_000_000L;
        while (hi - lo > 1) {
            long mid = (lo + hi) / 2;
            if (f(mid) < f(mid + 1)) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        if (f(lo) < f(hi)) {
            System.out.println(lo);
        } else {
            System.out.println(hi);
        }

    }

    long f(long v) {
        // 3(x - 27)^2 + 5
        return 3 * (v - 27) * (v - 27) + 5;
    }

}
