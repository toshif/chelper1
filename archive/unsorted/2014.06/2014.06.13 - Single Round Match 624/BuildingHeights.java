package fuku;

import java.util.Arrays;

public class BuildingHeights {
    public int minimum(int[] heights) {
        int ret = 0;
        Arrays.sort(heights);
        int N = heights.length;
        for (int M = 2; M <= N; M++) {
            int mi = 1000_000_000;
            for (int i = (M-1); i < N; i++) {
                int s = 0;
                for (int j = 1; j < M; j++) {
                    s += (heights[i] - heights[i-j]);
                }
                mi = Math.min(s, mi);
            }

            //System.out.printf("M=%s,mi=%s\n", M, mi);

            ret ^= mi;
        }

        return ret;
    }
}
