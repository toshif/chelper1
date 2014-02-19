package fuku;

import java.util.Arrays;

// System Test Passed
//
// http://apps.topcoder.com/wiki/display/tc/SRM+519
//
public class BinaryCards {
    public long largestNumber(long A, long B) {
        int[] a = new int[65];
        int[] b = new int[65];

        int al = 0;
        for (int i = 0; i < 65 && (A != 0); i++) {
            a[i] = (int) (A % 2);
            A = A >>1;
            al = i;
        }

        int bl = 0;
        for (int i = 0; i < 65 && (B != 0); i++) {
            b[i] = (int) (B % 2);
            B = B >>1;
            bl = i;
        }

        boolean found = false;
        long ret = 0;
        for (int i = bl; i >= 0; i--) {
            if (b[i] != a[i] && ! found){
                found = true;
            }

            if (b[i] == 1 || found){
                ret += (long)Math.pow(2, i);
            }

        }
        
        return ret;
    }

    public long largestNumber_Editorial(long A, long B) {
        for (int i=60; i>=0; --i)
            if ( (A^B) & (1LL<<i) )
        return A | ((1LL<<(i+1))-1);
        return A;
    }

}
