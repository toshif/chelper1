package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * http://en.wikipedia.org/wiki/Inclusion%E2%80%93exclusion_principle
 *
 * Created by toshif on 5/20/14.
 */
public class InclusionExclusion {

    static class IeSet {
        int a = 0;
    }

    // the number of sets
    int M = 2;

    IeSet[] sets = new IeSet[M];

    public long doInclusionExclusion(){
        long tot = 0;
        for (int i = 1; i < (1<<M); i++) {
            int bits = 0;
            for (int j = i; j > 0; j >>= 1) bits += j & 1;

            long sign = bits % 2 == 0 ? -1 : 1;

            List<IeSet> andSets = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                // if the bit for j-th set is on
                if (((i >> j) & 1) == 1){
                    andSets.add(sets[j]);
                }
            }

            // DO calculate AND of the andSets
            // A ∩ B ∩ C ..
            long andResult = 0;

            tot += sign * andResult;
        }

        return tot;
    }

    public static void main(String[] args){
        InclusionExclusion ie = new InclusionExclusion();

        IeSet s1 = new IeSet();
        s1.a = 2;
        ie.sets[0] = s1;

        IeSet s2 = new IeSet();
        s2.a = 2;
        ie.sets[1] = s2;

        long ret = ie.doInclusionExclusion();
        System.out.println("ret = " + ret);
    }

}
