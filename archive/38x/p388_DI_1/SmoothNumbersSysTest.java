

package tc.p388_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmoothNumbersSysTest {

  SmoothNumbers solver; 

  @Before
  public void setUp() {
    solver = new SmoothNumbers();
  }

  

  @Test
  public void test0(){
    assertEquals(7, solver.countSmoothNumbers(10,3) );
  }



  @Test
  public void test1(){
    assertEquals(7, solver.countSmoothNumbers(10,4) );
  }



  @Test
  public void test2(){
    assertEquals(8, solver.countSmoothNumbers(15,3) );
  }



  @Test
  public void test3(){
    assertEquals(5, solver.countSmoothNumbers(5,20) );
  }



  @Test
  public void test4(){
    assertEquals(17442, solver.countSmoothNumbers(100000,100) );
  }



  @Test
  public void test5(){
    assertEquals(1, solver.countSmoothNumbers(1,1) );
  }



  @Test
  public void test6(){
    assertEquals(1, solver.countSmoothNumbers(1,100) );
  }



  @Test
  public void test7(){
    assertEquals(1, solver.countSmoothNumbers(100000,1) );
  }



  @Test
  public void test8(){
    assertEquals(2, solver.countSmoothNumbers(2,2) );
  }



  @Test
  public void test9(){
    assertEquals(17441, solver.countSmoothNumbers(99999,100) );
  }



  @Test
  public void test10(){
    assertEquals(16760, solver.countSmoothNumbers(99999,96) );
  }



  @Test
  public void test11(){
    assertEquals(17441, solver.countSmoothNumbers(99999,97) );
  }



  @Test
  public void test12(){
    assertEquals(96, solver.countSmoothNumbers(96,97) );
  }



  @Test
  public void test13(){
    assertEquals(96, solver.countSmoothNumbers(96,96) );
  }



  @Test
  public void test14(){
    assertEquals(61, solver.countSmoothNumbers(121,11) );
  }



  @Test
  public void test15(){
    assertEquals(87, solver.countSmoothNumbers(168,13) );
  }



  @Test
  public void test16(){
    assertEquals(31, solver.countSmoothNumbers(50,7) );
  }



  @Test
  public void test17(){
    assertEquals(566, solver.countSmoothNumbers(50000,10) );
  }



  @Test
  public void test18(){
    assertEquals(17, solver.countSmoothNumbers(65536,2) );
  }



  @Test
  public void test19(){
    assertEquals(1, solver.countSmoothNumbers(2,1) );
  }



  @Test
  public void test20(){
    assertEquals(1, solver.countSmoothNumbers(99999,1) );
  }



  @Test
  public void test21(){
    assertEquals(101, solver.countSmoothNumbers(100000,4) );
  }



  @Test
  public void test22(){
    assertEquals(1, solver.countSmoothNumbers(10,1) );
  }



  @Test
  public void test23(){
    assertEquals(1, solver.countSmoothNumbers(100,1) );
  }



  @Test
  public void test24(){
    assertEquals(1, solver.countSmoothNumbers(1000,1) );
  }



  @Test
  public void test25(){
    assertEquals(1, solver.countSmoothNumbers(15,1) );
  }



}

