

package tc.p424_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BestRoadsTest {

  BestRoads solver; 

  @Before
  public void setUp() {
    solver = new BestRoads();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new int[]{4, 4, 4, 4, 4 }, solver.numberOfRoads(new String[]{"NYYYY","YNYYY","YYNYY","YYYNY","YYYYN"},10) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new int[]{2, 1, 1 }, solver.numberOfRoads(new String[]{"NYY","YNY","YYN"},2) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new int[]{ }, solver.numberOfRoads(new String[]{"NYNNY","YNNNY","NNNNN","NNNNY","YYNYN"},4) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new int[]{5, 3, 2, 2, 2, 2, 3, 1 }, solver.numberOfRoads(new String[]{"NYYNYYYN","YNNNNYYN","YNNNYNNN","NNNNNNYY","YNYNNNNN","YYNNNNYY","YYNYNYNY","NNNYNYYN"},10) );
  }



  @Test
  public void test4(){
    assertArrayEquals(new int[]{ }, solver.numberOfRoads(new String[]{"NNYY","NNYY","YYNN","YYNN"},5) );
  }



}

