

package tc.p423_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TheEasyChaseTest {

  TheEasyChase solver; 

  @Before
  public void setUp() {
    solver = new TheEasyChase();
  }

  

  @Test
  public void test0(){
    assertEquals("BLACK 2", solver.winner(2,1,1,2,2) );
  }



  @Test
  public void test1(){
    assertEquals("WHITE 1", solver.winner(2,2,2,1,2) );
  }



  @Test
  public void test2(){
    assertEquals("BLACK 6", solver.winner(3,1,1,3,3) );
  }



}

