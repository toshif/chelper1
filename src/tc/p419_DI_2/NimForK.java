
package tc.p419_DI_2;

import java.util.LinkedList;
import java.util.List;

public class NimForK {

    int[] winners(int n, int k, String[] moves){

        List<List<Integer>> mv = new LinkedList<>();
        mv.add(new LinkedList<Integer>());
        for (String s : moves) {
            String[] ss = s.split(" ");
            List<Integer> r = new LinkedList<>();
            for (int i = 0; i < ss.length; i++) {
                r.add(Integer.valueOf(ss[i]));
            }
            mv.add(r);
        }

        // 残り i 個, next player, for player
        // -> 0 : UNKNOWN, 1: CAN WIN, 2: MUST WIN
        int[][][] dp = new int[n+1][k][k];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                if (mv.get(i).contains(Integer.valueOf(i))){
                    // take all
                    dp[i][j][j] = 2;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < k; l++) {


                }
            }
        }


        return null;
    }

}

