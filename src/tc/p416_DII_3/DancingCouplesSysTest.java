

package tc.p416_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DancingCouplesSysTest {

  DancingCouples solver; 

  @Before
  public void setUp() {
    solver = new DancingCouples();
  }

  

  @Test
  public void test0(){
    assertEquals(24, solver.countPairs(new String[]{"YYYY", "YYYY", "YYYY"},3) );
  }



  @Test
  public void test1(){
    assertEquals(4, solver.countPairs(new String[]{"YYNN", "NYYN", "NNYY"},3) );
  }



  @Test
  public void test2(){
    assertEquals(0, solver.countPairs(new String[]{"YY", "YY", "YY"},3) );
  }



  @Test
  public void test3(){
    assertEquals(112, solver.countPairs(new String[]{"YYNNNN", "NYYNNN", "NNYYNN", "NNNYYN", "NNNNYY", "YNNNNY"},3) );
  }



  @Test
  public void test4(){
    assertEquals(1, solver.countPairs(new String[]{"Y"},1) );
  }



  @Test
  public void test5(){
    assertEquals(0, solver.countPairs(new String[]{"Y"},3) );
  }



  @Test
  public void test6(){
    assertEquals(0, solver.countPairs(new String[]{"N"},1) );
  }



  @Test
  public void test7(){
    assertEquals(0, solver.countPairs(new String[]{"N"},5) );
  }



  @Test
  public void test8(){
    assertEquals(2, solver.countPairs(new String[]{"YY"},1) );
  }



  @Test
  public void test9(){
    assertEquals(1, solver.countPairs(new String[]{"NY"},1) );
  }



  @Test
  public void test10(){
    assertEquals(0, solver.countPairs(new String[]{"NY"},2) );
  }



  @Test
  public void test11(){
    assertEquals(3, solver.countPairs(new String[]{"YYNNY"},1) );
  }



  @Test
  public void test12(){
    assertEquals(10, solver.countPairs(new String[]{"YYYYYYYYYY"},1) );
  }



  @Test
  public void test13(){
    assertEquals(7, solver.countPairs(new String[]{"YNYYYNNYYY"},1) );
  }



  @Test
  public void test14(){
    assertEquals(1, solver.countPairs(new String[]{"N", "Y"},1) );
  }



  @Test
  public void test15(){
    assertEquals(2, solver.countPairs(new String[]{"N", "Y", "Y"},1) );
  }



  @Test
  public void test16(){
    assertEquals(0, solver.countPairs(new String[]{"N", "Y", "Y"},2) );
  }



  @Test
  public void test17(){
    assertEquals(10, solver.countPairs(new String[]{"Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y"},1) );
  }



  @Test
  public void test18(){
    assertEquals(7, solver.countPairs(new String[]{"Y", "Y", "N", "N", "Y", "Y", "Y", "N", "Y", "Y"},1) );
  }



  @Test
  public void test19(){
    assertEquals(20, solver.countPairs(new String[]{"YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY"},1) );
  }



  @Test
  public void test20(){
    assertEquals(800, solver.countPairs(new String[]{"YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY"},3) );
  }



  @Test
  public void test21(){
    assertEquals(4290, solver.countPairs(new String[]{"YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY"},6) );
  }



  @Test
  public void test22(){
    assertEquals(825, solver.countPairs(new String[]{"YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY"},8) );
  }



  @Test
  public void test23(){
    assertEquals(2, solver.countPairs(new String[]{"YYNNNNNNNN", "NYYNNNNNNN", "NNYYNNNNNN", "NNNYYNNNNN", "NNNNYYNNNN", "NNNNNYYNNN", "NNNNNNYYNN", "NNNNNNNYYN", "NNNNNNNNYY", "YNNNNNNNNY"},10) );
  }



  @Test
  public void test24(){
    assertEquals(50, solver.countPairs(new String[]{"YYNYYNNNYN", "NYYYNNYNYN", "NNYYYNYNNY", "NYNYYNNYNY", "NNNYYYNYYN", "NYYNYYYNNN", "NNYNYNYYYN", "YNNYYNNYYN", "NYNNYNYNYY", "YYYNNNYNNY"},1) );
  }



  @Test
  public void test25(){
    assertEquals(10900, solver.countPairs(new String[]{"YYNNNYYNYN", "NYYNNYYYNN", "YNYYNYNNNY", "YYNYYNYNNN", "YNYNYYNNYN", "NNYYYYYNNN", "NYNYNYYYNN", "NNNYNYNYYY", "NNNNYYNYYY", "YYYNNYNNNY"},3) );
  }



  @Test
  public void test26(){
    assertEquals(251268, solver.countPairs(new String[]{"YYNNNYYNNY", "YYYYNNYNNN", "NYYYNNNYNY", "NYNYYYNNYN", "NYNNYYYNYN", "YNYNYYYNNN", "YNYNNNYYYN", "NYNYNNYYYN", "NNYNNYYNYY", "YNYNNYNYNY"},5) );
  }



  @Test
  public void test27(){
    assertEquals(683782, solver.countPairs(new String[]{"YYNYNNNNYY", "YYYYNNNYNN", "NNYYYYNYNN", "YNNYYNYNYN", "NYYNYYNNYN", "NNYNNYYYNY", "NNNNYYYYNY", "NNNYYNYYYN", "NYNYNNNYYY", "YNYNYYNNNY"},7) );
  }



  @Test
  public void test28(){
    assertEquals(4410, solver.countPairs(new String[]{"YYNYYNNNYN", "NYYYNNNYYN", "NNYYYYNNNY", "YNYYYNNYNN", "YNNNYYYNNY", "YYNNNYYNYN", "YNNYNNYYYN", "NYNNYNYYYN", "YNYNNNNYYY", "YYNYYNNNNY"},10) );
  }



  @Test
  public void test29(){
    assertEquals(80, solver.countPairs(new String[]{"YYYYNYYYYN", "YYYYNYYYNY", "YYNYYNYYYY", "YYYNYYYYYN", "YYNYNYYYYY", "YYYYYYYYNN", "YYNYYNYYYY", "YYYYNYYYNY", "YYYYNNYYYY", "YNYYYYYYYN"},1) );
  }



  @Test
  public void test30(){
    assertEquals(2595, solver.countPairs(new String[]{"YYNYYYYNYY", "YYYYYYYNNY", "YYNYYYNYYY", "YYYYYNYYYN", "YYNYNYYYYY", "YYYYYYNYYN", "YYYYYNYNYY", "YNYYYYYYNY", "YYYYYNYYNY", "NNYYYYYYYY"},2) );
  }



  @Test
  public void test31(){
    assertEquals(44442, solver.countPairs(new String[]{"YYYNYYYNYY", "YNYYYYYNYY", "YYYYYNYYYN", "NYYYNYYYYY", "YNYYNYYYYY", "YYYYYNYYYN", "YYNYNYYYYY", "YNYNYYYYYY", "YYYYYNNYYY", "NYYYYYNYYY"},3) );
  }



  @Test
  public void test32(){
    assertEquals(438439, solver.countPairs(new String[]{"YYNYYYYNYY", "YYYNYYNYYY", "YNYYYYYYNY", "NYNYYYYYYY", "YYYNYYYYYN", "YYYNNYYYYY", "YNYYYYYYNY", "YYNYYNYYYY", "YYYYYYNYYN", "NYYYYYYYNY"},4) );
  }



  @Test
  public void test33(){
    assertEquals(2459880, solver.countPairs(new String[]{"YYYYYYNYNY", "YYYYYYYYNN", "YYYYNYYYYN", "YYYYNYNYYY", "YYYNYYYYYN", "YYYNYYYYNY", "YYNYYYYYYN", "YNYYYYYYNY", "NYYYYYYYYN", "YNYYYYNYYY"},5) );
  }



  @Test
  public void test34(){
    assertEquals(8174829, solver.countPairs(new String[]{"YYYNYNYYYY", "YNNYYYYYYY", "YNNYYYYYYY", "YYYYYYNNYY", "YYYYNYYYYN", "YYNYYYNYYY", "YYYYYNNYYY", "NYNYYYYYYY", "YNNYYYYYYY", "YYYNYYNYYY"},6) );
  }



  @Test
  public void test35(){
    assertEquals(15365766, solver.countPairs(new String[]{"YYYYNYYYYN", "YNYYYYYYNY", "YYYNYYYNYY", "NYYYYYYNYY", "YYYYNNYYYY", "NYYNYYYYYY", "YYYYYNNYYY", "YYYYNNYYYY", "YNYYNYYYYY", "YNYYYYYNYY"},7) );
  }



  @Test
  public void test36(){
    assertEquals(14101790, solver.countPairs(new String[]{"NYNYYYYYYY", "YYYYNYYYNY", "YNYNYYYYYY", "YYYYYNYNYY", "YYYNYYYYYN", "NNYYYYYYYY", "YNYNYYYYYY", "YNYYYYNYYY", "YYYYYYNNYY", "NYYYNYYYYY"},8) );
  }



  @Test
  public void test37(){
    assertEquals(4972428, solver.countPairs(new String[]{"NYNYYYYYYY", "YYYYNYYYYN", "NYYYYYYNYY", "YYNYNYYYYY", "YYYYYYNYNY", "NYNYYYYYYY", "YYNYYYNYYY", "NYYYYYYNYY", "YNYYYNYYYY", "YYYNYYYYYN"},9) );
  }



  @Test
  public void test38(){
    assertEquals(385314, solver.countPairs(new String[]{"YYYYYNNYYY", "YYYYNYYYNY", "YYYYYNYYNY", "YNYYYNYYYY", "YYYYNNYYYY", "YYYYYYYNNY", "YYYYNYYYYN", "YYYNYYYNYY", "NYYNYYYYYY", "YYYYYYYNNY"},10) );
  }



  @Test
  public void test39(){
    assertEquals(100, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},1) );
  }



  @Test
  public void test40(){
    assertEquals(4050, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},2) );
  }



  @Test
  public void test41(){
    assertEquals(81648000, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},8) );
  }



  @Test
  public void test42(){
    assertEquals(36288000, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},9) );
  }



  @Test
  public void test43(){
    assertEquals(3628800, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},10) );
  }



  @Test
  public void test44(){
    assertEquals(115958, solver.countPairs(new String[]{"YNYNYYYNYY", "NNYYYNNYYY", "NYNNNYYYYY", "YYYYYNNYYN", "YYNNYYNNYY", "YNYYYYYYNY", "YYYYYYYYYY"},5) );
  }



  @Test
  public void test45(){
    assertEquals(3628800, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},10) );
  }



  @Test
  public void test46(){
    assertEquals(7620480, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},5) );
  }



  @Test
  public void test47(){
    assertEquals(112, solver.countPairs(new String[]{"YYNNNN", "NYYNNN", "NNYYNN", "NNNYYN", "NNNNYY", "YNNNNY"},3) );
  }



  @Test
  public void test48(){
    assertEquals(69148800, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYNYYY", "YYYYYYYYNY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},8) );
  }



  @Test
  public void test49(){
    assertEquals(24, solver.countPairs(new String[]{"YYYY", "YYYY", "YYYY"},3) );
  }



  @Test
  public void test50(){
    assertEquals(81648000, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},8) );
  }



  @Test
  public void test51(){
    assertEquals(16019531, solver.countPairs(new String[]{"YYYYYYYYYY", "NYYYYYYYYY", "YNYYYYYYYY", "YYNYYYYYYY", "YYYNYYYYYY", "YYYYNYYYYY", "YYYYYNYYYY", "YYYYYYNYYY", "YYYYYYYNYY", "YYYYYYYYNY"},9) );
  }



  @Test
  public void test52(){
    assertEquals(0, solver.countPairs(new String[]{"YYY", "YYY", "YYY"},10) );
  }



  @Test
  public void test53(){
    assertEquals(1058400, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},4) );
  }



  @Test
  public void test54(){
    assertEquals(0, solver.countPairs(new String[]{"Y"},3) );
  }



  @Test
  public void test55(){
    assertEquals(36288000, solver.countPairs(new String[]{"YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY"},9) );
  }



}

