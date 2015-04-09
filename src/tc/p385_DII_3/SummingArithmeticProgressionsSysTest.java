

package tc.p385_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SummingArithmeticProgressionsSysTest {

  SummingArithmeticProgressions solver; 

  @Before
  public void setUp() {
    solver = new SummingArithmeticProgressions();
  }

  

  @Test
  public void test0(){
    assertEquals(3, solver.howMany(1,12,3) );
  }



  @Test
  public void test1(){
    assertEquals(8, solver.howMany(1,10,2) );
  }



  @Test
  public void test2(){
    assertEquals(6, solver.howMany(20,30,4) );
  }



  @Test
  public void test3(){
    assertEquals(0, solver.howMany(1,9,4) );
  }



  @Test
  public void test4(){
    assertEquals(1, solver.howMany(1,13,4) );
  }



  @Test
  public void test5(){
    assertEquals(0, solver.howMany(1,1,2) );
  }



  @Test
  public void test6(){
    assertEquals(0, solver.howMany(1,2,2) );
  }



  @Test
  public void test7(){
    assertEquals(1, solver.howMany(1,3,2) );
  }



  @Test
  public void test8(){
    assertEquals(2, solver.howMany(1,4,2) );
  }



  @Test
  public void test9(){
    assertEquals(3, solver.howMany(1,5,2) );
  }



  @Test
  public void test10(){
    assertEquals(4, solver.howMany(1,6,2) );
  }



  @Test
  public void test11(){
    assertEquals(0, solver.howMany(1,1,3) );
  }



  @Test
  public void test12(){
    assertEquals(0, solver.howMany(1,2,3) );
  }



  @Test
  public void test13(){
    assertEquals(0, solver.howMany(1,3,3) );
  }



  @Test
  public void test14(){
    assertEquals(0, solver.howMany(1,4,3) );
  }



  @Test
  public void test15(){
    assertEquals(0, solver.howMany(1,5,3) );
  }



  @Test
  public void test16(){
    assertEquals(1, solver.howMany(1,6,3) );
  }



  @Test
  public void test17(){
    assertEquals(1, solver.howMany(1,7,3) );
  }



  @Test
  public void test18(){
    assertEquals(1, solver.howMany(1,8,3) );
  }



  @Test
  public void test19(){
    assertEquals(2, solver.howMany(1,9,3) );
  }



  @Test
  public void test20(){
    assertEquals(2, solver.howMany(1,10,3) );
  }



  @Test
  public void test21(){
    assertEquals(2, solver.howMany(1,11,3) );
  }



  @Test
  public void test22(){
    assertEquals(3, solver.howMany(1,12,3) );
  }



  @Test
  public void test23(){
    assertEquals(1, solver.howMany(1,10,4) );
  }



  @Test
  public void test24(){
    assertEquals(1, solver.howMany(1,11,4) );
  }



  @Test
  public void test25(){
    assertEquals(1, solver.howMany(1,12,4) );
  }



  @Test
  public void test26(){
    assertEquals(1, solver.howMany(1,13,4) );
  }



  @Test
  public void test27(){
    assertEquals(2, solver.howMany(1,14,4) );
  }



  @Test
  public void test28(){
    assertEquals(2, solver.howMany(1,15,4) );
  }



  @Test
  public void test29(){
    assertEquals(3, solver.howMany(1,16,4) );
  }



  @Test
  public void test30(){
    assertEquals(3, solver.howMany(1,17,4) );
  }



  @Test
  public void test31(){
    assertEquals(4, solver.howMany(1,18,4) );
  }



  @Test
  public void test32(){
    assertEquals(4, solver.howMany(1,19,4) );
  }



  @Test
  public void test33(){
    assertEquals(0, solver.howMany(1,10,5) );
  }



  @Test
  public void test34(){
    assertEquals(0, solver.howMany(1,11,5) );
  }



  @Test
  public void test35(){
    assertEquals(0, solver.howMany(1,12,5) );
  }



  @Test
  public void test36(){
    assertEquals(0, solver.howMany(1,13,5) );
  }



  @Test
  public void test37(){
    assertEquals(0, solver.howMany(1,14,5) );
  }



  @Test
  public void test38(){
    assertEquals(1, solver.howMany(1,15,5) );
  }



  @Test
  public void test39(){
    assertEquals(1, solver.howMany(1,16,5) );
  }



  @Test
  public void test40(){
    assertEquals(1, solver.howMany(1,17,5) );
  }



  @Test
  public void test41(){
    assertEquals(1, solver.howMany(1,18,5) );
  }



  @Test
  public void test42(){
    assertEquals(1, solver.howMany(1,19,5) );
  }



  @Test
  public void test43(){
    assertEquals(2, solver.howMany(1,20,5) );
  }



  @Test
  public void test44(){
    assertEquals(2, solver.howMany(1,21,5) );
  }



  @Test
  public void test45(){
    assertEquals(2, solver.howMany(1,22,5) );
  }



  @Test
  public void test46(){
    assertEquals(2, solver.howMany(1,23,5) );
  }



  @Test
  public void test47(){
    assertEquals(2, solver.howMany(1,24,5) );
  }



  @Test
  public void test48(){
    assertEquals(3, solver.howMany(1,25,5) );
  }



  @Test
  public void test49(){
    assertEquals(3, solver.howMany(1,26,5) );
  }



  @Test
  public void test50(){
    assertEquals(3, solver.howMany(1,27,5) );
  }



  @Test
  public void test51(){
    assertEquals(3, solver.howMany(1,28,5) );
  }



  @Test
  public void test52(){
    assertEquals(3, solver.howMany(1,29,5) );
  }



  @Test
  public void test53(){
    assertEquals(999999998, solver.howMany(1,1000000000,2) );
  }



  @Test
  public void test54(){
    assertEquals(333333332, solver.howMany(1,1000000000,3) );
  }



  @Test
  public void test55(){
    assertEquals(499999995, solver.howMany(1,1000000000,4) );
  }



  @Test
  public void test56(){
    assertEquals(0, solver.howMany(14,14,5) );
  }



  @Test
  public void test57(){
    assertEquals(1, solver.howMany(15,15,5) );
  }



  @Test
  public void test58(){
    assertEquals(0, solver.howMany(16,16,5) );
  }



  @Test
  public void test59(){
    assertEquals(1, solver.howMany(14,14,4) );
  }



  @Test
  public void test60(){
    assertEquals(0, solver.howMany(15,15,4) );
  }



  @Test
  public void test61(){
    assertEquals(1, solver.howMany(16,16,4) );
  }



  @Test
  public void test62(){
    assertEquals(69101910, solver.howMany(270050871,477356599,3) );
  }



  @Test
  public void test63(){
    assertEquals(76433474, solver.howMany(20,382167388,5) );
  }



  @Test
  public void test64(){
    assertEquals(429800806, solver.howMany(22,859601633,4) );
  }



  @Test
  public void test65(){
    assertEquals(208828776, solver.howMany(1,626486333,3) );
  }



  @Test
  public void test66(){
    assertEquals(1, solver.howMany(6,10,4) );
  }



  @Test
  public void test67(){
    assertEquals(2, solver.howMany(18,19,2) );
  }



  @Test
  public void test68(){
    assertEquals(2, solver.howMany(20,26,3) );
  }



  @Test
  public void test69(){
    assertEquals(13, solver.howMany(9,21,2) );
  }



  @Test
  public void test70(){
    assertEquals(3899057, solver.howMany(83775320,103270600,5) );
  }



  @Test
  public void test71(){
    assertEquals(4381684, solver.howMany(242548845,246930528,2) );
  }



  @Test
  public void test72(){
    assertEquals(5, solver.howMany(19,23,2) );
  }



  @Test
  public void test73(){
    assertEquals(6233205, solver.howMany(41014432,72180459,5) );
  }



  @Test
  public void test74(){
    assertEquals(24471800, solver.howMany(58155282,180514283,5) );
  }



  @Test
  public void test75(){
    assertEquals(0, solver.howMany(4,6,4) );
  }



  @Test
  public void test76(){
    assertEquals(57372926, solver.howMany(633034921,805153700,3) );
  }



  @Test
  public void test77(){
    assertEquals(0, solver.howMany(1,2,4) );
  }



  @Test
  public void test78(){
    assertEquals(416992653, solver.howMany(27,833985333,4) );
  }



  @Test
  public void test79(){
    assertEquals(137795074, solver.howMany(358476492,634066638,4) );
  }



  @Test
  public void test80(){
    assertEquals(233960050, solver.howMany(5,701880154,3) );
  }



  @Test
  public void test81(){
    assertEquals(125138101, solver.howMany(10,250276212,4) );
  }



  @Test
  public void test82(){
    assertEquals(110051563, solver.howMany(546195286,656246848,2) );
  }



  @Test
  public void test83(){
    assertEquals(13, solver.howMany(4,16,2) );
  }



  @Test
  public void test84(){
    assertEquals(338058368, solver.howMany(9,676116746,4) );
  }



  @Test
  public void test85(){
    assertEquals(478091732, solver.howMany(6,478091737,2) );
  }



  @Test
  public void test86(){
    assertEquals(0, solver.howMany(2,4,5) );
  }



  @Test
  public void test87(){
    assertEquals(0, solver.howMany(1,3,3) );
  }



  @Test
  public void test88(){
    assertEquals(3, solver.howMany(6,13,3) );
  }



  @Test
  public void test89(){
    assertEquals(58888904, solver.howMany(163039951,457484471,5) );
  }



  @Test
  public void test90(){
    assertEquals(4, solver.howMany(11,21,3) );
  }



  @Test
  public void test91(){
    assertEquals(17637571, solver.howMany(225235485,313423339,5) );
  }



  @Test
  public void test92(){
    assertEquals(92229742, solver.howMany(16,184459498,4) );
  }



  @Test
  public void test93(){
    assertEquals(7, solver.howMany(3,25,4) );
  }



  @Test
  public void test94(){
    assertEquals(18, solver.howMany(4,21,2) );
  }



  @Test
  public void test95(){
    assertEquals(430533859, solver.howMany(23,861067741,4) );
  }



  @Test
  public void test96(){
    assertEquals(1, solver.howMany(8,10,4) );
  }



  @Test
  public void test97(){
    assertEquals(116470969, solver.howMany(5,582354858,5) );
  }



  @Test
  public void test98(){
    assertEquals(2, solver.howMany(10,11,2) );
  }



  @Test
  public void test99(){
    assertEquals(281396924, solver.howMany(2,844190775,3) );
  }



  @Test
  public void test100(){
    assertEquals(0, solver.howMany(7,12,5) );
  }



  @Test
  public void test101(){
    assertEquals(16359803, solver.howMany(28,32719632,4) );
  }



  @Test
  public void test102(){
    assertEquals(1, solver.howMany(15,15,5) );
  }



  @Test
  public void test103(){
    assertEquals(134419286, solver.howMany(4,403257863,3) );
  }



  @Test
  public void test104(){
    assertEquals(65724636, solver.howMany(280275835,608899014,5) );
  }



  @Test
  public void test105(){
    assertEquals(59077599, solver.howMany(299704889,595092880,5) );
  }



  @Test
  public void test106(){
    assertEquals(12628213, solver.howMany(19,63141083,5) );
  }



  @Test
  public void test107(){
    assertEquals(361347149, solver.howMany(456585908,817933056,2) );
  }



  @Test
  public void test108(){
    assertEquals(0, solver.howMany(2,7,4) );
  }



  @Test
  public void test109(){
    assertEquals(102673647, solver.howMany(9117938,214465231,4) );
  }



  @Test
  public void test110(){
    assertEquals(31466824, solver.howMany(371052252,528386374,5) );
  }



  @Test
  public void test111(){
    assertEquals(60477071, solver.howMany(15,302385366,5) );
  }



  @Test
  public void test112(){
    assertEquals(49995, solver.howMany(1,100000,4) );
  }



  @Test
  public void test113(){
    assertEquals(499999994, solver.howMany(1,999999999,4) );
  }



  @Test
  public void test114(){
    assertEquals(199999997, solver.howMany(1,999999999,5) );
  }



  @Test
  public void test115(){
    assertEquals(199999998, solver.howMany(1,1000000000,5) );
  }



  @Test
  public void test116(){
    assertEquals(116161640, solver.howMany(10,232323290,4) );
  }



  @Test
  public void test117(){
    assertEquals(499999991, solver.howMany(20,1000000000,4) );
  }



  @Test
  public void test118(){
    assertEquals(499999994, solver.howMany(11,1000000000,4) );
  }



  @Test
  public void test119(){
    assertEquals(4995, solver.howMany(1,10000,4) );
  }



  @Test
  public void test120(){
    assertEquals(49950618, solver.howMany(98765,100000000,4) );
  }



  @Test
  public void test121(){
    assertEquals(333333326, solver.howMany(23,1000000000,3) );
  }



  @Test
  public void test122(){
    assertEquals(1, solver.howMany(1000000000,1000000000,5) );
  }



  @Test
  public void test123(){
    assertEquals(2624219, solver.howMany(10000320,23121412,5) );
  }



  @Test
  public void test124(){
    assertEquals(49999995, solver.howMany(1,100000000,4) );
  }



  @Test
  public void test125(){
    assertEquals(1, solver.howMany(7,9,3) );
  }



  @Test
  public void test126(){
    assertEquals(0, solver.howMany(12,12,4) );
  }



  @Test
  public void test127(){
    assertEquals(322, solver.howMany(1,654,4) );
  }



  @Test
  public void test128(){
    assertEquals(0, solver.howMany(1,1,4) );
  }



  @Test
  public void test129(){
    assertEquals(499999951, solver.howMany(100,1000000000,4) );
  }



  @Test
  public void test130(){
    assertEquals(0, solver.howMany(11,13,4) );
  }



  @Test
  public void test131(){
    assertEquals(0, solver.howMany(52,52,3) );
  }



  @Test
  public void test132(){
    assertEquals(1998, solver.howMany(1,10000,5) );
  }



  @Test
  public void test133(){
    assertEquals(0, solver.howMany(5,5,5) );
  }



  @Test
  public void test134(){
    assertEquals(1, solver.howMany(10,10,4) );
  }



  @Test
  public void test135(){
    assertEquals(45, solver.howMany(1,100,4) );
  }



  @Test
  public void test136(){
    assertEquals(1, solver.howMany(15,17,4) );
  }



  @Test
  public void test137(){
    assertEquals(1, solver.howMany(17,19,4) );
  }



  @Test
  public void test138(){
    assertEquals(4, solver.howMany(1,30,5) );
  }



  @Test
  public void test139(){
    assertEquals(2, solver.howMany(10,20,5) );
  }



  @Test
  public void test140(){
    assertEquals(3, solver.howMany(3,5,2) );
  }



  @Test
  public void test141(){
    assertEquals(24662484, solver.howMany(124,123312541,5) );
  }



  @Test
  public void test142(){
    assertEquals(0, solver.howMany(16,17,3) );
  }



  @Test
  public void test143(){
    assertEquals(0, solver.howMany(6,6,5) );
  }



}

