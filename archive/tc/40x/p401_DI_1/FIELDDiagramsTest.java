

package tc.p401_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FIELDDiagramsTest {

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



}

