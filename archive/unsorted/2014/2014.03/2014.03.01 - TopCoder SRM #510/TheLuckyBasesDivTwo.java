package fuku;

// System Test Passed
// http://apps.topcoder.com/wiki/display/tc/SRM+510
public class TheLuckyBasesDivTwo {
    public long find(long n) {
        if (n == 4 || n == 7) return -1;

        long tot = 0;

        double sqrt = n;
        if (n > 100) {
            sqrt = Math.sqrt(n);

            int[] v = new int[]{4, 7};

            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length; j++) {
                    if ((n - v[i]) % v[j] == 0) {
                        System.err.printf("n = %s + %s x %s \n", v[i], v[j], ((n - v[i]) / v[j]));
                        tot++;
                    }
                }
            }
        }

        A:
        for (long b = 5; b < sqrt; b++) {
            long na = n;
            while (na != 0) {
                long r = na % b;
                if ( !(r == 4 || r == 7)) {
                    continue A;
                }
                na /= b;
            }
            System.err.printf("%s\n", b);
            tot++;
        }

        return tot;
    }
}
