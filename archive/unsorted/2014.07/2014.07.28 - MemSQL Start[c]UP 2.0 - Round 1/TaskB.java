package fuku;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    class P {
        int x;
        int y;

        P(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "P{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        LinkedList<P> ps = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                P p1 = new P(i, 0);
                ps.add(p1);
            }

            if (i != n) {
                P p2 = new P(i, m);
                ps.add(p2);
            }
        }
        for (int i = 0; i <= m; i++) {
            if (i != 0) {
                P p1 = new P(0, i);
                ps.add(p1);
            }

            if (i != m) {
                P p2 = new P(n, i);
                ps.add(p2);
            }
        }

        LinkedList<P> rm = new LinkedList<>();
        for (P p : ps) {
            if (p.x == 0 && p.y == 0) rm.add(p);
            if (p.x == n && p.y == m) rm.add(p);
        }
        ps.removeAll(rm);

        System.err.printf("%s\n", ps);

        LinkedList<P> nm = new LinkedList<>();
        nm.add(new P(n, m));
        LinkedList<P> ze = new LinkedList<>();
        ze.add(new P(0, 0));

        find(ps, nm, ze, ps);
        find(nm, ze, ps, ps);

        for (P p : besp) {
            out.printf("%d %d\n", p.x, p.y);
        }
    }

    double best = 0;
    P[] besp = new P[4];

    void find(LinkedList<P> ps1, LinkedList<P> ps2, LinkedList<P> ps3, LinkedList<P> ps4) {
        for (P p1 : ps1) {
            for (P p2 : ps2) {
                for (P p3 : ps3) {
                    for (P p4 : ps4) {
                        double tot = dist(p1, p2) + dist(p2, p3) + dist(p3, p4);
                        if (best < tot) {
                            besp = new P[]{p1, p2, p3, p4};
                            best = tot;
                        }
                    }
                }
            }
        }
    }

    double dist(P p1, P p2){
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        return Math.sqrt(x * x + y * y);
    }
}
