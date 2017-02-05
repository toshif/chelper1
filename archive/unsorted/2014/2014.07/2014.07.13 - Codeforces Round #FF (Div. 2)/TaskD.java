package fuku;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    private int n;
    private int m;
    private long p;

    Comparator<Long> c = new Comparator<Long>() {
        @Override
        public int compare(Long o1, Long o2) {
            return - o1.compareTo(o2);
        }

        @Override
        public boolean equals(Object obj) {
            return obj.equals(this);
        }
    };

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();
        int k = in.nextInt();
        p = in.nextInt();

        long[][] g = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = in.nextInt();
            }
        }

        PriorityQueue<Long> ns = new PriorityQueue<Long>(1000, c);
        PriorityQueue<Long> ms = new PriorityQueue<Long>(1000, c);

        for (int i = 0; i < n; i++) {
            long tot = 0;
            for (int j = 0; j < m; j++) {
                tot += g[i][j];
            }
            ns.offer(tot);
        }

        for (int i = 0; i < m; i++) {
            long tot = 0;
            for (int j = 0; j < n; j++) {
                tot += g[j][i];
            }
            ms.offer(tot);
        }


        long ma = -1000_000_000_000_000L;
        for (int i = 0; i <= k; i++) {
            int rows = i;
            int cols = k -i;

            long tot = 0;
            tot += dod(clone(ns, q1), p * m, rows);
            tot += dod(clone(ms, q2), p * n, cols);

            long mi = p * rows * (cols);

            tot -= mi;

            ma = Math.max(ma, tot);
        }

        out.println(ma);
    }

    PriorityQueue<Long> q1 = new PriorityQueue<Long>(1000, c);
    PriorityQueue<Long> q2 = new PriorityQueue<Long>(1000, c);

    PriorityQueue<Long> clone(PriorityQueue<Long> q, PriorityQueue<Long> nq){
        nq.clear();
        for (Long v : q) {
            nq.offer(v);
        }
        return nq;
    }

    long dod(PriorityQueue<Long> queue, long pm, int rows){
        long tot = 0;
        for (int i = 0; i < rows; i++) {
            Long v = queue.poll();
            tot += v;
            queue.offer(v - pm);
        }
        return tot;
    }


}
