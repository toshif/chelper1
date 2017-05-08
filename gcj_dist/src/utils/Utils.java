package utils;

/**
 * Created by chelsea on 08/05/2017.
 */
public class Utils {


    // pseudo random
    static long xorshift64star(long x) {
        x ^= x >> 12;
        x ^= x << 25;
        x ^= x >> 27;
        return x * 0x2545F4914F6CDD1DL;
    }

    // hash : map the given v to a value in [0 .. n-1]
    static int hash(long v, int n) {
        return (int) (Math.abs(xorshift64star(v)) % (long) n);
    }


}
