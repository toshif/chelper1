

package tc.p385_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SummingArithmeticProgressionsTest {

  SummingArithmeticProgressions solver; 

  @Before
  public void setUp() {
    solver = new SummingArithmeticProgressions();
  }

  

  @Test
  public void test0(){
    assertEquals(3, solver.howMany(1,12,3) );
  }



  @Test
  public void test1(){
    assertEquals(8, solver.howMany(1,10,2) );
  }



  @Test
  public void test2(){
    assertEquals(6, solver.howMany(20,30,4) );
  }



  @Test
  public void test3(){
    assertEquals(0, solver.howMany(1,9,4) );
  }



  @Test
  public void test4(){
    assertEquals(1, solver.howMany(1,13,4) );
  }



}

