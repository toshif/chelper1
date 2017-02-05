
package tc.p413_DI_1;

public class ArithmeticProgression_mine_didnt_pass_systest {

    double minCommonDifference(int a0, int[] seq){
        int N = seq.length;
        if (seq.length == 0) return 0.0;

        int[] a = new int[N + 1];
        a[0] = a0;
        for (int i = 1; i < N+1; i++) {
            a[i] = seq[i-1];
        }

        double lo = -1.0;
        double hi = 1E7;

        int a00 = a[0];

        A:
        for (int i = 0; i < 10000; i++) {
            double mid = (hi - lo) / 2 + lo;

            for (int j = 1; j <= N; j++) {
                int an = a00 + (int)(j * mid);
                if (an < a[j]) {
                    lo = mid;
                    continue A;
                }
                if (an > a[j]) {
                    hi = mid;
                    continue A;
                }
            }

            // ok
            hi = mid;
        }

        if (lo < -1E-9) {
            return -1.0;
        }

        // check
        for (int i = 1; i <= N ; i++) {
            int an = a00 + (int)(i * lo + 1E-10);
            //System.err.printf("a %s = %s\n", i, an);
            if (an != a[i]) return -1.0;
        }

        return lo;
    }

}

