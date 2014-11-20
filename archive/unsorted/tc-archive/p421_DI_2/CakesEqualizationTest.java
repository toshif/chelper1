

package tc.p421_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CakesEqualizationTest {

  CakesEqualization solver; 

  @Before
  public void setUp() {
    solver = new CakesEqualization();
  }

  

  @Test
  public void test0(){
    assertEquals(0.0, solver.fairDivision(new int[]{1, 3},2) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(0.0, solver.fairDivision(new int[]{1, 1, 1, 1, 1},4) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(0.5, solver.fairDivision(new int[]{1, 3},1) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.3999999999999999, solver.fairDivision(new int[]{7, 11, 13},10) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(1.4666666666666668, solver.fairDivision(new int[]{13, 69, 41, 37, 80},27) , 1E-9);
  }



}

