

package tc.p418_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TwoLotteryGamesTest {

  TwoLotteryGames solver; 

  @Before
  public void setUp() {
    solver = new TwoLotteryGames();
  }

  

  @Test
  public void test0(){
    assertEquals(1.0, solver.getHigherChanceGame(3,2,1) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(0.3333333333333333, solver.getHigherChanceGame(3,1,1) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(0.4642857142857143, solver.getHigherChanceGame(8,2,1) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.7571428571428571, solver.getHigherChanceGame(8,4,2) , 1E-9);
  }



}

