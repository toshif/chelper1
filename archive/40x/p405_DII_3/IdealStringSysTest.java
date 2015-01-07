

package tc.p405_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IdealStringSysTest {

  IdealString solver; 

  @Before
  public void setUp() {
    solver = new IdealString();
  }

  

  @Test
  public void test0(){
    assertEquals("A", solver.construct(1) );
  }



  @Test
  public void test1(){
    assertEquals("ABB", solver.construct(3) );
  }



  @Test
  public void test2(){
    assertEquals("", solver.construct(2) );
  }



  @Test
  public void test3(){
    assertEquals("", solver.construct(4) );
  }



  @Test
  public void test4(){
    assertEquals("ABCBCC", solver.construct(6) );
  }



  @Test
  public void test5(){
    assertEquals("ABBCCCC", solver.construct(7) );
  }



  @Test
  public void test6(){
    assertEquals("", solver.construct(5) );
  }



  @Test
  public void test7(){
    assertEquals("", solver.construct(8) );
  }



  @Test
  public void test8(){
    assertEquals("", solver.construct(9) );
  }



  @Test
  public void test9(){
    assertEquals("ABCDBCCDDD", solver.construct(10) );
  }



  @Test
  public void test10(){
    assertEquals("ABCBDCCDDDD", solver.construct(11) );
  }



  @Test
  public void test11(){
    assertEquals("ABBCDCCCDDDD", solver.construct(12) );
  }



  @Test
  public void test12(){
    assertEquals("ABBCCDCCDDDDD", solver.construct(13) );
  }



  @Test
  public void test13(){
    assertEquals("ABBCCCDCDDDDDD", solver.construct(14) );
  }



  @Test
  public void test14(){
    assertEquals("ABBCCCCDDDDDDDD", solver.construct(15) );
  }



  @Test
  public void test15(){
    assertEquals("ABCDBECCDDDEEEEE", solver.construct(16) );
  }



  @Test
  public void test16(){
    assertEquals("ABCBDECCDDDDEEEEE", solver.construct(17) );
  }



  @Test
  public void test17(){
    assertEquals("ABBCDECCCDDDDEEEEE", solver.construct(18) );
  }



  @Test
  public void test18(){
    assertEquals("ABBCDCECCDDDDEEEEEE", solver.construct(19) );
  }



  @Test
  public void test19(){
    assertEquals("ABBCCDECCDDDDDEEEEEE", solver.construct(20) );
  }



  @Test
  public void test20(){
    assertEquals("ABBCCDCECDDDDDEEEEEEE", solver.construct(21) );
  }



  @Test
  public void test21(){
    assertEquals("ABBCCCDECDDDDDDEEEEEEE", solver.construct(22) );
  }



  @Test
  public void test22(){
    assertEquals("ABBCCCDCEDDDDDDEEEEEEEE", solver.construct(23) );
  }



  @Test
  public void test23(){
    assertEquals("ABBCCCCDEDDDDDDDEEEEEEEE", solver.construct(24) );
  }



  @Test
  public void test24(){
    assertEquals("ABBCCCCDDEDDDDDDEEEEEEEEE", solver.construct(25) );
  }



  @Test
  public void test25(){
    assertEquals("ABBCCCCDDDEDDDDDEEEEEEEEEE", solver.construct(26) );
  }



  @Test
  public void test26(){
    assertEquals("ABBCCCCDDDDEDDDDEEEEEEEEEEE", solver.construct(27) );
  }



  @Test
  public void test27(){
    assertEquals("ABBCCCCDDDDDEDDDEEEEEEEEEEEE", solver.construct(28) );
  }



  @Test
  public void test28(){
    assertEquals("ABBCCCCDDDDDDEDDEEEEEEEEEEEEE", solver.construct(29) );
  }



  @Test
  public void test29(){
    assertEquals("ABBCCCCDDDDDDDEDEEEEEEEEEEEEEE", solver.construct(30) );
  }



  @Test
  public void test30(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEE", solver.construct(31) );
  }



  @Test
  public void test31(){
    assertEquals("ABBCCCDECFDDDDDDEEEEEEEFFFFFFFFF", solver.construct(32) );
  }



  @Test
  public void test32(){
    assertEquals("ABBCCCDCEFDDDDDDEEEEEEEEFFFFFFFFF", solver.construct(33) );
  }



  @Test
  public void test33(){
    assertEquals("ABBCCCCDEFDDDDDDDEEEEEEEEFFFFFFFFF", solver.construct(34) );
  }



  @Test
  public void test34(){
    assertEquals("ABBCCCCDEDFDDDDDDEEEEEEEEFFFFFFFFFF", solver.construct(35) );
  }



  @Test
  public void test35(){
    assertEquals("ABBCCCCDDEFDDDDDDEEEEEEEEEFFFFFFFFFF", solver.construct(36) );
  }



  @Test
  public void test36(){
    assertEquals("ABBCCCCDDEDFDDDDDEEEEEEEEEFFFFFFFFFFF", solver.construct(37) );
  }



  @Test
  public void test37(){
    assertEquals("ABBCCCCDDDEFDDDDDEEEEEEEEEEFFFFFFFFFFF", solver.construct(38) );
  }



  @Test
  public void test38(){
    assertEquals("ABBCCCCDDDEDFDDDDEEEEEEEEEEFFFFFFFFFFFF", solver.construct(39) );
  }



  @Test
  public void test39(){
    assertEquals("ABBCCCCDDDDEFDDDDEEEEEEEEEEEFFFFFFFFFFFF", solver.construct(40) );
  }



  @Test
  public void test40(){
    assertEquals("ABBCCCCDDDDEDFDDDEEEEEEEEEEEFFFFFFFFFFFFF", solver.construct(41) );
  }



  @Test
  public void test41(){
    assertEquals("ABBCCCCDDDDDEFDDDEEEEEEEEEEEEFFFFFFFFFFFFF", solver.construct(42) );
  }



  @Test
  public void test42(){
    assertEquals("ABBCCCCDDDDDEDFDDEEEEEEEEEEEEFFFFFFFFFFFFFF", solver.construct(43) );
  }



  @Test
  public void test43(){
    assertEquals("ABBCCCCDDDDDDEFDDEEEEEEEEEEEEEFFFFFFFFFFFFFF", solver.construct(44) );
  }



  @Test
  public void test44(){
    assertEquals("ABBCCCCDDDDDDEDFDEEEEEEEEEEEEEFFFFFFFFFFFFFFF", solver.construct(45) );
  }



  @Test
  public void test45(){
    assertEquals("ABBCCCCDDDDDDDEFDEEEEEEEEEEEEEEFFFFFFFFFFFFFFF", solver.construct(46) );
  }



  @Test
  public void test46(){
    assertEquals("ABBCCCCDDDDDDDEDFEEEEEEEEEEEEEEFFFFFFFFFFFFFFFF", solver.construct(47) );
  }



  @Test
  public void test47(){
    assertEquals("ABBCCCCDDDDDDDDEFEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFF", solver.construct(48) );
  }



  @Test
  public void test48(){
    assertEquals("ABBCCCCDDDDDDDDEEFEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFF", solver.construct(49) );
  }



  @Test
  public void test49(){
    assertEquals("ABBCCCCDDDDDDDDEEEFEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFF", solver.construct(50) );
  }



  @Test
  public void test50(){
    assertEquals("ABBCCCCDDDDDDDDEEEEFEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFF", solver.construct(51) );
  }



  @Test
  public void test51(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEFEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFF", solver.construct(52) );
  }



  @Test
  public void test52(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEFEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFF", solver.construct(53) );
  }



  @Test
  public void test53(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEFEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFF", solver.construct(54) );
  }



  @Test
  public void test54(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEFEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(55) );
  }



  @Test
  public void test55(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEFEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(56) );
  }



  @Test
  public void test56(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEFEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(57) );
  }



  @Test
  public void test57(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEFEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(58) );
  }



  @Test
  public void test58(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEFEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(59) );
  }



  @Test
  public void test59(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEFEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(60) );
  }



  @Test
  public void test60(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEFEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(61) );
  }



  @Test
  public void test61(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(62) );
  }



  @Test
  public void test62(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", solver.construct(63) );
  }



  @Test
  public void test63(){
    assertEquals("ABBCCCCDDDDDDDEFDGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGG", solver.construct(64) );
  }



  @Test
  public void test64(){
    assertEquals("ABBCCCCDDDDDDDEDFGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGG", solver.construct(65) );
  }



  @Test
  public void test65(){
    assertEquals("ABBCCCCDDDDDDDDEFGEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGG", solver.construct(66) );
  }



  @Test
  public void test66(){
    assertEquals("ABBCCCCDDDDDDDDEFEGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGG", solver.construct(67) );
  }



  @Test
  public void test67(){
    assertEquals("ABBCCCCDDDDDDDDEEFGEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGG", solver.construct(68) );
  }



  @Test
  public void test68(){
    assertEquals("ABBCCCCDDDDDDDDEEFEGEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGG", solver.construct(69) );
  }



  @Test
  public void test69(){
    assertEquals("ABBCCCCDDDDDDDDEEEFGEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGG", solver.construct(70) );
  }



  @Test
  public void test70(){
    assertEquals("ABBCCCCDDDDDDDDEEEFEGEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGG", solver.construct(71) );
  }



  @Test
  public void test71(){
    assertEquals("ABBCCCCDDDDDDDDEEEEFGEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGG", solver.construct(72) );
  }



  @Test
  public void test72(){
    assertEquals("ABBCCCCDDDDDDDDEEEEFEGEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGG", solver.construct(73) );
  }



  @Test
  public void test73(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEFGEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGG", solver.construct(74) );
  }



  @Test
  public void test74(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEFEGEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGG", solver.construct(75) );
  }



  @Test
  public void test75(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEFGEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGG", solver.construct(76) );
  }



  @Test
  public void test76(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEFEGEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(77) );
  }



  @Test
  public void test77(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEFGEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(78) );
  }



  @Test
  public void test78(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEFEGEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(79) );
  }



  @Test
  public void test79(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEFGEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(80) );
  }



  @Test
  public void test80(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEFEGEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(81) );
  }



  @Test
  public void test81(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEFGEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(82) );
  }



  @Test
  public void test82(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEFEGEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(83) );
  }



  @Test
  public void test83(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEFGEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(84) );
  }



  @Test
  public void test84(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEFEGEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(85) );
  }



  @Test
  public void test85(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEFGEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(86) );
  }



  @Test
  public void test86(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEFEGEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(87) );
  }



  @Test
  public void test87(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEFGEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(88) );
  }



  @Test
  public void test88(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEFEGEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(89) );
  }



  @Test
  public void test89(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEFGEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(90) );
  }



  @Test
  public void test90(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEFEGEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(91) );
  }



  @Test
  public void test91(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEFGEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(92) );
  }



  @Test
  public void test92(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEFEGEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(93) );
  }



  @Test
  public void test93(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEFGEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(94) );
  }



  @Test
  public void test94(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEFEGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(95) );
  }



  @Test
  public void test95(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(96) );
  }



  @Test
  public void test96(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(97) );
  }



  @Test
  public void test97(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(98) );
  }



  @Test
  public void test98(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(99) );
  }



  @Test
  public void test99(){
    assertEquals("ABBCCCCDDDDDDDDEEEEEEEEEEEEEEEEFFFFFGFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", solver.construct(100) );
  }



}

