package fuku;

import java.util.Collections;
import java.util.LinkedList;

public class CatsOnTheLineDiv2 {

    class P implements Comparable {
        int pos = 0;
        int count = 0;

        @Override
        public int compareTo(Object o) {
            return pos - ((P)o).pos;
        }

        @Override
        public String toString() {
            return "P{" +
                    "pos=" + pos +
                    ", count=" + count +
                    '}';
        }
    }

    public String getAnswer(int[] position, int[] count, int time) {
        int N = position.length;
        final int offset = 3000;
        boolean[] used = new boolean[6000];

        LinkedList<P> ps = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            P p = new P();
            p.pos = position[i];
            p.count = count[i];
            ps.add(p);
        }

        Collections.sort(ps);
        //System.out.println("ps = " + ps);

        for (int i = 0; i < ps.size(); i++) {
            P p = ps.get(i);
            int pos = p.pos + offset;
            int from = pos - time;
            int to = pos + time;

            if (2 * time + 1 < p.count) {
                return "Impossible";
            }

            int remain = p.count;
            for (int j = from; j <= to; j++) {
                if (remain == 0) break;
                if (used[j]) continue;

                used[j] = true;
                remain--;
            }

            if (remain != 0) {
                return "Impossible";
            }
        }

        return "Possible";
    }
}
