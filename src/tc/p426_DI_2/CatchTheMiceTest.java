

package tc.p426_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CatchTheMiceTest {

  CatchTheMice solver; 

  @Before
  public void setUp() {
    solver = new CatchTheMice();
  }

  

  @Test
  public void test0(){
    assertEquals(10.0, solver.largestCage(new int[]{0,10},new int[]{0,10},new int[]{10,-10},new int[]{0,0}) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(3.0, solver.largestCage(new int[]{0,10,0},new int[]{0,0,10},new int[]{1,-6,4},new int[]{4,5,-4}) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(40.526315789473685, solver.largestCage(new int[]{50,10,30,15},new int[]{-10,30,20,40},new int[]{-5,-10,-15,-5},new int[]{40,-10,-1,-50}) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(10.0, solver.largestCage(new int[]{0,10,10,0},new int[]{0,0,10,10},new int[]{1,0,-1,0},new int[]{0,1,0,-1}) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(212.78688524590163, solver.largestCage(new int[]{13,50,100,40,-100},new int[]{20,20,-150,-40,63},new int[]{4,50,41,-41,-79},new int[]{1,1,1,3,-1}) , 1E-9);
  }



  @Test
  public void test5(){
    assertEquals(10.0, solver.largestCage(new int[]{0,10},new int[]{0,0},new int[]{5,5},new int[]{3,3}) , 1E-9);
  }



  @Test
  public void test6(){
    assertEquals(25.467532467532468, solver.largestCage(new int[]{-49,-463,-212,-204,-557,-67,-374,-335,-590,-4},new int[]{352,491,280,355,129,78,404,597,553,445},new int[]{-82,57,-23,-32,89,-72,27,17,100,-94},new int[]{-9,-58,9,-14,56,75,-32,-98,-81,-43}) , 1E-9);
  }



}

