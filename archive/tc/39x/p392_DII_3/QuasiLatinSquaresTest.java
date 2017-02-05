

package tc.p392_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuasiLatinSquaresTest {

  QuasiLatinSquares solver; 

  @Before
  public void setUp() {
    solver = new QuasiLatinSquares();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new String[]{"0 1 2", "1 2 0", "2 0 1" }, solver.makeSquare(3,3) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new String[]{"0 0 0 0 1", "0 0 0 0 1", "0 0 0 0 1", "0 0 0 0 1", "1 1 1 1 0" }, solver.makeSquare(5,2) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new String[]{"0 0 1 2 3", "0 0 1 2 3", "1 1 0 3 2", "2 2 3 0 1", "3 3 2 1 0" }, solver.makeSquare(5,4) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new String[]{"0 0 0 1 2 3 4 5 6","0 0 0 1 2 3 4 5 6","0 0 0 1 2 3 4 5 6","1 1 1 0 3 2 5 6 4","2 2 2 3 0 1 6 4 5","3 3 3 4 5 6 0 1 2","4 4 4 2 6 5 1 0 3","5 5 5 6 1 4 2 3 0","6 6 6 5 4 0 3 2 1" }, solver.makeSquare(9,7) );
  }



}

