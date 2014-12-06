

package tc.p416_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomDiceSysTest {

  CustomDice solver; 

  @Before
  public void setUp() {
    solver = new CustomDice();
  }

  

  @Test
  public void test0(){
    assertEquals(0, solver.countDice(3) );
  }



  @Test
  public void test1(){
    assertEquals(210, solver.countDice(4) );
  }



  @Test
  public void test2(){
    assertEquals(863010, solver.countDice(10) );
  }



  @Test
  public void test3(){
    assertEquals(101548350, solver.countDice(20) );
  }



  @Test
  public void test4(){
    assertEquals(375588112, solver.countDice(50) );
  }



  @Test
  public void test5(){
    assertEquals(196717870, solver.countDice(100) );
  }



  @Test
  public void test6(){
    assertEquals(665802632, solver.countDice(200) );
  }



  @Test
  public void test7(){
    assertEquals(879053231, solver.countDice(500) );
  }



  @Test
  public void test8(){
    assertEquals(962358859, solver.countDice(1000) );
  }



  @Test
  public void test9(){
    assertEquals(132854201, solver.countDice(2000) );
  }



  @Test
  public void test10(){
    assertEquals(526200842, solver.countDice(5000) );
  }



  @Test
  public void test11(){
    assertEquals(276610130, solver.countDice(10000) );
  }



  @Test
  public void test12(){
    assertEquals(792436673, solver.countDice(20000) );
  }



  @Test
  public void test13(){
    assertEquals(241849830, solver.countDice(25000) );
  }



  @Test
  public void test14(){
    assertEquals(782989301, solver.countDice(50000) );
  }



  @Test
  public void test15(){
    assertEquals(110520781, solver.countDice(100000) );
  }



  @Test
  public void test16(){
    assertEquals(503092938, solver.countDice(125013) );
  }



  @Test
  public void test17(){
    assertEquals(826840433, solver.countDice(249850) );
  }



  @Test
  public void test18(){
    assertEquals(996281693, solver.countDice(312000) );
  }



  @Test
  public void test19(){
    assertEquals(19525097, solver.countDice(555222) );
  }



  @Test
  public void test20(){
    assertEquals(942200740, solver.countDice(555123) );
  }



  @Test
  public void test21(){
    assertEquals(543105712, solver.countDice(800000) );
  }



  @Test
  public void test22(){
    assertEquals(174984532, solver.countDice(900000) );
  }



  @Test
  public void test23(){
    assertEquals(484722537, solver.countDice(950000) );
  }



  @Test
  public void test24(){
    assertEquals(34356100, solver.countDice(999999) );
  }



  @Test
  public void test25(){
    assertEquals(432413968, solver.countDice(1000000) );
  }



  @Test
  public void test26(){
    assertEquals(0, solver.countDice(1) );
  }



  @Test
  public void test27(){
    assertEquals(0, solver.countDice(2) );
  }



  @Test
  public void test28(){
    assertEquals(2700, solver.countDice(5) );
  }



  @Test
  public void test29(){
    assertEquals(14940, solver.countDice(6) );
  }



  @Test
  public void test30(){
    assertEquals(55320, solver.countDice(7) );
  }



  @Test
  public void test31(){
    assertEquals(160590, solver.countDice(8) );
  }



  @Test
  public void test32(){
    assertEquals(395280, solver.countDice(9) );
  }



  @Test
  public void test33(){
    assertEquals(12748786, solver.countDice(999996) );
  }



  @Test
  public void test34(){
    assertEquals(698655835, solver.countDice(999987) );
  }



  @Test
  public void test35(){
    assertEquals(782682397, solver.countDice(134351) );
  }



}

