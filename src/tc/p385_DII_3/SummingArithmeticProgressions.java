
package tc.p385_DII_3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SummingArithmeticProgressions {

    int howMany(int left, int right, int k){
        return f(right, k) - f(left-1, k);
    }

    // sum from 1 to x inclusive
    int f(int x, int k) {
        int s = k * (k+1) / 2;
        if (s > x) return 0;

        int y = x - s;

        int a = k;
        int b = k * (k-1) / 2;

        int r = y / a + y / b - (y / (int)lcm(a, b));

        return 1 + r;
    }

    /**
     * @return the greatest common divisor
     */
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     * the least common multiple (LCM)
     */
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }

}

