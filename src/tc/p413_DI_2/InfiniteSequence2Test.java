

package tc.p413_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InfiniteSequence2Test {

  InfiniteSequence2 solver; 

  @Before
  public void setUp() {
    solver = new InfiniteSequence2();
  }

  

  @Test
  public void test0(){
    assertEquals(2L, solver.calc(10000000L,2,3,10000000,10000000) );
  }



  @Test
  public void test1(){
    assertEquals(8L, solver.calc(12L,2,3,1,0) );
  }



  @Test
  public void test2(){
    assertEquals(1L, solver.calc(0L,2,2,0,0) );
  }



  @Test
  public void test3(){
    assertEquals(2L, solver.calc(123L,45,67,8,9) );
  }



}

