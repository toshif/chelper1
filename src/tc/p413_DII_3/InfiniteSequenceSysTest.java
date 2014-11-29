

package tc.p413_DII_3;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InfiniteSequenceSysTest {

  InfiniteSequence solver; 

  @Before
  public void setUp() {
    solver = new InfiniteSequence();
  }

  

  @Test
  public void test0(){
    assertEquals(1L, solver.calc(0L,2,3) );
  }



  @Test
  public void test1(){
    assertEquals(7L, solver.calc(7L,2,3) );
  }



  @Test
  public void test2(){
    assertEquals(32768L, solver.calc(10000000L,3,3) );
  }



  @Test
  public void test3(){
    assertEquals(89L, solver.calc(256L,2,4) );
  }



  @Test
  public void test4(){
    assertEquals(2L, solver.calc(1L,1000000,1000000) );
  }



  @Test
  public void test5(){
    assertEquals(1099511627776L, solver.calc(1000000000000L,2,2) );
  }



  @Test
  public void test6(){
    assertEquals(4266563557L, solver.calc(1000000000000L,2,3) );
  }



  @Test
  public void test7(){
    assertEquals(67108864L, solver.calc(1000000000000L,3,3) );
  }



  @Test
  public void test8(){
    assertEquals(96L, solver.calc(1000000000000L,2,1000000000) );
  }



  @Test
  public void test9(){
    assertEquals(4L, solver.calc(1000000000000L,1000000000,1000000000) );
  }



  @Test
  public void test10(){
    assertEquals(4135435417L, solver.calc(987654321234L,2,3) );
  }



  @Test
  public void test11(){
    assertEquals(267914296L, solver.calc(1000000000000L,2,4) );
  }



  @Test
  public void test12(){
    assertEquals(4L, solver.calc(692777636915L,846930888,4289385) );
  }



  @Test
  public void test13(){
    assertEquals(4L, solver.calc(885386760492L,424238337,157747795) );
  }



  @Test
  public void test14(){
    assertEquals(4L, solver.calc(202362490027L,289641423,596516651) );
  }



  @Test
  public void test15(){
    assertEquals(4L, solver.calc(897763513926L,202520061,783368692) );
  }



  @Test
  public void test16(){
    assertEquals(4L, solver.calc(89172455736L,640383428,465180542) );
  }



  @Test
  public void test17(){
    assertEquals(4L, solver.calc(702567956429L,521595370,35005213) );
  }



  @Test
  public void test18(){
    assertEquals(4L, solver.calc(722862665123L,861021532,336465784) );
  }



  @Test
  public void test19(){
    assertEquals(4L, solver.calc(513929979802L,468703137,345174069) );
  }



  @Test
  public void test20(){
    assertEquals(4L, solver.calc(133069898167L,635723060,415634024) );
  }



  @Test
  public void test21(){
    assertEquals(4L, solver.calc(175011478042L,289018458,159961395) );
  }



  @Test
  public void test22(){
    assertEquals(4L, solver.calc(484421544919L,753377375,231176231) );
  }



  @Test
  public void test23(){
    assertEquals(4L, solver.calc(575198594324L,756898539,608413786) );
  }



  @Test
  public void test24(){
    assertEquals(4L, solver.calc(566413803526L,238664372,149798317) );
  }



  @Test
  public void test25(){
    assertEquals(4L, solver.calc(759956241873L,524268982,412776093) );
  }



  @Test
  public void test26(){
    assertEquals(4L, solver.calc(906996497281L,42999172,137806864) );
  }



  @Test
  public void test27(){
    assertEquals(4L, solver.calc(477084336327L,284420927,511702307) );
  }



  @Test
  public void test28(){
    assertEquals(4L, solver.calc(750846621729L,259126507,572660338) );
  }



  @Test
  public void test29(){
    assertEquals(4L, solver.calc(616124353895L,533925859,200661315) );
  }



  @Test
  public void test30(){
    assertEquals(4L, solver.calc(898814233367L,201100547,39819584) );
  }



  @Test
  public void test31(){
    assertEquals(4L, solver.calc(344043313750L,685990366,610515436) );
  }



  @Test
  public void test32(){
    assertEquals(4L, solver.calc(117276947178L,356426810,577171089) );
  }



  @Test
  public void test33(){
    assertEquals(4L, solver.calc(705403502651L,709393586,880695790) );
  }



  @Test
  public void test34(){
    assertEquals(4L, solver.calc(999932095060L,574612401,752392756) );
  }



  @Test
  public void test35(){
    assertEquals(4L, solver.calc(947739210012L,43993370,511549678) );
  }



  @Test
  public void test36(){
    assertEquals(4L, solver.calc(348094297539L,849698588,855636228) );
  }



  @Test
  public void test37(){
    assertEquals(4L, solver.calc(651434960378L,463480572,136140797) );
  }



  @Test
  public void test38(){
    assertEquals(4L, solver.calc(710097612902L,92066603,317097469) );
  }



  @Test
  public void test39(){
    assertEquals(4L, solver.calc(926652260756L,603570494,430573319) );
  }



  @Test
  public void test40(){
    assertEquals(4L, solver.calc(724286209441L,485560282,59997303) );
  }



  @Test
  public void test41(){
    assertEquals(4L, solver.calc(228444346619L,894429691,294953867) );
  }



  @Test
  public void test42(){
    assertEquals(4L, solver.calc(958031108117L,270744731,221558442) );
  }



  @Test
  public void test43(){
    assertEquals(4L, solver.calc(834481890675L,207905773,314738099) );
  }



  @Test
  public void test44(){
    assertEquals(4L, solver.calc(704567777856L,791698929,710120711) );
  }



  @Test
  public void test45(){
    assertEquals(4L, solver.calc(254586276965L,524872355,355179499) );
  }



  @Test
  public void test46(){
    assertEquals(4L, solver.calc(406219028624L,803964685,269455308) );
  }



  @Test
  public void test47(){
    assertEquals(4L, solver.calc(805732048829L,240332873,160051530) );
  }



  @Test
  public void test48(){
    assertEquals(4L, solver.calc(258270363368L,515530021,378409505) );
  }



  @Test
  public void test49(){
    assertEquals(4L, solver.calc(226340518149L,277486717,509959710) );
  }



  @Test
  public void test50(){
    assertEquals(4L, solver.calc(142618002245L,289700725,200747798) );
  }



  @Test
  public void test51(){
    assertEquals(4L, solver.calc(892921243555L,439493453,150122848) );
  }



  @Test
  public void test52(){
    assertEquals(4L, solver.calc(537764888228L,722597490,331192381) );
  }



  @Test
  public void test53(){
    assertEquals(4L, solver.calc(165193441500L,438792352,347469843) );
  }



  @Test
  public void test54(){
    assertEquals(4L, solver.calc(470124324914L,116087766,342757036) );
  }



  @Test
  public void test55(){
    assertEquals(4L, solver.calc(373743346491L,182275858,8936989) );
  }



  @Test
  public void test56(){
    assertEquals(4L, solver.calc(709859281936L,841148367,350322229) );
  }



  @Test
  public void test57(){
    assertEquals(4L, solver.calc(316437899228L,286452553,771151434) );
  }



  @Test
  public void test58(){
    assertEquals(4L, solver.calc(901474276121L,213975409,576153277) );
  }



  @Test
  public void test59(){
    assertEquals(4L, solver.calc(36029661237L,330794397,653468860) );
  }



  @Test
  public void test60(){
    assertEquals(4L, solver.calc(65818894428L,450573795,705908237) );
  }



  @Test
  public void test61(){
    assertEquals(4L, solver.calc(335928639529L,187231013,889366145) );
  }



  @Test
  public void test62(){
    assertEquals(17179869184L, solver.calc(11111111110L,2,2) );
  }



  @Test
  public void test63(){
    assertEquals(1099511627776L, solver.calc(999999999999L,2,2) );
  }



  @Test
  public void test64(){
    assertEquals(4266563557L, solver.calc(999999999999L,2,3) );
  }



  @Test
  public void test65(){
    assertEquals(102737L, solver.calc(1000000000000L,13,3) );
  }



  @Test
  public void test66(){
    assertEquals(673272766L, solver.calc(100000000000L,2,3) );
  }



  @Test
  public void test67(){
    assertEquals(212L, solver.calc(1000000000000L,4325435,2) );
  }



  @Test
  public void test68(){
    assertEquals(110809534L, solver.calc(10000001111L,3,2) );
  }



  @Test
  public void test69(){
    assertEquals(673272766L, solver.calc(99999999999L,2,3) );
  }



  @Test
  public void test70(){
    assertEquals(137438953472L, solver.calc(100000000000L,2,2) );
  }



  @Test
  public void test71(){
    assertEquals(4266563557L, solver.calc(999999998127L,2,3) );
  }



  @Test
  public void test72(){
    assertEquals(252L, solver.calc(1000000000000L,2,1000000) );
  }



  @Test
  public void test73(){
    assertEquals(673272766L, solver.calc(99999989999L,2,3) );
  }



  @Test
  public void test74(){
    assertEquals(585167L, solver.calc(1000000000000L,3,7) );
  }



  @Test
  public void test75(){
    assertEquals(137438953472L, solver.calc(99999999999L,2,2) );
  }



  @Test
  public void test76(){
    assertEquals(1073741824L, solver.calc(1000000000L,2,2) );
  }



  @Test
  public void test77(){
    assertEquals(37L, solver.calc(1000000000000L,103,1007) );
  }



  @Test
  public void test78(){
    assertEquals(13L, solver.calc(1000000000000L,500,600000) );
  }



  @Test
  public void test79(){
    assertEquals(615975622L, solver.calc(90000001111L,3,2) );
  }



}

