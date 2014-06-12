package fuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    class P {
        int p1;
        int p2;
    }

    int N, M;
    int[] v;
    boolean[] used;
    List<P> es;
    int[] cost;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        N = in.nextInt();
        M = in.nextInt();
        v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = in.nextInt();
        }

        es = new ArrayList<>();
        for (int i = 0; i < M ; i++) {
            int pa = in.nextInt() -1;
            int pb = in.nextInt() -1;

            P p = new P();
            p.p1 = pa;
            p.p2 = pb;
            es.add(p);
        }

        used = new boolean[N];

        int tot = 0;
        for (int i = 0; i < N; i++) {
            int mii = findMi();
            used[mii] = true;
            tot += cost[mii];
        }

        out.print(tot);
    }

    int findMi(){
        cost = new int[N];
        for (P e : es) {
            if (!used[e.p2])
                cost[e.p1] += v[e.p2];

            if (!used[e.p1])
                cost[e.p2] += v[e.p1];
        }

        /*
        int mi = 1_000_000_000;
        int mii = -1;
        int vi = 0;
        for (int i = 0; i < N; i++) {
            if (used[i]) continue;

            if (mi > cost[i]) {
                mi = cost[i];
                mii = i;
                vi = v[i];
            } else if (mi == cost[i]){
                if (vi < v[i]){
                    mi = cost[i];
                    mii = i;
                    vi = v[i];
                }
            }
        }
        */

        int ma = -1;
        int mii = 0;
        int nb = 0;
        for (int i = 0; i < N; i++) {
            if ( !used[i] ) {
                if ( v[i] > ma){
                    ma = v[i];
                    mii = i;
                } else if (v[i] == ma) {

                }
            }
        }

        return mii;
    }
}
