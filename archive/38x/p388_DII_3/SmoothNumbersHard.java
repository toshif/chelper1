
package tc.p388_DII_3;

// passed the sys test
public class SmoothNumbersHard {

    int countSmoothNumbers(int N, int k){
        int[] p = new int[N + 10];
        for (int i = 0; i <= N; i++) {
            p[i] = i;
        }

        for (int i = 2; i <= k && i <= N; i++) {
            if (p[i] == 1) continue;

            for (int j = 1; j <= N; j++) {
                long m = (long)i * j;
                if(m > N) continue;

                while(p[(int)m] % i == 0) {
                    p[(int)m] /= i;
                }
            }
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (p[i] <= k) cnt++;
        }

        return cnt;
    }
}

