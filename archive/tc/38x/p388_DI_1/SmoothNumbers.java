
package tc.p388_DI_1;

// passed sys test
public class SmoothNumbers {

    int countSmoothNumbers(int N, int k){
        int[] p = new int[N + 10];
        for (int i = 0; i <= N; i++) {
            p[i] = i;
        }

        for (int i = 2; i <= k; i++) {
            for (int j = 1; j <= N; j++) {
                int m = i * j;
                if(m > N) continue;

                while(p[m] % i == 0) {
                    p[m] /= i;
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

