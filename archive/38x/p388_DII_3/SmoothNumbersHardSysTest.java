

package tc.p388_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmoothNumbersHardSysTest {

  SmoothNumbersHard solver; 

  @Before
  public void setUp() {
    solver = new SmoothNumbersHard();
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
    assertEquals(1196525, solver.countSmoothNumbers(5000000,1000) );
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
    assertEquals(1196523, solver.countSmoothNumbers(4999990,1000) );
  }



  @Test
  public void test20(){
    assertEquals(1192345, solver.countSmoothNumbers(5000000,996) );
  }



  @Test
  public void test21(){
    assertEquals(1196525, solver.countSmoothNumbers(5000000,997) );
  }



  @Test
  public void test22(){
    assertEquals(682, solver.countSmoothNumbers(5000000,5) );
  }



  @Test
  public void test23(){
    assertEquals(950, solver.countSmoothNumbers(950,1000) );
  }



  @Test
  public void test24(){
    assertEquals(23855, solver.countSmoothNumbers(123456,123) );
  }



  @Test
  public void test25(){
    assertEquals(1, solver.countSmoothNumbers(5000,1) );
  }



  @Test
  public void test26(){
    assertEquals(1015104, solver.countSmoothNumbers(5000000,731) );
  }



  @Test
  public void test27(){
    assertEquals(1194680, solver.countSmoothNumbers(4989898,1000) );
  }



  @Test
  public void test28(){
    assertEquals(816749, solver.countSmoothNumbers(5000000,500) );
  }



  @Test
  public void test29(){
    assertEquals(903642, solver.countSmoothNumbers(4999999,600) );
  }



  @Test
  public void test30(){
    assertEquals(618234, solver.countSmoothNumbers(5000000,343) );
  }



  @Test
  public void test31(){
    assertEquals(1196525, solver.countSmoothNumbers(5000000,998) );
  }



  @Test
  public void test32(){
    assertEquals(241786, solver.countSmoothNumbers(5000000,123) );
  }



  @Test
  public void test33(){
    assertEquals(1196525, solver.countSmoothNumbers(5000000,999) );
  }



  @Test
  public void test34(){
    assertEquals(1, solver.countSmoothNumbers(5000000,1) );
  }



  @Test
  public void test35(){
    assertEquals(842818, solver.countSmoothNumbers(5000000,527) );
  }



  @Test
  public void test36(){
    assertEquals(1185903, solver.countSmoothNumbers(4987654,987) );
  }



  @Test
  public void test37(){
    assertEquals(33073, solver.countSmoothNumbers(4000000,33) );
  }



  @Test
  public void test38(){
    assertEquals(1183920, solver.countSmoothNumbers(5000000,978) );
  }



  @Test
  public void test39(){
    assertEquals(1004649, solver.countSmoothNumbers(5000000,717) );
  }



  @Test
  public void test40(){
    assertEquals(977640, solver.countSmoothNumbers(4999678,675) );
  }



  @Test
  public void test41(){
    assertEquals(756789, solver.countSmoothNumbers(4888887,459) );
  }



  @Test
  public void test42(){
    assertEquals(215681, solver.countSmoothNumbers(4123654,123) );
  }



  @Test
  public void test43(){
    assertEquals(1188530, solver.countSmoothNumbers(4956349,997) );
  }



  @Test
  public void test44(){
    assertEquals(1192345, solver.countSmoothNumbers(5000000,991) );
  }



}

