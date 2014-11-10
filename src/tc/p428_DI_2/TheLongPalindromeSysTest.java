

package tc.p428_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TheLongPalindromeSysTest {

  TheLongPalindrome solver; 

  @Before
  public void setUp() {
    solver = new TheLongPalindrome();
  }

  

  @Test
  public void test0(){
    assertEquals(26, solver.count(1,1) );
  }



  @Test
  public void test1(){
    assertEquals(52, solver.count(2,10) );
  }



  @Test
  public void test2(){
    assertEquals(728, solver.count(3,2) );
  }



  @Test
  public void test3(){
    assertEquals(240249781, solver.count(44,7) );
  }



  @Test
  public void test4(){
    assertEquals(502499513, solver.count(1000000000,26) );
  }



  @Test
  public void test5(){
    assertEquals(555594822, solver.count(999999999,25) );
  }



  @Test
  public void test6(){
    assertEquals(1209505107, solver.count(23,23) );
  }



  @Test
  public void test7(){
    assertEquals(923760996, solver.count(40,19) );
  }



  @Test
  public void test8(){
    assertEquals(1161532321, solver.count(39,19) );
  }



  @Test
  public void test9(){
    assertEquals(74074289, solver.count(1000000000,1) );
  }



  @Test
  public void test10(){
    assertEquals(808142191, solver.count(757148,26) );
  }



  @Test
  public void test11(){
    assertEquals(903541512, solver.count(301413357,26) );
  }



  @Test
  public void test12(){
    assertEquals(801376963, solver.count(659598369,26) );
  }



  @Test
  public void test13(){
    assertEquals(1084608896, solver.count(391749388,26) );
  }



  @Test
  public void test14(){
    assertEquals(998485394, solver.count(35766291,26) );
  }



  @Test
  public void test15(){
    assertEquals(754312177, solver.count(473038165,26) );
  }



  @Test
  public void test16(){
    assertEquals(1134947060, solver.count(3615545,26) );
  }



  @Test
  public void test17(){
    assertEquals(854429520, solver.count(392289611,26) );
  }



  @Test
  public void test18(){
    assertEquals(1020182844, solver.count(170427799,26) );
  }



  @Test
  public void test19(){
    assertEquals(298581589, solver.count(675016434,26) );
  }



  @Test
  public void test20(){
    assertEquals(647481233, solver.count(100757147,19) );
  }



  @Test
  public void test21(){
    assertEquals(1150834273, solver.count(401413356,23) );
  }



  @Test
  public void test22(){
    assertEquals(706606893, solver.count(759598368,14) );
  }



  @Test
  public void test23(){
    assertEquals(15745476, solver.count(491749387,18) );
  }



  @Test
  public void test24(){
    assertEquals(384108829, solver.count(135766290,9) );
  }



  @Test
  public void test25(){
    assertEquals(333945499, solver.count(573038164,21) );
  }



  @Test
  public void test26(){
    assertEquals(480834182, solver.count(103615544,23) );
  }



  @Test
  public void test27(){
    assertEquals(198470272, solver.count(1000000000,20) );
  }



  @Test
  public void test28(){
    assertEquals(517605484, solver.count(999999999,17) );
  }



  @Test
  public void test29(){
    assertEquals(652883421, solver.count(999999999,16) );
  }



  @Test
  public void test30(){
    assertEquals(198470272, solver.count(1000000000,20) );
  }



  @Test
  public void test31(){
    assertEquals(1126070080, solver.count(147,7) );
  }



  @Test
  public void test32(){
    assertEquals(1049716493, solver.count(999999999,23) );
  }



  @Test
  public void test33(){
    assertEquals(318667120, solver.count(999999999,11) );
  }



  @Test
  public void test34(){
    assertEquals(522071800, solver.count(999999999,26) );
  }



  @Test
  public void test35(){
    assertEquals(1232051448, solver.count(1000000000,23) );
  }



  @Test
  public void test36(){
    assertEquals(460019892, solver.count(1000000000,25) );
  }



  @Test
  public void test37(){
    assertEquals(389687257, solver.count(1000000000,15) );
  }



  @Test
  public void test38(){
    assertEquals(482302736, solver.count(1000000000,10) );
  }



  @Test
  public void test39(){
    assertEquals(1222160695, solver.count(999999973,25) );
  }



  @Test
  public void test40(){
    assertEquals(868920764, solver.count(1000000000,19) );
  }



  @Test
  public void test41(){
    assertEquals(946932112, solver.count(574857047,23) );
  }



  @Test
  public void test42(){
    assertEquals(138511467, solver.count(999999997,23) );
  }



  @Test
  public void test43(){
    assertEquals(776103748, solver.count(51,12) );
  }



}

