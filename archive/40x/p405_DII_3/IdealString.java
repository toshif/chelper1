
package tc.p405_DII_3;

import java.util.LinkedList;
import java.util.Queue;

/*
impl by myself (~15mins)
passed sys test
 */
public class IdealString {

    String construct(int length){

        // 0: not used, 1: use
        boolean[][][] can = new boolean[length+2][300][2];
        can[length+1][0][0] = true;
        can[length+1][0][1] = true;

        for (int i = length; i >= 1; i--) {
            for (int j = 0; j < 105; j++) {
                if (j > 0) {
                    can[i][j][0] = can[i + 1][j - 1][0] || can[i + 1][j - 1][1];
                }
                can[i][j][1] = can[i+1][j+(i-1)][0] || can[i+1][j+(i-1)][1];
            }
        }

        if (!can[1][0][1]){
            return "";
        }

        int remain = 0;
        Queue<Character> q = new LinkedList<>();
        String ret = "";
        char nextC = 'A';
        for (int i = 1; i <= length; i++) {
            if (can[i][remain][0]) {
                // not use
                remain--;
                ret += q.poll();
            } else {
                // use
                ret += nextC;
                for (int j = 0; j < i-1; j++) {
                    q.add(nextC);
                }
                remain += (i-1);
                nextC = (char)(nextC + 1);
            }
        }

        return ret;
    }

}

