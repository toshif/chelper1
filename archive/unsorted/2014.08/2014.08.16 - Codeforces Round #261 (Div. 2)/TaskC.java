package fuku;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    private int k;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        k = in.nextInt();
        int d = in.nextInt();

        students = new int[n+1];
        results = new int[n+1][d];

        List<List<Integer>> src = new LinkedList<>();
        List<Integer> srcZero = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            srcZero.add(i);
        }
        src.add(srcZero);

        for (int i = 0; i < d; i++) {
            src = alloc(src);
            for (int j = 1; j <= n; j++) {
                results[j][i] = students[j];
            }
        }

        for (List<Integer> list : src) {
            if (list.size() != 1) {
                out.print(-1);
                return;
            }
        }

        // OK
        for (int i = 0; i < d; i++) {
            for (int j = 1; j <= n; j++) {
                out.print(results[j][i] + " ");
            }
            out.println();
        }
    }

    int[] students;
    int[][] results;

    List<List<Integer>> alloc(List<List<Integer>> src){
        List<List<Integer>> ret = new LinkedList<>();
        for (List<Integer> list : src) {
            if (list.size() == 1) {
                students[list.get(0)] = 1;
                ret.add(list);
                continue;
            }

            int m = Math.min(k, list.size());
            List<Integer>[] am = new List[m];
            for (int i = 0; i < m; i++) {
                am[i] = new LinkedList<>();
            }

            int next = 0;
            for (Integer s : list) {
                am[next].add(s);
                students[s] = next + 1;
                next++;
                next %= m;
            }

            for (int i = 0; i < m; i++) {
                ret.add(am[i]);
            }
        }

        return ret;
    }
}
