package fuku;

import java.util.Arrays;

// System Test Passed
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
}
