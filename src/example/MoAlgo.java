package example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * MO's algorithm example
 *
 * Time Complexity : O ( N sqrt(N) + Q )
 *
 * N : number of elements in the target array
 * Q : number of queries
 *
 * Reference : https://blog.anudeep2011.com/mos-algorithm/
 */
public class MoAlgo {
    public static void main(String[] args) {
        String input = "2\n" +
                "5\n" +
                "0 1 4 0 3 \n" +
                "2\n" +
                "0 4 1\n" +
                "2 4 2\n" +
                "5\n" +
                "4 3 0 0 0 \n" +
                "2\n" +
                "0 1 1\n" +
                "2 4 3";

        Scanner in = new Scanner(new BufferedInputStream(new ByteArrayInputStream(input.getBytes())));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            new MoAlgo.Solver().solve(i, in, out);
        }
        out.flush();
    }

    private static class Solver {

        // sqrt(N) : sqrt(10^5) is about 320
        static int BLOCK_SIZE = 320;

        // Query
        static class Q implements Comparable<Q> {
            int l;
            int r;
            int x;
            int idx;

            @Override
            public int compareTo(Q o) {
                // different block. sort by block number
                if (Integer.compare(l / BLOCK_SIZE, o.l / BLOCK_SIZE) != 0)
                    return Integer.compare(l / BLOCK_SIZE, o.l / BLOCK_SIZE);

                // same block. sort by r
                if (Integer.compare(r, o.r) != 0) return Integer.compare(r, o.r);

                return Integer.compare(idx, o.idx);
            }
        }

        private int[] v;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
            }
            int g = in.nextInt();

            List<Q> ps = new ArrayList<>();
            for (int i = 0; i < g; i++) {
                Q p = new Q();
                p.l = in.nextInt();
                p.r = in.nextInt();
                p.x = in.nextInt();
                p.idx = i;

                ps.add(p);
            }
            Collections.sort(ps);

            int m = n / BLOCK_SIZE + 5;

            freq = new int[n];

            int[] ans = new int[g];
            int currentL = 0, currentR = 0;
            A:
            for (Q p : ps) {
                int l = p.l;
                int r = p.r;
                while (currentR <= r) {
                    add(currentR);
                    currentR++;
                }
                while (currentR > r + 1) {
                    remove(currentR - 1);
                    currentR--;
                }
                while (currentL < l) {
                    remove(currentL);
                    currentL++;
                }
                while (currentL > l) {
                    add(currentL - 1);
                    currentL--;
                }

                // find the answer for the query
                ans[p.idx] = freq[p.x];
            }

            for (int i = 0; i < g; i++) {
                out.println(ans[i]);
            }
        }

        int[] freq;

        void add(int position) {
            int vote = v[position];
            freq[vote]++;
        }

        void remove(int position) {
            int vote = v[position];
            freq[vote]--;
        }
    }
    
}
