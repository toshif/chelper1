
package tc.p416_DI_1;

/**
 * Sys test passed
 */
public class NextNumber {

    int getNextNumber(int N){
        System.err.printf("N  =%s\n", Integer.toBinaryString(N));

        // highest bit position
        int h = Integer.toBinaryString(N).length()-1;

        int numOfBits = -1;
        for (int i = 0; i <= h; i++) {
            if ((N & (1 << i)) > 0) {
                N ^= (1 << i);
                numOfBits++;

                if ((N & (1 << (i+1))) == 0){
                    N ^= (1 << (i+1));
                    break;
                }
            }
        }

        for (int i = 0; i < numOfBits; i++) {
            N ^= (1<<i);
        }
        System.err.printf("ans=%s\n", Integer.toBinaryString(N));

        return N;
    }

}

