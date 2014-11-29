

package tc.p419_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UndoTest {

  Undo solver; 

  @Before
  public void setUp() {
    solver = new Undo();
  }

  

  @Test
  public void test0(){
    assertEquals("a", solver.getText(new String[]{"type a", "type b", "type c", "undo 3"},new int[]{1, 2, 3, 5}) );
  }



  @Test
  public void test1(){
    assertEquals("a", solver.getText(new String[]{"type a", "type b", "undo 2", "undo 2"},new int[]{1,2,3,4}) );
  }



  @Test
  public void test2(){
    assertEquals("a", solver.getText(new String[]{"type a", "undo 1", "undo 1"},new int[]{1,2,3}) );
  }



  @Test
  public void test3(){
    assertEquals("abc", solver.getText(new String[]{"type a", "type b", "type c", "undo 10"},new int[]{1, 2, 3, 1000}) );
  }



  @Test
  public void test4(){
    assertEquals("", solver.getText(new String[]{"undo 1"},new int[]{1}) );
  }



}

