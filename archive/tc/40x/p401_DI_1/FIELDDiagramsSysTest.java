

package tc.p401_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FIELDDiagramsSysTest {

  FIELDDiagrams solver; 

  @Before
  public void setUp() {
    solver = new FIELDDiagrams();
  }

  

  @Test
  public void test0(){
    assertEquals(4L, solver.countDiagrams(2) );
  }



  @Test
  public void test1(){
    assertEquals(13L, solver.countDiagrams(3) );
  }



  @Test
  public void test2(){
    assertEquals(131L, solver.countDiagrams(5) );
  }



  @Test
  public void test3(){
    assertEquals(58785L, solver.countDiagrams(10) );
  }



  @Test
  public void test4(){
    assertEquals(1L, solver.countDiagrams(1) );
  }



  @Test
  public void test5(){
    assertEquals(4L, solver.countDiagrams(2) );
  }



  @Test
  public void test6(){
    assertEquals(13L, solver.countDiagrams(3) );
  }



  @Test
  public void test7(){
    assertEquals(41L, solver.countDiagrams(4) );
  }



  @Test
  public void test8(){
    assertEquals(131L, solver.countDiagrams(5) );
  }



  @Test
  public void test9(){
    assertEquals(428L, solver.countDiagrams(6) );
  }



  @Test
  public void test10(){
    assertEquals(1429L, solver.countDiagrams(7) );
  }



  @Test
  public void test11(){
    assertEquals(4861L, solver.countDiagrams(8) );
  }



  @Test
  public void test12(){
    assertEquals(16795L, solver.countDiagrams(9) );
  }



  @Test
  public void test13(){
    assertEquals(58785L, solver.countDiagrams(10) );
  }



  @Test
  public void test14(){
    assertEquals(208011L, solver.countDiagrams(11) );
  }



  @Test
  public void test15(){
    assertEquals(742899L, solver.countDiagrams(12) );
  }



  @Test
  public void test16(){
    assertEquals(2674439L, solver.countDiagrams(13) );
  }



  @Test
  public void test17(){
    assertEquals(9694844L, solver.countDiagrams(14) );
  }



  @Test
  public void test18(){
    assertEquals(35357669L, solver.countDiagrams(15) );
  }



  @Test
  public void test19(){
    assertEquals(129644789L, solver.countDiagrams(16) );
  }



  @Test
  public void test20(){
    assertEquals(477638699L, solver.countDiagrams(17) );
  }



  @Test
  public void test21(){
    assertEquals(1767263189L, solver.countDiagrams(18) );
  }



  @Test
  public void test22(){
    assertEquals(6564120419L, solver.countDiagrams(19) );
  }



  @Test
  public void test23(){
    assertEquals(24466267019L, solver.countDiagrams(20) );
  }



  @Test
  public void test24(){
    assertEquals(91482563639L, solver.countDiagrams(21) );
  }



  @Test
  public void test25(){
    assertEquals(343059613649L, solver.countDiagrams(22) );
  }



  @Test
  public void test26(){
    assertEquals(1289904147323L, solver.countDiagrams(23) );
  }



  @Test
  public void test27(){
    assertEquals(4861946401451L, solver.countDiagrams(24) );
  }



  @Test
  public void test28(){
    assertEquals(18367353072151L, solver.countDiagrams(25) );
  }



  @Test
  public void test29(){
    assertEquals(69533550916003L, solver.countDiagrams(26) );
  }



  @Test
  public void test30(){
    assertEquals(263747951750359L, solver.countDiagrams(27) );
  }



  @Test
  public void test31(){
    assertEquals(1002242216651367L, solver.countDiagrams(28) );
  }



  @Test
  public void test32(){
    assertEquals(3814986502092303L, solver.countDiagrams(29) );
  }



  @Test
  public void test33(){
    assertEquals(14544636039226908L, solver.countDiagrams(30) );
  }



}

