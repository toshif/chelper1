

package tc.p425_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PiecesMoverSysTest {

  PiecesMover solver; 

  @Before
  public void setUp() {
    solver = new PiecesMover();
  }

  

  @Test
  public void test0(){
    assertEquals(1, solver.getMinimumMoves(new String[]{".....", "..**.", ".....", "...*.", "....."}) );
  }



  @Test
  public void test1(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", ".....", ".**..", ".*...", "**..."}) );
  }



  @Test
  public void test2(){
    assertEquals(12, solver.getMinimumMoves(new String[]{"*...*", ".....", ".....", ".....", "*...*"}) );
  }



  @Test
  public void test3(){
    assertEquals(7, solver.getMinimumMoves(new String[]{"**...", "*....", ".....", ".....", "*...*"}) );
  }



  @Test
  public void test4(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", ".....", ".....", ".....", "*.*.*"}) );
  }



  @Test
  public void test5(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", "....*", ".....", ".....", "*...*"}) );
  }



  @Test
  public void test6(){
    assertEquals(6, solver.getMinimumMoves(new String[]{"...*.", ".*...", "....*", "*....", "..*.."}) );
  }



  @Test
  public void test7(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", ".....", "....*", ".....", "....."}) );
  }



  @Test
  public void test8(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", ".....", ".*...", ".....", "....."}) );
  }



  @Test
  public void test9(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", ".....", ".....", ".....", ".*..."}) );
  }



  @Test
  public void test10(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", "*....", ".....", ".....", "*...."}) );
  }



  @Test
  public void test11(){
    assertEquals(4, solver.getMinimumMoves(new String[]{".....", "*....", ".....", ".....", "..*.."}) );
  }



  @Test
  public void test12(){
    assertEquals(1, solver.getMinimumMoves(new String[]{".....", ".....", ".*...", ".....", ".*..."}) );
  }



  @Test
  public void test13(){
    assertEquals(1, solver.getMinimumMoves(new String[]{".....", ".....", "..*..", ".....", "..*.."}) );
  }



  @Test
  public void test14(){
    assertEquals(4, solver.getMinimumMoves(new String[]{".....", ".....", ".....", "*....", "....*"}) );
  }



  @Test
  public void test15(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", ".....", ".....", "..*..", "*...."}) );
  }



  @Test
  public void test16(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", "*..*.", ".....", ".....", "....."}) );
  }



  @Test
  public void test17(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", "....*", ".....", "...*.", "....*"}) );
  }



  @Test
  public void test18(){
    assertEquals(4, solver.getMinimumMoves(new String[]{".....", "...*.", "...*.", ".....", "*...."}) );
  }



  @Test
  public void test19(){
    assertEquals(4, solver.getMinimumMoves(new String[]{"...*.", ".*...", ".....", ".....", "..*.."}) );
  }



  @Test
  public void test20(){
    assertEquals(5, solver.getMinimumMoves(new String[]{".*...", ".....", ".....", "....*", "....*"}) );
  }



  @Test
  public void test21(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", ".....", "...*.", "....*", "..*.."}) );
  }



  @Test
  public void test22(){
    assertEquals(1, solver.getMinimumMoves(new String[]{".....", ".....", ".....", ".....", ".**.*"}) );
  }



  @Test
  public void test23(){
    assertEquals(4, solver.getMinimumMoves(new String[]{".....", "....*", "...*.", "*....", "....."}) );
  }



  @Test
  public void test24(){
    assertEquals(3, solver.getMinimumMoves(new String[]{"..*..", ".....", "*..*.", ".....", "....."}) );
  }



  @Test
  public void test25(){
    assertEquals(3, solver.getMinimumMoves(new String[]{".....", ".....", "..*..", "....*", ".*..."}) );
  }



  @Test
  public void test26(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", "...*.", ".*...", "...*.", "....."}) );
  }



  @Test
  public void test27(){
    assertEquals(4, solver.getMinimumMoves(new String[]{"*....", ".*..*", ".....", ".*...", "....."}) );
  }



  @Test
  public void test28(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"*....", "....*", "..*.*", ".....", "....."}) );
  }



  @Test
  public void test29(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"*....", "...*.", "...*.", ".....", "..*.."}) );
  }



  @Test
  public void test30(){
    assertEquals(5, solver.getMinimumMoves(new String[]{".....", "*..*.", ".....", "..*..", ".*..."}) );
  }



  @Test
  public void test31(){
    assertEquals(5, solver.getMinimumMoves(new String[]{".....", "*..*.", ".....", "...*.", "....*"}) );
  }



  @Test
  public void test32(){
    assertEquals(5, solver.getMinimumMoves(new String[]{".....", "....*", ".....", "...*.", "*...*"}) );
  }



  @Test
  public void test33(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", ".....", ".*...", "**...", "*...."}) );
  }



  @Test
  public void test34(){
    assertEquals(5, solver.getMinimumMoves(new String[]{".....", "..*..", ".....", "*....", ".*..*"}) );
  }



  @Test
  public void test35(){
    assertEquals(3, solver.getMinimumMoves(new String[]{".....", ".....", "...*.", "*....", "**..."}) );
  }



  @Test
  public void test36(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"..*..", ".....", ".....", "...*.", "*..*."}) );
  }



  @Test
  public void test37(){
    assertEquals(1, solver.getMinimumMoves(new String[]{"***..", "...*.", ".....", ".....", "....."}) );
  }



  @Test
  public void test38(){
    assertEquals(3, solver.getMinimumMoves(new String[]{".....", "....*", "..*..", "*.*..", "....."}) );
  }



  @Test
  public void test39(){
    assertEquals(3, solver.getMinimumMoves(new String[]{".*...", "*....", ".*...", ".....", "..*.."}) );
  }



  @Test
  public void test40(){
    assertEquals(5, solver.getMinimumMoves(new String[]{".....", "..**.", ".....", ".*...", "*...."}) );
  }



  @Test
  public void test41(){
    assertEquals(4, solver.getMinimumMoves(new String[]{"*....", ".....", "...*.", "..**.", "....."}) );
  }



  @Test
  public void test42(){
    assertEquals(4, solver.getMinimumMoves(new String[]{"..*.*", "..*..", ".....", ".....", "...*."}) );
  }



  @Test
  public void test43(){
    assertEquals(3, solver.getMinimumMoves(new String[]{".....", "....*", "**.*.", ".....", "....."}) );
  }



  @Test
  public void test44(){
    assertEquals(3, solver.getMinimumMoves(new String[]{".....", "...**", "..*..", ".*...", "....."}) );
  }



  @Test
  public void test45(){
    assertEquals(4, solver.getMinimumMoves(new String[]{"*....", ".*...", ".....", ".*...", "..*.."}) );
  }



  @Test
  public void test46(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", ".*...", ".....", ".....", "***.."}) );
  }



  @Test
  public void test47(){
    assertEquals(7, solver.getMinimumMoves(new String[]{"*....", "...*.", "...*.", ".....", ".*..*"}) );
  }



  @Test
  public void test48(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"..*..", "...*.", "*...*", ".....", "...*."}) );
  }



  @Test
  public void test49(){
    assertEquals(3, solver.getMinimumMoves(new String[]{"...*.", ".....", "..**.", ".....", ".**.."}) );
  }



  @Test
  public void test50(){
    assertEquals(4, solver.getMinimumMoves(new String[]{".....", "*....", "**...", ".....", "..**."}) );
  }



  @Test
  public void test51(){
    assertEquals(6, solver.getMinimumMoves(new String[]{"*....", "..**.", ".....", ".....", "...**"}) );
  }



  @Test
  public void test52(){
    assertEquals(7, solver.getMinimumMoves(new String[]{"*..*.", ".....", ".*..*", ".....", "...*."}) );
  }



  @Test
  public void test53(){
    assertEquals(6, solver.getMinimumMoves(new String[]{"*....", ".*...", ".....", ".*..*", "*...."}) );
  }



  @Test
  public void test54(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", "...*.", ".*.**", ".*...", "....."}) );
  }



  @Test
  public void test55(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", ".*...", ".*...", "**...", "...*."}) );
  }



  @Test
  public void test56(){
    assertEquals(1, solver.getMinimumMoves(new String[]{"..*..", "..*..", "..**.", "....*", "....."}) );
  }



  @Test
  public void test57(){
    assertEquals(12, solver.getMinimumMoves(new String[]{"*...*", ".....", ".....", ".....", "*...*"}) );
  }



  @Test
  public void test58(){
    assertEquals(6, solver.getMinimumMoves(new String[]{"..**.", ".....", ".....", ".....", ".**.."}) );
  }



  @Test
  public void test59(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"*..*.", ".*...", "..*..", ".....", "*...."}) );
  }



  @Test
  public void test60(){
    assertEquals(9, solver.getMinimumMoves(new String[]{"*....", "....*", ".....", ".*...", "*...*"}) );
  }



  @Test
  public void test61(){
    assertEquals(7, solver.getMinimumMoves(new String[]{".**..", ".....", "....*", "*....", "...*."}) );
  }



  @Test
  public void test62(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", ".....", ".....", ".....", "*.*.*"}) );
  }



  @Test
  public void test63(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"....*", ".*...", "..*..", "...*.", "....*"}) );
  }



  @Test
  public void test64(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", ".....", "..*..", ".....", "*...*"}) );
  }



  @Test
  public void test65(){
    assertEquals(7, solver.getMinimumMoves(new String[]{"....*", "*....", "..*..", ".....", ".*.*."}) );
  }



  @Test
  public void test66(){
    assertEquals(0, solver.getMinimumMoves(new String[]{"*....", ".....", ".....", ".....", "....."}) );
  }



  @Test
  public void test67(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"*...*", "*...*", "..*..", ".....", "....."}) );
  }



  @Test
  public void test68(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", ".....", ".....", "...*.", "*...*"}) );
  }



  @Test
  public void test69(){
    assertEquals(2, solver.getMinimumMoves(new String[]{"*.*..", ".....", "*....", ".....", "....."}) );
  }



  @Test
  public void test70(){
    assertEquals(5, solver.getMinimumMoves(new String[]{"..*..", ".....", "..*..", ".....", "*.*.*"}) );
  }



  @Test
  public void test71(){
    assertEquals(6, solver.getMinimumMoves(new String[]{"*....", ".*...", "..*..", "...*.", "....*"}) );
  }



  @Test
  public void test72(){
    assertEquals(0, solver.getMinimumMoves(new String[]{"...*.", "..***", ".....", ".....", "....."}) );
  }



  @Test
  public void test73(){
    assertEquals(4, solver.getMinimumMoves(new String[]{"..*..", ".....", "*.*.*", ".....", "..*.."}) );
  }



  @Test
  public void test74(){
    assertEquals(9, solver.getMinimumMoves(new String[]{"*...*", "..*..", ".....", "....*", "*...."}) );
  }



  @Test
  public void test75(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", ".....", "...*.", ".....", "*...*"}) );
  }



  @Test
  public void test76(){
    assertEquals(6, solver.getMinimumMoves(new String[]{"*....", "..*..", "*...*", ".....", "...*."}) );
  }



  @Test
  public void test77(){
    assertEquals(8, solver.getMinimumMoves(new String[]{"*..*.", ".....", "..*..", ".....", "*..*."}) );
  }



  @Test
  public void test78(){
    assertEquals(1, solver.getMinimumMoves(new String[]{"**.**", "..*..", ".....", ".....", "....."}) );
  }



  @Test
  public void test79(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".*...", "***..", ".*...", ".....", "....."}) );
  }



  @Test
  public void test80(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"**..*", ".....", ".....", ".....", "*...*"}) );
  }



  @Test
  public void test81(){
    assertEquals(0, solver.getMinimumMoves(new String[]{"....*", "....*", "....*", "....*", "....*"}) );
  }



  @Test
  public void test82(){
    assertEquals(8, solver.getMinimumMoves(new String[]{".*...", "....*", ".....", ".....", "*.*.*"}) );
  }



  @Test
  public void test83(){
    assertEquals(2, solver.getMinimumMoves(new String[]{".....", ".....", ".....", ".....", "*..**"}) );
  }



  @Test
  public void test84(){
    assertEquals(1, solver.getMinimumMoves(new String[]{"..*..", ".**.*", "..*..", ".....", "....."}) );
  }



  @Test
  public void test85(){
    assertEquals(2, solver.getMinimumMoves(new String[]{"*.*..", ".*...", "*....", ".....", "....."}) );
  }



  @Test
  public void test86(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", "..**.", "..**.", ".....", "....."}) );
  }



  @Test
  public void test87(){
    assertEquals(0, solver.getMinimumMoves(new String[]{".....", ".***.", ".*.*.", ".....", "....."}) );
  }



  @Test
  public void test88(){
    assertEquals(10, solver.getMinimumMoves(new String[]{"*...*", ".....", "*....", ".....", ".*..*"}) );
  }



}

