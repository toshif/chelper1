

package tc.p410_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClosestRegexSysTest {

  ClosestRegex solver; 

  @Before
  public void setUp() {
    solver = new ClosestRegex();
  }

  

  @Test
  public void test0(){
    assertEquals("bcdd", solver.closestString("abcd","bcdd") );
  }



  @Test
  public void test1(){
    assertEquals("ttpcodee", solver.closestString("topcoder","t*px*coa*de*") );
  }



  @Test
  public void test2(){
    assertEquals("cfu", solver.closestString("cmu","c*m*fm*u*") );
  }



  @Test
  public void test3(){
    assertEquals("aaaaabccc", solver.closestString("aaaaacccc","a*abc*") );
  }



  @Test
  public void test4(){
    assertEquals("", solver.closestString("short","lo*ts*of*let*ter*s") );
  }



  @Test
  public void test5(){
    assertEquals("def", solver.closestString("abc","def") );
  }



  @Test
  public void test6(){
    assertEquals("", solver.closestString("abc","ab") );
  }



  @Test
  public void test7(){
    assertEquals("acd", solver.closestString("abc","ab*cd") );
  }



  @Test
  public void test8(){
    assertEquals("abb", solver.closestString("cbc","a*b*") );
  }



  @Test
  public void test9(){
    assertEquals("bcde", solver.closestString("acde","a*bcde*") );
  }



  @Test
  public void test10(){
    assertEquals("a", solver.closestString("z","a*") );
  }



  @Test
  public void test11(){
    assertEquals("z", solver.closestString("a","z*") );
  }



  @Test
  public void test12(){
    assertEquals("p", solver.closestString("p","p*") );
  }



  @Test
  public void test13(){
    assertEquals("x", solver.closestString("x","x") );
  }



  @Test
  public void test14(){
    assertEquals("y", solver.closestString("x","y") );
  }



  @Test
  public void test15(){
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaabababababababababababab", solver.closestString("ababababababababababababababababababababababababab","a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*") );
  }



  @Test
  public void test16(){
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", solver.closestString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*") );
  }



  @Test
  public void test17(){
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", solver.closestString("ababababababababababababababababababababababababab","a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*") );
  }



  @Test
  public void test18(){
    assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx", solver.closestString("bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxa","abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx") );
  }



  @Test
  public void test19(){
    assertEquals("ca", solver.closestString("cb","c*ca*") );
  }



  @Test
  public void test20(){
    assertEquals("oa", solver.closestString("qq","o*ot*a*a*p*a*n*") );
  }



  @Test
  public void test21(){
    assertEquals("cbaaaaaaaa", solver.closestString("bbbcaabcbc","c*cba*a") );
  }



  @Test
  public void test22(){
    assertEquals("ecccceee", solver.closestString("cbdaaeed","e*e*ec*ee*") );
  }



  @Test
  public void test23(){
    assertEquals("gffha", solver.closestString("deeia","g*gf*ha*f*") );
  }



  @Test
  public void test24(){
    assertEquals("baadadcc", solver.closestString("bdadddca","b*bc*a*d*adc*c") );
  }



  @Test
  public void test25(){
    assertEquals("oooodllloodllloodllloodlpodflp", solver.closestString("ggooglegooglegooglegoogleoogle","o*df*l*o*df*l*p*o*df*l*o*df*l*podfl*p*p*p") );
  }



  @Test
  public void test26(){
    assertEquals("aaaaabbbbdddddddddddddddddddddddddddddddddd", solver.closestString("adadfbbasdfasdbfadfasdfqadfadfbadsfbadfadfd","a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*r*s*t*u*v*") );
  }



  @Test
  public void test27(){
    assertEquals("ltoleteealsasraa", solver.closestString("shortestotnakraj","lo*ts*of*let*ter*s*ealsr*asra*a*") );
  }



  @Test
  public void test28(){
    assertEquals("jjjjjjjhhfsfffsffffffffffssssssssssae", solver.closestString("abfjdsjdhfsjfksdkjfywekjdssgkjkjjksjk","j*h*f*z*d*g*d*d*d*s*f*fsg*f*fg*s*s*d*a*z*a*h*z*t*e") );
  }



}

