

package tc.p429_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IngredientProportionsTest {

  IngredientProportions solver; 

  @Before
  public void setUp() {
    solver = new IngredientProportions();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new int[]{3, 2 }, solver.getMasses(new String[]{"#0 and #1 as 6:4"}) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new int[]{81, 72, 64 }, solver.getMasses(new String[]{"#0 and #1 as 9:8","#1 and #2 as 9:8"}) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new int[]{105, 35, 21, 15, 105 }, solver.getMasses(new String[]{"#4 and #0 as 1:1", "#4 and #1 as 3:1", "#4 and #2 as 5:1", "#4 and #3 as 7:1"}) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new int[]{60, 20, 63, 84 }, solver.getMasses(new String[]{"#2 and #3 as 6:8", "#0 and #1 as 9:3", "#3 and #0 as 7:5"}) );
  }



}

