package utils;

/**
 * Created by vaiouser on 9/13/14.
 */
public class Tips {

    public static void main(String[] args) {
        //reversingString();

        int rup = roundUpDivide(5, 3);
        System.err.printf("rup=%s\n", rup);
    }

    /**
     * Reverse a string : "hello" -> "olleh"
     */
    static void reversingString() {
        String s = "hello";

        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println("reversed = " + reversed);
    }

    /**
     * round up the integer division
     *
     * how to : (a + (b-1)) / b
     *
     * <p/>
     * a = 5, b = 3
     * round down : a/b = 1
     * round up : a/b = 2
     */
    static int roundUpDivide(int a, int b) {
        return (a + b - 1) / b;
    }

    /**
     * Integer part of log base 2, calculated with integer arithmetics.
     *
     * <p/>
     *
     * examples)
     *
     * floorLog2(2) = 1
     * floorLog2(3) = 1
     * floorLog2(4) = 2
     * floorLog2(5) = 2
     * ...
     *
     * floorLog2(0) = 0
     * floorLog2(1) = 0
     *
     * floorLog2(-1) = -1
     *
     * @return
     */
    public static int floorLog2(long a){
        for (int i = 0; i < 70; i++) {
            if ( (a >> (i+1)) == 0 ) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Log base 2
     *
     * <pre>
     *            log[a]x
     * log[b]x = ---------
     *            log[a]b
     * </pre>
     */
    public static double log2(long a){
        return Math.log(a) / Math.log(2);
    }

}
