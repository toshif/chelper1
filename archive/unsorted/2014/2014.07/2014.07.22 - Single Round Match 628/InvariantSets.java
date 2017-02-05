package fuku;

import java.util.Arrays;
import java.util.LinkedList;

public class InvariantSets {

    private int n;
    private int[] f;

    public long countSets(int[] f) {
        this.f = f;
        n = f.length;
        used = new int[n];
        Arrays.fill(used, -1);

        long grand = 1;
        for (int i = 0; i < n; i++) {
            if (used[i] == -1) {
                findMode = false;
                loop.clear();
                current++;
                dfs(i);

                System.out.println(loop);

                long tot = 1;
                for (Integer idx : loop) {
                    tot *= backsearch(idx);
                }
                grand *= tot;
            }
        }

        return grand;
    }

    long backsearch(int idx){
        System.out.println("backserch=" + idx);
        long tot = 1;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (idx == f[i] && !loop.contains(Integer.valueOf(i))){
                used[i] = current;
                tot *= backsearch(i);
                found = true;
            }
        }
        if (!found) return 1;
        System.out.println("backserch ret=" + (tot+1));
        return tot + 1;
    }

    int[] used;
    int current = 0;
    int back = 0;
    boolean findMode = false;
    LinkedList<Integer> loop = new LinkedList<>();

    void dfs(int cntNode){
        int next = f[cntNode];

        if (findMode) {
            loop.add(Integer.valueOf(cntNode));
            if (back == next) return;
        }

        used[cntNode] = current;

        if (used[next] == -1) {
            dfs(next);
        } else {
            back = cntNode;
            findMode = true;
            loop.add(Integer.valueOf(cntNode));
            // found loop
            dfs(next);
        }
    }
}
