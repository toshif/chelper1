

package tc.p414_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Shape3DTest {

  Shape3D solver; 

  @Before
  public void setUp() {
    solver = new Shape3D();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new String[]{"0 0 0", "0 0 1", "0 1 0", "0 1 1", "1 0 0", "1 0 1", "1 1 0", "1 1 1" }, solver.findCanonical(new String[]{"0 0 0","1 0 0","1 1 0","1 1 1","1 0 1","0 1 1","0 0 1","0 1 0"}) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new String[]{"0 0 0", "0 0 1", "0 1 0" }, solver.findCanonical(new String[]{"100 50 50","100 49 50","100 49 49"}) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new String[]{"0 1 1","1 1 1","2 0 1","2 1 0","2 1 1","2 1 2","2 2 1","3 1 1","4 1 1" }, solver.findCanonical(new String[]{"11 11 11","10 11 11","12 11 11","11 11 10","11 11 12","11 10 11","11 12 11","9 11 11","13 11 11"}) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new String[]{"0 0 0","0 0 1","0 0 2","0 0 3","0 0 4","0 0 5","0 0 6","0 0 7","0 0 8","0 1 8","0 2 8","0 3 8","0 4 8","1 4 8","2 4 8" }, solver.findCanonical(new String[]{"100 900 800","101 900 800","102 900 800","102 899 800","102 898 800","102 897 800","102 896 800","102 896 801","102 896 802","102 896 803","102 896 804","102 896 805","102 896 806","102 896 807","102 896 808"}) );
  }



  /*
  @Test
  public void test4(){
    can't compile
    assertArrayEquals(new String[]{"0 10 10","1 10 10","2 10 10","2 10 11","2 10 12","2 10 8","2 10 9","2 11 10","2 12 10","2 8 10","2 9 10","3 10 10","4 10 10" }, solver.findCanonical() );
  }
  */



}

