

package tc.p415_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardsCheatingTest {

  CardsCheating solver; 

  @Before
  public void setUp() {
    solver = new CardsCheating();
  }

  

  @Test
  public void test0(){
    assertEquals(0, solver.numberOfShuffles(new int[]{0,1,2,0,1,2},new int[]{1,4,0,3,2,5}) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.numberOfShuffles(new int[]{2,0,1},new int[]{1,2,0}) );
  }



  @Test
  public void test2(){
    assertEquals(59, solver.numberOfShuffles(new int[]{1,1,2,0,2,0,1,0,2,2,1,0},new int[]{5,0,9,7,1,8,3,10,4,11,6,2}) );
  }



  @Test
  public void test3(){
    assertEquals(-1, solver.numberOfShuffles(new int[]{1,0,2},new int[]{0,2,1}) );
  }



}

