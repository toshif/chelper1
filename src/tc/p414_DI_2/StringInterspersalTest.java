

package tc.p414_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringInterspersalTest {

  StringInterspersal solver; 

  @Before
  public void setUp() {
    solver = new StringInterspersal();
  }

  

  @Test
  public void test0(){
    assertEquals("ADELGMAORARISIGNTHMTHON", solver.minimum(new String[]{"DESIGN","ALGORITHM","MARATHON"}) );
  }



  @Test
  public void test1(){
    assertEquals("ABCKPERIJGERRTJETOMEKTRURUNDUKUSH", solver.minimum(new String[]{"TOMEK","PETR","ACRUSH","BURUNDUK","KRIJGERTJE"}) );
  }



  @Test
  public void test2(){
    assertEquals("CCCACCCBCCCCCCDE", solver.minimum(new String[]{"CCCA","CCCB","CCCD","CCCE"}) );
  }



  @Test
  public void test3(){
    assertEquals("BDDKLODEPODEEEQQSDSOPTDDVNKLWRTXX", solver.minimum(new String[]{"BKSDSOPTDD","DDODEVNKL","XX","PODEEE","LQQWRT"}) );
  }



  @Test
  public void test4(){
    assertEquals("BBELILLNSATFAIRTOPCODERTY", solver.minimum(new String[]{"TOPCODER","BETFAIR","NSA","BT","LILLY"}) );
  }



  @Test
  public void test5(){
    assertEquals("ABHKGLKMAQIQQTHSQARQTJEAMVYICVNIKKYLHVGMLRYZZFFEWC", solver.minimum(new String[]{"QITHSQARQV","BYLHVGMLRY","LKMAQTJEAM","AQYICVNIKK","HKGZZFFEWC"}) );
  }



  @Test
  public void test6(){
    assertEquals("BEKBILMINMNDHMOOIOSADSPOFAKSSNTCXBDHPJUQXHCYBTUQUW", solver.minimum(new String[]{"XHCYBTUQUW","EKBISADSSN","LOOISPOFAK","MIXBDHPJUQ","BNMNDHMOTC"}) );
  }



}

