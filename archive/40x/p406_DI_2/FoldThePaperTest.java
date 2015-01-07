

package tc.p406_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FoldThePaperTest {

  FoldThePaper solver; 

  @Before
  public void setUp() {
    solver = new FoldThePaper();
  }

  

  @Test
  public void test0(){
    assertEquals(6, solver.getValue(new String[]{"1 1 1","1 1 1"}) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.getValue(new String[]{"1 -1","1 -1"}) );
  }



  @Test
  public void test2(){
    assertEquals(4, solver.getValue(new String[]{"1 -1 -1 1","-1 -1 -1 -1","-1 -1 -1 -1","1 -1 -1 1"}) );
  }



  @Test
  public void test3(){
    assertEquals(131, solver.getValue(new String[]{"20 13 -2 100","-12 0 4 -3","4 1 -36 21"}) );
  }



  @Test
  public void test4(){
    assertEquals(0, solver.getValue(new String[]{"0"}) );
  }



}

