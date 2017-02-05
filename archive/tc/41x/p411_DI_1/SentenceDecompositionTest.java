

package tc.p411_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SentenceDecompositionTest {

  SentenceDecomposition solver; 

  @Before
  public void setUp() {
    solver = new SentenceDecomposition();
  }

  

  @Test
  public void test0(){
    assertEquals(8, solver.decompose("neotowheret",new String[]{"one", "two", "three", "there"}) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.decompose("abba",new String[]{"ab", "ac", "ad"}) );
  }



  @Test
  public void test2(){
    assertEquals(-1, solver.decompose("thisismeaningless",new String[]{"this", "is", "meaningful"}) );
  }



  @Test
  public void test3(){
    assertEquals(10, solver.decompose("ommwreehisymkiml",new String[]{"we", "were", "here", "my", "is", "mom", "here", "si", "milk", "where", "si"}) );
  }



  @Test
  public void test4(){
    assertEquals(8, solver.decompose("ogodtsneeencs",new String[]{"go", "good", "do", "sentences", "tense", "scen"}) );
  }



  @Test
  public void test5(){
    assertEquals(-1, solver.decompose("sepawaterords",new String[]{"separate","words"}) );
  }



}

