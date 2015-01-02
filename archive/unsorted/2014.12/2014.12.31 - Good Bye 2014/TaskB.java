package fuku;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    int n;
    int[] p;
    LinkedList<Integer>[] swp;
    boolean[] visited;
    int[] ret;

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        n = in.nextInt();

        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }
        in.nextLine();


        swp = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            swp[i] = new LinkedList<>();
            String line = in.nextLine();
            for (int j = 0; j < n; j++) {
                if (line.charAt(j) == '1')
                    swp[i].add(j);
            }
        }

        visited = new boolean[n];
        ret = new int[n];

        for (int i = 0; i < n; i++) {
            nodes.clear();
            values.clear();

            if (!visited[i]) {
                dfs(i);
            }

            Collections.sort(nodes);
            Collections.sort(values);

            for (int j = 0; j < nodes.size(); j++) {
                ret[nodes.get(j)] = values.get(j);
            }
        }

        for (int i : ret) {
            out.printf("%d ", i);
        }
    }

    List<Integer> nodes = new LinkedList<>();
    List<Integer> values = new LinkedList<>();

    void dfs(int node){
        visited[node] = true;
        nodes.add(node);
        values.add(p[node]);
        for (Integer nextN : swp[node]) {
            if (!visited[nextN])
                dfs(nextN);
        }
    }
}
