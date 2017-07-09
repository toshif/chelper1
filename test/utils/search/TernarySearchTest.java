package utils.search;

import org.junit.Assert;
import org.junit.Test;

public class TernarySearchTest {

    @Test
    public void test_findMinBin() {
        long[] ret = TernarySearch.findMinBin(0, 10, x -> (x - 2) * ( x - 2 ));
        // index
        Assert.assertEquals(2, ret[0]);
        // val
        Assert.assertEquals(0, ret[1]);

        ret = TernarySearch.findMinBin(0, 10, x -> (x - 2) * ( x - 2 ) + 5);
        // index
        Assert.assertEquals(2, ret[0]);
        // val
        Assert.assertEquals(5, ret[1]);
    }


    @Test
    public void test_findMin() {
        long[] ret = TernarySearch.findMin(0, 10, x -> (x - 2) * ( x - 2 ));
        // index
        Assert.assertEquals(2, ret[0]);
        // val
        Assert.assertEquals(0, ret[1]);

        ret = TernarySearch.findMin(0, 10, x -> (x - 2) * ( x - 2 ) + 5);
        // index
        Assert.assertEquals(2, ret[0]);
        // val
        Assert.assertEquals(5, ret[1]);
    }

}
