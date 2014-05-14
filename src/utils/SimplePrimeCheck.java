package utils;

/**
 * 単純な素数判定
 *
 * n が素数か判定する
 *
 * sqrt(n) まで割り切れるかをチェックする
 *
 * 沢山の数を素数判定する場合は、計算時間が大きくなるので、エラトステネスのふるいを使う
 */
public class SimplePrimeCheck {

    static boolean isPrime(int n){
        if (n == 0 || n == 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            System.out.printf("%s isPrime ? = %s\n", i, isPrime(i));
        }


        System.out.printf("%s isPrime ? = %s\n", 123457, isPrime(123457));
    }
}
