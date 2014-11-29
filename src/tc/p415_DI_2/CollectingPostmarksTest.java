

package tc.p415_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollectingPostmarksTest {

  CollectingPostmarks solver; 

  @Before
  public void setUp() {
    solver = new CollectingPostmarks();
  }

  

  @Test
  public void test0(){
    assertEquals(15, solver.amountOfMoney(new int[]{2,15},new int[]{},new int[]{2,21},13) );
  }



  @Test
  public void test1(){
    assertEquals(22, solver.amountOfMoney(new int[]{9,18,7,6,18},new int[]{4,0},new int[]{12,27,10,10,25},67) );
  }



  @Test
  public void test2(){
    assertEquals(0, solver.amountOfMoney(new int[]{14,14,12,6},new int[]{3,2,1},new int[]{19,23,20,7},10) );
  }



  @Test
  public void test3(){
    assertEquals(-1, solver.amountOfMoney(new int[]{43,33,14,31,42,37,17,42,40,20},new int[]{6},new int[]{116,71,38,77,87,106,48,107,91,41},811) );
  }



}

