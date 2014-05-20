package utils;

/**
 * Created by toshif on 3/14/14.
 */
public class GCD {

    /**
     * @return the greatest common divisor
     */
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     * the least common multiple (LCM)
     */
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("gcd(0, 0)) = " + gcd(0, 0));
        System.out.println("gcd(2, 4)) = " + gcd(2, 4));
        System.out.println("gcd(2, 6)) = " + gcd(2, 6));
        System.out.println("gcd(3, 4)) = " + gcd(3, 4));
        System.out.println("gcd(3, 6)) = " + gcd(3, 6));
        System.out.println("gcd(25, 100)) = " + gcd(25, 100));
        System.out.println("gcd(75, 100)) = " + gcd(75, 100));

        System.out.println("lcm(2, 3)) = " + lcm(2, 3)); // 6
        System.out.println("lcm(2, 4)) = " + lcm(2, 4)); // 4
        System.out.println("lcm(2, 7)) = " + lcm(2, 7)); // 14
        System.out.println("lcm(4, 6)) = " + lcm(4, 6)); // 12
    }
}
