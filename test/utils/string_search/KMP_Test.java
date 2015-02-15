package utils.string_search;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KMP_Test {

    KMP_Knuth_Morris_Pratt kmp;

    @Before
    public void setUp() {
        kmp = new KMP_Knuth_Morris_Pratt();
    }

    @Test
    public void test0() {
        assertArrayEquals(new int[]{0, 2}, toIntArray(kmp.kmpSearch("ABAB", "AB")));
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 2}, toIntArray(kmp.kmpSearch("ABABA", "AB")));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{}, toIntArray(kmp.kmpSearch("ABABA", "ZZ")));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0,1,2}, toIntArray(kmp.kmpSearch("AAAA", "AA")));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{}, toIntArray(kmp.kmpSearch("", "AA")));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{0, 4}, toIntArray(kmp.kmpSearch("ABCZABC", "ABC")));
    }

    int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

}
