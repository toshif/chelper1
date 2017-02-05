package fuku;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class EmoticonsDiv1 {
    // emo num, clip
    int[][] dp = new int[1500][1500];

    class P {
        int step = 0;
        int emo = 0;
        int clip = 0;

        P(int step, int emo, int clip) {
            this.step = step;
            this.emo = emo;
            this.clip = clip;
        }
    }

    public int printSmiles(int smiles) {
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 1000_000_00);
        }
        dp[1][0] = 0;
        LinkedList<P> q = new LinkedList<>();
        q.add(new P(0, 1, 0));

        while(true) {
            if (q.size() == 0) break;
            P p = q.pop();

            // copy
            P co = new P(p.step + 1, p.emo, p.emo);
            if ( isOK(co) && isBest(co) ) q.add(co);

            // paste
            P pa = new P(p.step + 1, p.emo + p.clip, p.clip);
            if ( isOK(pa) && isBest(pa) ) q.add(pa);

            // delete
            P de = new P(p.step + 1, p.emo -1, p.clip);
            if ( isOK(de) && isBest(de) ) q.add(de);
        }

        int mi = 1000_000_00;
        for (int i = 0; i < 1500; i++) {
            mi = Math.min(mi, dp[smiles][i]);
        }

        return mi;
    }

    boolean isBest(P p){
        if ( dp[p.emo][p.clip] > p.step ) {
            dp[p.emo][p.clip] = p.step;
            return true;
        }
        return false;
    }

    boolean isOK(P p) {
        if (p.emo < 0 || 1500 <= p.emo){
            return false;
        }
        if (p.clip < 0 || 1500 <= p.clip){
            return false;
        }
        if (p.step > 2000) {
            return false;
        }
        return true;
    }
}
