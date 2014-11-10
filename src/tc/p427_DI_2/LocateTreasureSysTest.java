

package tc.p427_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocateTreasureSysTest {

  LocateTreasure solver; 

  @Before
  public void setUp() {
    solver = new LocateTreasure();
  }

  

  @Test
  public void test0(){
    assertEquals("-6 4", solver.location(5,2) );
  }



  @Test
  public void test1(){
    assertEquals("1 0", solver.location(99,1) );
  }



  @Test
  public void test2(){
    assertEquals("10 -2", solver.location(5226,4) );
  }



  @Test
  public void test3(){
    assertEquals("9 1", solver.location(6,9) );
  }



  @Test
  public void test4(){
    assertEquals("-6 -3", solver.location(1000000000,2) );
  }



  @Test
  public void test5(){
    assertEquals("0 0", solver.location(79025992,1) );
  }



  @Test
  public void test6(){
    assertEquals("-6 1", solver.location(219683641,3) );
  }



  @Test
  public void test7(){
    assertEquals("7 4", solver.location(247731190,4) );
  }



  @Test
  public void test8(){
    assertEquals("2 4", solver.location(920386894,5) );
  }



  @Test
  public void test9(){
    assertEquals("-3 -8", solver.location(888829576,6) );
  }



  @Test
  public void test10(){
    assertEquals("0 1", solver.location(260501341,7) );
  }



  @Test
  public void test11(){
    assertEquals("8 1", solver.location(105476434,8) );
  }



  @Test
  public void test12(){
    assertEquals("0 1", solver.location(29,9) );
  }



  @Test
  public void test13(){
    assertEquals("0 1", solver.location(312553813,10) );
  }



  @Test
  public void test14(){
    assertEquals("0 1", solver.location(687512077,11) );
  }



  @Test
  public void test15(){
    assertEquals("3 1", solver.location(38,12) );
  }



  @Test
  public void test16(){
    assertEquals("3 -2", solver.location(41,13) );
  }



  @Test
  public void test17(){
    assertEquals("-6 -3", solver.location(44,14) );
  }



  @Test
  public void test18(){
    assertEquals("-3 -8", solver.location(337774576,15) );
  }



  @Test
  public void test19(){
    assertEquals("0 1", solver.location(442868173,16) );
  }



  @Test
  public void test20(){
    assertEquals("0 0", solver.location(804601048,17) );
  }



  @Test
  public void test21(){
    assertEquals("0 -8", solver.location(56,18) );
  }



  @Test
  public void test22(){
    assertEquals("1 1", solver.location(410048638,19) );
  }



  @Test
  public void test23(){
    assertEquals("1 1", solver.location(62,928) );
  }



  @Test
  public void test24(){
    assertEquals("-3 -2", solver.location(65,734) );
  }



  @Test
  public void test25(){
    assertEquals("0 -8", solver.location(68,711) );
  }



  @Test
  public void test26(){
    assertEquals("0 1", solver.location(688266589,965) );
  }



  @Test
  public void test27(){
    assertEquals("8 1", solver.location(74,854) );
  }



  @Test
  public void test28(){
    assertEquals("0 1", solver.location(77,422) );
  }



  @Test
  public void test29(){
    assertEquals("10 -3", solver.location(632756779,265) );
  }



  @Test
  public void test30(){
    assertEquals("1 0", solver.location(71551579,676) );
  }



  @Test
  public void test31(){
    assertEquals("-3 -8", solver.location(712969612,96) );
  }



  @Test
  public void test32(){
    assertEquals("-3 -2", solver.location(89,32) );
  }



  @Test
  public void test33(){
    assertEquals("3 3", solver.location(92,835) );
  }



  @Test
  public void test34(){
    assertEquals("2 0", solver.location(95,374) );
  }



  @Test
  public void test35(){
    assertEquals("7 4", solver.location(738294070,544) );
  }



  @Test
  public void test36(){
    assertEquals("-3 -8", solver.location(547196272,618) );
  }



  @Test
  public void test37(){
    assertEquals("-6 -3", solver.location(104,491) );
  }



  @Test
  public void test38(){
    assertEquals("-3 -8", solver.location(655871152,807) );
  }



  @Test
  public void test39(){
    assertEquals("0 1", solver.location(747887641,637) );
  }



  @Test
  public void test40(){
    assertEquals("4 7", solver.location(9796882,448) );
  }



  @Test
  public void test41(){
    assertEquals("-3 -8", solver.location(116,672) );
  }



  @Test
  public void test42(){
    assertEquals("10 3", solver.location(466182835,43) );
  }



  @Test
  public void test43(){
    assertEquals("5 1", solver.location(122,689) );
  }



  @Test
  public void test44(){
    assertEquals("6 1", solver.location(210082162,402) );
  }



  @Test
  public void test45(){
    assertEquals("0 1", solver.location(75680341,31) );
  }



  @Test
  public void test46(){
    assertEquals("5 0", solver.location(131,164) );
  }



  @Test
  public void test47(){
    assertEquals("-3 1", solver.location(502700341,780) );
  }



  @Test
  public void test48(){
    assertEquals("9 1", solver.location(217085866,180) );
  }



  @Test
  public void test49(){
    assertEquals("-3 1", solver.location(389727085,978) );
  }



  @Test
  public void test50(){
    assertEquals("-6 1", solver.location(292509493,48) );
  }



  @Test
  public void test51(){
    assertEquals("-3 1", solver.location(278858965,879) );
  }



  @Test
  public void test52(){
    assertEquals("3 -6", solver.location(351903760,589) );
  }



  @Test
  public void test53(){
    assertEquals("-3 -8", solver.location(152,636) );
  }



  @Test
  public void test54(){
    assertEquals("-6 -8", solver.location(7560,867) );
  }



  @Test
  public void test55(){
    assertEquals("-6 1", solver.location(6121,579) );
  }



  @Test
  public void test56(){
    assertEquals("0 -8", solver.location(9941400,981) );
  }



  @Test
  public void test57(){
    assertEquals("-6 1", solver.location(361,201) );
  }



  @Test
  public void test58(){
    assertEquals("-3 1", solver.location(952921,942) );
  }



  @Test
  public void test59(){
    assertEquals("0 0", solver.location(1000000000,991) );
  }



  @Test
  public void test60(){
    assertEquals("0 0", solver.location(1000000000,1000) );
  }



  @Test
  public void test61(){
    assertEquals("0 -8", solver.location(172672312,999) );
  }



  @Test
  public void test62(){
    assertEquals("8 0", solver.location(999917171,971) );
  }



  @Test
  public void test63(){
    assertEquals("1 1", solver.location(987654142,847) );
  }



  @Test
  public void test64(){
    assertEquals("6 -3", solver.location(1000000000,997) );
  }



  @Test
  public void test65(){
    assertEquals("9 -8", solver.location(999999999,999) );
  }



  @Test
  public void test66(){
    assertEquals("-3 -6", solver.location(1000000000,779) );
  }



  @Test
  public void test67(){
    assertEquals("-3 -6", solver.location(1000000000,5) );
  }



  @Test
  public void test68(){
    assertEquals("0 0", solver.location(1000000000,989) );
  }



  @Test
  public void test69(){
    assertEquals("-3 -8", solver.location(1000000000,789) );
  }



  @Test
  public void test70(){
    assertEquals("0 0", solver.location(1000000000,1) );
  }



  @Test
  public void test71(){
    assertEquals("-3 -8", solver.location(100000000,123) );
  }



  @Test
  public void test72(){
    assertEquals("0 1", solver.location(900000001,9) );
  }



  @Test
  public void test73(){
    assertEquals("6 -3", solver.location(1000000000,979) );
  }



  @Test
  public void test74(){
    assertEquals("9 -8", solver.location(99999999,999) );
  }



  @Test
  public void test75(){
    assertEquals("0 1", solver.location(1,3) );
  }



  @Test
  public void test76(){
    assertEquals("8 0", solver.location(999999991,8) );
  }



  @Test
  public void test77(){
    assertEquals("-6 -8", solver.location(1000000000,939) );
  }



  @Test
  public void test78(){
    assertEquals("0 -8", solver.location(1000000000,9) );
  }



  @Test
  public void test79(){
    assertEquals("9 -8", solver.location(999999,999) );
  }



  @Test
  public void test80(){
    assertEquals("0 1", solver.location(954345345,566) );
  }



  @Test
  public void test81(){
    assertEquals("-6 -3", solver.location(1000000000,137) );
  }



  @Test
  public void test82(){
    assertEquals("0 -8", solver.location(840,9) );
  }



  @Test
  public void test83(){
    assertEquals("-3 -8", solver.location(1000000000,987) );
  }



  @Test
  public void test84(){
    assertEquals("-6 -8", solver.location(4,3) );
  }



  @Test
  public void test85(){
    assertEquals("-3 -6", solver.location(1000000000,113) );
  }



  @Test
  public void test86(){
    assertEquals("0 -8", solver.location(1000000000,999) );
  }



  @Test
  public void test87(){
    assertEquals("-1 4", solver.location(998697978,83) );
  }



  @Test
  public void test88(){
    assertEquals("0 -8", solver.location(1000,9) );
  }



  @Test
  public void test89(){
    assertEquals("-3 1", solver.location(987654321,987) );
  }



  @Test
  public void test90(){
    assertEquals("-6 -8", solver.location(1000000000,3) );
  }



  @Test
  public void test91(){
    assertEquals("6 -8", solver.location(3,6) );
  }



  @Test
  public void test92(){
    assertEquals("7 1", solver.location(800007086,61) );
  }



  @Test
  public void test93(){
    assertEquals("3 -8", solver.location(99,3) );
  }



  @Test
  public void test94(){
    assertEquals("0 1", solver.location(500000001,333) );
  }



  @Test
  public void test95(){
    assertEquals("3 -8", solver.location(199,3) );
  }



  @Test
  public void test96(){
    assertEquals("6 -8", solver.location(999999799,987) );
  }



  @Test
  public void test97(){
    assertEquals("-3 -6", solver.location(1000000000,986) );
  }



  @Test
  public void test98(){
    assertEquals("0 -8", solver.location(1000000000,927) );
  }



  @Test
  public void test99(){
    assertEquals("-3 1", solver.location(1451521,969) );
  }



  @Test
  public void test100(){
    assertEquals("7 4", solver.location(999999994,994) );
  }



  @Test
  public void test101(){
    assertEquals("2 -3", solver.location(999999999,2) );
  }



  @Test
  public void test102(){
    assertEquals("3 -6", solver.location(32675632,4) );
  }



  @Test
  public void test103(){
    assertEquals("6 -3", solver.location(1000,7) );
  }



  @Test
  public void test104(){
    assertEquals("1 0", solver.location(15,19) );
  }



  @Test
  public void test105(){
    assertEquals("10 4", solver.location(800003778,61) );
  }



  @Test
  public void test106(){
    assertEquals("-6 1", solver.location(13,3) );
  }



  @Test
  public void test107(){
    assertEquals("0 -8", solver.location(1000000,999) );
  }



  @Test
  public void test108(){
    assertEquals("1 0", solver.location(999999999,19) );
  }



  @Test
  public void test109(){
    assertEquals("6 1", solver.location(999999994,996) );
  }



  @Test
  public void test110(){
    assertEquals("3 -6", solver.location(1000000000,13) );
  }



  @Test
  public void test111(){
    assertEquals("-6 -8", solver.location(12,3) );
  }



  @Test
  public void test112(){
    assertEquals("-3 -6", solver.location(1000000000,599) );
  }



}

