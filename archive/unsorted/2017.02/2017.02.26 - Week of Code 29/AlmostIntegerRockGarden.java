package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.*;

public class AlmostIntegerRockGarden {

    Map<Integer, Integer> m = new TreeMap<>();
    Map<Integer, LinkedList<Integer[]>> m2 = new TreeMap<>();

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = -12; i <= 12; i++) {
            for (int j = -12; j <= 12; j++) {
                int d2 = i * i + j * j;

                if (isZero(Math.sqrt(d2) - (int) (Math.sqrt(d2)))) {
//                    System.err.printf("zero %s \n", d2);
                } else {
                    if (!m.containsKey(d2)) {
                        m.put(d2, 0);
                        m2.put(d2, new LinkedList<>());
                    }
                    m.put(d2, m.get(d2) + 1);
                    m2.get(d2).add(new Integer[]{i, j});
                }
            }
        }

        int targetD2 = x * x + y * y;
        int targetidx = -1;

        int n = m.size();
        Integer[] vs = new Integer[n];
        int[] vsSize = new int[n];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            vs[idx] = entry.getKey();
            vsSize[idx] = entry.getValue();
            if (targetD2 == entry.getKey()) {
                targetidx = idx;
            }
            idx++;
        }

        int[][] groups = new int[][]{
                {3, 14, 14, 16, 31, 31, 31, 45, 46, 50, 52, 52},
                {3, 4, 13, 19, 32, 33, 41, 43, 47, 59, 59, 59},
                {21, 24, 36, 41, 41, 44, 47, 54, 56, 58, 58, 62},
                {0, 9, 31, 31, 33, 34, 34, 37, 53, 56, 56, 63},
                {9, 15, 15, 31, 31, 33, 34, 34, 37, 56, 60, 63},
                {2, 3, 6, 8, 8, 8, 20, 25, 39, 43, 56, 62},
                {0, 24, 27, 29, 40, 40, 48, 49, 49, 54, 55, 55},
                {0, 2, 2, 3, 8, 20, 25, 34, 39, 43, 56, 62},
                {21, 24, 26, 36, 44, 47, 54, 56, 56, 58, 58, 62},
                {9, 26, 26, 26, 31, 31, 33, 34, 34, 37, 60, 63},
                {11, 12, 29, 31, 35, 37, 43, 44, 44, 57, 60, 64},
                {11, 12, 29, 31, 35, 37, 43, 44, 44, 53, 57, 67},
                {9, 10, 21, 21, 24, 25, 30, 38, 41, 44, 48, 62},
                {2, 4, 16, 19, 30, 33, 41, 43, 47, 59, 59, 59},
                {4, 8, 13, 25, 27, 28, 37, 43, 45, 49, 51, 65},
                {7, 9, 31, 31, 33, 34, 34, 37, 41, 41, 60, 63},
                {18, 18, 28, 30, 31, 40, 42, 44, 48, 49, 61, 66},
                {1, 23, 27, 28, 30, 31, 33, 46, 54, 61, 66, 66},
                {3, 5, 16, 22, 31, 31, 31, 45, 46, 52, 52, 54},
                {0, 10, 13, 30, 31, 31, 31, 45, 46, 50, 52, 54},
                {3, 4, 4, 4, 8, 16, 20, 25, 34, 43, 56, 62},
                {3, 4, 4, 8, 16, 17, 20, 25, 34, 39, 43, 56}
        };
        int[] g = new int[0];
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                if (groups[i][j] == targetidx) {
                    g = groups[i];
                }
            }
        }

        double sum = Math.sqrt(x * x + y * y);
        boolean first = true;
        for (int i = 0; i < g.length; i++) {
            if (targetidx == g[i]) {
                if (first) {
                    first = false;
                    continue;
                }
            }

            Integer[] point = m2.get(vs[g[i]]).removeFirst();
            if (point[0] == x && point[1] == y) {
                point = m2.get(vs[g[i]]).removeFirst();
            }

            out.println(point[0] + " " + point[1]);

            sum += Math.sqrt(point[0] * point[0] + point[1] * point[1]);
        }

//        System.err.printf("sum=%s\n", sum);
    }

    boolean isZero(double v) {
        return Math.abs(v) < 1E-12;
    }
}
