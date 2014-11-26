
package tc.p424_DI_2;

// passed sys test
// implemeted after read the editorial
//
/*
state を定義する変数は、一見すると strength, intellect, freepoints の 3つ必要なように見えるが、
freepoints は strength と intellect から一意に決定するため、state は、strength と intellect
の2つで定義できる。
 */
public class StrengthOrIntellect {

    // 0: strength, 1: intellect
    boolean[][] can;

    private int[] strength;
    private int[] intellect;
    private int[] points;
    private int N;

    int ma = 0;

    int numberOfMissions(int[] strength, int[] intellect, int[] points){
        this.strength = strength;
        this.intellect = intellect;
        this.points = points;

        N = strength.length;

        can = new boolean[1005][1005];
        dfs(1, 1);

        return ma;
    }

    void dfs(int s, int i){
        can[s][i] = true;

        // complete all with the s and i
        int gain = 0;
        int beat = 0;
        for (int j = 0; j < N; j++) {
            if (strength[j] <= s || intellect[j] <= i) {
                beat++;
                gain += points[j];
            }
        }

        ma = Math.max(ma, beat);

        int remain = gain - (s + i - 2);
        for (int j = 0; j <= remain; j++) {
            int ns = s + j;
            int ni = i + (remain - j);

            ns = Math.min(ns, 1001);
            ni = Math.min(ni, 1001);

            if (!can[ns][ni]) {
                dfs(ns, ni);
            }
        }
    }

}

