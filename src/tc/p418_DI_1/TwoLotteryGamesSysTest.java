

package tc.p418_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TwoLotteryGamesSysTest {

  TwoLotteryGames solver; 

  @Before
  public void setUp() {
    solver = new TwoLotteryGames();
  }

  

  @Test
  public void test0(){
    assertEquals(1.0, solver.getHigherChanceGame(3,2,1) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(0.3333333333333333, solver.getHigherChanceGame(3,1,1) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(0.4642857142857143, solver.getHigherChanceGame(8,2,1) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.7571428571428571, solver.getHigherChanceGame(8,4,2) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(0.8214285714285714, solver.getHigherChanceGame(8,3,1) , 1E-9);
  }



  @Test
  public void test5(){
    assertEquals(0.5, solver.getHigherChanceGame(2,1,1) , 1E-9);
  }



  @Test
  public void test6(){
    assertEquals(0.5, solver.getHigherChanceGame(2,1,1) , 1E-9);
  }



  @Test
  public void test7(){
    assertEquals(0.3333333333333333, solver.getHigherChanceGame(3,1,1) , 1E-9);
  }



  @Test
  public void test8(){
    assertEquals(1.0, solver.getHigherChanceGame(3,2,1) , 1E-9);
  }



  @Test
  public void test9(){
    assertEquals(0.3333333333333333, solver.getHigherChanceGame(3,2,2) , 1E-9);
  }



  @Test
  public void test10(){
    assertEquals(0.25, solver.getHigherChanceGame(4,1,1) , 1E-9);
  }



  @Test
  public void test11(){
    assertEquals(0.8333333333333334, solver.getHigherChanceGame(4,2,1) , 1E-9);
  }



  @Test
  public void test12(){
    assertEquals(0.16666666666666666, solver.getHigherChanceGame(4,2,2) , 1E-9);
  }



  @Test
  public void test13(){
    assertEquals(1.0, solver.getHigherChanceGame(4,3,1) , 1E-9);
  }



  @Test
  public void test14(){
    assertEquals(1.0, solver.getHigherChanceGame(4,3,2) , 1E-9);
  }



  @Test
  public void test15(){
    assertEquals(0.25, solver.getHigherChanceGame(4,3,3) , 1E-9);
  }



  @Test
  public void test16(){
    assertEquals(0.2, solver.getHigherChanceGame(5,1,1) , 1E-9);
  }



  @Test
  public void test17(){
    assertEquals(0.7, solver.getHigherChanceGame(5,2,1) , 1E-9);
  }



  @Test
  public void test18(){
    assertEquals(0.1, solver.getHigherChanceGame(5,2,2) , 1E-9);
  }



  @Test
  public void test19(){
    assertEquals(1.0, solver.getHigherChanceGame(5,3,1) , 1E-9);
  }



  @Test
  public void test20(){
    assertEquals(0.7, solver.getHigherChanceGame(5,3,2) , 1E-9);
  }



  @Test
  public void test21(){
    assertEquals(0.1, solver.getHigherChanceGame(5,3,3) , 1E-9);
  }



  @Test
  public void test22(){
    assertEquals(1.0, solver.getHigherChanceGame(5,4,1) , 1E-9);
  }



  @Test
  public void test23(){
    assertEquals(1.0, solver.getHigherChanceGame(5,4,2) , 1E-9);
  }



  @Test
  public void test24(){
    assertEquals(1.0, solver.getHigherChanceGame(5,4,3) , 1E-9);
  }



  @Test
  public void test25(){
    assertEquals(0.2, solver.getHigherChanceGame(5,4,4) , 1E-9);
  }



  @Test
  public void test26(){
    assertEquals(0.16666666666666666, solver.getHigherChanceGame(6,1,1) , 1E-9);
  }



  @Test
  public void test27(){
    assertEquals(0.6, solver.getHigherChanceGame(6,2,1) , 1E-9);
  }



  @Test
  public void test28(){
    assertEquals(0.06666666666666667, solver.getHigherChanceGame(6,2,2) , 1E-9);
  }



  @Test
  public void test29(){
    assertEquals(0.95, solver.getHigherChanceGame(6,3,1) , 1E-9);
  }



  @Test
  public void test30(){
    assertEquals(0.5, solver.getHigherChanceGame(6,3,2) , 1E-9);
  }



  @Test
  public void test31(){
    assertEquals(0.05, solver.getHigherChanceGame(6,3,3) , 1E-9);
  }



  @Test
  public void test32(){
    assertEquals(1.0, solver.getHigherChanceGame(6,4,1) , 1E-9);
  }



  @Test
  public void test33(){
    assertEquals(1.0, solver.getHigherChanceGame(6,4,2) , 1E-9);
  }



  @Test
  public void test34(){
    assertEquals(0.6, solver.getHigherChanceGame(6,4,3) , 1E-9);
  }



  @Test
  public void test35(){
    assertEquals(0.06666666666666667, solver.getHigherChanceGame(6,4,4) , 1E-9);
  }



  @Test
  public void test36(){
    assertEquals(1.0, solver.getHigherChanceGame(6,5,1) , 1E-9);
  }



  @Test
  public void test37(){
    assertEquals(1.0, solver.getHigherChanceGame(6,5,2) , 1E-9);
  }



  @Test
  public void test38(){
    assertEquals(1.0, solver.getHigherChanceGame(6,5,3) , 1E-9);
  }



  @Test
  public void test39(){
    assertEquals(1.0, solver.getHigherChanceGame(6,5,4) , 1E-9);
  }



  @Test
  public void test40(){
    assertEquals(0.16666666666666666, solver.getHigherChanceGame(6,5,5) , 1E-9);
  }



  @Test
  public void test41(){
    assertEquals(0.14285714285714285, solver.getHigherChanceGame(7,1,1) , 1E-9);
  }



  @Test
  public void test42(){
    assertEquals(0.5238095238095238, solver.getHigherChanceGame(7,2,1) , 1E-9);
  }



  @Test
  public void test43(){
    assertEquals(0.047619047619047616, solver.getHigherChanceGame(7,2,2) , 1E-9);
  }



  @Test
  public void test44(){
    assertEquals(0.8857142857142857, solver.getHigherChanceGame(7,3,1) , 1E-9);
  }



  @Test
  public void test45(){
    assertEquals(0.37142857142857144, solver.getHigherChanceGame(7,3,2) , 1E-9);
  }



  @Test
  public void test46(){
    assertEquals(0.02857142857142857, solver.getHigherChanceGame(7,3,3) , 1E-9);
  }



  @Test
  public void test47(){
    assertEquals(1.0, solver.getHigherChanceGame(7,4,1) , 1E-9);
  }



  @Test
  public void test48(){
    assertEquals(0.8857142857142857, solver.getHigherChanceGame(7,4,2) , 1E-9);
  }



  @Test
  public void test49(){
    assertEquals(0.37142857142857144, solver.getHigherChanceGame(7,4,3) , 1E-9);
  }



  @Test
  public void test50(){
    assertEquals(0.02857142857142857, solver.getHigherChanceGame(7,4,4) , 1E-9);
  }



  @Test
  public void test51(){
    assertEquals(1.0, solver.getHigherChanceGame(7,5,1) , 1E-9);
  }



  @Test
  public void test52(){
    assertEquals(1.0, solver.getHigherChanceGame(7,5,2) , 1E-9);
  }



  @Test
  public void test53(){
    assertEquals(1.0, solver.getHigherChanceGame(7,5,3) , 1E-9);
  }



  @Test
  public void test54(){
    assertEquals(0.5238095238095238, solver.getHigherChanceGame(7,5,4) , 1E-9);
  }



  @Test
  public void test55(){
    assertEquals(0.047619047619047616, solver.getHigherChanceGame(7,5,5) , 1E-9);
  }



  @Test
  public void test56(){
    assertEquals(1.0, solver.getHigherChanceGame(7,6,1) , 1E-9);
  }



  @Test
  public void test57(){
    assertEquals(1.0, solver.getHigherChanceGame(7,6,2) , 1E-9);
  }



  @Test
  public void test58(){
    assertEquals(1.0, solver.getHigherChanceGame(7,6,3) , 1E-9);
  }



  @Test
  public void test59(){
    assertEquals(1.0, solver.getHigherChanceGame(7,6,4) , 1E-9);
  }



  @Test
  public void test60(){
    assertEquals(1.0, solver.getHigherChanceGame(7,6,5) , 1E-9);
  }



  @Test
  public void test61(){
    assertEquals(0.14285714285714285, solver.getHigherChanceGame(7,6,6) , 1E-9);
  }



  @Test
  public void test62(){
    assertEquals(0.125, solver.getHigherChanceGame(8,1,1) , 1E-9);
  }



  @Test
  public void test63(){
    assertEquals(0.4642857142857143, solver.getHigherChanceGame(8,2,1) , 1E-9);
  }



  @Test
  public void test64(){
    assertEquals(0.03571428571428571, solver.getHigherChanceGame(8,2,2) , 1E-9);
  }



  @Test
  public void test65(){
    assertEquals(0.8214285714285714, solver.getHigherChanceGame(8,3,1) , 1E-9);
  }



  @Test
  public void test66(){
    assertEquals(0.2857142857142857, solver.getHigherChanceGame(8,3,2) , 1E-9);
  }



  @Test
  public void test67(){
    assertEquals(0.017857142857142856, solver.getHigherChanceGame(8,3,3) , 1E-9);
  }



  @Test
  public void test68(){
    assertEquals(0.9857142857142858, solver.getHigherChanceGame(8,4,1) , 1E-9);
  }



  @Test
  public void test69(){
    assertEquals(0.7571428571428571, solver.getHigherChanceGame(8,4,2) , 1E-9);
  }



  @Test
  public void test70(){
    assertEquals(0.24285714285714285, solver.getHigherChanceGame(8,4,3) , 1E-9);
  }



  @Test
  public void test71(){
    assertEquals(0.014285714285714285, solver.getHigherChanceGame(8,4,4) , 1E-9);
  }



  @Test
  public void test72(){
    assertEquals(1.0, solver.getHigherChanceGame(8,5,1) , 1E-9);
  }



  @Test
  public void test73(){
    assertEquals(1.0, solver.getHigherChanceGame(8,5,2) , 1E-9);
  }



  @Test
  public void test74(){
    assertEquals(0.8214285714285714, solver.getHigherChanceGame(8,5,3) , 1E-9);
  }



  @Test
  public void test75(){
    assertEquals(0.2857142857142857, solver.getHigherChanceGame(8,5,4) , 1E-9);
  }



  @Test
  public void test76(){
    assertEquals(0.017857142857142856, solver.getHigherChanceGame(8,5,5) , 1E-9);
  }



  @Test
  public void test77(){
    assertEquals(1.0, solver.getHigherChanceGame(8,6,1) , 1E-9);
  }



  @Test
  public void test78(){
    assertEquals(1.0, solver.getHigherChanceGame(8,6,2) , 1E-9);
  }



  @Test
  public void test79(){
    assertEquals(1.0, solver.getHigherChanceGame(8,6,3) , 1E-9);
  }



  @Test
  public void test80(){
    assertEquals(1.0, solver.getHigherChanceGame(8,6,4) , 1E-9);
  }



  @Test
  public void test81(){
    assertEquals(0.4642857142857143, solver.getHigherChanceGame(8,6,5) , 1E-9);
  }



  @Test
  public void test82(){
    assertEquals(0.03571428571428571, solver.getHigherChanceGame(8,6,6) , 1E-9);
  }



  @Test
  public void test83(){
    assertEquals(1.0, solver.getHigherChanceGame(8,7,1) , 1E-9);
  }



  @Test
  public void test84(){
    assertEquals(1.0, solver.getHigherChanceGame(8,7,2) , 1E-9);
  }



  @Test
  public void test85(){
    assertEquals(1.0, solver.getHigherChanceGame(8,7,3) , 1E-9);
  }



  @Test
  public void test86(){
    assertEquals(1.0, solver.getHigherChanceGame(8,7,4) , 1E-9);
  }



  @Test
  public void test87(){
    assertEquals(1.0, solver.getHigherChanceGame(8,7,5) , 1E-9);
  }



  @Test
  public void test88(){
    assertEquals(1.0, solver.getHigherChanceGame(8,7,6) , 1E-9);
  }



  @Test
  public void test89(){
    assertEquals(0.125, solver.getHigherChanceGame(8,7,7) , 1E-9);
  }



}

