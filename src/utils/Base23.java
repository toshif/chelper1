package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by toshif on 3/6/14.
 */
public class Base23 {

    /**
     * Returns the base-23 int array for the given number n
     */
    static int[] getBase23(int n){
        int radix = 23;
        List<Integer> ret = new ArrayList<>();
        while(n != 0) {
            ret.add(n % radix);
            n /= radix;
        }

        // convert to int[]
        int[] retArr = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            retArr[i] = ret.get(i);
        }

        return retArr;
    }

    public static void main(String[] args) {
        System.out.println("base23");

        System.out.println("10 (base23) = " + Arrays.toString(getBase23(10)));
        System.out.println("100 (base23) = " + Arrays.toString(getBase23(100)) + " : 8 + 4 x 23 ");
        System.out.println("23 (base23) = " + Arrays.toString(getBase23(23)) + " : 0 + 1 x 23");
    }

}
