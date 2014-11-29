

package tc.p414_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmbassyTest {

  Embassy solver; 

  @Before
  public void setUp() {
    solver = new Embassy();
  }

  

  @Test
  public void test0(){
    assertEquals(12, solver.visaApplication(new int[]{4,4,4},24,8) );
  }



  @Test
  public void test1(){
    assertEquals(28, solver.visaApplication(new int[]{4,4,4,4},24,8) );
  }



  @Test
  public void test2(){
    assertEquals(73, solver.visaApplication(new int[]{2,2,2,2},24,1) );
  }



  @Test
  public void test3(){
    assertEquals(16945, solver.visaApplication(new int[]{25,500,630,2500,1000,350,22,58,100,400,500,5000},1440,360) );
  }



}

