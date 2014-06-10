package fuku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * System Test Passed
 */
public class CrazyLine {
    int N;
    private int[] heights;

    public int maxCrazyness(int[] heights) {
        this.heights = heights;
        N = heights.length;
        Arrays.sort(heights);

        return Math.max(getMax(false), getMax(true));
    }

    int getMax(boolean init){
        LinkedList<Integer> he = new LinkedList<>();
        for (int i : heights) {
            he.add(i);
        }

        int tot = 0;
        int prev = he.remove(N/2);
        boolean shouldMax = init;
        while(he.size() > 0){
            int next = 0;
            if (shouldMax){
                next = he.removeLast();
            } else {
                next = he.removeFirst();
            }
            shouldMax = !shouldMax;
            tot += Math.abs(next - prev);
            prev = next;
        }

        return tot;
    }
}
