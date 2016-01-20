package example;

/**
 * Created by macpro on 1/16/16.
 */
public class Loop {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            a += i;
            a %= 1000;
        }
        long end = System.currentTimeMillis();
        System.err.println("a=" + a);
        System.err.println("time=" + (end  - start) + " msec.");
    }

}
