package utils.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class BITTest {

    @Test
    public void test1() {
        BIT bit = new BIT(100);
        bit.add(1, 10);
        bit.add(2, 1);
        bit.add(5, 1);
        bit.add(50, 3);
        bit.add(100, 7);

        assertEquals(0, bit.getHeadSum(0));
        assertEquals(10, bit.getHeadSum(1));
        assertEquals(11, bit.getHeadSum(2));
        assertEquals(11, bit.getHeadSum(3));
        assertEquals(11, bit.getHeadSum(4));
        assertEquals(12, bit.getHeadSum(5));
        assertEquals(15, bit.getHeadSum(50));
        assertEquals(15, bit.getHeadSum(99));
        assertEquals(22, bit.getHeadSum(100));
    }

    @Test
    public void test2() {
        BIT bit = new BIT(20);
        assertEquals(0, bit.getHeadSum(0));
        assertEquals(0, bit.getHeadSum(2));
        assertEquals(0, bit.getHeadSum(10));

        bit.add(2, 7);
        assertEquals(0, bit.getHeadSum(0));
        assertEquals(0, bit.getHeadSum(1));
        assertEquals(7, bit.getHeadSum(2));
        assertEquals(7, bit.getHeadSum(3));

        bit.add(0, 3);
        assertEquals(3, bit.getHeadSum(0));
        assertEquals(3, bit.getHeadSum(1));
        assertEquals(10, bit.getHeadSum(2));
        assertEquals(10, bit.getHeadSum(3));

        bit.add(20, 11);
        assertEquals(3, bit.getHeadSum(0));
        assertEquals(3, bit.getHeadSum(1));
        assertEquals(10, bit.getHeadSum(2));
        assertEquals(21, bit.getHeadSum(20));
    }


}