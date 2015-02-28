package utils;

/**
 * A class representing the point X-Y.
 *
 * Created by toshif on 2015/03/01.
 */
public class PointXY {

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

    public static void main(String[] args) {
        P p = new P(1, 2);
        System.err.printf("p=%s\n", p);
        System.err.printf("p.hashCode=%s\n", p.hashCode());
    }
}
