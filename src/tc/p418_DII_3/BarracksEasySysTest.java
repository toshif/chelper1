

package tc.p418_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BarracksEasySysTest {

  BarracksEasy solver; 

  @Before
  public void setUp() {
    solver = new BarracksEasy();
  }

  

  @Test
  public void test0(){
    assertEquals(4, solver.attack(10,11,15) );
  }



  @Test
  public void test1(){
    assertEquals(-1, solver.attack(3,10,4) );
  }



  @Test
  public void test2(){
    assertEquals(9, solver.attack(2,10,1) );
  }



  @Test
  public void test3(){
    assertEquals(2, solver.attack(11,12,9) );
  }



  @Test
  public void test4(){
    assertEquals(4, solver.attack(12,32,5) );
  }



  @Test
  public void test5(){
    assertEquals(7, solver.attack(12,44,6) );
  }



  @Test
  public void test6(){
    assertEquals(4, solver.attack(7,10,8) );
  }



  @Test
  public void test7(){
    assertEquals(-1, solver.attack(4,6,7) );
  }



  @Test
  public void test8(){
    assertEquals(2, solver.attack(8,10,6) );
  }



  @Test
  public void test9(){
    assertEquals(3, solver.attack(4,5,5) );
  }



  @Test
  public void test10(){
    assertEquals(4, solver.attack(5,8,5) );
  }



  @Test
  public void test11(){
    assertEquals(2, solver.attack(6,8,4) );
  }



  @Test
  public void test12(){
    assertEquals(3, solver.attack(6,8,6) );
  }



  @Test
  public void test13(){
    assertEquals(1, solver.attack(1,1,2) );
  }



  @Test
  public void test14(){
    assertEquals(1, solver.attack(1,1,3) );
  }



  @Test
  public void test15(){
    assertEquals(-1, solver.attack(1,2,2) );
  }



  @Test
  public void test16(){
    assertEquals(-1, solver.attack(1,2,3) );
  }



  @Test
  public void test17(){
    assertEquals(-1, solver.attack(1,3,1) );
  }



  @Test
  public void test18(){
    assertEquals(-1, solver.attack(1,3,2) );
  }



  @Test
  public void test19(){
    assertEquals(-1, solver.attack(1,3,3) );
  }



  @Test
  public void test20(){
    assertEquals(1, solver.attack(2,1,1) );
  }



  @Test
  public void test21(){
    assertEquals(1, solver.attack(2,1,2) );
  }



  @Test
  public void test22(){
    assertEquals(1, solver.attack(2,1,3) );
  }



  @Test
  public void test23(){
    assertEquals(1, solver.attack(2,2,1) );
  }



  @Test
  public void test24(){
    assertEquals(1, solver.attack(2,2,2) );
  }



  @Test
  public void test25(){
    assertEquals(1, solver.attack(2,2,3) );
  }



  @Test
  public void test26(){
    assertEquals(2, solver.attack(2,3,1) );
  }



  @Test
  public void test27(){
    assertEquals(3, solver.attack(2,3,2) );
  }



  @Test
  public void test28(){
    assertEquals(-1, solver.attack(2,3,3) );
  }



  @Test
  public void test29(){
    assertEquals(1, solver.attack(3,1,1) );
  }



  @Test
  public void test30(){
    assertEquals(1, solver.attack(3,1,2) );
  }



  @Test
  public void test31(){
    assertEquals(1, solver.attack(3,1,3) );
  }



  @Test
  public void test32(){
    assertEquals(1, solver.attack(3,2,1) );
  }



  @Test
  public void test33(){
    assertEquals(1, solver.attack(3,2,2) );
  }



  @Test
  public void test34(){
    assertEquals(1, solver.attack(3,2,3) );
  }



  @Test
  public void test35(){
    assertEquals(1, solver.attack(3,3,1) );
  }



  @Test
  public void test36(){
    assertEquals(1, solver.attack(3,3,2) );
  }



  @Test
  public void test37(){
    assertEquals(1, solver.attack(3,3,3) );
  }



  @Test
  public void test38(){
    assertEquals(49, solver.attack(2,50,1) );
  }



  @Test
  public void test39(){
    assertEquals(16, solver.attack(10,43,8) );
  }



  @Test
  public void test40(){
    assertEquals(10, solver.attack(8,35,5) );
  }



  @Test
  public void test41(){
    assertEquals(11, solver.attack(12,43,9) );
  }



  @Test
  public void test42(){
    assertEquals(17, solver.attack(9,43,7) );
  }



  @Test
  public void test43(){
    assertEquals(10, solver.attack(6,49,1) );
  }



  @Test
  public void test44(){
    assertEquals(13, solver.attack(7,31,5) );
  }



  @Test
  public void test45(){
    assertEquals(10, solver.attack(11,32,9) );
  }



  @Test
  public void test46(){
    assertEquals(11, solver.attack(8,21,7) );
  }



  @Test
  public void test47(){
    assertEquals(13, solver.attack(4,17,3) );
  }



  @Test
  public void test48(){
    assertEquals(17, solver.attack(5,22,4) );
  }



  @Test
  public void test49(){
    assertEquals(12, solver.attack(6,28,4) );
  }



  @Test
  public void test50(){
    assertEquals(22, solver.attack(4,45,2) );
  }



  @Test
  public void test51(){
    assertEquals(22, solver.attack(9,33,8) );
  }



  @Test
  public void test52(){
    assertEquals(12, solver.attack(6,37,3) );
  }



  @Test
  public void test53(){
    assertEquals(21, solver.attack(4,43,2) );
  }



  @Test
  public void test54(){
    assertEquals(10, solver.attack(8,44,4) );
  }



  @Test
  public void test55(){
    assertEquals(18, solver.attack(5,23,4) );
  }



  @Test
  public void test56(){
    assertEquals(17, solver.attack(9,43,7) );
  }



  @Test
  public void test57(){
    assertEquals(16, solver.attack(22,48,21) );
  }



  @Test
  public void test58(){
    assertEquals(13, solver.attack(12,49,9) );
  }



  @Test
  public void test59(){
    assertEquals(1, solver.attack(50,50,50) );
  }



  @Test
  public void test60(){
    assertEquals(1, solver.attack(50,50,49) );
  }



  @Test
  public void test61(){
    assertEquals(1, solver.attack(30,30,50) );
  }



  @Test
  public void test62(){
    assertEquals(-1, solver.attack(30,31,48) );
  }



  @Test
  public void test63(){
    assertEquals(4, solver.attack(30,31,47) );
  }



  @Test
  public void test64(){
    assertEquals(-1, solver.attack(1,50,1) );
  }



  @Test
  public void test65(){
    assertEquals(1, solver.attack(1,1,1) );
  }



  @Test
  public void test66(){
    assertEquals(-1, solver.attack(1,2,1) );
  }



  @Test
  public void test67(){
    assertEquals(1, solver.attack(50,1,1) );
  }



  @Test
  public void test68(){
    assertEquals(1, solver.attack(1,1,50) );
  }



  @Test
  public void test69(){
    assertEquals(-1, solver.attack(1,50,50) );
  }



  @Test
  public void test70(){
    assertEquals(1, solver.attack(50,1,50) );
  }



  @Test
  public void test71(){
    assertEquals(1, solver.attack(50,50,1) );
  }



  @Test
  public void test72(){
    assertEquals(-1, solver.attack(1,31,1) );
  }



  @Test
  public void test73(){
    assertEquals(-1, solver.attack(3,4,42) );
  }



  @Test
  public void test74(){
    assertEquals(-1, solver.attack(3,4,6) );
  }



  @Test
  public void test75(){
    assertEquals(-1, solver.attack(2,3,36) );
  }



  @Test
  public void test76(){
    assertEquals(-1, solver.attack(5,37,5) );
  }



  @Test
  public void test77(){
    assertEquals(-1, solver.attack(12,13,50) );
  }



  @Test
  public void test78(){
    assertEquals(-1, solver.attack(19,23,28) );
  }



  @Test
  public void test79(){
    assertEquals(-1, solver.attack(8,37,8) );
  }



  @Test
  public void test80(){
    assertEquals(-1, solver.attack(5,6,19) );
  }



  @Test
  public void test81(){
    assertEquals(-1, solver.attack(22,35,23) );
  }



  @Test
  public void test82(){
    assertEquals(-1, solver.attack(18,36,18) );
  }



  @Test
  public void test83(){
    assertEquals(-1, solver.attack(21,22,40) );
  }



  @Test
  public void test84(){
    assertEquals(-1, solver.attack(11,12,23) );
  }



  @Test
  public void test85(){
    assertEquals(-1, solver.attack(6,7,45) );
  }



  @Test
  public void test86(){
    assertEquals(-1, solver.attack(23,36,25) );
  }



  @Test
  public void test87(){
    assertEquals(-1, solver.attack(11,24,11) );
  }



  @Test
  public void test88(){
    assertEquals(-1, solver.attack(9,36,9) );
  }



  @Test
  public void test89(){
    assertEquals(-1, solver.attack(2,12,2) );
  }



  @Test
  public void test90(){
    assertEquals(-1, solver.attack(10,26,10) );
  }



  @Test
  public void test91(){
    assertEquals(-1, solver.attack(8,9,18) );
  }



  @Test
  public void test92(){
    assertEquals(4, solver.attack(9,11,12) );
  }



  @Test
  public void test93(){
    assertEquals(6, solver.attack(34,47,42) );
  }



  @Test
  public void test94(){
    assertEquals(6, solver.attack(34,48,41) );
  }



  @Test
  public void test95(){
    assertEquals(4, solver.attack(32,43,40) );
  }



  @Test
  public void test96(){
    assertEquals(4, solver.attack(12,17,14) );
  }



  @Test
  public void test97(){
    assertEquals(4, solver.attack(14,16,20) );
  }



  @Test
  public void test98(){
    assertEquals(4, solver.attack(19,21,28) );
  }



  @Test
  public void test99(){
    assertEquals(4, solver.attack(32,42,41) );
  }



  @Test
  public void test100(){
    assertEquals(5, solver.attack(23,31,29) );
  }



  @Test
  public void test101(){
    assertEquals(4, solver.attack(30,40,38) );
  }



  @Test
  public void test102(){
    assertEquals(5, solver.attack(13,16,18) );
  }



  @Test
  public void test103(){
    assertEquals(6, solver.attack(34,44,45) );
  }



  @Test
  public void test104(){
    assertEquals(4, solver.attack(15,23,16) );
  }



  @Test
  public void test105(){
    assertEquals(4, solver.attack(14,16,20) );
  }



  @Test
  public void test106(){
    assertEquals(5, solver.attack(31,42,39) );
  }



  @Test
  public void test107(){
    assertEquals(6, solver.attack(34,39,50) );
  }



  @Test
  public void test108(){
    assertEquals(4, solver.attack(27,32,38) );
  }



  @Test
  public void test109(){
    assertEquals(4, solver.attack(30,46,32) );
  }



  @Test
  public void test110(){
    assertEquals(4, solver.attack(32,38,45) );
  }



  @Test
  public void test111(){
    assertEquals(4, solver.attack(22,31,26) );
  }



  @Test
  public void test112(){
    assertEquals(3, solver.attack(48,49,48) );
  }



  @Test
  public void test113(){
    assertEquals(3, solver.attack(45,49,45) );
  }



  @Test
  public void test114(){
    assertEquals(3, solver.attack(45,49,50) );
  }



  @Test
  public void test115(){
    assertEquals(2, solver.attack(49,50,47) );
  }



  @Test
  public void test116(){
    assertEquals(3, solver.attack(46,47,48) );
  }



  @Test
  public void test117(){
    assertEquals(3, solver.attack(45,47,45) );
  }



  @Test
  public void test118(){
    assertEquals(2, solver.attack(47,48,45) );
  }



  @Test
  public void test119(){
    assertEquals(3, solver.attack(45,50,46) );
  }



  @Test
  public void test120(){
    assertEquals(3, solver.attack(45,48,46) );
  }



  @Test
  public void test121(){
    assertEquals(3, solver.attack(48,50,48) );
  }



  @Test
  public void test122(){
    assertEquals(3, solver.attack(47,49,49) );
  }



  @Test
  public void test123(){
    assertEquals(3, solver.attack(45,50,50) );
  }



  @Test
  public void test124(){
    assertEquals(3, solver.attack(47,50,48) );
  }



  @Test
  public void test125(){
    assertEquals(2, solver.attack(49,50,48) );
  }



  @Test
  public void test126(){
    assertEquals(3, solver.attack(46,48,49) );
  }



  @Test
  public void test127(){
    assertEquals(3, solver.attack(45,48,49) );
  }



  @Test
  public void test128(){
    assertEquals(2, solver.attack(47,48,45) );
  }



  @Test
  public void test129(){
    assertEquals(3, solver.attack(47,50,49) );
  }



  @Test
  public void test130(){
    assertEquals(3, solver.attack(46,49,49) );
  }



  @Test
  public void test131(){
    assertEquals(3, solver.attack(47,49,48) );
  }



  @Test
  public void test132(){
    assertEquals(1, solver.attack(50,27,48) );
  }



  @Test
  public void test133(){
    assertEquals(-1, solver.attack(10,50,10) );
  }



  @Test
  public void test134(){
    assertEquals(-1, solver.attack(3,40,3) );
  }



  @Test
  public void test135(){
    assertEquals(3, solver.attack(23,43,12) );
  }



  @Test
  public void test136(){
    assertEquals(1, solver.attack(50,21,11) );
  }



  @Test
  public void test137(){
    assertEquals(-1, solver.attack(2,50,2) );
  }



  @Test
  public void test138(){
    assertEquals(4, solver.attack(20,40,11) );
  }



  @Test
  public void test139(){
    assertEquals(6, solver.attack(10,50,2) );
  }



  @Test
  public void test140(){
    assertEquals(10, solver.attack(3,20,1) );
  }



  @Test
  public void test141(){
    assertEquals(-1, solver.attack(20,41,21) );
  }



  @Test
  public void test142(){
    assertEquals(15, solver.attack(3,30,1) );
  }



  @Test
  public void test143(){
    assertEquals(-1, solver.attack(6,50,6) );
  }



  @Test
  public void test144(){
    assertEquals(12, solver.attack(20,50,18) );
  }



  @Test
  public void test145(){
    assertEquals(5, solver.attack(30,50,29) );
  }



  @Test
  public void test146(){
    assertEquals(3, solver.attack(3,4,3) );
  }



  @Test
  public void test147(){
    assertEquals(9, solver.attack(10,50,5) );
  }



  @Test
  public void test148(){
    assertEquals(-1, solver.attack(5,11,5) );
  }



  @Test
  public void test149(){
    assertEquals(3, solver.attack(10,11,11) );
  }



  @Test
  public void test150(){
    assertEquals(7, solver.attack(19,50,14) );
  }



  @Test
  public void test151(){
    assertEquals(37, solver.attack(10,50,9) );
  }



  @Test
  public void test152(){
    assertEquals(8, solver.attack(19,50,15) );
  }



  @Test
  public void test153(){
    assertEquals(-1, solver.attack(1,10,1) );
  }



}

