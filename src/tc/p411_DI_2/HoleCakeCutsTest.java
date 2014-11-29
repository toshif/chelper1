

package tc.p411_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HoleCakeCutsTest {

  HoleCakeCuts solver; 

  @Before
  public void setUp() {
    solver = new HoleCakeCuts();
  }

  

  @Test
  public void test0(){
    assertEquals(6, solver.cutTheCake(5,3,new int[]{1, -4},new int[]{1}) );
  }



  @Test
  public void test1(){
    assertEquals(4, solver.cutTheCake(10,5,new int[]{},new int[]{-2, 2}) );
  }



  @Test
  public void test2(){
    assertEquals(6, solver.cutTheCake(10,5,new int[]{1},new int[]{-5, 5}) );
  }



  @Test
  public void test3(){
    assertEquals(12, solver.cutTheCake(50,5,new int[]{40, -40},new int[]{20, 0, -20}) );
  }



}

