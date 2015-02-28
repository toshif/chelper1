package utils.graph;

import static utils.PointXY.P;

import java.util.*;

/**
 * Returns the pattern set of connected x-y points with N points
 * <p/>
 * <p/>
 * For example,
 * <pre>
 *  Ex1)
 *  . . . * .
 *  . . . * .
 *  . . * * .
 *  . . * . .
 *
 *  -> (<0,0>, <0,1>, <1,1>, <1,2>, <1,3>), ..
 *
 *  Ex2)
 *  . . . . .
 *  . * * * .
 *  . . . . .
 *
 *  -> this is described by the follwing 3 patterns, depending on where the origin point is.
 *
 *  ( <0,0>,  <1,0>, <2,0>)
 *  (<-1,0>,  <0,0>, <1,0>)
 *  (<-2,0>, <-1,0>, <0,0>)
 *
 * </pre>
 * <p/>
 *
 * <p/>
 * Created by toshif on 2015/03/01.
 */
public class ConnectedXYPointsSet {

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

    public static void main(String[] args) {
        System.err.printf("----- getSet N=3 -----\n");

        List<List<P>> patternSet = new GetConnectedPointsPatternSet(3).getSet();
        for (List<P> ps : patternSet) {
            /**
             <pre>
             Set for N = 3

             6 unique patterns x 3 = 18

             [<0,0>, <0,1>, <1,0>]
             [<-1,0>, <0,0>, <1,0>]
             [<0,-1>, <0,0>, <1,0>]
             [<0,0>, <1,0>, <2,0>]
             [<0,0>, <1,0>, <1,1>]
             [<0,0>, <1,-1>, <1,0>]
             [<-1,0>, <0,0>, <0,1>]
             [<0,-1>, <0,0>, <0,1>]
             [<0,0>, <0,1>, <1,1>]
             [<0,0>, <0,1>, <0,2>]
             [<-1,1>, <0,0>, <0,1>]
             [<-1,0>, <-1,1>, <0,0>]
             [<-2,0>, <-1,0>, <0,0>]
             [<-1,-1>, <-1,0>, <0,0>]
             [<-1,0>, <0,-1>, <0,0>]
             [<0,-1>, <0,0>, <1,-1>]
             [<-1,-1>, <0,-1>, <0,0>]
             [<0,-2>, <0,-1>, <0,0>]
             </pre>
             */
            System.err.printf("%s\n", ps);
        }

        System.err.printf("----- getUniquePatternSet N=3 -----\n");

        List<List<P>> uniquePatternSet = new GetConnectedPointsPatternSet(3).getUniquePatternSet();
        for (List<P> ps : uniquePatternSet) {
            /**
             <pre>
             Set for N = 3

             6 unique patterns

             [<0,0>, <0,1>, <1,0>]
             [<0,0>, <1,0>, <2,0>]
             [<0,0>, <0,1>, <1,1>]
             [<0,0>, <1,0>, <1,1>]
             [<0,1>, <1,0>, <1,1>]
             [<0,0>, <0,1>, <0,2>]

             </pre>
             */
            System.err.printf("%s\n", ps);
        }

        System.err.printf("----------\n");

        for (int i = 0; i < 9; i++) {
            /**
             * <pre>
             size of 0 -> 0
             size of 1 -> 1
             size of 2 -> 4
             size of 3 -> 18
             size of 4 -> 76
             size of 5 -> 315
             size of 6 -> 1296
             size of 7 -> 5320
             size of 8 -> 21800
             </pre>

             */
            System.err.printf("size of %s -> %s\n", i, new GetConnectedPointsPatternSet(i).getSet().size());
        }
    }

}
