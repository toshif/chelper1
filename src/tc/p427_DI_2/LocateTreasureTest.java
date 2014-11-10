

package tc.p427_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocateTreasureTest {

  LocateTreasure solver; 

  @Before
  public void setUp() {
    solver = new LocateTreasure();
  }

  

  @Test
  public void test0(){
    assertEquals("-6 4", solver.location(5,2) );
  }



  @Test
  public void test1(){
    assertEquals("1 0", solver.location(99,1) );
  }



  @Test
  public void test2(){
    assertEquals("9 1", solver.location(6,9) );
  }



}

