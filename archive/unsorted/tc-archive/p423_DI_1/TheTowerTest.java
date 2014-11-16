

package tc.p423_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TheTowerTest {

  TheTower solver; 

  @Before
  public void setUp() {
    solver = new TheTower();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new int[]{0, 1, 3, 10 }, solver.count(new int[]{1, 2, 4, 9},new int[]{1, 1, 1, 1}) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new int[]{0, 2, 3, 4 }, solver.count(new int[]{15, 15, 14, 16},new int[]{14, 16, 15, 15}) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new int[]{0, 0 }, solver.count(new int[]{4, 4},new int[]{7, 7}) );
  }



}

