package fuku;

import java.util.Collections;
import java.util.LinkedList;

public class TravellingSalesmanEasy {
    public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
        LinkedList<Integer>[] items = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            items[i] = new LinkedList<>();
        }
        for (int i = 0; i < profit.length; i++) {
            int p = profit[i];
            int c = city[i]-1;
            items[c].add(p);
        }
        for (int i = 0; i < M; i++) {
            Collections.sort(items[i]);
        }


        int tot = 0;
        for (int i = 0; i < visit.length; i++) {
            int c = visit[i]-1;

            if (items[c].size() > 0) {
                tot += items[c].removeLast();
            }
        }

        return tot;
    }
}
