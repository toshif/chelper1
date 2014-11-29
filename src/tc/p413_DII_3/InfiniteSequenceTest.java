

package tc.p413_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InfiniteSequenceTest {

  InfiniteSequence solver; 

  @Before
  public void setUp() {
    solver = new InfiniteSequence();
  }

  

  @Test
  public void test0(){
    assertEquals(1L, solver.calc(0L,2,3) );
  }



  @Test
  public void test1(){
    assertEquals(7L, solver.calc(7L,2,3) );
  }



  @Test
  public void test2(){
    assertEquals(32768L, solver.calc(10000000L,3,3) );
  }



  @Test
  public void test3(){
    assertEquals(89L, solver.calc(256L,2,4) );
  }



  @Test
  public void test4(){
    assertEquals(2L, solver.calc(1L,1000000,1000000) );
  }



}

