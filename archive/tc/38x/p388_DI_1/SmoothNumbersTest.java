

package tc.p388_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmoothNumbersTest {

  SmoothNumbers solver; 

  @Before
  public void setUp() {
    solver = new SmoothNumbers();
  }

  

  @Test
  public void test0(){
    assertEquals(7, solver.countSmoothNumbers(10,3) );
  }



  @Test
  public void test1(){
    assertEquals(7, solver.countSmoothNumbers(10,4) );
  }



  @Test
  public void test2(){
    assertEquals(8, solver.countSmoothNumbers(15,3) );
  }



  @Test
  public void test3(){
    assertEquals(5, solver.countSmoothNumbers(5,20) );
  }



  @Test
  public void test4(){
    assertEquals(17442, solver.countSmoothNumbers(100000,100) );
  }



}

