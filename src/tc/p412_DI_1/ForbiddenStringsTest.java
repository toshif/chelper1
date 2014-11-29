

package tc.p412_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ForbiddenStringsTest {

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



}

