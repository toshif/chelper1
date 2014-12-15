

package tc.p412_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringsAndTabsTest {

  StringsAndTabs solver; 

  @Before
  public void setUp() {
    solver = new StringsAndTabs();
  }

  

  @Test
  public void test0(){
    assertArrayEquals(new String[]{"-3-5-7-8-A-C-E-F-" }, solver.transformTab(new String[]{"-----------------","-------------0-1-","---------0-2-----","---0-2-3---------","-3---------------","-----------------"},new int[]{28,23,19,14,9,4},new int[]{9},0) );
  }



  @Test
  public void test1(){
    assertArrayEquals(new String[]{"-----------------------------------","-----------------------------------","----00---------------00------------","-223--32-0--02200-223--32-0--020---","----------33---------------33---33-","-----------------------------------" }, solver.transformTab(new String[]{"-4457754-20024422-4457754-20024200-"},new int[]{0},new int[]{28,23,19,14,9,4},12) );
  }



  @Test
  public void test2(){
    assertArrayEquals(new String[]{"-----------------------------------","-001--10-----00---001--10-----0----","---------2002--22---------2002-200-","----00---------------00------------" }, solver.transformTab(new String[]{"-----------------------------------","-----------------------------------","----00---------------00------------","-223--32-0--02200-223--32-0--020---","----------33---------------33---33-","-----------------------------------"},new int[]{28,23,19,14,9,4},new int[]{33,28,24,31},12) );
  }



  @Test
  public void test3(){
    assertArrayEquals(new String[]{"xxx-27-xx-049-999x--7777-777x-","xxx----xx-------5x---------Cx-","xxx3---xx0-----99x--------CCx-" }, solver.transformTab(new String[]{"-----0------2-2222--0-------0-","----0------2---222---5-----55-","---0------2-----22----9---999-","--0------2-------2-----E-EEEE-","-0------2---------------------","0------2----------------------"},new int[]{28,23,19,14,9,4},new int[]{33,28,28},12) );
  }



  @Test
  public void test4(){
    assertArrayEquals(new String[]{"xx0123---WXYZxx" }, solver.transformTab(new String[]{"012345---------","---------UVWXYZ"},new int[]{-2,2},new int[]{0},0) );
  }



  @Test
  public void test5(){
    assertArrayEquals(new String[]{"222222222222", "------------", "555555555555" }, solver.transformTab(new String[]{"0220----02--","75--75----57","------B9B9B9","--242424----"},new int[]{33,28,24,31},new int[]{33,28,28},0) );
  }



}

