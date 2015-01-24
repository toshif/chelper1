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

}
