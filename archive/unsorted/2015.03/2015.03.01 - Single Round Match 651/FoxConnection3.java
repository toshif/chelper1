package fuku;

import java.util.*;

public class FoxConnection3 {
    public long minimalSteps(int[] x, int[] y) {
        N = x.length;

        ss = new GetConnectedPointsPatternSet(N).getSet();

        System.err.printf("ss.size=%s\n", ss.size());

        int ix = getMix(x);
        int iy = getMix(y);

        long mi = 1_000_000_000_000L;

        for (List<P> ps : ss) {
            long[] x2 = new long[N];
            long[] y2 = new long[N];

            for (int j = 0; j < N; j++) {
                x2[j] = x[ix] + ps.get(j).x;
                y2[j] = y[iy] + ps.get(j).y;
            }

            Permutation p = new Permutation(N);

            int[] next;
            while ((next = p.nextPermutation()) != null) {
                long tot = 0;
                for (int j = 0; j < N; j++) {
                    tot += Math.abs(x[next[j]] - x2[j]);
                    tot += Math.abs(y[next[j]] - y2[j]);
                }

                mi = Math.min(mi, tot);
            }
        }


        return mi;
    }

    int getMix(int[] x) {
        int ix = 0;
        long mi_ix = 10000000000000L;
        for (int i = 0; i < N; i++) {
            long totx = 0;
            for (int j = 0; j < N; j++) {
                totx += Math.abs(x[j] - x[i]);
            }
            if (mi_ix > totx) {
                ix = i;
                mi_ix = totx;
            }
        }
        return ix;
    }

    List<List<P>> ss = new ArrayList<>();

    int N = 0;

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
            P p2 = (P) obj;
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

            if (o1.x != o2.x) return o1.x - o2.x < 0 ? -1 : 1;
            return o1.y - o2.y < 0 ? -1 : 1;
        }
    }

    static class GetConnectedPointsPatternSet {

        List<List<P>> ret = new ArrayList<>();
        Set<String> cache = new HashSet<>();

        int N = 0;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        /**
         * @param N number of conencted points
         */
        GetConnectedPointsPatternSet(int N) {
            this.N = N;

            if (N <= 0) return;
            if (N == 1) {
                ret.add(Arrays.asList(new P(0, 0)));
                return;
            }

            // find all the patterns
            calc();
        }

        List<List<P>> getSet() {
            return ret;
        }

        List<List<P>> getUniquePatternSet() {
            List<List<P>> retUnique = new ArrayList<>();
            Set<String> cacheUnique = new HashSet<>();

            for (List<P> s : ret) {
                long minX = s.get(0).x;
                long minY = s.get(0).y;
                for (int i = 0; i < s.size(); i++) {
                    minX = Math.min(minX, s.get(i).x);
                    minY = Math.min(minY, s.get(i).y);
                }
                for (int i = 0; i < s.size(); i++) {
                    s.get(i).x = s.get(i).x - minX;
                    s.get(i).y = s.get(i).y - minY;
                }

                String key = getKey(s);
                if (!cacheUnique.contains(key)) {
                    cacheUnique.add(key);
                    retUnique.add(s);
                }
            }

            return retUnique;
        }

        private void calc() {
            Queue<List<P>> q = new LinkedList<>();
            q.add(Arrays.asList(new P(0, 0)));

            A:
            while (!q.isEmpty()) {
                List<P> s = q.poll();

                for (int i = 0; i < s.size(); i++) {
                    long x = s.get(i).x;
                    long y = s.get(i).y;

                    B:
                    for (int j = 0; j < 4; j++) {
                        long x2 = x + dx[j];
                        long y2 = y + dy[j];

                        P p2 = new P(x2, y2);
                        for (int k = 0; k < s.size(); k++) {
                            if (s.get(k).equals(p2)) continue B;
                        }

                        // add the point
                        List<P> s2 = new ArrayList<>();
                        for (int k = 0; k < s.size(); k++) {
                            s2.add(s.get(k).clone());
                        }
                        s2.add(p2);

                        String key = getKey(s2);
                        if (!cache.contains(key)) {
                            cache.add(key);

                            if (s2.size() == N) {
                                // found a connected N points pattern
                                ret.add(s2);
                            } else {
                                q.add(s2);
                            }
                        }
                    }
                }
            }

        }

        String getKey(List<P> s) {
            Collections.sort(s);
            String key = "" + s;
            return key;
        }
    }


    public static class Permutation {

        private int[] arr;

        private int N;

        private int[] indexes;

        private int pStack = 1;

        /**
         * init with the given array
         */
        public Permutation(int[] arr) {
            init(arr);
        }

        /**
         * Initialize with the size n of natural numbers 0, 1, 2, ... n-1.
         */
        public Permutation(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            init(arr);
        }

        private void init(int[] arr) {
            this.arr = arr;
            N = arr.length;
            indexes = new int[N];
            Arrays.fill(indexes, -1);
        }

        /**
         * @return the next permutation in lexicographical order.
         * return null if already run out all the permutations.
         */
        public int[] nextPermutation() {
            if (pStack == -1) {
                // already ran out the permutations
                return null;
            }

            next();

            if (pStack == -1) {
                // just ran out all the permutations
                return null;
            }

            int[] ret = new int[N];
            for (int i = 0; i < N; i++) {
                ret[i] = arr[indexes[i]];
            }

            return ret;
        }

        @Deprecated
        private void next() {
            pStack--;

            while (true) {
                // ran out all the permutations
                if (pStack == -1) break;

                // found the next permutation
                if (pStack == N) break;

                boolean found = false;
                int base = indexes[pStack];
                int nextVal = base + 1;
                for (; nextVal < N; nextVal++) {
                    boolean isUsed = false;
                    for (int j = pStack - 1; j >= 0; j--) {
                        if (indexes[j] == nextVal) isUsed = true;
                    }

                    if (!isUsed) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    indexes[pStack] = nextVal;
                    pStack++;
                } else {
                    indexes[pStack] = -1;
                    pStack--;
                }
            }
        }


    }


}
