package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskF {

    private int n;
    private int k;
    private List<Integer>[] e;
    private Set<Integer> c;
    private int[] ck;
    private boolean[] visited;
    private int[] et;
    private int root;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        k = in.nextInt();
        e = new List[n];
        for (int i = 0; i < n; i++) {
            e[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(in.next()) - 1;
            int b = Integer.parseInt(in.next()) - 1;

            e[a].add(b);
            e[b].add(a);
        }

        c = new HashSet<>();
        for (int i = 0; i < 2 * k; i++) {
            c.add(Integer.parseInt(in.next()) - 1);
        }

        // find v
        ck = new int[n];
        visited = new boolean[n];
        Arrays.fill(ck, -1);
        count(0);

        root = 0;
        Arrays.fill(visited, false);
        find(0);

        // list sub trees
        Arrays.fill(visited, false);
        et = new int[n];
        list(root);

        // print
        out.println("1");
        out.println("" + (root + 1));
        for (int i = 0; i < k; i++) {
            out.println((et[i] + 1) + " " + (et[i + k] + 1) + " " + (root + 1));
        }
    }

    int count(int v) {
        visited[v] = true;

        int tot = 0;
        for (int i = 0; i < e[v].size(); i++) {
            Integer next = e[v].get(i);
            if (visited[next]) continue;

            tot += count(next);
        }

        if (c.contains(v)) {
            tot += 1;
        }

        ck[v] = tot;
        return tot;
    }

    void find(int v) {
        visited[v] = true;
        root = v;
        for (int i = 0; i < e[v].size(); i++) {
            Integer next = e[v].get(i);
            if (visited[next]) continue;
            if (ck[next] < k) continue;

            find(next);
        }
    }

    int idx = 0;

    void list(int v) {
        visited[v] = true;

        for (int i = 0; i < e[v].size(); i++) {
            Integer next = e[v].get(i);
            if (visited[next]) continue;
            list(next);
        }

        if (c.contains(v)) {
            et[idx++] = v;
        }
    }

}
