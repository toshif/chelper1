

package tc.p417_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CubeNetsTest {

  CubeNets solver; 

  @Before
  public void setUp() {
    solver = new CubeNets();
  }

  

  @Test
  public void test0(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.","####","..#."}) );
  }



  @Test
  public void test1(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###","###"}) );
  }



  @Test
  public void test2(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.","####",".#.."}) );
  }



  @Test
  public void test3(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##..",".##.","..##"}) );
  }



  @Test
  public void test4(){
    assertEquals("NO", solver.isCubeNet(new String[]{"####","...#","...#"}) );
  }



}

