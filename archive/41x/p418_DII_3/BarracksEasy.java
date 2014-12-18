
package tc.p418_DII_3;

import java.util.Arrays;

/*
sys test passed
impl by myself
 */
public class BarracksEasy {

    int attack(int myUnits, int barHp, int unitsPerRound){
        // turn %2, hp, myUnits, enemyUnits at turn end
        boolean[][][][] dp = new boolean[2][barHp+1][myUnits+1][100];
        dp[0][barHp][myUnits][0] = true;

        int turn = 0;
        for (int z = 0; z < 1000; z++) {
            turn++;

            //System.err.printf("turn %s:\n", turn);

            int turnPrev = (turn+1)%2;
            int t = turn%2;

            for (int i = 0; i <= barHp; i++) {
                for (int j = 0; j <= myUnits; j++) {
                    Arrays.fill(dp[t][i][j], false);
                }
            }

            for (int i = 0; i <= barHp; i++) {
                for (int j = 0; j <= myUnits; j++) {
                    for (int k = 0; k < 100; k++) {
                        if (dp[turnPrev][i][j][k]){
                            // attack hp or enemy units
                            for (int l = 0; l <= Math.min(i, j); l++) {
                                // attack l hp
                                int hpRemain = i - l;
                                int attackRemain = j - l;
                                int enemyRemain = Math.max(0, k - attackRemain);

                                if (hpRemain == 0 && enemyRemain == 0) return turn;

                                int myUnitAfter = j - enemyRemain;

                                int enemyAfter = enemyRemain;
                                if (hpRemain > 0) enemyAfter = enemyRemain + unitsPerRound;

                                if (myUnitAfter > 0) {
                                    dp[t][hpRemain][myUnitAfter][enemyAfter] = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        return -1;
    }

}

