package fuku;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    boolean[] used;
    int[] cnt;
    private int n;

    long tot = 1;
    private int[][] g;

    LinkedList<Integer> q;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        int m = in.nextInt();

        used = new boolean[n];
        cnt = new int[n];

        g = new int[n][n];
        for (int i = 0; i < m; i++) {
            int p1 = in.nextInt() - 1;
            int p2 = in.nextInt() - 1;

            g[p1][p2] = 1;
            g[p2][p1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 1) {
                    cnt[j]++;
                }
            }
        }

        q = new LinkedList<>();
        while (true) {
            int idx = -1;
            if (q.isEmpty()) {
                idx = findMax();
            } else {
                idx = q.removeLast();
            }

            if (idx == -1) break;

            calc(idx);
            used[idx] = true;
            adds(idx);
        }

        out.println(tot);
    }

    int findMax() {
        int ma = -1;
        int mai = -1;
        for (int i = 0; i < n; i++) {
            if (!used[i] && cnt[i] > ma) {
                mai = i;
                ma = cnt[i];
            }
        }

        return mai;
    }

    void calc(int idx) {
        if (used[idx]) return;

        for (int i = 0; i < n; i++) {
            if (used[i] && g[idx][i] == 1) {
                tot *= 2;
                break;
            }
        }
    }

    void adds(int idx){
        for (int i = 0; i < n; i++) {
            if (!used[i] && g[idx][i] == 1){
                q.add(i);
            }
        }
    }
}
