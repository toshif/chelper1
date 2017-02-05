

package tc.p416_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomDiceTest {

  CustomDice solver; 

  @Before
  public void setUp() {
    solver = new CustomDice();
  }

  

  @Test
  public void test0(){
    assertEquals(0, solver.countDice(3) );
  }



  @Test
  public void test1(){
    assertEquals(210, solver.countDice(4) );
  }



  @Test
  public void test2(){
    assertEquals(863010, solver.countDice(10) );
  }



  @Test
  public void test3(){
    assertEquals(375588112, solver.countDice(50) );
  }



}

