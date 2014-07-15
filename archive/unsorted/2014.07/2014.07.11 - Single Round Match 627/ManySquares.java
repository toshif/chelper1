package fuku;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ManySquares {
    public int howManySquares(int[] sticks) {
        Arrays.sort(sticks);

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < sticks.length; i++) {
            Integer vi = Integer.valueOf(sticks[i]);
            if (!m.containsKey(vi)) {
                m.put(vi, 0);
            }
            m.put(vi, m.get(vi) + 1);
        }

        System.out.println("m = " + m);

        int tot = 0;
        for (Integer val : m.values()) {
            tot += val / 4;
        }

        return tot;
    }
}
