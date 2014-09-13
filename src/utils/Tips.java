package utils;

/**
 * Created by vaiouser on 9/13/14.
 */
public class Tips {

    public static void main(String[] args) {
        reversingString();
    }

    /**
     * Reverse a string : "hello" -> "olleh"
     */
    static void reversingString(){
        String s = "hello";

        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println("reversed = " + reversed);
    }

}
