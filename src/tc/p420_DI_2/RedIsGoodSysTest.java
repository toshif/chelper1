

package tc.p420_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RedIsGoodSysTest {

  RedIsGood solver; 

  @Before
  public void setUp() {
    solver = new RedIsGood();
  }

  

  @Test
  public void test0(){
    assertEquals(0.0, solver.getProfit(0,7) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(4.0, solver.getProfit(4,0) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(4.166666666666667, solver.getProfit(5,1) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.6666666666666666, solver.getProfit(2,2) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(8.324175824175823, solver.getProfit(12,4) , 1E-9);
  }



  @Test
  public void test5(){
    assertEquals(1.075642825339958, solver.getProfit(11,12) , 1E-9);
  }



  @Test
  public void test6(){
    assertEquals(36.90021846438633, solver.getProfit(5000,5000) , 1E-9);
  }



  @Test
  public void test7(){
    assertEquals(191.15589434419024, solver.getProfit(4950,4772) , 1E-9);
  }



  @Test
  public void test8(){
    assertEquals(8.13249058054577E-4, solver.getProfit(4446,4525) , 1E-9);
  }



  @Test
  public void test9(){
    assertEquals(0.0, solver.getProfit(4446,4526) , 1E-9);
  }



  @Test
  public void test10(){
    assertEquals(0.0, solver.getProfit(0,0) , 1E-9);
  }



  @Test
  public void test11(){
    assertEquals(0.0, solver.getProfit(0,5000) , 1E-9);
  }



  @Test
  public void test12(){
    assertEquals(5000.0, solver.getProfit(5000,0) , 1E-9);
  }



  @Test
  public void test13(){
    assertEquals(0.0, solver.getProfit(1,5000) , 1E-9);
  }



  @Test
  public void test14(){
    assertEquals(4999.00019996, solver.getProfit(5000,1) , 1E-9);
  }



  @Test
  public void test15(){
    assertEquals(4998.000399920013, solver.getProfit(5000,2) , 1E-9);
  }



  @Test
  public void test16(){
    assertEquals(4994.000600240182, solver.getProfit(4997,3) , 1E-9);
  }



  @Test
  public void test17(){
    assertEquals(1698.9961276212473, solver.getProfit(4112,2414) , 1E-9);
  }



  @Test
  public void test18(){
    assertEquals(2008.826383724269, solver.getProfit(4321,2313) , 1E-9);
  }



  @Test
  public void test19(){
    assertEquals(0.0, solver.getProfit(1243,1424) , 1E-9);
  }



  @Test
  public void test20(){
    assertEquals(0.0, solver.getProfit(1244,4312) , 1E-9);
  }



  @Test
  public void test21(){
    assertEquals(4027.027562459711, solver.getProfit(4141,114) , 1E-9);
  }



  @Test
  public void test22(){
    assertEquals(982.2787778158794, solver.getProfit(1313,331) , 1E-9);
  }



  @Test
  public void test23(){
    assertEquals(209.73511834927416, solver.getProfit(4765,4567) , 1E-9);
  }



  @Test
  public void test24(){
    assertEquals(37.605546346158974, solver.getProfit(5000,4999) , 1E-9);
  }



  @Test
  public void test25(){
    assertEquals(36.896526342887306, solver.getProfit(4999,4999) , 1E-9);
  }



  @Test
  public void test26(){
    assertEquals(36.194890582613674, solver.getProfit(4999,5000) , 1E-9);
  }



  @Test
  public void test27(){
    assertEquals(7.767994094275865, solver.getProfit(4950,5000) , 1E-9);
  }



  @Test
  public void test28(){
    assertEquals(1.4266549085142939, solver.getProfit(4920,4990) , 1E-9);
  }



  @Test
  public void test29(){
    assertEquals(0.002145068517158122, solver.getProfit(4917,5000) , 1E-9);
  }



  @Test
  public void test30(){
    assertEquals(27.34304499857498, solver.getProfit(4973,4987) , 1E-9);
  }



  @Test
  public void test31(){
    assertEquals(0.0, solver.getProfit(3415,4311) , 1E-9);
  }



  @Test
  public void test32(){
    assertEquals(237.03978696760726, solver.getProfit(5000,4774) , 1E-9);
  }



  @Test
  public void test33(){
    assertEquals(0.0, solver.getProfit(2562,3514) , 1E-9);
  }



  @Test
  public void test34(){
    assertEquals(0.0, solver.getProfit(1,10) , 1E-9);
  }



  @Test
  public void test35(){
    assertEquals(0.0, solver.getProfit(60,3263) , 1E-9);
  }



  @Test
  public void test36(){
    assertEquals(0.0, solver.getProfit(1,50) , 1E-9);
  }



}

