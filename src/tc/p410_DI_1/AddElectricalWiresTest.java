

package tc.p410_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddElectricalWiresTest {

  AddElectricalWires solver; 

  @Before
  public void setUp() {
    solver = new AddElectricalWires();
  }

  

  @Test
  public void test0(){
    assertEquals(3, solver.maxNewWires(new String[]{"000","000","000"},new int[]{0}) );
  }



  @Test
  public void test1(){
    assertEquals(1, solver.maxNewWires(new String[]{"000","000","000"},new int[]{0,1}) );
  }



  @Test
  public void test2(){
    assertEquals(0, solver.maxNewWires(new String[]{"01","10"},new int[]{0}) );
  }



  @Test
  public void test3(){
    assertEquals(0, solver.maxNewWires(new String[]{"00000","00000","00000","00000","00000"},new int[]{0,1,2,3,4}) );
  }



  @Test
  public void test4(){
    assertEquals(3, solver.maxNewWires(new String[]{"01000","10100","01010","00100","00000"},new int[]{2,4}) );
  }



}

