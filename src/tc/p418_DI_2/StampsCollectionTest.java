

package tc.p418_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StampsCollectionTest {

  StampsCollection solver; 

  @Before
  public void setUp() {
    solver = new StampsCollection();
  }

  

  @Test
  public void test0(){
    assertEquals(3, solver.sell(10,new String[]{"0 4"},new int[]{3}) );
  }



  @Test
  public void test1(){
    assertEquals(5, solver.sell(2,new String[]{"1 0","0"},new int[]{3,5}) );
  }



  @Test
  public void test2(){
    assertEquals(12, solver.sell(3,new String[]{"0 1","0 2","1 2"},new int[]{10,11,12}) );
  }



  @Test
  public void test3(){
    assertEquals(10, solver.sell(3,new String[]{"0","1 0","1 2"},new int[]{5,9,5}) );
  }



  @Test
  public void test4(){
    assertEquals(40, solver.sell(20,new String[]{"0 1","1 2","2 3","3 0","4 5","5 6","6 4","8","8","9","9 10","10 11","11 12","12"},new int[]{3,7,4,1,3,3,1,5,6,5,18,10,1,5}) );
  }



}

