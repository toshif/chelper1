package hr.bear_and_steady_gene;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {

        private int[] a;
        private int[][] A;
        private int n;

        public void solve(Scanner in, PrintWriter out) {
            n = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            char[] cs = s.toCharArray();

            a = new int[4];
            A = new int[n][4];

            for (int i = 0; i < n; i++) {
                if (cs[i] == 'A') a[0]++;
                if (cs[i] == 'C') a[1]++;
                if (cs[i] == 'T') a[2]++;
                if (cs[i] == 'G') a[3]++;

                for (int j = 0; j < 4; j++) {
                    A[i][j] = a[j];
                }
            }

            if (a[0] == n /4 && a[1] == n /4 && a[2] == n /4 && a[3] == n /4) {
                out.println("0"); return;
            }

            int mi = 1_000_000_000;
            for (int i = 0; i < n; i++) {
                int lo = i;
                int hi = n -1;
                for (int j = 0; j < 100; j++) {
                    if (hi - lo <= 1) break;
                    int mid = (lo + hi) / 2;
                    if (ok(i, mid)) {
                        hi = mid;
                    } else {
                        lo = mid;
                    }
                }

                int req = 1_000_000_000;
                if (ok(i, hi)) req = (hi - i) + 1;
                if (ok(i, lo)) req = (lo - i) + 1;
                mi = Math.min(mi, req);
            }

            out.printf("%d", mi);
        }

        boolean ok(int i, int mid) {
            for (int k = 0; k < 4; k++) {
                int right = a[k] - A[mid][k];
                int left = (i==0) ? 0 : A[i-1][k];
                int remain = left + right;
                if (remain > n / 4) return false;
            }
            return true;
        }
    }

}
