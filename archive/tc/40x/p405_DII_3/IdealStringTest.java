

package tc.p405_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IdealStringTest {

  IdealString solver; 

  @Before
  public void setUp() {
    solver = new IdealString();
  }

  

  @Test
  public void test0(){
    assertEquals("A", solver.construct(1) );
  }



  @Test
  public void test1(){
    assertEquals("ABB", solver.construct(3) );
  }



  @Test
  public void test2(){
    assertEquals("", solver.construct(2) );
  }



  @Test
  public void test3(){
    assertEquals("ABCBCC", solver.construct(6) );
  }



  @Test
  public void test4(){
    assertEquals("ABBCCCC", solver.construct(7) );
  }



  @Test
  public void test5(){
    assertEquals("", solver.construct(5) );
  }



}

