package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by toshif on 3/6/14.
 */
public class PrimeFactor {

    /**
     * Prime Factorization
     *
     * @return the array of prime numbers for the given n
     */
    static long[] factor(long n) {
        List<Long> ret = new ArrayList<Long>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        // convert to long[]
        long[] arr = new long[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            arr[i] = ret.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println("prime factor");

        System.out.println("factor(0) = " + Arrays.toString(factor(0))); // []
        System.out.println("factor(1) = " + Arrays.toString(factor(1))); // []
        System.out.println("factor(3) = " + Arrays.toString(factor(3))); // [3]
        System.out.println("factor(100) = " + Arrays.toString(factor(100))); // [2, 2, 5, 5]
        System.out.println("factor(33333333) = " + Arrays.toString(factor(33333333))); // [3, 11, 73, 101, 137]
    }
}
