package fuku;

import java.util.HashMap;

public class PeacefulLine {
    public String makeLine(int[] x) {
        int N = x.length;

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Integer age = Integer.valueOf(x[i]);
            if (!m.containsKey(age)) {
                m.put(age, 0);
            }

            m.put(age, m.get(age)+1);
        }

        int max = N % 2 == 0 ? N / 2 : (N+1)/2;

        for (Integer v : m.values()) {
            if (v > max) {
                return "impossible";
            }
        }

        return "possible";
    }
}
