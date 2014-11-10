

package tc.p428_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TheLongPalindromeTest {

  TheLongPalindrome solver; 

  @Before
  public void setUp() {
    solver = new TheLongPalindrome();
  }

  

  @Test
  public void test0(){
    assertEquals(26, solver.count(1,1) );
  }



  @Test
  public void test1(){
    assertEquals(52, solver.count(2,10) );
  }



  @Test
  public void test2(){
    assertEquals(728, solver.count(3,2) );
  }



  @Test
  public void test3(){
    assertEquals(240249781, solver.count(44,7) );
  }



}

