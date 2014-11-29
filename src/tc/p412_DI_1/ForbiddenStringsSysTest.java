

package tc.p412_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ForbiddenStringsSysTest {

  ForbiddenStrings solver; 

  @Before
  public void setUp() {
    solver = new ForbiddenStrings();
  }

  

  @Test
  public void test0(){
    assertEquals(9L, solver.countNotForbidden(2) );
  }



  @Test
  public void test1(){
    assertEquals(21L, solver.countNotForbidden(3) );
  }



  @Test
  public void test2(){
    assertEquals(51L, solver.countNotForbidden(4) );
  }



  @Test
  public void test3(){
    assertEquals(3L, solver.countNotForbidden(1) );
  }



  @Test
  public void test4(){
    assertEquals(123L, solver.countNotForbidden(5) );
  }



  @Test
  public void test5(){
    assertEquals(10089L, solver.countNotForbidden(10) );
  }



  @Test
  public void test6(){
    assertEquals(67858611L, solver.countNotForbidden(20) );
  }



  @Test
  public void test7(){
    assertEquals(456417007497L, solver.countNotForbidden(30) );
  }



  @Test
  public void test8(){
    assertEquals(297L, solver.countNotForbidden(6) );
  }



  @Test
  public void test9(){
    assertEquals(717L, solver.countNotForbidden(7) );
  }



  @Test
  public void test10(){
    assertEquals(1731L, solver.countNotForbidden(8) );
  }



  @Test
  public void test11(){
    assertEquals(4179L, solver.countNotForbidden(9) );
  }



  @Test
  public void test12(){
    assertEquals(24357L, solver.countNotForbidden(11) );
  }



  @Test
  public void test13(){
    assertEquals(58803L, solver.countNotForbidden(12) );
  }



  @Test
  public void test14(){
    assertEquals(141963L, solver.countNotForbidden(13) );
  }



  @Test
  public void test15(){
    assertEquals(342729L, solver.countNotForbidden(14) );
  }



  @Test
  public void test16(){
    assertEquals(827421L, solver.countNotForbidden(15) );
  }



  @Test
  public void test17(){
    assertEquals(1997571L, solver.countNotForbidden(16) );
  }



  @Test
  public void test18(){
    assertEquals(4822563L, solver.countNotForbidden(17) );
  }



  @Test
  public void test19(){
    assertEquals(11642697L, solver.countNotForbidden(18) );
  }



  @Test
  public void test20(){
    assertEquals(28107957L, solver.countNotForbidden(19) );
  }



  @Test
  public void test21(){
    assertEquals(163825179L, solver.countNotForbidden(21) );
  }



  @Test
  public void test22(){
    assertEquals(395508969L, solver.countNotForbidden(22) );
  }



  @Test
  public void test23(){
    assertEquals(954843117L, solver.countNotForbidden(23) );
  }



  @Test
  public void test24(){
    assertEquals(2305195203L, solver.countNotForbidden(24) );
  }



  @Test
  public void test25(){
    assertEquals(5565233523L, solver.countNotForbidden(25) );
  }



  @Test
  public void test26(){
    assertEquals(13435662249L, solver.countNotForbidden(26) );
  }



  @Test
  public void test27(){
    assertEquals(32436558021L, solver.countNotForbidden(27) );
  }



  @Test
  public void test28(){
    assertEquals(78308778291L, solver.countNotForbidden(28) );
  }



  @Test
  public void test29(){
    assertEquals(189054114603L, solver.countNotForbidden(29) );
  }



}

