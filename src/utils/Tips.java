package utils;

/**
 * Created by vaiouser on 9/13/14.
 */
public class Tips {

    public static void main(String[] args) {
        //reversingString();
        roundUpDivide();
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
     * round up the integer diviion
     *
     *
     * <p/>
     * a = 5, b = 3
     * round down : a/b = 1
     * round up : a/b = 2
     *
     * how : (a + (b-1)) / b
     */
    static int roundUpDivide(int a, int b) {
        return (a + b - 1) / b;
    }

}
