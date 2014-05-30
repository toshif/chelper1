package fuku;

import java.util.*;

public class MixingColors {
    public int minColors(int[] colors) {
        Arrays.sort(colors);
        int N = colors.length;
        int cnt = 0;
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = N-1; i >= 0; i--) {
            int c = colors[i];
            Integer ic = Integer.valueOf(c);
            if (s.contains(ic)) continue;

            cnt++;
            s.add(ic);

            ArrayList<Integer> a = new ArrayList<>();
            for (Integer is : s) {
                a.add(Integer.valueOf(is.intValue() ^ c));
            }

            for (int j = 0; j < a.size(); j++) {
                s.add(a.get(j));
            }
        }
        return cnt;
    }
}
