

package tc.p416_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DancingCouplesTest {

  DancingCouples solver; 

  @Before
  public void setUp() {
    solver = new DancingCouples();
  }

  

  @Test
  public void test0(){
    assertEquals(24, solver.countPairs(new String[]{"YYYY","YYYY","YYYY"},3) );
  }



  @Test
  public void test1(){
    assertEquals(4, solver.countPairs(new String[]{"YYNN","NYYN","NNYY"},3) );
  }



  @Test
  public void test2(){
    assertEquals(0, solver.countPairs(new String[]{"YY","YY","YY"},3) );
  }



  @Test
  public void test3(){
    assertEquals(112, solver.countPairs(new String[]{"YYNNNN","NYYNNN","NNYYNN","NNNYYN","NNNNYY","YNNNNY"},3) );
  }



}

