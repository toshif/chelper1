

package tc.p418_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BarracksEasyTest {

  BarracksEasy solver; 

  @Before
  public void setUp() {
    solver = new BarracksEasy();
  }

  

  @Test
  public void test0(){
    assertEquals(4, solver.attack(10,11,15) );
  }



  @Test
  public void test1(){
    assertEquals(-1, solver.attack(3,10,4) );
  }



  @Test
  public void test2(){
    assertEquals(9, solver.attack(2,10,1) );
  }



  @Test
  public void test3(){
    assertEquals(2, solver.attack(11,12,9) );
  }



}

