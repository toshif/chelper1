

package tc.p417_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TemplateMatchingTest {

  TemplateMatching solver; 

  @Before
  public void setUp() {
    solver = new TemplateMatching();
  }

  

  @Test
  public void test0(){
    assertEquals("something", solver.bestMatch("something","awesome","ingenious") );
  }



  @Test
  public void test1(){
    assertEquals("a", solver.bestMatch("havka","eto","papstvo") );
  }



  @Test
  public void test2(){
    assertEquals("abrac", solver.bestMatch("abracadabra","habrahabr","bracket") );
  }



  @Test
  public void test3(){
    assertEquals("ippi", solver.bestMatch("mississippi","promise","piccolo") );
  }



  @Test
  public void test4(){
    assertEquals("a a", solver.bestMatch("a a a a a a","a a","a") );
  }



  @Test
  public void test5(){
    assertEquals("b", solver.bestMatch("ab","b","a") );
  }



}

