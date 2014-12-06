

package tc.p416_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NextNumberTest {

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
    assertEquals(8, solver.getNextNumber(4) );
  }



  @Test
  public void test2(){
    assertEquals(11, solver.getNextNumber(7) );
  }



  @Test
  public void test3(){
    assertEquals(17, solver.getNextNumber(12) );
  }



  @Test
  public void test4(){
    assertEquals(555557, solver.getNextNumber(555555) );
  }



}

