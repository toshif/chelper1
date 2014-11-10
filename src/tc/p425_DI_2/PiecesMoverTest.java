

package tc.p425_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PiecesMoverTest {

  PiecesMover solver; 

  @Before
  public void setUp() {
    solver = new PiecesMover();
  }

  

  @Test
  public void test0(){
    assertEquals(1, solver.getMinimumMoves(new String[]{".....","..**.",".....","...*.","....."}) );
  }



  @Test
  public void test1(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....",".....",".**..",".*...","**..."}) );
  }



  @Test
  public void test2(){
    assertEquals(12, solver.getMinimumMoves(new String[]{"*...*",".....",".....",".....","*...*"}) );
  }



}

