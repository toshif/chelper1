

package tc.p416_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NextNumberSysTest {

  NextNumber solver; 

  @Before
  public void setUp() {
    solver = new NextNumber();
  }

  

  @Test
  public void test0(){
    assertEquals(1718, solver.getNextNumber(1717) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.getNextNumber(1) );
  }



  @Test
  public void test2(){
    assertEquals(4, solver.getNextNumber(2) );
  }



  @Test
  public void test3(){
    assertEquals(8, solver.getNextNumber(4) );
  }



  @Test
  public void test4(){
    assertEquals(2048, solver.getNextNumber(1024) );
  }



  @Test
  public void test5(){
    assertEquals(2097152, solver.getNextNumber(1048576) );
  }



  @Test
  public void test6(){
    assertEquals(536870912, solver.getNextNumber(268435456) );
  }



  @Test
  public void test7(){
    assertEquals(671088639, solver.getNextNumber(536870910) );
  }



  @Test
  public void test8(){
    assertEquals(805306367, solver.getNextNumber(536870911) );
  }



  @Test
  public void test9(){
    assertEquals(1073741824, solver.getNextNumber(536870912) );
  }



  @Test
  public void test10(){
    assertEquals(1073741825, solver.getNextNumber(805306368) );
  }



  @Test
  public void test11(){
    assertEquals(989855743, solver.getNextNumber(973078527) );
  }



  @Test
  public void test12(){
    assertEquals(939524095, solver.getNextNumber(805306367) );
  }



  @Test
  public void test13(){
    assertEquals(1073741827, solver.getNextNumber(939524096) );
  }



  @Test
  public void test14(){
    assertEquals(335544319, solver.getNextNumber(268435454) );
  }



  @Test
  public void test15(){
    assertEquals(402653183, solver.getNextNumber(268435455) );
  }



  @Test
  public void test16(){
    assertEquals(500000256, solver.getNextNumber(500000000) );
  }



  @Test
  public void test17(){
    assertEquals(800002048, solver.getNextNumber(800000000) );
  }



  @Test
  public void test18(){
    assertEquals(900000256, solver.getNextNumber(900000000) );
  }



  @Test
  public void test19(){
    assertEquals(999990023, solver.getNextNumber(999990000) );
  }



  @Test
  public void test20(){
    assertEquals(1000000255, solver.getNextNumber(999999999) );
  }



  @Test
  public void test21(){
    assertEquals(1000000512, solver.getNextNumber(1000000000) );
  }



  @Test
  public void test22(){
    assertEquals(11, solver.getNextNumber(7) );
  }



  @Test
  public void test23(){
    assertEquals(17, solver.getNextNumber(12) );
  }



  @Test
  public void test24(){
    assertEquals(555557, solver.getNextNumber(555555) );
  }



  @Test
  public void test25(){
    assertEquals(536870915, solver.getNextNumber(469762048) );
  }



  @Test
  public void test26(){
    assertEquals(57, solver.getNextNumber(54) );
  }



  @Test
  public void test27(){
    assertEquals(49, solver.getNextNumber(44) );
  }



  @Test
  public void test28(){
    assertEquals(67108864, solver.getNextNumber(33554432) );
  }



  @Test
  public void test29(){
    assertEquals(25, solver.getNextNumber(22) );
  }



  @Test
  public void test30(){
    assertEquals(249209945, solver.getNextNumber(249209942) );
  }



  @Test
  public void test31(){
    assertEquals(536870913, solver.getNextNumber(402653184) );
  }



  @Test
  public void test32(){
    assertEquals(7663683, solver.getNextNumber(7663672) );
  }



  @Test
  public void test33(){
    assertEquals(805306368, solver.getNextNumber(671088640) );
  }



  @Test
  public void test34(){
    assertEquals(5354380, solver.getNextNumber(5354378) );
  }



  @Test
  public void test35(){
    assertEquals(134217728, solver.getNextNumber(67108864) );
  }



  @Test
  public void test36(){
    assertEquals(949209945, solver.getNextNumber(949209942) );
  }



  @Test
  public void test37(){
    assertEquals(268443647, solver.getNextNumber(268419072) );
  }



  @Test
  public void test38(){
    assertEquals(555555687, solver.getNextNumber(555555678) );
  }



  @Test
  public void test39(){
    assertEquals(71, solver.getNextNumber(60) );
  }



  @Test
  public void test40(){
    assertEquals(805240897, solver.getNextNumber(805240880) );
  }



  @Test
  public void test41(){
    assertEquals(103, solver.getNextNumber(94) );
  }



  @Test
  public void test42(){
    assertEquals(51, solver.getNextNumber(46) );
  }



  @Test
  public void test43(){
    assertEquals(97, solver.getNextNumber(88) );
  }



  @Test
  public void test44(){
    assertEquals(536887295, solver.getNextNumber(536854528) );
  }



  @Test
  public void test45(){
    assertEquals(96, solver.getNextNumber(80) );
  }



  @Test
  public void test46(){
    assertEquals(23, solver.getNextNumber(15) );
  }



  @Test
  public void test47(){
    assertEquals(201326591, solver.getNextNumber(134217727) );
  }



  @Test
  public void test48(){
    assertEquals(1721, solver.getNextNumber(1718) );
  }



  @Test
  public void test49(){
    assertEquals(33, solver.getNextNumber(24) );
  }



  @Test
  public void test50(){
    assertEquals(838860799, solver.getNextNumber(805306364) );
  }



  @Test
  public void test51(){
    assertEquals(355, solver.getNextNumber(348) );
  }



  @Test
  public void test52(){
    assertEquals(99, solver.getNextNumber(92) );
  }



  @Test
  public void test53(){
    assertEquals(35, solver.getNextNumber(28) );
  }



  @Test
  public void test54(){
    assertEquals(6482145, solver.getNextNumber(6482136) );
  }



  @Test
  public void test55(){
    assertEquals(931, solver.getNextNumber(924) );
  }



  @Test
  public void test56(){
    assertEquals(81, solver.getNextNumber(76) );
  }



  @Test
  public void test57(){
    assertEquals(40, solver.getNextNumber(36) );
  }



  @Test
  public void test58(){
    assertEquals(2063, solver.getNextNumber(1984) );
  }



  @Test
  public void test59(){
    assertEquals(1571, solver.getNextNumber(1564) );
  }



  @Test
  public void test60(){
    assertEquals(327, solver.getNextNumber(316) );
  }



  @Test
  public void test61(){
    assertEquals(195, solver.getNextNumber(184) );
  }



  @Test
  public void test62(){
    assertEquals(1039, solver.getNextNumber(992) );
  }



}

