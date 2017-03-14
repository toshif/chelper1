package utils;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by chelsea on 14/03/2017.
 */
public class Base23Test {
    @Test
    public void toBase23() throws Exception {
        assertArrayEquals(new long[]{0}, Base23.toBase23(0));
        assertArrayEquals(new long[]{1}, Base23.toBase23(1));
        assertArrayEquals(new long[]{10}, Base23.toBase23(10));
        assertArrayEquals(new long[]{8, 4}, Base23.toBase23(100)); // 8 + 4 x 23
        assertArrayEquals(new long[]{0, 1}, Base23.toBase23(23)); // 0 + 1 x 23
        assertArrayEquals(new long[]{11, 20, 1}, Base23.toBase23(1000));

        assertEquals(100, Base23.fromBase23(Base23.toBase23(100)));
        assertEquals(0, Base23.fromBase23(Base23.toBase23(0)));
        assertEquals(1, Base23.fromBase23(Base23.toBase23(1)));
        assertEquals(1000, Base23.fromBase23(Base23.toBase23(1000)));
        assertEquals(1373, Base23.fromBase23(Base23.toBase23(1373)));
        assertEquals(1279098, Base23.fromBase23(Base23.toBase23(1279098)));
    }

}