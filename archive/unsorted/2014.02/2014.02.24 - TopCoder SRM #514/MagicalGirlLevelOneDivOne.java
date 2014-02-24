package fuku;

// System Test Passed
/*
   x = 1; x % 2 --> 1
   x = -1; x % 2 --> -1

   Note: when the numerator is negative, the remainder is also negative
*/
public class MagicalGirlLevelOneDivOne {
    public String isReachable(int[] jumpTypes, int x, int y) {
        for (int i = 0; i < jumpTypes.length; i++) {
            if (jumpTypes[i] % 2 == 0) return "YES";
        }
        // odd
        if ((x % 2 == 0 && y % 2 == 0) || (Math.abs(x % 2) == 1 && Math.abs(y % 2) == 1)) return "YES";

        return "NO";
    }
}
