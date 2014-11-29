

package tc.p417_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TripleJumpTest {

  TripleJump solver; 

  @Before
  public void setUp() {
    solver = new TripleJump();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new double[]{0.5, 0.5, 0.0, 0.0, 0.0 }, solver.getProbabilities(1,2,1,new int[]{1,2,3,4}) , 1E-9);
  }



  @Test
  public void test1(){
    assertArrayEquals(new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0 }, solver.getProbabilities(3,7,5,new int[]{9,9,19,19,19}) , 1E-9);
  }



  @Test
  public void test2(){
    assertArrayEquals(new double[]{0.9753086419753086, 0.024691358024691357 }, solver.getProbabilities(1,10,1,new int[]{5}) , 1E-9);
  }



  @Test
  public void test3(){
    assertArrayEquals(new double[]{0.22222222222222227, 0.6234567901234567, 0.05555555555555558, 0.043209876543209846, 0.05555555555555558, 0.0, 0.0, 0.0, 0.0 }, solver.getProbabilities(1,10,5,new int[]{1,2,3,5,10,11,12,19}) , 1E-9);
  }



}

