

package tc.p417_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CubeNetsSysTest {

  CubeNets solver; 

  @Before
  public void setUp() {
    solver = new CubeNets();
  }

  

  @Test
  public void test0(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.", "####", "..#."}) );
  }



  @Test
  public void test1(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "###"}) );
  }



  @Test
  public void test2(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.", "####", ".#.."}) );
  }



  @Test
  public void test3(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##..", ".##.", "..##"}) );
  }



  @Test
  public void test4(){
    assertEquals("NO", solver.isCubeNet(new String[]{"####", "...#", "...#"}) );
  }



  @Test
  public void test5(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", "###", ".#.", ".#."}) );
  }



  @Test
  public void test6(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##.", ".##", ".#.", ".#."}) );
  }



  @Test
  public void test7(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", "##.", ".##", ".#."}) );
  }



  @Test
  public void test8(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##.", ".#.", ".#.", ".##"}) );
  }



  @Test
  public void test9(){
    assertEquals("YES", solver.isCubeNet(new String[]{"...#", "####", ".#.."}) );
  }



  @Test
  public void test10(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#..", "####", "...#"}) );
  }



  @Test
  public void test11(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##..", ".###", "..#."}) );
  }



  @Test
  public void test12(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##..", ".###", "...#"}) );
  }



  @Test
  public void test13(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.", "###.", "..##"}) );
  }



  @Test
  public void test14(){
    assertEquals("YES", solver.isCubeNet(new String[]{"...#", "####", "...#"}) );
  }



  @Test
  public void test15(){
    assertEquals("YES", solver.isCubeNet(new String[]{"....#", ".####", "....#"}) );
  }



  @Test
  public void test16(){
    assertEquals("YES", solver.isCubeNet(new String[]{"....#.", ".####.", "....#."}) );
  }



  @Test
  public void test17(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "....#.", ".####.", "....#."}) );
  }



  @Test
  public void test18(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#.....", ".#....", "..#...", "...#..", "....#.", ".....#"}) );
  }



  @Test
  public void test19(){
    assertEquals("NO", solver.isCubeNet(new String[]{"...#..", "...##.", "...##.", "...#..", "......", "......"}) );
  }



  @Test
  public void test20(){
    assertEquals("NO", solver.isCubeNet(new String[]{"...#..", "...##.", "......", "...#..", "...##.", "......"}) );
  }



  @Test
  public void test21(){
    assertEquals("NO", solver.isCubeNet(new String[]{"......", "......", "######", "......", "......", "......"}) );
  }



  @Test
  public void test22(){
    assertEquals("YES", solver.isCubeNet(new String[]{".....#", ".....#", "....##", "....#.", "....#.", "......"}) );
  }



  @Test
  public void test23(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", ".#....", "####..", ".#....", "......", "......"}) );
  }



  @Test
  public void test24(){
    assertEquals("NO", solver.isCubeNet(new String[]{"......", "......", "#####.", "#.....", "......", "......"}) );
  }



  @Test
  public void test25(){
    assertEquals("NO", solver.isCubeNet(new String[]{".##...", "##....", ".##...", "......", "......", "......"}) );
  }



  @Test
  public void test26(){
    assertEquals("NO", solver.isCubeNet(new String[]{"......", "......", "#####.", ".#....", "......", "......"}) );
  }



  @Test
  public void test27(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#", ".#", "##", "#.", "#."}) );
  }



  @Test
  public void test28(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", ".#", "##", "#.", ".#"}) );
  }



  @Test
  public void test29(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", "##", ".#", "#.", "#."}) );
  }



  @Test
  public void test30(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", "##", ".#", ".#", "#."}) );
  }



  @Test
  public void test31(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#", "#", "#", "#", "#", "#"}) );
  }



  @Test
  public void test32(){
    assertEquals("NO", solver.isCubeNet(new String[]{"######"}) );
  }



  @Test
  public void test33(){
    assertEquals("YES", solver.isCubeNet(new String[]{"###..", "..###"}) );
  }



  @Test
  public void test34(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.", "####", "#..."}) );
  }



  @Test
  public void test35(){
    assertEquals("NO", solver.isCubeNet(new String[]{"..", "##", "#.", "##", "#."}) );
  }



  @Test
  public void test36(){
    assertEquals("NO", solver.isCubeNet(new String[]{"....#.", "##.##.", ".#....", "......"}) );
  }



  @Test
  public void test37(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#.", "...", "###", ".##"}) );
  }



  @Test
  public void test38(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", ".#", "#.", ".#", "##"}) );
  }



  @Test
  public void test39(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#..", ".##", "###"}) );
  }



  @Test
  public void test40(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##..", ".#..", "..#.", "#...", "..#."}) );
  }



  @Test
  public void test41(){
    assertEquals("NO", solver.isCubeNet(new String[]{"....", "....", "#.#.", "##.#", "#..."}) );
  }



  @Test
  public void test42(){
    assertEquals("NO", solver.isCubeNet(new String[]{"..##", "..##", "....", "...#", "...#"}) );
  }



  @Test
  public void test43(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#..#..", "##....", "..#.#.", "......"}) );
  }



  @Test
  public void test44(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#.#.", "....#", ".....", "#....", ".#...", "....#"}) );
  }



  @Test
  public void test45(){
    assertEquals("YES", solver.isCubeNet(new String[]{"###..", "..###"}) );
  }



  @Test
  public void test46(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..", ".#", ".#", "##", "#.", "#."}) );
  }



  @Test
  public void test47(){
    assertEquals("YES", solver.isCubeNet(new String[]{"....", "..##", ".##.", "##..", "...."}) );
  }



  @Test
  public void test48(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "....#.", "....##", "...##.", "...#.."}) );
  }



  @Test
  public void test49(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "......", "......", "....#.", "..###.", ".##..."}) );
  }



  @Test
  public void test50(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#..", ".####", "...#."}) );
  }



  @Test
  public void test51(){
    assertEquals("YES", solver.isCubeNet(new String[]{"#.", "#.", "##", ".#", ".#", ".."}) );
  }



  @Test
  public void test52(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "..###.", "###..."}) );
  }



  @Test
  public void test53(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "......", "...#..", "####..", "#....."}) );
  }



  @Test
  public void test54(){
    assertEquals("YES", solver.isCubeNet(new String[]{"...", ".#.", ".#.", "###", "..#"}) );
  }



  @Test
  public void test55(){
    assertEquals("NO", solver.isCubeNet(new String[]{"....#.", "...###", "....##"}) );
  }



  @Test
  public void test56(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###..", "##...", "#....", "....."}) );
  }



  @Test
  public void test57(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##..", "####"}) );
  }



  @Test
  public void test58(){
    assertEquals("NO", solver.isCubeNet(new String[]{"......", "###...", "###...", "......"}) );
  }



  @Test
  public void test59(){
    assertEquals("NO", solver.isCubeNet(new String[]{".##.", "###.", ".#..", "....", "...."}) );
  }



  @Test
  public void test60(){
    assertEquals("NO", solver.isCubeNet(new String[]{"......", "..####", "...##."}) );
  }



  @Test
  public void test61(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#...", ".###.", ".#...", ".#...", ".....", "....."}) );
  }



  @Test
  public void test62(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##....", "##....", "#.....", "#.....", "......"}) );
  }



  @Test
  public void test63(){
    assertEquals("NO", solver.isCubeNet(new String[]{"######"}) );
  }



  @Test
  public void test64(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##", "##", "#.", "#.", ".."}) );
  }



  @Test
  public void test65(){
    assertEquals("NO", solver.isCubeNet(new String[]{".....", ".####", ".#..#"}) );
  }



  @Test
  public void test66(){
    assertEquals("NO", solver.isCubeNet(new String[]{"..", "##", "#.", "##", "#.", ".."}) );
  }



  @Test
  public void test67(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##.", "#..", "##.", ".#."}) );
  }



  @Test
  public void test68(){
    assertEquals("NO", solver.isCubeNet(new String[]{"####..", ".#.#.."}) );
  }



  @Test
  public void test69(){
    assertEquals("NO", solver.isCubeNet(new String[]{"....", ".###", "##.#", "....", "....", "...."}) );
  }



  @Test
  public void test70(){
    assertEquals("NO", solver.isCubeNet(new String[]{"####", ".##."}) );
  }



  @Test
  public void test71(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##", "#.", "#.", "#.", "#."}) );
  }



  @Test
  public void test72(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#.", "##", "#.", "#.", "#."}) );
  }



  @Test
  public void test73(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#.", "#.", "##", "#.", "#."}) );
  }



  @Test
  public void test74(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", "##", "#.", "#.", "#."}) );
  }



  @Test
  public void test75(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##", "##", "#.", "#."}) );
  }



  @Test
  public void test76(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##", "#.", "##", "#."}) );
  }



  @Test
  public void test77(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##", "#.", "#.", "##"}) );
  }



  @Test
  public void test78(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "#..", "#..", "#.."}) );
  }



  @Test
  public void test79(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#..", "###", "#..", "#.."}) );
  }



  @Test
  public void test80(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#", ".#", "##", "#.", "#."}) );
  }



  @Test
  public void test81(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", "##", "##", "#."}) );
  }



  @Test
  public void test82(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#", "##", "#.", "##"}) );
  }



  @Test
  public void test83(){
    assertEquals("NO", solver.isCubeNet(new String[]{".##", "##.", "#..", "#.."}) );
  }



  @Test
  public void test84(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#.", "###", "#..", "#.."}) );
  }



  @Test
  public void test85(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##", "##", "##"}) );
  }



  @Test
  public void test86(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "##.", "#.."}) );
  }



  @Test
  public void test87(){
    assertEquals("NO", solver.isCubeNet(new String[]{"##.", "###", "#.."}) );
  }



  @Test
  public void test88(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "#..", "##."}) );
  }



  @Test
  public void test89(){
    assertEquals("NO", solver.isCubeNet(new String[]{"..#", "###", "#..", "#.."}) );
  }



  @Test
  public void test90(){
    assertEquals("YES", solver.isCubeNet(new String[]{".##", ".#.", "##.", "#.."}) );
  }



  @Test
  public void test91(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", ".##", "##.", "#.."}) );
  }



  @Test
  public void test92(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", ".#.", "###", "#.."}) );
  }



  @Test
  public void test93(){
    assertEquals("NO", solver.isCubeNet(new String[]{".##", "##.", "##."}) );
  }



  @Test
  public void test94(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#.", "###", "##."}) );
  }



  @Test
  public void test95(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#", ".##", "##.", "#.."}) );
  }



  @Test
  public void test96(){
    assertEquals("NO", solver.isCubeNet(new String[]{".#.", "###", "#.#"}) );
  }



  @Test
  public void test97(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#..", "####", "#..."}) );
  }



  @Test
  public void test98(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", ".#.", "##."}) );
  }



  @Test
  public void test99(){
    assertEquals("YES", solver.isCubeNet(new String[]{".##", ".#.", ".#.", "##."}) );
  }



  @Test
  public void test100(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", ".##", ".#.", "##."}) );
  }



  @Test
  public void test101(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", ".##", "##.", ".#."}) );
  }



  @Test
  public void test102(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", ".#.", "###", ".#."}) );
  }



  @Test
  public void test103(){
    assertEquals("YES", solver.isCubeNet(new String[]{"###", ".#.", ".#.", ".#."}) );
  }



  @Test
  public void test104(){
    assertEquals("NO", solver.isCubeNet(new String[]{"######"}) );
  }



  @Test
  public void test105(){
    assertEquals("NO", solver.isCubeNet(new String[]{"####", "#.#."}) );
  }



  @Test
  public void test106(){
    assertEquals("YES", solver.isCubeNet(new String[]{"###..", "..###"}) );
  }



  @Test
  public void test107(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "###"}) );
  }



  @Test
  public void test108(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "...#..", ".####.", "...#..", "......"}) );
  }



  @Test
  public void test109(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "..#...", "..#...", "..##..", "...#..", "...#.."}) );
  }



  @Test
  public void test110(){
    assertEquals("YES", solver.isCubeNet(new String[]{"...#.", "####.", "...#."}) );
  }



  @Test
  public void test111(){
    assertEquals("NO", solver.isCubeNet(new String[]{"######"}) );
  }



  @Test
  public void test112(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "...", "###"}) );
  }



  @Test
  public void test113(){
    assertEquals("NO", solver.isCubeNet(new String[]{"...#..", "..###.", "...##.", "......"}) );
  }



  @Test
  public void test114(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", ".###..", "...###", "......", "......"}) );
  }



  @Test
  public void test115(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##.", ".#.", ".##", "..#"}) );
  }



  @Test
  public void test116(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "..#...", "..#...", ".##...", ".#....", ".#...."}) );
  }



  @Test
  public void test117(){
    assertEquals("YES", solver.isCubeNet(new String[]{".....#", ".....#", "....##", "....#.", "....#.", "......"}) );
  }



  @Test
  public void test118(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..###", "###.."}) );
  }



  @Test
  public void test119(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.", "###.", "..##"}) );
  }



  @Test
  public void test120(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..##", ".##.", "##.."}) );
  }



  @Test
  public void test121(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..##", "###.", "..#."}) );
  }



  @Test
  public void test122(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", ".##...", "..###.", "...#..", "......"}) );
  }



  @Test
  public void test123(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##..", ".##.", "..##", "....", "...."}) );
  }



  @Test
  public void test124(){
    assertEquals("YES", solver.isCubeNet(new String[]{"#...", "####", "...#"}) );
  }



  @Test
  public void test125(){
    assertEquals("YES", solver.isCubeNet(new String[]{"#..", "##.", ".##", "..#"}) );
  }



  @Test
  public void test126(){
    assertEquals("YES", solver.isCubeNet(new String[]{"###..", "..###", "....."}) );
  }



  @Test
  public void test127(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#...", "###..", "..##."}) );
  }



  @Test
  public void test128(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#", ".##", ".#.", "##."}) );
  }



  @Test
  public void test129(){
    assertEquals("YES", solver.isCubeNet(new String[]{"....#.", ".####.", "....#."}) );
  }



  @Test
  public void test130(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "......", "......", "...###", ".###..", "......"}) );
  }



  @Test
  public void test131(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#.", "###", ".#.", ".#."}) );
  }



  @Test
  public void test132(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "..###.", "...#..", "...#..", "...#..", "......"}) );
  }



  @Test
  public void test133(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#..", "###.", "..##"}) );
  }



  @Test
  public void test134(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###..", ".....", "..###"}) );
  }



  @Test
  public void test135(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#####.", "....#."}) );
  }



  @Test
  public void test136(){
    assertEquals("YES", solver.isCubeNet(new String[]{"##..", ".###", ".#.."}) );
  }



  @Test
  public void test137(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "......", "..#...", "..#...", "..##..", ".##..."}) );
  }



  @Test
  public void test138(){
    assertEquals("YES", solver.isCubeNet(new String[]{".#....", ".###..", "...##.", "......"}) );
  }



  @Test
  public void test139(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###", "..#", ".##"}) );
  }



  @Test
  public void test140(){
    assertEquals("YES", solver.isCubeNet(new String[]{"......", "...#..", ".###..", "...##.", "......"}) );
  }



  @Test
  public void test141(){
    assertEquals("YES", solver.isCubeNet(new String[]{"..#.", ".###", "##.."}) );
  }



  @Test
  public void test142(){
    assertEquals("NO", solver.isCubeNet(new String[]{"#.####", "......", "#....."}) );
  }



  @Test
  public void test143(){
    assertEquals("NO", solver.isCubeNet(new String[]{"###.", "..#.", "..##"}) );
  }



  @Test
  public void test144(){
    assertEquals("NO", solver.isCubeNet(new String[]{"####", "#..#"}) );
  }



}

