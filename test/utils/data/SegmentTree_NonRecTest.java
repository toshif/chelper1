package utils.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by chelsea on 14/07/2017.
 */
public class SegmentTree_NonRecTest {

    @Test
    public void test1() {
        SegmentTree_NonRec segTree = new SegmentTree_NonRec(new long[3]);
        Assert.assertEquals(0, segTree.query(0, 0));
        Assert.assertEquals(0, segTree.query(1, 1));
        Assert.assertEquals(0, segTree.query(2, 2));

        Assert.assertEquals(0, segTree.query(0, 2));

        segTree.update(0, 3);
        Assert.assertEquals(3, segTree.query(0, 0));
        Assert.assertEquals(0, segTree.query(1, 1));
        Assert.assertEquals(0, segTree.query(2, 2));

        segTree.update(0, 2);
        Assert.assertEquals(2, segTree.query(0, 0));

        segTree.update(1, 1);
        Assert.assertEquals(2, segTree.query(0, 0));
        Assert.assertEquals(1, segTree.query(1, 1));
        Assert.assertEquals(1, segTree.query(0, 1));
        Assert.assertEquals(0, segTree.query(0, 2));

        segTree.update(2, -3);
        Assert.assertEquals(2, segTree.query(0, 0));
        Assert.assertEquals(1, segTree.query(1, 1));
        Assert.assertEquals(1, segTree.query(0, 1));
        Assert.assertEquals(-3, segTree.query(0, 2));
        Assert.assertEquals(-3, segTree.query(2, 2));
    }

    @Test
    public void test_init() {
        SegmentTree_NonRec segTree = new SegmentTree_NonRec(new long[]{2, 1, -3});
        Assert.assertEquals(2, segTree.query(0, 0));
        Assert.assertEquals(1, segTree.query(1, 1));
        Assert.assertEquals(1, segTree.query(0, 1));
        Assert.assertEquals(-3, segTree.query(0, 2));
        Assert.assertEquals(-3, segTree.query(2, 2));
    }

    @Test
    public void test_compare() {
        Random rand = new Random(123);
        for (int i = 1; i < 100; i++) {
            SegmentTree segTreeRec = new SegmentTree(new long[i]);
            SegmentTree_NonRec segTreeNonRec = new SegmentTree_NonRec(new long[i]);

            for (int j = 0; j < 100; j++) {
                int v = rand.nextInt();
                int idx = rand.nextInt(i);

                segTreeRec.update(idx, v);
                segTreeNonRec.update(idx, v);

                int idx1 = rand.nextInt(i);
                int idx2 = rand.nextInt(i);
                int left = Math.min(idx1, idx2);
                int right = Math.max(idx1, idx2);

                long recResult = segTreeRec.query(left, right);
                long nonRecResult = segTreeNonRec.query(left, right);

                Assert.assertEquals(recResult, nonRecResult);
            }
        }
    }

}
