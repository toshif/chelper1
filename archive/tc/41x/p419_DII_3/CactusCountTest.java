

package tc.p419_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CactusCountTest {

  CactusCount solver; 

  @Before
  public void setUp() {
    solver = new CactusCount();
  }

  

  @Test
  public void test0(){
    assertEquals(1, solver.countCacti(3,new String[]{"1 2,1 3,2 3"}) );
  }



  @Test
  public void test1(){
    assertEquals(10, solver.countCacti(10,new String[]{}) );
  }



  @Test
  public void test2(){
    assertEquals(2, solver.countCacti(5,new String[]{"1 2,3 4,4 5"}) );
  }



  @Test
  public void test3(){
    assertEquals(2, solver.countCacti(17,new String[]{"1 2,2 3,3 4,4 5,5 3,1 3,6 7,7 8,6 8,8 9,9 1","0,10 11,11 9,12 13,14 15,15 16,16 17,14 17,14 16"}) );
  }



}

