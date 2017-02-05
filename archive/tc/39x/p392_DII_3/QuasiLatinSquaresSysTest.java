

package tc.p392_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuasiLatinSquaresSysTest {

  QuasiLatinSquares solver; 

  @Before
  public void setUp() {
    solver = new QuasiLatinSquares();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new String[]{"0 1 2", "1 2 0", "2 0 1"}, solver.makeSquare(3,3) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new String[]{"0 0 0 0 1", "0 0 0 0 1", "0 0 0 0 1", "0 0 0 0 1", "1 1 1 1 0"}, solver.makeSquare(5,2) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new String[]{"0 0 1 2 3", "0 0 1 2 3", "1 1 0 3 2", "2 2 3 0 1", "3 3 2 1 0"}, solver.makeSquare(5,4) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new String[]{"0 0 0 1 2 3 4 5 6", "0 0 0 1 2 3 4 5 6", "0 0 0 1 2 3 4 5 6", "1 1 1 0 3 2 5 6 4", "2 2 2 3 0 1 6 4 5", "3 3 3 4 5 6 0 1 2", "4 4 4 2 6 5 1 0 3", "5 5 5 6 1 4 2 3 0", "6 6 6 5 4 0 3 2 1"}, solver.makeSquare(9,7) );
  }



  @Test
  public void test4(){
    assertArrayEquals(new String[]{"0 1 2 3 4 5 6 7 8 9", "1 0 3 2 5 4 7 6 9 8", "2 3 0 1 6 7 8 9 4 5", "3 2 1 0 7 6 9 8 5 4", "4 5 6 7 8 9 0 1 2 3", "5 4 7 6 9 8 1 0 3 2", "6 7 8 9 2 3 4 5 0 1", "7 6 9 8 3 2 5 4 1 0", "8 9 4 5 0 1 2 3 6 7", "9 8 5 4 1 0 3 2 7 6"}, solver.makeSquare(10,10) );
  }



  @Test
  public void test5(){
    assertArrayEquals(new String[]{"0"}, solver.makeSquare(1,1) );
  }



  @Test
  public void test6(){
    assertArrayEquals(new String[]{"0 0", "0 0"}, solver.makeSquare(2,1) );
  }



  @Test
  public void test7(){
    assertArrayEquals(new String[]{"0 1", "1 0"}, solver.makeSquare(2,2) );
  }



  @Test
  public void test8(){
    assertArrayEquals(new String[]{"0 0 1 2", "0 0 1 2", "1 1 2 0", "2 2 0 1"}, solver.makeSquare(4,3) );
  }



  @Test
  public void test9(){
    assertArrayEquals(new String[]{"0 1 2 3", "1 0 3 2", "2 3 0 1", "3 2 1 0"}, solver.makeSquare(4,4) );
  }



  @Test
  public void test10(){
    assertArrayEquals(new String[]{"0 0 0 1 2", "0 0 0 1 2", "0 0 0 1 2", "1 1 1 2 0", "2 2 2 0 1"}, solver.makeSquare(5,3) );
  }



  @Test
  public void test11(){
    assertArrayEquals(new String[]{"0 1 2 3 4", "1 0 3 4 2", "2 3 4 0 1", "3 4 1 2 0", "4 2 0 1 3"}, solver.makeSquare(5,5) );
  }



  @Test
  public void test12(){
    assertArrayEquals(new String[]{"0 0 0 1 2 3", "0 0 0 1 2 3", "0 0 0 1 2 3", "1 1 1 0 3 2", "2 2 2 3 0 1", "3 3 3 2 1 0"}, solver.makeSquare(6,4) );
  }



  @Test
  public void test13(){
    assertArrayEquals(new String[]{"0 1 2 3 4 5", "1 0 3 2 5 4", "2 3 4 5 0 1", "3 2 5 4 1 0", "4 5 0 1 2 3", "5 4 1 0 3 2"}, solver.makeSquare(6,6) );
  }



  @Test
  public void test14(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0"}, solver.makeSquare(7,1) );
  }



  @Test
  public void test15(){
    assertArrayEquals(new String[]{"0 0 0 1 2 3 4", "0 0 0 1 2 3 4", "0 0 0 1 2 3 4", "1 1 1 0 3 4 2", "2 2 2 3 4 0 1", "3 3 3 4 1 2 0", "4 4 4 2 0 1 3"}, solver.makeSquare(7,5) );
  }



  @Test
  public void test16(){
    assertArrayEquals(new String[]{"0 0 1 2 3 4 5", "0 0 1 2 3 4 5", "1 1 0 3 2 5 4", "2 2 3 4 5 0 1", "3 3 2 5 4 1 0", "4 4 5 0 1 2 3", "5 5 4 1 0 3 2"}, solver.makeSquare(7,6) );
  }



  @Test
  public void test17(){
    assertArrayEquals(new String[]{"0 1 2 3 4 5 6", "1 0 3 2 5 6 4", "2 3 0 1 6 4 5", "3 4 5 6 0 1 2", "4 2 6 5 1 0 3", "5 6 1 4 2 3 0", "6 5 4 0 3 2 1"}, solver.makeSquare(7,7) );
  }



  @Test
  public void test18(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 0"}, solver.makeSquare(8,2) );
  }



  @Test
  public void test19(){
    assertArrayEquals(new String[]{"0 0 0 0 1 2 3 4", "0 0 0 0 1 2 3 4", "0 0 0 0 1 2 3 4", "0 0 0 0 1 2 3 4", "1 1 1 1 0 3 4 2", "2 2 2 2 3 4 0 1", "3 3 3 3 4 1 2 0", "4 4 4 4 2 0 1 3"}, solver.makeSquare(8,5) );
  }



  @Test
  public void test20(){
    assertArrayEquals(new String[]{"0 0 0 1 2 3 4 5", "0 0 0 1 2 3 4 5", "0 0 0 1 2 3 4 5", "1 1 1 0 3 2 5 4", "2 2 2 3 4 5 0 1", "3 3 3 2 5 4 1 0", "4 4 4 5 0 1 2 3", "5 5 5 4 1 0 3 2"}, solver.makeSquare(8,6) );
  }



  @Test
  public void test21(){
    assertArrayEquals(new String[]{"0 0 1 2 3 4 5 6", "0 0 1 2 3 4 5 6", "1 1 0 3 2 5 6 4", "2 2 3 0 1 6 4 5", "3 3 4 5 6 0 1 2", "4 4 2 6 5 1 0 3", "5 5 6 1 4 2 3 0", "6 6 5 4 0 3 2 1"}, solver.makeSquare(8,7) );
  }



  @Test
  public void test22(){
    assertArrayEquals(new String[]{"0 1 2 3 4 5 6 7", "1 0 3 2 5 4 7 6", "2 3 0 1 6 7 4 5", "3 2 1 0 7 6 5 4", "4 5 6 7 0 1 2 3", "5 4 7 6 1 0 3 2", "6 7 4 5 2 3 0 1", "7 6 5 4 3 2 1 0"}, solver.makeSquare(8,8) );
  }



  @Test
  public void test23(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "1 1 1 1 1 1 1 2 0", "2 2 2 2 2 2 2 0 1"}, solver.makeSquare(9,3) );
  }



  @Test
  public void test24(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "1 1 1 1 1 1 0 3 2", "2 2 2 2 2 2 3 0 1", "3 3 3 3 3 3 2 1 0"}, solver.makeSquare(9,4) );
  }



  @Test
  public void test25(){
    assertArrayEquals(new String[]{"0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "1 1 1 1 1 0 3 4 2", "2 2 2 2 2 3 4 0 1", "3 3 3 3 3 4 1 2 0", "4 4 4 4 4 2 0 1 3"}, solver.makeSquare(9,5) );
  }



  @Test
  public void test26(){
    assertArrayEquals(new String[]{"0 0 0 0 1 2 3 4 5", "0 0 0 0 1 2 3 4 5", "0 0 0 0 1 2 3 4 5", "0 0 0 0 1 2 3 4 5", "1 1 1 1 0 3 2 5 4", "2 2 2 2 3 4 5 0 1", "3 3 3 3 2 5 4 1 0", "4 4 4 4 5 0 1 2 3", "5 5 5 5 4 1 0 3 2"}, solver.makeSquare(9,6) );
  }



  @Test
  public void test27(){
    assertArrayEquals(new String[]{"0 0 0 1 2 3 4 5 6 7", "0 0 0 1 2 3 4 5 6 7", "0 0 0 1 2 3 4 5 6 7", "1 1 1 0 3 2 5 4 7 6", "2 2 2 3 0 1 6 7 4 5", "3 3 3 2 1 0 7 6 5 4", "4 4 4 5 6 7 0 1 2 3", "5 5 5 4 7 6 1 0 3 2", "6 6 6 7 4 5 2 3 0 1", "7 7 7 6 5 4 3 2 1 0"}, solver.makeSquare(10,8) );
  }



  @Test
  public void test28(){
    assertArrayEquals(new String[]{"0 0 1 2 3 4 5 6 7", "0 0 1 2 3 4 5 6 7", "1 1 0 3 2 5 4 7 6", "2 2 3 0 1 6 7 4 5", "3 3 2 1 0 7 6 5 4", "4 4 5 6 7 0 1 2 3", "5 5 4 7 6 1 0 3 2", "6 6 7 4 5 2 3 0 1", "7 7 6 5 4 3 2 1 0"}, solver.makeSquare(9,8) );
  }



  @Test
  public void test29(){
    assertArrayEquals(new String[]{"0 1 2 3 4 5 6 7 8", "1 0 3 2 5 4 7 8 6", "2 3 0 1 6 7 8 4 5", "3 2 1 0 7 8 5 6 4", "4 5 6 7 8 0 1 2 3", "5 4 7 8 0 6 2 3 1", "6 7 8 4 1 2 3 5 0", "7 8 5 6 3 1 4 0 2", "8 6 4 5 2 3 0 1 7"}, solver.makeSquare(9,9) );
  }



  @Test
  public void test30(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0"}, solver.makeSquare(10,1) );
  }



  @Test
  public void test31(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 1 1 0"}, solver.makeSquare(10,2) );
  }



  @Test
  public void test32(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "1 1 1 1 1 1 1 1 2 0", "2 2 2 2 2 2 2 2 0 1"}, solver.makeSquare(10,3) );
  }



  @Test
  public void test33(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "1 1 1 1 1 1 1 0 3 2", "2 2 2 2 2 2 2 3 0 1", "3 3 3 3 3 3 3 2 1 0"}, solver.makeSquare(10,4) );
  }



  @Test
  public void test34(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "1 1 1 1 1 1 0 3 4 2", "2 2 2 2 2 2 3 4 0 1", "3 3 3 3 3 3 4 1 2 0", "4 4 4 4 4 4 2 0 1 3"}, solver.makeSquare(10,5) );
  }



  @Test
  public void test35(){
    assertArrayEquals(new String[]{"0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "1 1 1 1 1 0 3 2 5 4", "2 2 2 2 2 3 4 5 0 1", "3 3 3 3 3 2 5 4 1 0", "4 4 4 4 4 5 0 1 2 3", "5 5 5 5 5 4 1 0 3 2"}, solver.makeSquare(10,6) );
  }



  @Test
  public void test36(){
    assertArrayEquals(new String[]{"0 0 0 0 1 2 3 4 5 6", "0 0 0 0 1 2 3 4 5 6", "0 0 0 0 1 2 3 4 5 6", "0 0 0 0 1 2 3 4 5 6", "1 1 1 1 0 3 2 5 6 4", "2 2 2 2 3 0 1 6 4 5", "3 3 3 3 4 5 6 0 1 2", "4 4 4 4 2 6 5 1 0 3", "5 5 5 5 6 1 4 2 3 0", "6 6 6 6 5 4 0 3 2 1"}, solver.makeSquare(10,7) );
  }



  @Test
  public void test37(){
    assertArrayEquals(new String[]{"0 0 1 2 3 4 5 6 7 8", "0 0 1 2 3 4 5 6 7 8", "1 1 0 3 2 5 4 7 8 6", "2 2 3 0 1 6 7 8 4 5", "3 3 2 1 0 7 8 5 6 4", "4 4 5 6 7 8 0 1 2 3", "5 5 4 7 8 0 6 2 3 1", "6 6 7 8 4 1 2 3 5 0", "7 7 8 5 6 3 1 4 0 2", "8 8 6 4 5 2 3 0 1 7"}, solver.makeSquare(10,9) );
  }



  @Test
  public void test38(){
    assertArrayEquals(new String[]{"0 0 0", "0 0 0", "0 0 0"}, solver.makeSquare(3,1) );
  }



  @Test
  public void test39(){
    assertArrayEquals(new String[]{"0 0 1", "0 0 1", "1 1 0"}, solver.makeSquare(3,2) );
  }



  @Test
  public void test40(){
    assertArrayEquals(new String[]{"0 0 0 0", "0 0 0 0", "0 0 0 0", "0 0 0 0"}, solver.makeSquare(4,1) );
  }



  @Test
  public void test41(){
    assertArrayEquals(new String[]{"0 0 0 1", "0 0 0 1", "0 0 0 1", "1 1 1 0"}, solver.makeSquare(4,2) );
  }



  @Test
  public void test42(){
    assertArrayEquals(new String[]{"0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0"}, solver.makeSquare(5,1) );
  }



  @Test
  public void test43(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0"}, solver.makeSquare(6,1) );
  }



  @Test
  public void test44(){
    assertArrayEquals(new String[]{"0 0 0 0 0 1", "0 0 0 0 0 1", "0 0 0 0 0 1", "0 0 0 0 0 1", "0 0 0 0 0 1", "1 1 1 1 1 0"}, solver.makeSquare(6,2) );
  }



  @Test
  public void test45(){
    assertArrayEquals(new String[]{"0 0 0 0 1 2", "0 0 0 0 1 2", "0 0 0 0 1 2", "0 0 0 0 1 2", "1 1 1 1 2 0", "2 2 2 2 0 1"}, solver.makeSquare(6,3) );
  }



  @Test
  public void test46(){
    assertArrayEquals(new String[]{"0 0 1 2 3 4", "0 0 1 2 3 4", "1 1 0 3 4 2", "2 2 3 4 0 1", "3 3 4 1 2 0", "4 4 2 0 1 3"}, solver.makeSquare(6,5) );
  }



  @Test
  public void test47(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "1 1 1 1 1 1 0"}, solver.makeSquare(7,2) );
  }



  @Test
  public void test48(){
    assertArrayEquals(new String[]{"0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "1 1 1 1 1 2 0", "2 2 2 2 2 0 1"}, solver.makeSquare(7,3) );
  }



  @Test
  public void test49(){
    assertArrayEquals(new String[]{"0 0 0 0 1 2 3", "0 0 0 0 1 2 3", "0 0 0 0 1 2 3", "0 0 0 0 1 2 3", "1 1 1 1 0 3 2", "2 2 2 2 3 0 1", "3 3 3 3 2 1 0"}, solver.makeSquare(7,4) );
  }



  @Test
  public void test50(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0"}, solver.makeSquare(8,1) );
  }



  @Test
  public void test51(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "1 1 1 1 1 1 2 0", "2 2 2 2 2 2 0 1"}, solver.makeSquare(8,3) );
  }



  @Test
  public void test52(){
    assertArrayEquals(new String[]{"0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "1 1 1 1 1 0 3 2", "2 2 2 2 2 3 0 1", "3 3 3 3 3 2 1 0"}, solver.makeSquare(8,4) );
  }



  @Test
  public void test53(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0"}, solver.makeSquare(9,1) );
  }



  @Test
  public void test54(){
    assertArrayEquals(new String[]{"0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 1 0"}, solver.makeSquare(9,2) );
  }



}

