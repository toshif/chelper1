

package tc.p410_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContiguousCacheTest {

  ContiguousCache solver; 

  @Before
  public void setUp() {
    solver = new ContiguousCache();
  }

  

  @Test
  public void test0(){
    assertEquals(7L, solver.minimumReads(100,3,new int[]{0, 2, 16, 13}) );
  }



  @Test
  public void test1(){
    assertEquals(29L, solver.minimumReads(100,10,new int[]{1,10,19,28,30,37}) );
  }



  @Test
  public void test2(){
    assertEquals(1987654320L, solver.minimumReads(1000000000,500000000,new int[]{0, 999999999, 1, 500000000, 500000001, 987654321}) );
  }



  @Test
  public void test3(){
    assertEquals(2L, solver.minimumReads(8,2,new int[]{7}) );
  }



}

