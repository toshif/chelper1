package utils.big_num;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Factorial_BigInteger {

    static List<BigInteger> factMemo;

    static BigInteger factorial(int n) {
        if (factMemo == null) {
            factMemo = new ArrayList<>();
            factMemo.add(BigInteger.ONE);
        }

        if (n >= factMemo.size()) {
            for (int i = factMemo.size(); i <= n; i++) {
                factMemo.add(i, factMemo.get(i-1).multiply(BigInteger.valueOf(i)));
            }
        }

        return factMemo.get(n);
    }

    public static void main(String[] args) {
        Factorial_BigInteger fact = new Factorial_BigInteger();
        for (int i = 0; i < 50; i++) {
            System.out.printf("i=%s, fact=%s\n", i, fact.factorial(i));
        }
    }

}
