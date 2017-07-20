package utils.big_num;

import org.junit.Test;

import static org.junit.Assert.*;

public class FastFibonacci_ModTest {

    @Test
    public void test1() {
        FastFibonacci_Mod fib = new FastFibonacci_Mod();

        assertEquals(0, fib.fastFibonacciMatrix(0));
        assertEquals(1, fib.fastFibonacciMatrix(1));
        assertEquals(1, fib.fastFibonacciMatrix(2));

        int a1 = 1;
        int a2 = 1;
        for (int i = 3; i < 10000; i++) {
            int f = a1 + a2;
            f %= FastFibonacci_Mod.MOD;
            assertEquals(f, fib.fastFibonacciMatrix(i));

            a1 = a2;
            a2 = f;
        }
    }

}