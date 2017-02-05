package fuku;

import java.util.*;

/**
 * System test passed
 */
public class BatchSystem {
    class P {
        List<Integer> tasks = new ArrayList<>();
        long totDuration = 0;
    }
    public int[] schedule(int[] duration, String[] user) {
        int N = user.length;
        Map<String, P> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String u = user[i];
            if (!m.containsKey(u)){
                m.put(u, new P());
            }
            P p = m.get(u);
            p.tasks.add(Integer.valueOf(i));
            p.totDuration += duration[i];
        }

        List<Map.Entry<String, P>> li = new ArrayList<>(m.entrySet());

        Collections.sort(li, new Comparator<Map.Entry<String, P>>() {
            @Override
            public int compare(Map.Entry<String, P> o1, Map.Entry<String, P> o2) {
                if ( o1.getValue().totDuration != o2.getValue().totDuration ) {
                    long a = o1.getValue().totDuration - o2.getValue().totDuration;
                    return (int) (a / Math.abs(a));
                }
                return o1.getValue().tasks.get(0) - o2.getValue().tasks.get(0);
            }
        });

        int[] ret = new int[N];
        int c = 0;
        for (Map.Entry<String, P> entry : li) {
            List<Integer> tasks = entry.getValue().tasks;
            for (Integer task : tasks) {
                ret[c] = task;
                c++;
            }
        }

        return ret;
    }
}
