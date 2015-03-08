package marathon1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by vaiouser on 2015/03/01.
 */
public class BacktrackN {

    int N = 20;

    void calc() {
        LinkedList<P> s = new LinkedList<>();
        rec(s, 0);
    }

    int[] dx = {1, 1, 1};
    int[] dy = {0, -1, 1};

    boolean found = false;

    void rec(LinkedList<P> s, int x) {
        if (x == N) {
            // found it
            System.err.printf("s=%s\n", s);
            found = true;
            return;
        }

        A1:
        for (int i = 0; i < N; i++) {
            for (P p : s) {
                if (i == p.y) continue A1;
                if (x - p.x == Math.abs(p.y - i)) continue A1;
            }

            // ok
            s.add(new P(x, i));

            if (found) {
                return;
            } else {
                rec(s, x+1);
            }

            s.removeLast();
        }
    }

    public static void main(String[] args) {
        new BacktrackN().calc();
    }


    public static class P implements Comparable<P> {
        public long x;
        public long y;

        private final long HASH_MOD = 1_000_000_007;

        public P(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            P p2 = (P)obj;
            return x == p2.x && y == p2.y;
        }

        @Override
        public String toString() {
            return "<" + x + "," + y + ">";
        }

        @Override
        public int hashCode() {
            int hash = 1;
            hash = hash * 17 + (int) (x % HASH_MOD);
            hash = hash * 31 + (int) (y % HASH_MOD);
            return hash;
        }

        @Override
        public P clone() {
            return new P(x, y);
        }

        @Override
        public int compareTo(P o2) {
            P o1 = this;

            if ( o1.x != o2.x ) return o1.x - o2.x < 0 ? -1 : 1;
            return o1.y - o2.y < 0 ? -1 : 1;
        }
    }

}
