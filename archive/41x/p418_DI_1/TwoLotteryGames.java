
package tc.p418_DI_1;

// passed sys test
// impl by myself
/*
 constraint が かなり小さいので、brute force した。
 たった 2^8 = 256 手しかない。
 */
public class TwoLotteryGames {

    double getHigherChanceGame(int n, int m, int k){

        int win = 0;
        int tot = 0;
        for (int i = 0; i < (1 << n); i++) {
            if (numcard(i) != m) continue;

            for (int j = 0; j < (1 << n); j++) {
                if (numcard(j) != m) continue;

                tot++;

                int r = i & j;
                if (numcard(r) >= k) {
                    win++;
                }
            }
        }

        return 1.0 * win / tot;
    }

    int numcard(int x) {
        int cnt = 0;
        while(x > 0){
            if ((x & 1) > 0) cnt++;
            x >>= 1;
        }
        return cnt;
    }

}

