

package tc.p422_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CavePassageTest {

  CavePassage solver; 

  @Before
  public void setUp() {
    solver = new CavePassage();
  }

  

  @Test
  public void test0(){
    assertEquals(9, solver.minimalTime(new int[]{ 1, 1, 1 },new int[]{ 2, 3, 4 },new String[]{ "YYY", "YYY", "YYY" },2) );
  }



  @Test
  public void test1(){
    assertEquals(10, solver.minimalTime(new int[]{ 1, 1, 1 },new int[]{ 2, 3, 4 },new String[]{ "YYY", "YYY", "NYY" },2) );
  }



  @Test
  public void test2(){
    assertEquals(19, solver.minimalTime(new int[]{ 1, 1, 1 },new int[]{ 7, 13, 19 },new String[]{ "YYN", "NYY", "YNY" },3) );
  }



  @Test
  public void test3(){
    assertEquals(-1, solver.minimalTime(new int[]{ 43 },new int[]{ 23 },new String[]{ "Y" },42) );
  }



}

