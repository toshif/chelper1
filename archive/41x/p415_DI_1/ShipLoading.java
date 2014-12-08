
package tc.p415_DI_1;

import java.util.Arrays;

/*
passed sys test

greeedy

easy
 */
public class ShipLoading {

    int minimumTime(int[] cranes, String[] boxes){
        Arrays.sort(cranes);
        int M = cranes.length;

        String b = "";
        for (String box : boxes) {
            b += box;
        }
        String[] bs = b.split(" ");
        int N = bs.length;

        int[] box = new int[N];
        boolean[] used = new boolean[N];
        for (int i = 0; i < N; i++) {
            box[i] = Integer.parseInt(bs[i]);
        }
        Arrays.sort(box);

        int cnt = N;
        int turn = 0;
        while(cnt > 0){
            turn++;
            boolean updated = false;

            A:
            for (int i = M - 1; i >= 0; i--) {
                for (int j = N - 1; j >= 0; j--) {
                    if (used[j]) continue;

                    if (box[j] <= cranes[i]) {
                        cnt--;
                        used[j] = true;
                        updated = true;
                        continue A;
                    }
                }
            }

            if (!updated) return -1;
        }

        return turn;
    }

}

