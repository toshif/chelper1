package utils;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import utils.Tips;
import utils.string_search.KMP_Knuth_Morris_Pratt;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TipsTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testFloorLog2() {
        assertEquals(0, Tips.floorLog2(0));
        assertEquals(0, Tips.floorLog2(1));

        assertEquals(1, Tips.floorLog2(2));
        assertEquals(1, Tips.floorLog2(3));

        assertEquals(2, Tips.floorLog2(4));
        assertEquals(2, Tips.floorLog2(7));

        assertEquals(3, Tips.floorLog2(8));


        assertEquals(10, Tips.floorLog2(1024));
        assertEquals(10, Tips.floorLog2(1025));
    }



}
