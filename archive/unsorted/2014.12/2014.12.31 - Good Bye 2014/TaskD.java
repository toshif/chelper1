package fuku;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    class E {
        int to;
        int w;

        public E(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }

    // size of subtree for root node i
    long[] sz;

    List<E>[] edges;

    // parent node of node i
    int[] parentNode;

    long dfs(int node, int parent){
        parentNode[node] = parent;
        List<E> es = edges[node];

        long treeSize = 1;
        for (E e : es) {
            if (e.to == parent) continue;

            long childSize = dfs(e.to, node);
            treeSize += childSize;
        }
        sz[node] = treeSize;
        return treeSize;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int[] from = new int[N-1];
        int[] to = new int[N-1];
        int[] weight = new int[N-1];

        sz = new long[N];
        parentNode = new int[N];

        // from node i -> nodes

        edges = new List[N];
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new LinkedList<>();
        }


        for (int i = 0; i < N - 1; i++) {
            int ai = in.nextInt()-1;
            int bi = in.nextInt()-1;
            int li = in.nextInt();

            from[i] = ai;
            to[i] = bi;
            weight[i] = li;

            edges[ai].add(new E(bi, li));
            edges[bi].add(new E(ai, li));
        }

        dfs(0, -1);

        double factor = 3.0 * 2 / (N * (N-1));

        long sum = 0; // sum * factor = S
        for (int i = 0; i < N-1; i++) {
            int ai = from[i];
            int bi = to[i];

            int pa = ai;
            int child = bi;
            if (parentNode[ai] == bi) {
                pa = bi;
                child = ai;
            }

            long size1 = sz[child];
            long size2 = N - size1;
            sum += (long)size1 * size2 * (long)weight[i];
        }

        System.err.printf("sum=%s\n", sum);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int eid = in.nextInt()-1;
            int newWeight = in.nextInt();

            int ai = from[eid];
            int bi = to[eid];

            int pa = ai;
            int child = bi;
            if (parentNode[ai] == bi) {
                pa = bi;
                child = ai;
            }

            long size1 = sz[child];
            long size2 = N - size1;

            long weightDiff = weight[eid] - newWeight;
            sum -= size1 * size2 * weightDiff;
            out.println(6.0 * sum / N / (N - 1));

            weight[eid] = newWeight;
        }

    }
}
