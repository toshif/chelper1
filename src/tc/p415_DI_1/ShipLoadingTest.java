

package tc.p415_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShipLoadingTest {

  ShipLoading solver; 

  @Before
  public void setUp() {
    solver = new ShipLoading();
  }

  

  @Test
  public void test0(){
    assertEquals(2, solver.minimumTime(new int[]{6,8,9},new String[]{"2 5 2 4 7"}) );
  }



  @Test
  public void test1(){
    assertEquals(4, solver.minimumTime(new int[]{19,20},new String[]{"14 12 16 19 16 1 5"}) );
  }



  @Test
  public void test2(){
    assertEquals(3, solver.minimumTime(new int[]{23,32,25,28},new String[]{"5 27 10 16 24 20 2 32 18 7"}) );
  }



  @Test
  public void test3(){
    assertEquals(2, solver.minimumTime(new int[]{11,17,5,2,20,7,5,5,20,7},new String[]{"18 18 15 15 17"}) );
  }



  @Test
  public void test4(){
    assertEquals(12, solver.minimumTime(new int[]{56,114,979,120,120,87,480},new String[]{"221 882 504 358 642 674 212 679 203 279 632 799 79","6 502 275 823 372 594 482 343"}) );
  }



}

