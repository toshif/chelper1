package utils.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chelsea on 02/07/2017.
 */
public class ArrayUtilsTest {

    @Test
    public void testReverse_Int() {
        int[] a = new int[]{};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new int[]{});

        a = new int[]{1};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new int[]{1});

        a = new int[]{1, 2};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new int[]{2, 1});

        a = new int[]{1, 2, 3};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new int[]{3, 2, 1});

        a = new int[]{1, 2, 3, 4};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new int[]{4, 3, 2, 1});

        a = new int[]{1, 2, 3, 4, 5};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new int[]{5, 4, 3, 2, 1});
    }

    @Test
    public void testReverse_Long() {
        long[] a = new long[]{};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new long[]{});

        a = new long[]{1};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new long[]{1});

        a = new long[]{1, 2};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new long[]{2, 1});

        a = new long[]{1, 2, 3};
        ArrayUtils.reverse(a);
        Assert.assertArrayEquals(a, new long[]{3, 2, 1});
    }

}
