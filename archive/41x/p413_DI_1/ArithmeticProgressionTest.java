

package tc.p413_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArithmeticProgressionTest {

  ArithmeticProgression solver; 

  @Before
  public void setUp() {
    solver = new ArithmeticProgression();
  }

  

  @Test
  public void test0(){
    assertEquals(6.75, solver.minCommonDifference(0,new int[]{6, 13, 20, 27}) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(1.0, solver.minCommonDifference(1,new int[]{2, 3, 4, 5, 6}) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(0.0, solver.minCommonDifference(3,new int[]{}) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.2, solver.minCommonDifference(3,new int[]{3, 3, 3, 3, 4}) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(-1.0, solver.minCommonDifference(1,new int[]{-3}) , 1E-9);
  }



  @Test
  public void test5(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 14}) , 1E-9);
  }



}

