

package tc.p410_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClosestRegexTest {

  ClosestRegex solver; 

  @Before
  public void setUp() {
    solver = new ClosestRegex();
  }

  

  @Test
  public void test0(){
    assertEquals("bcdd", solver.closestString("abcd","bcdd") );
  }



  @Test
  public void test1(){
    assertEquals("ttpcodee", solver.closestString("topcoder","t*px*coa*de*") );
  }



  @Test
  public void test2(){
    assertEquals("cfu", solver.closestString("cmu","c*m*fm*u*") );
  }



  @Test
  public void test3(){
    assertEquals("aaaaabccc", solver.closestString("aaaaacccc","a*abc*") );
  }



  @Test
  public void test4(){
    assertEquals("", solver.closestString("short","lo*ts*of*let*ter*s") );
  }



}

