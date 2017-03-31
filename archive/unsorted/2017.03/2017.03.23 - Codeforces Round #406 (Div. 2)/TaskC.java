package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.*;

public class TaskC {
    int n;

    int[][] states;
    private Set<Integer>[] s;

    class P {
        int p;
        int v;

        public P(int p, int v) {
            this.p = p;
            this.v = v;
        }
    }

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        n = in.nextInt();
        s = new Set[2];
        for (int i = 0; i < 2; i++) {
            s[i] = new HashSet();
        }
        int k1 = in.nextInt();
        for (int i = 0; i < k1; i++) {
            s[0].add(in.nextInt());
        }
        int k2 = in.nextInt();
        for (int i = 0; i < k2; i++) {
            s[1].add(in.nextInt());
        }


        // 0 : win
        // 1 : lose
        // -1 : unknown
        states = new int[2][n];
        for (int i = 0; i < 2; i++) {
            Arrays.fill(states[i], -1);
        }
        states[0][0] = 1;
        states[1][0] = 1;

        Queue<P> q = new ArrayDeque<>();
        q.add(new P(0, 0));
        q.add(new P(1, 0));

        int[][] cnt = new int[2][n];
        Arrays.fill(cnt[0], k1);
        Arrays.fill(cnt[1], k2);

        while (!q.isEmpty()) {
            P p = q.poll();

            Set<Integer> s1 = s[p.p ^ 1];
            for (Integer mv : s1) {
                int prev = ( p.v - mv + 2 * n ) % n;

                if (states[p.p ^ 1][prev] != -1) continue;

                if (states[p.p][p.v] == 1) {
                    states[p.p ^ 1][prev] = 0;
                    q.add(new P(p.p ^ 1, prev));
                } else {
                    cnt[p.p ^ 1][prev]--;
                    if (cnt[p.p ^ 1][prev] == 0) {
                        states[p.p ^ 1][prev] = 1;
                        q.add(new P(p.p ^ 1, prev));
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < n; j++) {
                if (states[i][j] == 0) {
                    sb.append("Win ");
                } else if (states[i][j] == 1) {
                    sb.append("Lose ");
                } else {
                    sb.append("Loop ");
                }
            }
            sb.append("\n");
        }
        out.println(sb.toString());

    }

}
