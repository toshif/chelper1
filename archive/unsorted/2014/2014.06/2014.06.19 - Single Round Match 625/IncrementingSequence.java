package fuku;

import java.util.Arrays;

public class IncrementingSequence {
    public String canItBeDone(int k, int[] A) {
        Arrays.sort(A);
        int N = A.length;
        boolean[] used = new boolean[N];
        boolean[] mark = new boolean[N+1];

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int x = A[i];
            if (x > N) return "IMPOSSIBLE";
            if (mark[x]) continue;

            used[i] = true;
            mark[x] = true;
            cnt++;
        }

        while(true){
            boolean found = false;
            for (int i = 0; i < N; i++) {
                if(used[i]) continue;

                int x = A[i];
                for (int j = 1; (x + j *k) < N + 1; j++) {
                    int y = x + j *k;
                    if (!mark[y]){
                        mark[y] = true;
                        used[i] = true;
                        found = true;
                        cnt++;
                    }
                }
            }

            if (!found){
                break;
            }
        }

        if (cnt == N) return "POSSIBLE";
        return "IMPOSSIBLE";
    }
}
