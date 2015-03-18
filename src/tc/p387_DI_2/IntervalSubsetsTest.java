

package tc.p387_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntervalSubsetsTest {

  IntervalSubsets solver; 

  @Before
  public void setUp() {
    solver = new IntervalSubsets();
  }

  

  @Test
  public void test0(){
    assertEquals(1, solver.numberOfSubsets(new int[]{68,25},new int[]{75,64}) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.numberOfSubsets(new int[]{4,2,3},new int[]{4,5,3}) );
  }



  @Test
  public void test2(){
    assertEquals(5, solver.numberOfSubsets(new int[]{3,4,3,2,1},new int[]{4,5,4,5,5}) );
  }



  @Test
  public void test3(){
    assertEquals(14, solver.numberOfSubsets(new int[]{2,3,4,4,4,4,2,2,1},new int[]{3,5,4,5,4,5,3,2,4}) );
  }



  @Test
  public void test4(){
    assertEquals(4, solver.numberOfSubsets(new int[]{1, 1, 3, 3},new int[]{2, 2, 4, 4}) );
  }



}

