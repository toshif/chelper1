package utils.graph;

import static utils.PointXY.P;

import java.util.*;

/**
 * Returns the pattern set of connected x-y points with N points
 * <p/>
 * <p/>
 * For example,
 * <pre>
 *  . . . * .
 *  . . . * .
 *  . . * * .
 *  . . * . .
 *
 *  -> (<0,0>, <0,1>, <1,1>, <1,2>, <1,3>)
 *
 * </pre>
 * <p/>
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
                        s2.addAll(s);
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
        List<List<P>> patternSet = new GetConnectedPointsPatternSet(3).getSet();
        for (List<P> ps : patternSet) {
            /**
             <pre>
             Set for N = 3

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

        System.err.printf("----------\n");

        for (int i = 0; i < 9; i++) {
            System.err.printf("size of %s -> %s\n", i, new GetConnectedPointsPatternSet(i).getSet().size());
        }
    }

}
