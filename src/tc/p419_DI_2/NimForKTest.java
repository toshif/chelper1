

package tc.p419_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NimForKTest {

  NimForK solver; 

  @Before
  public void setUp() {
    solver = new NimForK();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new int[]{2 }, solver.winners(8,2,new String[]{"1", "1 2", "1 2 3", "1 2 3", "1 2 3", "1 2 3", "1 2 3", "1 2 3"}) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new int[]{1 }, solver.winners(7,2,new String[]{"1", "1 2", "1 2 3", "1 2 3", "1 2 3", "1 2 3", "1 2 3"}) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new int[]{2, 3 }, solver.winners(5,3,new String[]{"1", "1 2", "1 2 3", "1 2 3", "1 2 3"}) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new int[]{1, 3 }, solver.winners(6,3,new String[]{"1", "1 2", "1 2 3", "1 2 3", "1 2 3", "1 2 3"}) );
  }



  @Test
  public void test4(){
    assertArrayEquals(new int[]{ }, solver.winners(1,20,new String[]{""}) );
  }



}

