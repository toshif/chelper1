

package tc.p423_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TheEasyChaseSysTest {

  TheEasyChase solver; 

  @Before
  public void setUp() {
    solver = new TheEasyChase();
  }

  

  @Test
  public void test0(){
    assertEquals("BLACK 2", solver.winner(2,1,1,2,2) );
  }



  @Test
  public void test1(){
    assertEquals("WHITE 1", solver.winner(2,2,2,1,2) );
  }



  @Test
  public void test2(){
    assertEquals("BLACK 6", solver.winner(3,1,1,3,3) );
  }



  @Test
  public void test3(){
    assertEquals("BLACK 8", solver.winner(3,3,2,1,1) );
  }



  @Test
  public void test4(){
    assertEquals("BLACK 8", solver.winner(3,1,2,3,1) );
  }



  @Test
  public void test5(){
    assertEquals("BLACK 6", solver.winner(3,2,2,3,1) );
  }



  @Test
  public void test6(){
    assertEquals("BLACK 22", solver.winner(8,5,4,1,1) );
  }



  @Test
  public void test7(){
    assertEquals("BLACK 14", solver.winner(8,5,1,7,3) );
  }



  @Test
  public void test8(){
    assertEquals("WHITE 1", solver.winner(8,6,4,6,5) );
  }



  @Test
  public void test9(){
    assertEquals("BLACK 8", solver.winner(4,3,2,1,3) );
  }



  @Test
  public void test10(){
    assertEquals("BLACK 42", solver.winner(16,9,13,5,1) );
  }



  @Test
  public void test11(){
    assertEquals("BLACK 36", solver.winner(15,13,12,6,13) );
  }



  @Test
  public void test12(){
    assertEquals("BLACK 30", solver.winner(15,7,5,7,11) );
  }



  @Test
  public void test13(){
    assertEquals("BLACK 20", solver.winner(12,7,1,6,7) );
  }



  @Test
  public void test14(){
    assertEquals("BLACK 36", solver.winner(16,3,9,12,5) );
  }



  @Test
  public void test15(){
    assertEquals("BLACK 30", solver.winner(15,10,4,4,8) );
  }



  @Test
  public void test16(){
    assertEquals("BLACK 28", solver.winner(14,1,7,3,1) );
  }



  @Test
  public void test17(){
    assertEquals("BLACK 24", solver.winner(11,5,4,9,4) );
  }



  @Test
  public void test18(){
    assertEquals("BLACK 30", solver.winner(18,1,1,9,9) );
  }



  @Test
  public void test19(){
    assertEquals("BLACK 20", solver.winner(10,9,7,7,10) );
  }



  @Test
  public void test20(){
    assertEquals("BLACK 34", solver.winner(17,2,2,1,1) );
  }



  @Test
  public void test21(){
    assertEquals("BLACK 30", solver.winner(15,2,2,1,1) );
  }



  @Test
  public void test22(){
    assertEquals("BLACK 38", solver.winner(19,2,2,1,1) );
  }



  @Test
  public void test23(){
    assertEquals("BLACK 40", solver.winner(20,19,2,20,1) );
  }



  @Test
  public void test24(){
    assertEquals("BLACK 56", solver.winner(20,1,20,20,1) );
  }



  @Test
  public void test25(){
    assertEquals("BLACK 54", solver.winner(19,1,19,19,1) );
  }



  @Test
  public void test26(){
    assertEquals("BLACK 56", solver.winner(20,1,1,19,20) );
  }



  @Test
  public void test27(){
    assertEquals("BLACK 58", solver.winner(20,11,11,1,1) );
  }



  @Test
  public void test28(){
    assertEquals("BLACK 58", solver.winner(20,20,19,1,1) );
  }



  @Test
  public void test29(){
    assertEquals("BLACK 46", solver.winner(20,1,17,5,9) );
  }



  @Test
  public void test30(){
    assertEquals("BLACK 42", solver.winner(20,8,12,11,13) );
  }



  @Test
  public void test31(){
    assertEquals("BLACK 46", solver.winner(20,7,5,17,11) );
  }



  @Test
  public void test32(){
    assertEquals("BLACK 28", solver.winner(20,19,9,14,11) );
  }



  @Test
  public void test33(){
    assertEquals("BLACK 58", solver.winner(20,1,2,1,20) );
  }



  @Test
  public void test34(){
    assertEquals("BLACK 56", solver.winner(19,1,2,19,19) );
  }



  @Test
  public void test35(){
    assertEquals("BLACK 52", solver.winner(18,1,1,1,18) );
  }



  @Test
  public void test36(){
    assertEquals("BLACK 34", solver.winner(20,1,1,10,10) );
  }



  @Test
  public void test37(){
    assertEquals("BLACK 56", solver.winner(20,1,1,20,20) );
  }



  @Test
  public void test38(){
    assertEquals("BLACK 54", solver.winner(20,7,14,19,2) );
  }



  @Test
  public void test39(){
    assertEquals("BLACK 2", solver.winner(5,5,5,4,4) );
  }



  @Test
  public void test40(){
    assertEquals("BLACK 56", solver.winner(20,1,1,20,19) );
  }



  @Test
  public void test41(){
    assertEquals("BLACK 50", solver.winner(19,1,1,17,18) );
  }



  @Test
  public void test42(){
    assertEquals("BLACK 54", solver.winner(20,1,2,20,18) );
  }



  @Test
  public void test43(){
    assertEquals("BLACK 56", solver.winner(19,2,9,19,1) );
  }



  @Test
  public void test44(){
    assertEquals("BLACK 54", solver.winner(20,5,7,17,19) );
  }



  @Test
  public void test45(){
    assertEquals("BLACK 50", solver.winner(19,1,3,17,17) );
  }



  @Test
  public void test46(){
    assertEquals("BLACK 40", solver.winner(20,2,2,4,3) );
  }



  @Test
  public void test47(){
    assertEquals("BLACK 56", solver.winner(20,1,20,1,2) );
  }



  @Test
  public void test48(){
    assertEquals("BLACK 40", solver.winner(20,10,10,10,12) );
  }



  @Test
  public void test49(){
    assertEquals("BLACK 44", solver.winner(20,2,5,11,17) );
  }



  @Test
  public void test50(){
    assertEquals("BLACK 36", solver.winner(19,2,5,5,7) );
  }



  @Test
  public void test51(){
    assertEquals("BLACK 58", solver.winner(20,2,3,20,20) );
  }



  @Test
  public void test52(){
    assertEquals("BLACK 56", solver.winner(20,18,19,2,1) );
  }



  @Test
  public void test53(){
    assertEquals("BLACK 8", solver.winner(5,2,1,5,3) );
  }



  @Test
  public void test54(){
    assertEquals("BLACK 20", solver.winner(10,1,1,3,2) );
  }



  @Test
  public void test55(){
    assertEquals("BLACK 12", solver.winner(6,6,3,2,2) );
  }



  @Test
  public void test56(){
    assertEquals("BLACK 54", solver.winner(20,1,1,19,17) );
  }



  @Test
  public void test57(){
    assertEquals("BLACK 48", solver.winner(20,1,1,10,20) );
  }



  @Test
  public void test58(){
    assertEquals("BLACK 52", solver.winner(20,4,7,18,17) );
  }



  @Test
  public void test59(){
    assertEquals("BLACK 40", solver.winner(20,1,1,2,3) );
  }



  @Test
  public void test60(){
    assertEquals("BLACK 46", solver.winner(20,5,6,3,4) );
  }



  @Test
  public void test61(){
    assertEquals("BLACK 52", solver.winner(19,3,4,19,18) );
  }



  @Test
  public void test62(){
    assertEquals("BLACK 40", solver.winner(20,1,1,2,4) );
  }



  @Test
  public void test63(){
    assertEquals("BLACK 40", solver.winner(20,2,2,1,1) );
  }



  @Test
  public void test64(){
    assertEquals("BLACK 14", solver.winner(6,1,1,5,6) );
  }



  @Test
  public void test65(){
    assertEquals("BLACK 58", solver.winner(20,19,20,1,1) );
  }



  @Test
  public void test66(){
    assertEquals("BLACK 48", solver.winner(20,1,1,10,19) );
  }



  @Test
  public void test67(){
    assertEquals("BLACK 54", solver.winner(20,1,1,17,19) );
  }



  @Test
  public void test68(){
    assertEquals("BLACK 6", solver.winner(3,1,1,3,2) );
  }



  @Test
  public void test69(){
    assertEquals("BLACK 40", solver.winner(20,1,1,1,4) );
  }



  @Test
  public void test70(){
    assertEquals("BLACK 40", solver.winner(20,20,20,17,18) );
  }



  @Test
  public void test71(){
    assertEquals("BLACK 40", solver.winner(19,1,8,10,17) );
  }



  @Test
  public void test72(){
    assertEquals("BLACK 54", solver.winner(20,2,20,20,19) );
  }



  @Test
  public void test73(){
    assertEquals("BLACK 40", solver.winner(20,1,1,3,2) );
  }



  @Test
  public void test74(){
    assertEquals("BLACK 46", solver.winner(20,2,6,11,19) );
  }



  @Test
  public void test75(){
    assertEquals("BLACK 52", solver.winner(20,2,3,18,17) );
  }



  @Test
  public void test76(){
    assertEquals("BLACK 54", solver.winner(20,1,1,19,18) );
  }



  @Test
  public void test77(){
    assertEquals("BLACK 48", solver.winner(20,4,15,4,5) );
  }



  @Test
  public void test78(){
    assertEquals("BLACK 50", solver.winner(20,17,3,1,8) );
  }



  @Test
  public void test79(){
    assertEquals("BLACK 6", solver.winner(20,1,1,3,3) );
  }



  @Test
  public void test80(){
    assertEquals("WHITE 1", solver.winner(20,20,20,20,19) );
  }



  @Test
  public void test81(){
    assertEquals("BLACK 18", solver.winner(9,4,4,6,4) );
  }



  @Test
  public void test82(){
    assertEquals("BLACK 48", solver.winner(20,2,3,13,19) );
  }



  @Test
  public void test83(){
    assertEquals("BLACK 56", solver.winner(20,2,3,19,20) );
  }



  @Test
  public void test84(){
    assertEquals("BLACK 6", solver.winner(3,1,1,2,3) );
  }



}

