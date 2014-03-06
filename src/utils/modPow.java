package utils;

/**
 * Created by toshif on 3/6/14.
 */
public class modPow {

    static final long MOD = 1_000_000_009;

    // returns x^y modulo MOD. loops only log2(y) times.
    static long modPow(int x, int y) {
        long res = 1, a = x;
        while (y > 0) {
            if ((y & 1) > 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            y >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("modPow");

        System.out.println("3^100 mod = " + modPow(3, 100));
        System.out.println("3^1000 mod = " + modPow(3, 1000));
        System.out.println("3^10000 mod = " + modPow(3, 10000));
    }

}
