package utils.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vaiouser on 2015/02/14.
 */
public class SegmentTreeTest {

    long[] A = new long[]{2, 7, 1, 2, 3, 6, 4};

    SegmentTree segTree;

    @Before
    public void setUp() {
        segTree = new SegmentTree(A);
    }

    @Test
    public void testQuery(){
        for (int i = 0; i < A.length; i++) {
            Assert.assertEquals(A[i], segTree.query(i, i));
        }

        Assert.assertEquals(2, segTree.query(0, 1));
        Assert.assertEquals(1, segTree.query(0, 2));
        Assert.assertEquals(1, segTree.query(0, 3));
        Assert.assertEquals(1, segTree.query(0, 6));

        Assert.assertEquals(1, segTree.query(1, 2));
        Assert.assertEquals(1, segTree.query(1, 3));
        Assert.assertEquals(1, segTree.query(1, 6));

        Assert.assertEquals(1, segTree.query(2, 4));
        Assert.assertEquals(2, segTree.query(3, 4));
        Assert.assertEquals(2, segTree.query(3, 6));

        Assert.assertEquals(3, segTree.query(4, 6));
        Assert.assertEquals(4, segTree.query(5, 6));
        Assert.assertEquals(4, segTree.query(6, 6));
    }

    @Test
    public void testUpdate(){
        // now A={0, 7, 1, 2, 3, 6, 4}
        segTree.update(0, 0);

        Assert.assertEquals(0, segTree.query(0, 2));
        Assert.assertEquals(0, segTree.query(0, 6));
        Assert.assertEquals(1, segTree.query(1, 6));

        // now A={3, 7, 2, 2, 3, 6, 4}
        segTree.update(0, 3);
        segTree.update(2, 2);

        Assert.assertEquals(3, segTree.query(0, 1));
        Assert.assertEquals(2, segTree.query(0, 2));
        Assert.assertEquals(2, segTree.query(0, 6));
        Assert.assertEquals(2, segTree.query(2, 6));
    }
}
