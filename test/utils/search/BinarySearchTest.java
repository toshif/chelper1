package utils.search;

import org.junit.Assert;
import org.junit.Test;

/**
 */
public class BinarySearchTest {

    @Test
    public void test_findHighestTrue() {
        boolean[] a = new boolean[]{true, true, false, false, false};

        Assert.assertEquals(1, BinarySearch.findHighestTrue(0, 1, x -> a[x.intValue()]));
        Assert.assertEquals(1, BinarySearch.findHighestTrue(0, 2, x -> a[x.intValue()]));
        Assert.assertEquals(1, BinarySearch.findHighestTrue(0, 3, x -> a[x.intValue()]));
        Assert.assertEquals(1, BinarySearch.findHighestTrue(0, 4, x -> a[x.intValue()]));
        Assert.assertEquals(1, BinarySearch.findHighestTrue(1, 1, x -> a[x.intValue()]));
        Assert.assertEquals(1, BinarySearch.findHighestTrue(1, 2, x -> a[x.intValue()]));
        Assert.assertEquals(1, BinarySearch.findHighestTrue(1, 3, x -> a[x.intValue()]));

        Assert.assertEquals(2, BinarySearch.findHighestTrue(2, 2, x -> a[x.intValue()]));
        Assert.assertEquals(2, BinarySearch.findHighestTrue(2, 3, x -> a[x.intValue()]));
    }

    @Test
    public void test_findLowestTrue() {
        boolean[] a = new boolean[]{false, false, true, true, true};

        Assert.assertEquals(2, BinarySearch.findLowestTrue(0, 2, x -> a[x.intValue()]));
        Assert.assertEquals(2, BinarySearch.findLowestTrue(1, 2, x -> a[x.intValue()]));
        Assert.assertEquals(2, BinarySearch.findLowestTrue(2, 2, x -> a[x.intValue()]));

        Assert.assertEquals(2, BinarySearch.findLowestTrue(0, 3, x -> a[x.intValue()]));
        Assert.assertEquals(2, BinarySearch.findLowestTrue(1, 3, x -> a[x.intValue()]));
        Assert.assertEquals(2, BinarySearch.findLowestTrue(2, 3, x -> a[x.intValue()]));

        Assert.assertEquals(3, BinarySearch.findLowestTrue(3, 3, x -> a[x.intValue()]));
        Assert.assertEquals(3, BinarySearch.findLowestTrue(3, 4, x -> a[x.intValue()]));
    }


}
