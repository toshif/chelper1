

package tc.p420_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RedIsGoodTest {

  RedIsGood solver; 

  @Before
  public void setUp() {
    solver = new RedIsGood();
  }

  

  @Test
  public void test0(){
    assertEquals(0.0, solver.getProfit(0,7) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(4.0, solver.getProfit(4,0) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(4.166666666666667, solver.getProfit(5,1) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.6666666666666666, solver.getProfit(2,2) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(8.324175824175823, solver.getProfit(12,4) , 1E-9);
  }



  @Test
  public void test5(){
    assertEquals(1.075642825339958, solver.getProfit(11,12) , 1E-9);
  }



}

