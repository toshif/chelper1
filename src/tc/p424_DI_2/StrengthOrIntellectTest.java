

package tc.p424_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrengthOrIntellectTest {

  StrengthOrIntellect solver; 

  @Before
  public void setUp() {
    solver = new StrengthOrIntellect();
  }

  

  @Test
  public void test0(){
    assertEquals(2, solver.numberOfMissions(new int[]{1, 2},new int[]{1, 2},new int[]{1, 2}) );
  }



  @Test
  public void test1(){
    assertEquals(0, solver.numberOfMissions(new int[]{3},new int[]{2},new int[]{1}) );
  }



  @Test
  public void test2(){
    assertEquals(4, solver.numberOfMissions(new int[]{1, 3, 1, 10, 3},new int[]{1, 1, 3, 20, 3},new int[]{2, 1, 1, 5, 1}) );
  }



  @Test
  public void test3(){
    assertEquals(9, solver.numberOfMissions(new int[]{1, 2, 100, 5, 100, 10, 100, 17, 100},new int[]{1, 100, 3, 100, 7, 100, 13, 100, 21},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1}) );
  }



  @Test
  public void test4(){
    assertEquals(7, solver.numberOfMissions(new int[]{1, 10, 1, 2, 16, 12, 13, 19, 12, 8},new int[]{1, 5, 1, 8, 3, 5, 3, 16, 19, 20},new int[]{1, 1, 1, 2, 1, 1, 2, 3, 5, 1}) );
  }



}

