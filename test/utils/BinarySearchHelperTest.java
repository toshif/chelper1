package utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 */
public class BinarySearchHelperTest {

    @Test
    public void testHigher() {
        ArrayList<Long> a = new ArrayList<>();
        a.add(10L);
        a.add(20L);
        a.add(30L);

        Assert.assertEquals(0, BinarySearchHelper.higher(a, 0L));
        Assert.assertEquals(10L, a.get(BinarySearchHelper.higher(a, 0L)).longValue());

        Assert.assertEquals(0, BinarySearchHelper.higher(a, 9L));
        Assert.assertEquals(10L, a.get(BinarySearchHelper.higher(a, 9L)).longValue());

        Assert.assertEquals(1, BinarySearchHelper.higher(a, 10L));
        Assert.assertEquals(20L, a.get(BinarySearchHelper.higher(a, 10L)).longValue());

        Assert.assertEquals(2, BinarySearchHelper.higher(a, 20L));
        Assert.assertEquals(30L, a.get(BinarySearchHelper.higher(a, 20L)).longValue());

        Assert.assertEquals(2, BinarySearchHelper.higher(a, 29L));
        Assert.assertEquals(30L, a.get(BinarySearchHelper.higher(a, 29L)).longValue());

        Assert.assertEquals(-1, BinarySearchHelper.higher(a, 30L));

        Assert.assertEquals(-1, BinarySearchHelper.higher(a, 50L));
    }

    @Test
    public void testHigher2() {
        ArrayList<Long> a = new ArrayList<>();
        a.add(10L);
        a.add(20L);
        a.add(20L);
        a.add(30L);

        Assert.assertEquals(0, BinarySearchHelper.higher(a, 0L));
        Assert.assertEquals(10L, a.get(BinarySearchHelper.higher(a, 0L)).longValue());

        Assert.assertEquals(1, BinarySearchHelper.higher(a, 19L));
        Assert.assertEquals(20L, a.get(BinarySearchHelper.higher(a, 19L)).longValue());

        Assert.assertEquals(3, BinarySearchHelper.higher(a, 20L));
        Assert.assertEquals(30L, a.get(BinarySearchHelper.higher(a, 20L)).longValue());

        Assert.assertEquals(3, BinarySearchHelper.higher(a, 29L));
        Assert.assertEquals(30L, a.get(BinarySearchHelper.higher(a, 29L)).longValue());

        Assert.assertEquals(-1, BinarySearchHelper.higher(a, 30L));

        Assert.assertEquals(-1, BinarySearchHelper.higher(a, 50L));
    }


    @Test
    public void testLower() {
        ArrayList<Long> a = new ArrayList<>();
        a.add(10L);
        a.add(20L);
        a.add(30L);

        Assert.assertEquals(-1, BinarySearchHelper.lower(a, 0L));

        Assert.assertEquals(-1, BinarySearchHelper.lower(a, 9L));

        Assert.assertEquals(-1, BinarySearchHelper.lower(a, 10L));

        Assert.assertEquals(0, BinarySearchHelper.lower(a, 11L));
        Assert.assertEquals(10L, a.get(BinarySearchHelper.lower(a, 11L)).longValue());

        Assert.assertEquals(0, BinarySearchHelper.lower(a, 20L));
        Assert.assertEquals(10L, a.get(BinarySearchHelper.lower(a, 20L)).longValue());

        Assert.assertEquals(1, BinarySearchHelper.lower(a, 21L));

        Assert.assertEquals(1, BinarySearchHelper.lower(a, 30L));

        Assert.assertEquals(2, BinarySearchHelper.lower(a, 40L));
    }
}
