

package tc.p415_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardsCheatingSysTest {

  CardsCheating solver; 

  @Before
  public void setUp() {
    solver = new CardsCheating();
  }

  

  @Test
  public void test0(){
    assertEquals(0, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 1, 2},new int[]{1, 4, 0, 3, 2, 5}) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.numberOfShuffles(new int[]{2, 0, 1},new int[]{1, 2, 0}) );
  }



  @Test
  public void test2(){
    assertEquals(59, solver.numberOfShuffles(new int[]{1, 1, 2, 0, 2, 0, 1, 0, 2, 2, 1, 0},new int[]{5, 0, 9, 7, 1, 8, 3, 10, 4, 11, 6, 2}) );
  }



  @Test
  public void test3(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 0, 2},new int[]{0, 2, 1}) );
  }



  @Test
  public void test4(){
    assertEquals(2, solver.numberOfShuffles(new int[]{1, 2, 0},new int[]{2, 0, 1}) );
  }



  @Test
  public void test5(){
    assertEquals(0, solver.numberOfShuffles(new int[]{0, 1, 2},new int[]{0, 1, 2}) );
  }



  @Test
  public void test6(){
    assertEquals(2, solver.numberOfShuffles(new int[]{1, 2, 0},new int[]{2, 0, 1}) );
  }



  @Test
  public void test7(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 1, 0},new int[]{1, 0, 2}) );
  }



  @Test
  public void test8(){
    assertEquals(5, solver.numberOfShuffles(new int[]{2, 0, 1, 0, 2, 1},new int[]{1, 5, 4, 3, 2, 0}) );
  }



  @Test
  public void test9(){
    assertEquals(2, solver.numberOfShuffles(new int[]{0, 1, 1, 2, 2, 0},new int[]{5, 2, 4, 0, 1, 3}) );
  }



  @Test
  public void test10(){
    assertEquals(0, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 1, 2},new int[]{0, 1, 2, 3, 4, 5}) );
  }



  @Test
  public void test11(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{2, 0, 1, 2, 0, 0},new int[]{1, 2, 3, 4, 5, 0}) );
  }



  @Test
  public void test12(){
    assertEquals(2, solver.numberOfShuffles(new int[]{1, 1, 0, 2, 0, 2},new int[]{4, 0, 5, 2, 1, 3}) );
  }



  @Test
  public void test13(){
    assertEquals(10, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 2, 1, 0, 2, 1},new int[]{7, 4, 6, 5, 8, 0, 2, 3, 1}) );
  }



  @Test
  public void test14(){
    assertEquals(6, solver.numberOfShuffles(new int[]{1, 2, 0, 1, 2, 1, 2, 0, 0},new int[]{5, 0, 4, 8, 7, 3, 2, 1, 6}) );
  }



  @Test
  public void test15(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 1, 2, 1, 1, 0, 2, 0, 2},new int[]{4, 0, 8, 2, 5, 1, 6, 7, 3}) );
  }



  @Test
  public void test16(){
    assertEquals(13, solver.numberOfShuffles(new int[]{2, 0, 1, 0, 2, 1, 0, 2, 1},new int[]{6, 8, 7, 1, 5, 0, 3, 2, 4}) );
  }



  @Test
  public void test17(){
    assertEquals(7, solver.numberOfShuffles(new int[]{2, 0, 2, 1, 1, 0, 2, 0, 1},new int[]{7, 4, 2, 1, 8, 0, 5, 3, 6}) );
  }



  @Test
  public void test18(){
    assertEquals(3, solver.numberOfShuffles(new int[]{2, 2, 0, 1, 0, 1, 2, 0, 2, 0, 1, 1},new int[]{2, 5, 0, 6, 7, 1, 4, 11, 10, 8, 9, 3}) );
  }



  @Test
  public void test19(){
    assertEquals(41, solver.numberOfShuffles(new int[]{1, 2, 1, 1, 2, 2, 0, 2, 1, 0, 0, 0},new int[]{1, 11, 10, 7, 8, 4, 9, 2, 5, 0, 3, 6}) );
  }



  @Test
  public void test20(){
    assertEquals(38, solver.numberOfShuffles(new int[]{0, 2, 0, 2, 1, 1, 2, 1, 0, 2, 0, 1},new int[]{7, 11, 8, 6, 3, 9, 1, 0, 4, 10, 5, 2}) );
  }



  @Test
  public void test21(){
    assertEquals(22, solver.numberOfShuffles(new int[]{0, 1, 1, 2, 2, 0, 1, 0, 0, 2, 2, 1},new int[]{0, 7, 4, 9, 11, 3, 10, 6, 5, 8, 2, 1}) );
  }



  @Test
  public void test22(){
    assertEquals(4, solver.numberOfShuffles(new int[]{2, 1, 2, 1, 2, 0, 1, 0, 0, 0, 2, 1},new int[]{11, 7, 8, 1, 5, 6, 4, 3, 10, 2, 0, 9}) );
  }



  @Test
  public void test23(){
    assertEquals(17, solver.numberOfShuffles(new int[]{1, 2, 0, 1, 0, 2, 2, 1, 0, 1, 0, 0, 1, 2, 2},new int[]{1, 5, 0, 10, 9, 2, 13, 3, 12, 4, 7, 8, 6, 11, 14}) );
  }



  @Test
  public void test24(){
    assertEquals(63, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 1, 0, 0, 1, 2, 0, 1, 2, 1, 2, 2},new int[]{14, 4, 9, 1, 2, 13, 6, 3, 0, 11, 12, 7, 5, 10, 8}) );
  }



  @Test
  public void test25(){
    assertEquals(7, solver.numberOfShuffles(new int[]{2, 2, 1, 0, 2, 2, 1, 0, 1, 0, 0, 2, 1, 0, 1},new int[]{7, 14, 0, 6, 11, 9, 13, 5, 4, 2, 12, 8, 10, 3, 1}) );
  }



  @Test
  public void test26(){
    assertEquals(19, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 1, 2, 0, 2, 2, 1, 2, 0, 0, 1, 1},new int[]{6, 2, 13, 0, 10, 4, 3, 9, 7, 11, 14, 8, 12, 5, 1}) );
  }



  @Test
  public void test27(){
    assertEquals(81, solver.numberOfShuffles(new int[]{2, 0, 2, 0, 2, 2, 0, 1, 2, 0, 0, 1, 1, 1, 1},new int[]{4, 11, 1, 12, 2, 14, 3, 7, 13, 8, 6, 5, 10, 9, 0}) );
  }



  @Test
  public void test28(){
    assertEquals(194, solver.numberOfShuffles(new int[]{1, 1, 2, 2, 2, 0, 1, 0, 0, 2, 2, 1, 0, 1, 0, 1, 2, 0},new int[]{7, 1, 13, 9, 0, 12, 8, 6, 4, 5, 17, 3, 10, 2, 16, 14, 15, 11}) );
  }



  @Test
  public void test29(){
    assertEquals(137, solver.numberOfShuffles(new int[]{0, 2, 1, 2, 1, 0, 1, 1, 1, 2, 1, 0, 2, 0, 0, 2, 2, 0},new int[]{11, 14, 5, 16, 4, 9, 12, 13, 7, 3, 10, 2, 1, 15, 17, 8, 0, 6}) );
  }



  @Test
  public void test30(){
    assertEquals(99, solver.numberOfShuffles(new int[]{1, 2, 0, 2, 0, 2, 0, 1, 0, 2, 1, 1, 0, 1, 2, 0, 1, 2},new int[]{15, 3, 17, 11, 0, 1, 5, 6, 9, 4, 14, 2, 10, 16, 12, 8, 13, 7}) );
  }



  @Test
  public void test31(){
    assertEquals(202, solver.numberOfShuffles(new int[]{1, 2, 2, 0, 0, 2, 1, 1, 0, 2, 2, 1, 0, 1, 0, 0, 1, 2},new int[]{15, 2, 17, 14, 16, 1, 10, 7, 6, 4, 8, 5, 13, 12, 9, 3, 0, 11}) );
  }



  @Test
  public void test32(){
    assertEquals(71, solver.numberOfShuffles(new int[]{2, 0, 1, 0, 2, 2, 1, 0, 0, 2, 1, 1, 2, 0, 2, 0, 1, 1},new int[]{2, 9, 13, 15, 6, 14, 7, 11, 12, 5, 10, 4, 17, 3, 8, 0, 16, 1}) );
  }



  @Test
  public void test33(){
    assertEquals(188, solver.numberOfShuffles(new int[]{1, 0, 2, 0, 0, 1, 1, 2, 2, 1, 1, 1, 0, 0, 2, 0, 1, 2, 2, 2, 0},new int[]{1, 10, 6, 3, 8, 14, 18, 2, 5, 15, 16, 17, 20, 0, 7, 13, 9, 19, 12, 11, 4}) );
  }



  @Test
  public void test34(){
    assertEquals(158, solver.numberOfShuffles(new int[]{1, 0, 2, 2, 0, 2, 1, 1, 0, 0, 2, 2, 2, 0, 0, 1, 1, 1, 1, 2, 0},new int[]{1, 19, 5, 17, 12, 2, 14, 15, 0, 7, 6, 11, 18, 20, 10, 8, 3, 4, 13, 9, 16}) );
  }



  @Test
  public void test35(){
    assertEquals(1, solver.numberOfShuffles(new int[]{2, 1, 2, 0, 1, 2, 0, 0, 2, 0, 2, 0, 0, 2, 0, 1, 1, 2, 1, 1, 1},new int[]{11, 19, 8, 6, 10, 5, 15, 3, 20, 12, 2, 0, 9, 17, 18, 1, 13, 14, 7, 16, 4}) );
  }



  @Test
  public void test36(){
    assertEquals(26, solver.numberOfShuffles(new int[]{1, 0, 2, 0, 2, 1, 1, 2, 0, 0, 2, 2, 0, 2, 1, 1, 2, 1, 0, 1, 0},new int[]{9, 4, 19, 18, 15, 16, 7, 14, 11, 3, 5, 10, 12, 20, 13, 17, 0, 1, 8, 2, 6}) );
  }



  @Test
  public void test37(){
    assertEquals(124, solver.numberOfShuffles(new int[]{2, 1, 1, 2, 2, 1, 0, 2, 0, 0, 1, 0, 0, 2, 0, 2, 1, 1, 0, 1, 2},new int[]{2, 0, 14, 11, 7, 15, 3, 17, 13, 8, 18, 6, 10, 5, 4, 9, 20, 1, 19, 12, 16}) );
  }



  @Test
  public void test38(){
    assertEquals(649, solver.numberOfShuffles(new int[]{0, 1, 0, 2, 2, 1, 2, 0, 2, 0, 0, 1, 1, 0, 0, 1, 2, 0, 2, 2, 1, 1, 2, 1},new int[]{6, 22, 1, 20, 14, 8, 23, 2, 16, 9, 0, 15, 19, 5, 3, 18, 21, 12, 7, 17, 10, 13, 11, 4}) );
  }



  @Test
  public void test39(){
    assertEquals(213, solver.numberOfShuffles(new int[]{0, 0, 2, 1, 1, 0, 2, 1, 0, 2, 1, 2, 0, 0, 2, 2, 0, 0, 1, 1, 2, 1, 2, 1},new int[]{11, 4, 12, 22, 8, 21, 20, 14, 2, 7, 5, 19, 13, 15, 17, 23, 3, 10, 6, 0, 1, 16, 9, 18}) );
  }



  @Test
  public void test40(){
    assertEquals(116, solver.numberOfShuffles(new int[]{2, 2, 0, 2, 0, 0, 2, 0, 2, 1, 1, 2, 1, 0, 1, 1, 1, 1, 2, 2, 1, 0, 0, 0},new int[]{22, 16, 6, 5, 10, 7, 23, 13, 9, 12, 15, 0, 3, 8, 18, 1, 20, 2, 19, 21, 4, 11, 17, 14}) );
  }



  @Test
  public void test41(){
    assertEquals(301, solver.numberOfShuffles(new int[]{0, 0, 0, 2, 0, 0, 1, 1, 2, 0, 1, 2, 0, 1, 1, 2, 1, 1, 0, 2, 2, 2, 1, 2},new int[]{18, 14, 1, 10, 6, 12, 4, 19, 9, 22, 21, 16, 3, 13, 5, 2, 0, 7, 8, 23, 17, 15, 11, 20}) );
  }



  @Test
  public void test42(){
    assertEquals(672, solver.numberOfShuffles(new int[]{0, 1, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 1, 2, 0, 1, 2, 0, 1, 2},new int[]{20, 11, 15, 9, 1, 21, 5, 3, 10, 7, 0, 8, 19, 22, 14, 6, 23, 18, 12, 13, 4, 2, 16, 17}) );
  }



  @Test
  public void test43(){
    assertEquals(17, solver.numberOfShuffles(new int[]{1, 1, 0, 1, 1, 2, 2, 2, 0, 0, 0, 1, 0, 1, 2, 0, 1, 2, 0, 2, 0, 0, 2, 1, 1, 2, 2},new int[]{20, 11, 21, 8, 1, 14, 3, 9, 10, 24, 12, 26, 6, 2, 5, 13, 4, 22, 0, 18, 15, 7, 16, 17, 19, 23, 25}) );
  }



  @Test
  public void test44(){
    assertEquals(381, solver.numberOfShuffles(new int[]{0, 2, 2, 1, 0, 0, 2, 2, 1, 0, 0, 2, 2, 2, 1, 0, 2, 1, 1, 1, 1, 2, 0, 1, 0, 0, 1},new int[]{20, 3, 11, 16, 12, 10, 18, 24, 25, 9, 6, 17, 2, 14, 22, 15, 26, 4, 21, 19, 7, 8, 23, 1, 13, 5, 0}) );
  }



  @Test
  public void test45(){
    assertEquals(396, solver.numberOfShuffles(new int[]{2, 1, 0, 1, 0, 2, 2, 1, 0, 1, 1, 2, 0, 1, 0, 0, 2, 0, 1, 1, 1, 0, 2, 2, 2, 2, 0},new int[]{26, 23, 22, 16, 14, 11, 25, 5, 24, 20, 1, 7, 10, 4, 2, 0, 8, 3, 15, 9, 6, 21, 18, 12, 17, 13, 19}) );
  }



  @Test
  public void test46(){
    assertEquals(474, solver.numberOfShuffles(new int[]{0, 1, 2, 2, 1, 0, 1, 0, 1, 2, 0, 2, 2, 1, 1, 2, 2, 1, 1, 0, 2, 0, 2, 0, 0, 1, 0},new int[]{11, 16, 24, 10, 22, 19, 3, 14, 25, 13, 5, 0, 26, 23, 12, 7, 17, 18, 6, 1, 2, 21, 8, 4, 20, 9, 15}) );
  }



  @Test
  public void test47(){
    assertEquals(146, solver.numberOfShuffles(new int[]{2, 0, 2, 0, 0, 0, 2, 1, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 0, 0, 2, 1, 2, 1, 0, 1, 2},new int[]{5, 15, 17, 3, 9, 13, 7, 0, 22, 24, 23, 16, 4, 14, 18, 26, 1, 20, 12, 25, 2, 19, 21, 8, 6, 10, 11}) );
  }



  @Test
  public void test48(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 0, 0, 1, 0, 1, 2, 1, 1, 1, 1, 0, 1, 2, 2, 1, 2, 0, 2, 0, 0, 1, 2, 2, 2, 0, 2, 0, 0, 2},new int[]{29, 2, 9, 15, 23, 28, 22, 1, 7, 8, 5, 20, 24, 14, 18, 4, 3, 19, 17, 25, 21, 12, 16, 6, 13, 11, 10, 0, 26, 27}) );
  }



  @Test
  public void test49(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 1, 2, 0, 2, 0, 0, 2, 0, 2, 0, 1, 0, 2, 0, 0, 1, 1, 0, 1, 2, 2, 1, 2, 2, 1, 0, 1, 1, 2},new int[]{2, 8, 12, 6, 24, 0, 14, 18, 20, 5, 25, 19, 9, 16, 7, 28, 1, 26, 21, 22, 29, 27, 13, 15, 10, 4, 11, 3, 23, 17}) );
  }



  @Test
  public void test50(){
    assertEquals(1434, solver.numberOfShuffles(new int[]{2, 1, 2, 2, 1, 2, 2, 1, 0, 2, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 2, 2, 1, 1, 0, 0, 2, 2, 0, 0},new int[]{29, 26, 14, 9, 17, 1, 15, 4, 25, 6, 16, 8, 11, 23, 12, 20, 7, 27, 19, 24, 2, 13, 5, 0, 18, 3, 22, 28, 10, 21}) );
  }



  @Test
  public void test51(){
    assertEquals(1261, solver.numberOfShuffles(new int[]{1, 2, 2, 2, 0, 0, 1, 2, 0, 0, 0, 1, 2, 1, 1, 0, 0, 2, 2, 1, 1, 0, 2, 2, 1, 0, 1, 2, 0, 1},new int[]{19, 9, 2, 29, 1, 6, 14, 11, 12, 17, 18, 13, 26, 28, 4, 27, 15, 0, 5, 10, 16, 3, 23, 8, 7, 24, 22, 20, 21, 25}) );
  }



  @Test
  public void test52(){
    assertEquals(2298, solver.numberOfShuffles(new int[]{1, 0, 1, 2, 1, 0, 1, 2, 2, 0, 0, 1, 0, 2, 0, 0, 1, 1, 2, 2, 0, 2, 0, 1, 1, 2, 1, 0, 2, 2},new int[]{11, 6, 23, 28, 24, 17, 20, 10, 3, 16, 14, 7, 22, 2, 27, 9, 15, 8, 12, 13, 29, 0, 4, 19, 1, 26, 18, 21, 5, 25}) );
  }



  @Test
  public void test53(){
    assertEquals(2053, solver.numberOfShuffles(new int[]{1, 0, 2, 0, 1, 2, 2, 2, 2, 0, 0, 0, 2, 2, 1, 1, 2, 1, 1, 1, 1, 0, 0, 1, 0, 0, 2, 1, 0, 0, 2, 1, 2},new int[]{29, 6, 8, 20, 7, 0, 14, 26, 2, 9, 18, 13, 31, 10, 21, 30, 23, 4, 16, 3, 12, 32, 5, 19, 27, 15, 17, 28, 24, 25, 22, 11, 1}) );
  }



  @Test
  public void test54(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{2, 2, 0, 0, 2, 1, 1, 2, 2, 0, 2, 0, 2, 1, 0, 0, 2, 1, 0, 2, 2, 0, 1, 1, 1, 1, 0, 0, 0, 2, 1, 1, 0},new int[]{23, 12, 30, 24, 5, 7, 18, 26, 14, 21, 8, 32, 11, 4, 27, 10, 2, 22, 1, 17, 20, 15, 29, 28, 16, 13, 3, 9, 19, 31, 25, 0, 6}) );
  }



  @Test
  public void test55(){
    assertEquals(4980, solver.numberOfShuffles(new int[]{2, 1, 1, 2, 1, 1, 0, 0, 2, 0, 2, 2, 2, 1, 2, 1, 1, 2, 2, 0, 2, 0, 1, 0, 1, 0, 2, 0, 0, 1, 0, 1, 0},new int[]{29, 1, 30, 5, 11, 19, 17, 15, 16, 4, 18, 27, 32, 22, 10, 28, 20, 21, 23, 12, 8, 13, 6, 26, 25, 3, 2, 9, 24, 31, 14, 7, 0}) );
  }



  @Test
  public void test56(){
    assertEquals(149, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 0, 0, 1, 1, 0, 1, 2, 0, 1, 1, 0, 1, 0, 0, 2, 0, 2, 2, 2, 2, 1, 2, 2, 0, 2, 1, 1, 2, 1},new int[]{3, 16, 11, 27, 24, 31, 32, 6, 7, 4, 2, 17, 26, 13, 18, 5, 20, 21, 28, 9, 30, 12, 14, 8, 19, 15, 10, 0, 1, 25, 23, 29, 22}) );
  }



  @Test
  public void test57(){
    assertEquals(2347, solver.numberOfShuffles(new int[]{1, 1, 1, 2, 1, 2, 2, 0, 1, 1, 0, 0, 0, 0, 0, 2, 2, 0, 0, 1, 2, 2, 2, 0, 2, 1, 2, 0, 1, 1, 0, 2, 1},new int[]{4, 32, 9, 14, 22, 21, 17, 5, 20, 31, 2, 0, 26, 24, 6, 23, 10, 3, 25, 12, 7, 8, 19, 27, 11, 1, 18, 15, 29, 16, 30, 28, 13}) );
  }



  @Test
  public void test58(){
    assertEquals(678, solver.numberOfShuffles(new int[]{1, 1, 1, 0, 2, 1, 0, 2, 2, 1, 2, 2, 2, 0, 0, 2, 1, 1, 0, 2, 1, 1, 1, 0, 0, 1, 2, 2, 1, 0, 2, 0, 2, 0, 0, 0},new int[]{3, 1, 32, 6, 9, 25, 23, 28, 16, 0, 4, 15, 17, 20, 26, 27, 8, 14, 33, 30, 2, 35, 5, 31, 18, 12, 10, 34, 22, 19, 21, 7, 11, 24, 13, 29}) );
  }



  @Test
  public void test59(){
    assertEquals(701, solver.numberOfShuffles(new int[]{0, 1, 1, 2, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 2, 0, 2, 0, 1, 0, 1, 1, 1, 0, 0, 2, 2, 2, 2, 1, 2, 0, 0, 2, 1},new int[]{18, 28, 4, 26, 34, 20, 3, 8, 31, 2, 33, 7, 5, 35, 16, 10, 9, 32, 0, 12, 27, 25, 23, 1, 24, 13, 17, 15, 30, 11, 19, 21, 6, 14, 22, 29}) );
  }



  @Test
  public void test60(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 0, 1, 0, 2, 0, 2, 1, 1, 0, 2, 0, 2, 1, 2, 1, 0, 2, 1, 2, 1, 2, 0, 2, 0, 2, 0, 1, 1, 1, 2, 0, 0, 1, 1, 2},new int[]{20, 16, 10, 28, 22, 35, 3, 14, 21, 26, 6, 25, 7, 9, 24, 15, 32, 30, 13, 19, 34, 29, 23, 8, 12, 27, 18, 5, 1, 33, 0, 2, 31, 4, 17, 11}) );
  }



  @Test
  public void test61(){
    assertEquals(383, solver.numberOfShuffles(new int[]{1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 0, 1, 2, 0, 0, 0, 0, 0, 2, 2, 0, 1, 2, 1, 2, 2, 0, 0, 1, 1, 0, 2, 0, 1, 0},new int[]{32, 6, 0, 30, 7, 23, 10, 22, 5, 19, 11, 24, 18, 2, 25, 14, 3, 1, 15, 16, 17, 28, 12, 8, 20, 4, 26, 34, 27, 9, 21, 29, 35, 33, 31, 13}) );
  }



  @Test
  public void test62(){
    assertEquals(6825, solver.numberOfShuffles(new int[]{0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 0, 2, 0, 0, 2, 0, 2, 2, 0, 1, 1, 0, 2, 2, 2, 1, 2, 0, 1, 2, 0, 1, 0, 1, 1, 1},new int[]{2, 11, 14, 16, 29, 6, 21, 30, 22, 8, 33, 18, 1, 9, 4, 3, 20, 24, 7, 10, 5, 32, 35, 23, 15, 17, 12, 31, 27, 0, 26, 28, 25, 13, 34, 19}) );
  }



  @Test
  public void test63(){
    assertEquals(11317, solver.numberOfShuffles(new int[]{2, 2, 0, 1, 1, 2, 0, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 0, 0, 0, 2, 1, 0, 1, 1, 0, 2, 2, 0, 0, 1, 1, 2, 2, 2, 0, 0, 2, 2},new int[]{28, 7, 29, 31, 1, 33, 30, 34, 24, 26, 6, 21, 38, 13, 14, 12, 11, 20, 2, 8, 9, 4, 3, 16, 37, 23, 27, 17, 36, 5, 18, 19, 32, 0, 25, 15, 10, 22, 35}) );
  }



  @Test
  public void test64(){
    assertEquals(8012, solver.numberOfShuffles(new int[]{1, 1, 0, 2, 0, 2, 1, 2, 2, 0, 2, 1, 1, 1, 2, 2, 0, 0, 2, 0, 0, 2, 1, 1, 2, 1, 0, 0, 0, 2, 1, 2, 1, 2, 1, 0, 0, 1, 0},new int[]{21, 22, 24, 9, 26, 7, 1, 36, 4, 8, 31, 3, 33, 10, 38, 16, 35, 34, 11, 29, 30, 19, 25, 17, 37, 13, 18, 32, 14, 27, 5, 23, 15, 2, 6, 0, 28, 20, 12}) );
  }



  @Test
  public void test65(){
    assertEquals(1856, solver.numberOfShuffles(new int[]{1, 1, 2, 2, 1, 0, 0, 0, 0, 0, 1, 2, 0, 1, 2, 0, 2, 2, 2, 2, 1, 0, 1, 0, 1, 2, 1, 2, 2, 2, 2, 0, 0, 1, 1, 0, 1, 0, 1},new int[]{7, 19, 17, 23, 9, 24, 14, 10, 20, 11, 21, 34, 2, 30, 26, 4, 8, 15, 25, 38, 0, 13, 22, 28, 35, 27, 32, 5, 6, 29, 16, 33, 18, 1, 12, 3, 31, 36, 37}) );
  }



  @Test
  public void test66(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{2, 2, 1, 1, 1, 1, 2, 2, 2, 0, 0, 1, 2, 2, 0, 0, 2, 2, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 2, 1, 2, 1, 0, 1, 2, 1, 2},new int[]{35, 15, 13, 1, 14, 37, 11, 16, 2, 25, 22, 17, 18, 4, 24, 3, 19, 5, 32, 10, 34, 0, 38, 23, 31, 27, 7, 12, 8, 21, 36, 6, 30, 20, 33, 29, 9, 28, 26}) );
  }



  @Test
  public void test67(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{2, 0, 1, 0, 2, 1, 0, 1, 0, 2, 1, 0, 2, 1, 1, 1, 2, 1, 2, 0, 2, 1, 2, 0, 0, 2, 0, 1, 1, 0, 1, 1, 0, 2, 0, 2, 0, 2, 2},new int[]{4, 24, 26, 3, 22, 15, 34, 28, 7, 32, 19, 38, 29, 23, 5, 2, 25, 9, 36, 6, 31, 14, 27, 1, 11, 21, 37, 20, 10, 18, 30, 17, 0, 13, 8, 12, 35, 33, 16}) );
  }



  @Test
  public void test68(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 1, 0, 2, 2, 1, 0, 1, 1, 1, 2, 2, 0, 0, 1, 0, 2, 2, 2, 2, 0, 2, 2, 1, 1, 1, 2, 0, 0, 1, 0, 2, 0, 1, 0, 0, 1, 2, 1, 2, 0, 0},new int[]{28, 41, 25, 31, 18, 21, 3, 16, 6, 34, 27, 9, 14, 30, 7, 20, 32, 0, 37, 11, 19, 40, 39, 12, 10, 13, 33, 17, 22, 26, 38, 8, 24, 35, 36, 5, 1, 23, 2, 4, 29, 15}) );
  }



  @Test
  public void test69(){
    assertEquals(24413, solver.numberOfShuffles(new int[]{0, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0, 0, 2, 0, 2, 0, 0, 2, 1, 0, 1, 2, 2, 0, 1, 0, 1, 2, 2, 1, 2, 2, 1, 0, 1, 2, 0, 0, 0, 2, 0, 1},new int[]{2, 9, 34, 6, 23, 1, 26, 16, 27, 41, 19, 12, 40, 20, 31, 11, 0, 33, 7, 28, 14, 18, 24, 36, 3, 21, 38, 13, 22, 35, 15, 29, 17, 39, 25, 30, 32, 5, 10, 4, 8, 37}) );
  }



  @Test
  public void test70(){
    assertEquals(9096, solver.numberOfShuffles(new int[]{0, 1, 2, 2, 1, 2, 0, 1, 1, 0, 1, 2, 0, 2, 2, 0, 0, 2, 1, 1, 0, 2, 2, 2, 0, 1, 1, 0, 1, 0, 1, 1, 2, 2, 1, 2, 0, 0, 2, 0, 0, 1},new int[]{6, 41, 17, 27, 30, 2, 39, 28, 19, 35, 26, 32, 31, 1, 9, 37, 40, 3, 36, 25, 0, 20, 13, 4, 14, 22, 5, 15, 10, 16, 33, 11, 12, 18, 34, 24, 29, 7, 38, 21, 23, 8}) );
  }



  @Test
  public void test71(){
    assertEquals(13312, solver.numberOfShuffles(new int[]{0, 1, 1, 0, 1, 2, 2, 0, 1, 2, 1, 0, 0, 2, 2, 2, 0, 1, 1, 0, 0, 2, 1, 0, 1, 0, 2, 0, 2, 2, 1, 1, 1, 0, 2, 0, 2, 1, 2, 1, 2, 0},new int[]{4, 19, 31, 35, 0, 37, 2, 36, 10, 18, 22, 30, 7, 8, 14, 38, 21, 25, 27, 6, 41, 39, 1, 34, 12, 16, 5, 3, 11, 40, 28, 13, 29, 26, 9, 23, 15, 33, 32, 17, 20, 24}) );
  }



  @Test
  public void test72(){
    assertEquals(11142, solver.numberOfShuffles(new int[]{2, 1, 0, 0, 0, 1, 2, 2, 2, 1, 1, 2, 1, 1, 0, 2, 2, 0, 0, 0, 2, 1, 0, 1, 2, 2, 1, 0, 1, 1, 0, 1, 2, 1, 0, 2, 2, 1, 0, 2, 0, 0},new int[]{18, 30, 36, 28, 23, 10, 31, 16, 32, 11, 7, 17, 37, 4, 39, 27, 26, 25, 14, 33, 3, 40, 13, 24, 2, 34, 5, 38, 20, 9, 1, 12, 35, 21, 22, 0, 6, 29, 8, 41, 19, 15}) );
  }



  @Test
  public void test73(){
    assertEquals(29021, solver.numberOfShuffles(new int[]{1, 0, 2, 0, 0, 0, 0, 2, 2, 0, 1, 0, 0, 2, 1, 2, 0, 1, 2, 2, 0, 2, 2, 1, 1, 2, 0, 1, 1, 1, 0, 1, 0, 2, 1, 2, 1, 2, 0, 2, 1, 1},new int[]{5, 32, 41, 28, 36, 24, 4, 14, 23, 29, 20, 1, 6, 2, 13, 18, 31, 38, 11, 10, 35, 19, 30, 39, 22, 3, 0, 12, 26, 40, 25, 27, 8, 37, 9, 17, 16, 21, 34, 15, 33, 7}) );
  }



  @Test
  public void test74(){
    assertEquals(29657, solver.numberOfShuffles(new int[]{1, 2, 0, 2, 0, 1, 2, 2, 2, 0, 2, 0, 0, 1, 1, 1, 0, 2, 1, 0, 2, 0, 2, 1, 1, 2, 1, 1, 1, 0, 0, 1, 1, 2, 0, 1, 0, 0, 2, 2, 2, 0},new int[]{16, 18, 25, 12, 7, 31, 8, 23, 5, 11, 21, 22, 41, 37, 19, 38, 9, 0, 29, 17, 35, 32, 36, 27, 28, 39, 13, 10, 40, 3, 14, 34, 4, 15, 24, 2, 33, 6, 30, 20, 26, 1}) );
  }



  @Test
  public void test75(){
    assertEquals(14312, solver.numberOfShuffles(new int[]{1, 1, 2, 1, 2, 1, 2, 1, 0, 0, 2, 0, 2, 0, 2, 2, 0, 1, 2, 1, 0, 0, 0, 2, 0, 1, 0, 2, 1, 1, 0, 0, 0, 0, 1, 2, 1, 2, 1, 2, 1, 2},new int[]{7, 28, 15, 36, 38, 37, 29, 25, 35, 22, 11, 3, 8, 0, 12, 20, 6, 2, 21, 5, 18, 32, 10, 39, 24, 34, 23, 33, 1, 13, 14, 17, 27, 26, 4, 30, 41, 19, 40, 31, 16, 9}) );
  }



  @Test
  public void test76(){
    assertEquals(17101, solver.numberOfShuffles(new int[]{2, 1, 1, 2, 1, 2, 2, 2, 2, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 2, 0, 0, 1, 2, 0, 0, 0, 1, 0, 2, 1, 2, 1, 2, 0, 2, 1, 1, 2, 0, 2},new int[]{29, 37, 4, 8, 14, 35, 12, 5, 13, 10, 27, 19, 2, 40, 3, 0, 24, 6, 28, 22, 1, 23, 18, 38, 36, 21, 15, 41, 7, 39, 11, 25, 17, 32, 33, 30, 31, 9, 16, 26, 34, 20}) );
  }



  @Test
  public void test77(){
    assertEquals(7763, solver.numberOfShuffles(new int[]{2, 1, 1, 0, 1, 0, 1, 1, 2, 2, 1, 0, 2, 1, 2, 0, 1, 2, 0, 0, 1, 2, 1, 0, 0, 2, 0, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1, 2, 0},new int[]{21, 19, 9, 17, 29, 8, 3, 0, 25, 12, 1, 38, 40, 33, 4, 37, 14, 23, 10, 11, 2, 36, 22, 15, 13, 31, 6, 24, 20, 32, 16, 34, 35, 26, 39, 30, 18, 27, 41, 5, 7, 28}) );
  }



  @Test
  public void test78(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 0, 0, 1, 1, 2, 2, 1, 2, 2, 2, 2, 0, 1, 2, 0, 0, 1, 0, 2, 2, 2, 1, 0, 0, 2, 0, 1, 2, 2, 1, 0, 0, 0, 1, 1, 2, 1, 2, 0, 1, 1, 1, 0, 1},new int[]{11, 20, 19, 31, 9, 41, 7, 44, 14, 36, 4, 43, 33, 25, 15, 42, 1, 29, 30, 37, 0, 34, 2, 8, 23, 6, 24, 13, 27, 32, 39, 18, 17, 21, 12, 38, 16, 28, 10, 3, 35, 5, 26, 40, 22}) );
  }



  @Test
  public void test79(){
    assertEquals(36503, solver.numberOfShuffles(new int[]{0, 2, 2, 1, 0, 0, 1, 0, 1, 2, 1, 0, 1, 1, 2, 0, 2, 0, 2, 0, 2, 2, 0, 0, 0, 1, 0, 2, 2, 2, 2, 0, 1, 2, 1, 2, 2, 1, 1, 0, 1, 0, 1, 1, 1},new int[]{23, 17, 29, 43, 37, 30, 4, 32, 42, 26, 40, 18, 15, 35, 24, 31, 38, 41, 0, 10, 33, 5, 3, 2, 28, 16, 8, 7, 1, 21, 11, 22, 20, 19, 6, 25, 14, 44, 13, 12, 34, 9, 36, 39, 27}) );
  }



  @Test
  public void test80(){
    assertEquals(48557, solver.numberOfShuffles(new int[]{0, 2, 0, 1, 0, 0, 2, 2, 2, 1, 2, 0, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2, 1, 0, 2, 2, 1, 0, 0, 0, 0, 0, 2, 0, 1, 2, 0, 2, 1, 1, 1, 2},new int[]{13, 4, 11, 9, 3, 34, 18, 42, 17, 2, 29, 12, 1, 15, 28, 23, 10, 22, 14, 19, 39, 5, 41, 25, 38, 0, 44, 26, 32, 37, 7, 30, 20, 35, 6, 21, 36, 16, 43, 40, 33, 31, 24, 8, 27}) );
  }



  @Test
  public void test81(){
    assertEquals(27232, solver.numberOfShuffles(new int[]{0, 1, 2, 1, 1, 0, 2, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 2, 0, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 0, 0, 0, 0, 1, 2, 2, 1, 2, 0, 2, 2, 2, 1, 0},new int[]{32, 9, 1, 21, 5, 2, 8, 36, 44, 20, 14, 35, 22, 41, 7, 37, 29, 15, 24, 39, 28, 0, 43, 34, 6, 13, 26, 40, 19, 42, 38, 3, 11, 17, 4, 27, 16, 33, 12, 23, 31, 30, 10, 25, 18}) );
  }



  @Test
  public void test82(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 2, 1, 0, 0, 2, 1, 0, 2, 0, 0, 2, 1, 2, 1, 0, 2, 1, 1, 0, 2, 1, 0, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 1, 0, 1},new int[]{41, 23, 40, 34, 20, 3, 32, 21, 1, 5, 7, 16, 11, 28, 42, 44, 14, 18, 37, 25, 29, 15, 10, 36, 6, 8, 43, 33, 38, 17, 27, 24, 12, 19, 0, 30, 35, 26, 22, 9, 13, 39, 31, 4, 2}) );
  }



  @Test
  public void test83(){
    assertEquals(19657, solver.numberOfShuffles(new int[]{1, 1, 2, 1, 0, 2, 0, 1, 2, 2, 1, 2, 0, 2, 0, 0, 1, 1, 2, 2, 2, 2, 0, 2, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 2, 2, 1, 2, 0, 0, 2, 1, 1, 1},new int[]{40, 38, 8, 43, 24, 14, 17, 20, 1, 23, 34, 32, 7, 26, 15, 42, 16, 36, 5, 44, 33, 11, 3, 29, 19, 35, 4, 12, 13, 18, 30, 41, 39, 31, 0, 6, 25, 10, 27, 21, 9, 2, 37, 22, 28}) );
  }



  @Test
  public void test84(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{2, 1, 1, 0, 0, 0, 1, 2, 2, 1, 2, 0, 2, 0, 2, 1, 0, 0, 0, 0, 2, 0, 1, 1, 2, 2, 1, 2, 0, 2, 2, 2, 2, 1, 0, 0, 1, 1, 0, 1, 1, 2, 1, 0, 2},new int[]{17, 43, 32, 20, 34, 6, 33, 38, 2, 13, 26, 30, 22, 28, 7, 0, 36, 12, 40, 9, 16, 39, 35, 14, 23, 8, 37, 15, 18, 41, 44, 24, 29, 1, 3, 4, 27, 10, 5, 42, 21, 25, 19, 31, 11}) );
  }



  @Test
  public void test85(){
    assertEquals(26983, solver.numberOfShuffles(new int[]{2, 1, 2, 0, 1, 0, 0, 2, 2, 2, 1, 1, 1, 0, 0, 1, 0, 1, 2, 1, 0, 0, 0, 1, 1, 2, 2, 0, 2, 1, 0, 0, 2, 1, 1, 0, 2, 1, 2, 2, 2, 2, 1, 0, 0},new int[]{13, 30, 18, 5, 10, 22, 7, 40, 41, 24, 33, 2, 16, 15, 27, 31, 36, 43, 44, 6, 21, 12, 9, 35, 3, 37, 19, 39, 1, 34, 29, 11, 8, 17, 42, 26, 14, 4, 20, 38, 28, 32, 23, 25, 0}) );
  }



  @Test
  public void test86(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 2, 1, 1, 0, 2, 0, 2, 0, 0, 2, 0, 0, 1, 1, 2, 2, 0, 2, 2, 2, 1, 0, 0, 1, 2, 1, 2, 1, 2, 2, 1, 0, 0, 0, 1, 0, 2, 2, 1, 1, 1, 1, 0, 1},new int[]{36, 41, 23, 10, 24, 43, 9, 0, 19, 35, 40, 16, 29, 1, 13, 11, 27, 32, 25, 33, 8, 38, 28, 14, 4, 18, 2, 5, 21, 20, 37, 12, 26, 15, 39, 6, 30, 7, 3, 17, 44, 34, 22, 31, 42}) );
  }



  @Test
  public void test87(){
    assertEquals(23288, solver.numberOfShuffles(new int[]{2, 1, 1, 1, 0, 2, 1, 2, 2, 2, 1, 0, 0, 1, 0, 2, 0, 2, 0, 1, 0, 1, 1, 2, 0, 1, 0, 1, 2, 2, 2, 1, 1, 0, 1, 0, 0, 2, 0, 2, 1, 0, 0, 2, 2},new int[]{26, 31, 19, 41, 15, 33, 30, 6, 38, 11, 34, 28, 13, 36, 37, 17, 9, 44, 32, 1, 7, 25, 27, 3, 35, 4, 21, 24, 23, 12, 16, 43, 20, 10, 29, 39, 5, 22, 42, 14, 2, 18, 0, 40, 8}) );
  }



  @Test
  public void test88(){
    assertEquals(34956, solver.numberOfShuffles(new int[]{0, 2, 0, 0, 2, 1, 1, 2, 1, 0, 2, 1, 0, 2, 2, 2, 0, 1, 0, 0, 0, 1, 1, 1, 2, 2, 1, 0, 2, 1, 2, 0, 0, 0, 1, 0, 1, 0, 2, 2, 2, 1, 1, 1, 2, 0, 1, 2},new int[]{37, 2, 41, 32, 11, 34, 33, 29, 38, 35, 36, 28, 42, 6, 12, 16, 19, 4, 45, 5, 30, 15, 26, 20, 23, 7, 39, 18, 47, 46, 1, 22, 10, 3, 44, 13, 31, 40, 0, 9, 14, 25, 8, 43, 21, 27, 24, 17}) );
  }



  @Test
  public void test89(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 1, 1, 1, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 2, 0, 1, 1, 0, 1, 1, 1, 2, 2, 1, 0, 0, 2, 1},new int[]{44, 21, 26, 31, 7, 32, 33, 28, 18, 20, 42, 38, 29, 11, 8, 37, 2, 46, 5, 19, 1, 14, 9, 43, 45, 41, 24, 6, 4, 0, 25, 22, 35, 34, 47, 3, 23, 10, 17, 40, 16, 12, 39, 27, 30, 15, 13, 36}) );
  }



  @Test
  public void test90(){
    assertEquals(14880, solver.numberOfShuffles(new int[]{1, 1, 2, 0, 2, 2, 1, 1, 1, 0, 1, 2, 0, 1, 2, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 2, 0, 1, 1, 0, 0, 2, 2, 0, 2, 1, 2, 0},new int[]{43, 2, 8, 37, 15, 44, 35, 39, 19, 20, 25, 45, 5, 3, 22, 46, 13, 34, 29, 14, 31, 38, 26, 21, 6, 12, 1, 16, 4, 42, 18, 32, 9, 7, 24, 11, 41, 33, 0, 27, 47, 36, 40, 28, 10, 30, 23, 17}) );
  }



  @Test
  public void test91(){
    assertEquals(99733, solver.numberOfShuffles(new int[]{0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 0, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 0, 0, 2, 0, 1, 1, 0, 2, 0, 1, 1, 0, 0, 1, 0, 2, 0, 0, 1, 2, 2, 2},new int[]{20, 2, 15, 10, 4, 26, 16, 18, 27, 33, 37, 3, 42, 25, 31, 46, 32, 1, 38, 28, 5, 13, 0, 9, 17, 40, 19, 43, 41, 23, 7, 21, 12, 8, 45, 34, 14, 39, 22, 11, 36, 44, 24, 47, 30, 35, 6, 29}) );
  }



  @Test
  public void test92(){
    assertEquals(65911, solver.numberOfShuffles(new int[]{0, 2, 2, 1, 1, 2, 1, 2, 2, 1, 0, 1, 0, 0, 2, 2, 1, 0, 2, 1, 1, 0, 2, 0, 2, 0, 2, 0, 0, 0, 1, 2, 1, 1, 0, 1, 0, 0, 1, 1, 2, 2, 0, 1, 1, 2, 2, 0},new int[]{12, 44, 13, 28, 43, 35, 0, 47, 8, 46, 6, 25, 37, 14, 21, 20, 22, 26, 23, 32, 18, 41, 29, 2, 17, 3, 40, 9, 27, 36, 34, 4, 31, 16, 30, 7, 33, 19, 1, 10, 38, 15, 45, 39, 24, 11, 5, 42}) );
  }



  @Test
  public void test93(){
    assertEquals(33252, solver.numberOfShuffles(new int[]{1, 0, 1, 2, 2, 0, 0, 0, 0, 1, 1, 2, 0, 0, 1, 0, 2, 0, 0, 2, 0, 2, 0, 2, 0, 2, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 0, 1, 0, 1},new int[]{33, 9, 13, 30, 23, 40, 24, 22, 42, 5, 38, 6, 46, 39, 32, 2, 20, 4, 27, 25, 41, 1, 0, 35, 11, 26, 29, 8, 7, 43, 12, 10, 16, 19, 14, 3, 34, 31, 37, 47, 45, 36, 44, 28, 21, 18, 15, 17}) );
  }



  @Test
  public void test94(){
    assertEquals(8339, solver.numberOfShuffles(new int[]{2, 2, 0, 2, 0, 1, 1, 0, 2, 1, 1, 1, 0, 0, 2, 2, 1, 2, 0, 2, 2, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 2, 0, 2, 0, 0, 0, 2, 2, 1, 1, 1, 2, 2, 2, 0, 1, 0},new int[]{18, 10, 8, 2, 35, 12, 36, 16, 29, 45, 25, 24, 44, 15, 40, 11, 27, 13, 32, 6, 4, 17, 23, 33, 14, 26, 1, 7, 34, 28, 20, 30, 19, 22, 5, 9, 47, 41, 37, 46, 21, 0, 43, 39, 42, 31, 3, 38}) );
  }



  @Test
  public void test95(){
    assertEquals(16248, solver.numberOfShuffles(new int[]{0, 1, 2, 1, 1, 0, 2, 2, 2, 1, 2, 1, 2, 2, 2, 0, 2, 1, 1, 0, 0, 1, 2, 2, 1, 2, 0, 1, 0, 0, 2, 1, 0, 2, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 2, 0, 2, 0},new int[]{33, 10, 39, 41, 37, 44, 40, 6, 2, 43, 20, 0, 35, 17, 25, 21, 18, 1, 14, 38, 36, 28, 47, 22, 31, 3, 7, 30, 12, 26, 45, 13, 16, 23, 24, 4, 9, 15, 27, 8, 19, 46, 5, 34, 11, 29, 42, 32}) );
  }



  @Test
  public void test96(){
    assertEquals(70223, solver.numberOfShuffles(new int[]{0, 2, 2, 2, 0, 2, 1, 1, 2, 0, 2, 1, 2, 0, 0, 0, 2, 0, 0, 2, 1, 0, 2, 1, 2, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 2, 2, 1, 0, 0, 2, 1, 0, 2, 2},new int[]{13, 6, 10, 34, 18, 39, 45, 40, 43, 24, 7, 12, 15, 32, 4, 0, 44, 27, 1, 28, 41, 33, 46, 47, 14, 23, 16, 9, 30, 5, 26, 29, 8, 17, 22, 37, 21, 20, 19, 25, 31, 3, 35, 11, 38, 36, 42, 2}) );
  }



  @Test
  public void test97(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{2, 1, 2, 1, 1, 0, 2, 1, 1, 1, 0, 0, 1, 2, 1, 0, 0, 0, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 0, 2, 2, 0, 0, 0, 2, 0, 2, 0, 0, 2, 1, 1, 1, 2, 0, 2, 2},new int[]{26, 46, 25, 9, 34, 0, 13, 21, 29, 12, 42, 47, 5, 19, 15, 45, 44, 17, 1, 4, 6, 40, 11, 43, 16, 30, 32, 22, 7, 41, 33, 23, 36, 27, 28, 14, 37, 35, 20, 31, 38, 10, 8, 18, 24, 3, 39, 2}) );
  }



  @Test
  public void test98(){
    assertEquals(120119, solver.numberOfShuffles(new int[]{0, 0, 1, 1, 1, 2, 2, 2, 0, 0, 1, 1, 1, 2, 1, 1, 2, 0, 2, 0, 1, 1, 0, 2, 1, 1, 2, 0, 1, 1, 0, 0, 0, 1, 2, 2, 2, 0, 2, 2, 2, 2, 0, 0, 0, 1, 0, 2},new int[]{31, 10, 40, 8, 11, 7, 27, 33, 13, 19, 21, 6, 42, 29, 35, 30, 20, 5, 9, 28, 41, 37, 4, 36, 44, 14, 39, 22, 25, 16, 43, 12, 34, 0, 3, 18, 1, 45, 23, 32, 24, 26, 17, 15, 38, 46, 2, 47}) );
  }



  @Test
  public void test99(){
    assertEquals(59, solver.numberOfShuffles(new int[]{1, 1, 2, 0, 2, 0, 1, 0, 2, 2, 1, 0},new int[]{5, 0, 9, 7, 1, 8, 3, 10, 4, 11, 6, 2}) );
  }



  @Test
  public void test100(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 1, 2, 0, 2, 0, 1, 0, 2, 2, 1, 2},new int[]{5, 0, 9, 7, 1, 8, 3, 10, 4, 11, 6, 2}) );
  }



  @Test
  public void test101(){
    assertEquals(2, solver.numberOfShuffles(new int[]{2, 0, 1},new int[]{1, 2, 0}) );
  }



  @Test
  public void test102(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 2, 0, 2, 1, 0},new int[]{3, 2, 1, 0, 5, 4}) );
  }



  @Test
  public void test103(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1, 2, 0, 1, 2, 0, 1, 0, 1, 2, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1, 2, 2},new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47}) );
  }



  @Test
  public void test104(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{0, 1, 2, 2, 0, 1, 2, 1, 0, 2, 2, 1, 1, 0, 0},new int[]{12, 2, 5, 10, 0, 1, 7, 14, 13, 6, 8, 9, 3, 4, 11}) );
  }



}

