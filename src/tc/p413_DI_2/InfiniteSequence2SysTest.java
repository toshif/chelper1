

package tc.p413_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InfiniteSequence2SysTest {

  InfiniteSequence2 solver; 

  @Before
  public void setUp() {
    solver = new InfiniteSequence2();
  }

  

  @Test
  public void test0(){
    assertEquals(2L, solver.calc(10000000L,2,3,10000000,10000000) );
  }



  @Test
  public void test1(){
    assertEquals(8L, solver.calc(12L,2,3,1,0) );
  }



  @Test
  public void test2(){
    assertEquals(1L, solver.calc(0L,2,2,0,0) );
  }



  @Test
  public void test3(){
    assertEquals(2L, solver.calc(123L,45,67,8,9) );
  }



  @Test
  public void test4(){
    assertEquals(11993312L, solver.calc(10000000000000L,2,2,0,10131990) );
  }



  @Test
  public void test5(){
    assertEquals(1182936L, solver.calc(10000000000000L,2,3,3434343,0) );
  }



  @Test
  public void test6(){
    assertEquals(37498466L, solver.calc(9999999999998L,2,2,3000000,0) );
  }



  @Test
  public void test7(){
    assertEquals(711689L, solver.calc(1234567891011L,2,3,0,1000000) );
  }



  @Test
  public void test8(){
    assertEquals(8192L, solver.calc(10000000000000L,2,2,1000000000,999999999) );
  }



  @Test
  public void test9(){
    assertEquals(1369L, solver.calc(9999999999999L,2,3,1000000000,999999999) );
  }



  @Test
  public void test10(){
    assertEquals(50167999L, solver.calc(8335957747793L,5,2,10,6) );
  }



  @Test
  public void test11(){
    assertEquals(2689L, solver.calc(27025202362L,9,8,6,0) );
  }



  @Test
  public void test12(){
    assertEquals(7446L, solver.calc(3426365180540L,12,7,3,5) );
  }



  @Test
  public void test13(){
    assertEquals(3613L, solver.calc(6429294702567L,17,10,0,2) );
  }



  @Test
  public void test14(){
    assertEquals(5352L, solver.calc(3135145174067L,9,10,6,4) );
  }



  @Test
  public void test15(){
    assertEquals(4493437L, solver.calc(8167369133069L,8,2,7,10) );
  }



  @Test
  public void test16(){
    assertEquals(5594L, solver.calc(7373131176229L,18,6,8,7) );
  }



  @Test
  public void test17(){
    assertEquals(169441L, solver.calc(4324734575198L,4,7,1,4) );
  }



  @Test
  public void test18(){
    assertEquals(75983L, solver.calc(8980412776091L,9,4,6,7) );
  }



  @Test
  public void test19(){
    assertEquals(34334L, solver.calc(7281982906996L,6,7,6,7) );
  }



  @Test
  public void test20(){
    assertEquals(70498L, solver.calc(6505572660336L,5,7,4,4) );
  }



  @Test
  public void test21(){
    assertEquals(4614L, solver.calc(3895141616124L,20,6,2,10) );
  }



  @Test
  public void test22(){
    assertEquals(8361L, solver.calc(364610515434L,15,4,4,9) );
  }



  @Test
  public void test23(){
    assertEquals(3602L, solver.calc(7178945117276L,15,9,9,6) );
  }



  @Test
  public void test24(){
    assertEquals(2883L, solver.calc(2399752392754L,16,8,9,3) );
  }



  @Test
  public void test25(){
    assertEquals(550L, solver.calc(12943947739L,12,10,8,6) );
  }



  @Test
  public void test26(){
    assertEquals(13739L, solver.calc(570036140795L,9,5,9,5) );
  }



  @Test
  public void test27(){
    assertEquals(2149L, solver.calc(2902376710097L,15,10,7,8) );
  }



  @Test
  public void test28(){
    assertEquals(18466L, solver.calc(280959997301L,4,9,8,7) );
  }



  @Test
  public void test29(){
    assertEquals(4598L, solver.calc(6619364228444L,17,8,0,8) );
  }



  @Test
  public void test30(){
    assertEquals(551168L, solver.calc(5771114738097L,17,2,2,4) );
  }



  @Test
  public void test31(){
    assertEquals(1290156L, solver.calc(7856631704567L,13,2,2,5) );
  }



  @Test
  public void test32(){
    assertEquals(35162L, solver.calc(4683269455306L,6,8,5,0) );
  }



  @Test
  public void test33(){
    assertEquals(161652L, solver.calc(8829112805732L,13,3,7,0) );
  }



  @Test
  public void test34(){
    assertEquals(4762979L, solver.calc(6715409959708L,8,2,4,10) );
  }



  @Test
  public void test35(){
    assertEquals(5769L, solver.calc(2245117142618L,11,8,8,2) );
  }



  @Test
  public void test36(){
    assertEquals(11671L, solver.calc(7488231192379L,14,6,1,5) );
  }



  @Test
  public void test37(){
    assertEquals(403690L, solver.calc(1500911165193L,6,3,8,8) );
  }



  @Test
  public void test38(){
    assertEquals(12288L, solver.calc(5856008936987L,11,8,1,0) );
  }



  @Test
  public void test39(){
    assertEquals(2400L, solver.calc(1936960709859L,13,10,4,6) );
  }



  @Test
  public void test40(){
    assertEquals(1729L, solver.calc(5407476153275L,20,10,9,7) );
  }



  @Test
  public void test41(){
    assertEquals(4096L, solver.calc(1237239036029L,10,10,8,8) );
  }



  @Test
  public void test42(){
    assertEquals(7399L, solver.calc(1011789366143L,9,7,8,8) );
  }



  @Test
  public void test43(){
    assertEquals(290025L, solver.calc(5763939964443L,6,4,2,4) );
  }



  @Test
  public void test44(){
    assertEquals(24576L, solver.calc(4818909002904L,7,7,3,6) );
  }



  @Test
  public void test45(){
    assertEquals(16018L, solver.calc(6996504569917L,10,8,0,1) );
  }



  @Test
  public void test46(){
    assertEquals(3140L, solver.calc(5499480298490L,17,8,10,8) );
  }



  @Test
  public void test47(){
    assertEquals(230579L, solver.calc(8139544617505L,10,3,9,2) );
  }



  @Test
  public void test48(){
    assertEquals(160031L, solver.calc(8464722308542L,6,5,5,1) );
  }



  @Test
  public void test49(){
    assertEquals(2L, solver.calc(8611789376348L,285228807,740759357,6939507,933110197) );
  }



  @Test
  public void test50(){
    assertEquals(2L, solver.calc(5568529195746L,654887345,34949302,37127827,450573621) );
  }



  @Test
  public void test51(){
    assertEquals(2L, solver.calc(1801447267605L,494613813,889023313,87755422,335354339) );
  }



  @Test
  public void test52(){
    assertEquals(2L, solver.calc(8736569229320L,346811308,308044881,396473730,745425661) );
  }



  @Test
  public void test53(){
    assertEquals(2L, solver.calc(3416402586708L,470503468,977648525,434248626,590079443) );
  }



  @Test
  public void test54(){
    assertEquals(2L, solver.calc(5624473442062L,884167640,559412926,188213258,143408281) );
  }



  @Test
  public void test55(){
    assertEquals(2L, solver.calc(5550431419379L,273911902,238433455,776532036,238962600) );
  }



  @Test
  public void test56(){
    assertEquals(2L, solver.calc(4930113903881L,407487133,707900975,619290071,665947467) );
  }



  @Test
  public void test57(){
    assertEquals(2L, solver.calc(7981058657199L,937370165,404158662,711845894,776808932) );
  }



  @Test
  public void test58(){
    assertEquals(2L, solver.calc(9668824272813L,472713776,260152961,501252995,642548898) );
  }



  @Test
  public void test59(){
    assertEquals(2L, solver.calc(1340704365084L,437116468,850952929,967681094,25187188) );
  }



  @Test
  public void test60(){
    assertEquals(17592186044416L, solver.calc(10000000000000L,2,2,0,0) );
  }



  @Test
  public void test61(){
    assertEquals(44470458L, solver.calc(10000000000000L,2,2,2,2222222) );
  }



  @Test
  public void test62(){
    assertEquals(86169543L, solver.calc(10000000000000L,2,2,1234567,0) );
  }



  @Test
  public void test63(){
    assertEquals(95846721L, solver.calc(10000000000000L,2,2,0,1100000) );
  }



  @Test
  public void test64(){
    assertEquals(104592532L, solver.calc(10000000000000L,2,2,1000000,0) );
  }



  @Test
  public void test65(){
    assertEquals(4398046511104L, solver.calc(10000000000000L,2,2,1,1) );
  }



  @Test
  public void test66(){
    assertEquals(104592532L, solver.calc(10000000000000L,2,2,0,1000000) );
  }



  @Test
  public void test67(){
    assertEquals(2766178294444L, solver.calc(10000000000000L,2,2,1,4) );
  }



  @Test
  public void test68(){
    assertEquals(12144693L, solver.calc(10000000000000L,2,2,0,10000000) );
  }



  @Test
  public void test69(){
    assertEquals(94972147L, solver.calc(9999999999999L,2,2,1111111,0) );
  }



  @Test
  public void test70(){
    assertEquals(23289372L, solver.calc(10000000000000L,2,2,0,5000000) );
  }



  @Test
  public void test71(){
    assertEquals(1893461615L, solver.calc(1000000000000L,2,3,1,1) );
  }



  @Test
  public void test72(){
    assertEquals(19949114L, solver.calc(999999999999L,2,2,499999,0) );
  }



  @Test
  public void test73(){
    assertEquals(879148277L, solver.calc(10000000000000L,2,2,0,100000) );
  }



  @Test
  public void test74(){
    assertEquals(244787015L, solver.calc(10000000000000L,2,2,0,400000) );
  }



  @Test
  public void test75(){
    assertEquals(1099511627776L, solver.calc(999999999999L,2,2,0,0) );
  }



  @Test
  public void test76(){
    assertEquals(13407808L, solver.calc(2358775268291L,2,2,3350,679115) );
  }



  @Test
  public void test77(){
    assertEquals(17179869184L, solver.calc(10000000000L,2,2,0,0) );
  }



  @Test
  public void test78(){
    assertEquals(724865000L, solver.calc(10000000000000L,2,2,0,123456) );
  }



  @Test
  public void test79(){
    assertEquals(199182503L, solver.calc(10000000000000L,2,2,0,500007) );
  }



  @Test
  public void test80(){
    assertEquals(1953326158L, solver.calc(10000000000000L,2,3,13,17) );
  }



  @Test
  public void test81(){
    assertEquals(54796271L, solver.calc(10000000000000L,2,2,0,2000000) );
  }



  @Test
  public void test82(){
    assertEquals(272433069L, solver.calc(10000000000000L,2,2,124342,1138) );
  }



  @Test
  public void test83(){
    assertEquals(9664293228L, solver.calc(10000000000000L,2,3,1,2) );
  }



  @Test
  public void test84(){
    assertEquals(96791648L, solver.calc(10000000000000L,2,2,1,1000000) );
  }



  @Test
  public void test85(){
    assertEquals(37498466L, solver.calc(10000000000000L,2,2,0,3000000) );
  }



  @Test
  public void test86(){
    assertEquals(17592186044416L, solver.calc(9999999999999L,2,2,0,0) );
  }



  @Test
  public void test87(){
    assertEquals(24230196227L, solver.calc(100000000000L,2,2,2,3) );
  }



  @Test
  public void test88(){
    assertEquals(686650497L, solver.calc(10000000000000L,2,2,0,131071) );
  }



  @Test
  public void test89(){
    assertEquals(49870998L, solver.calc(10000000000000L,2,2,999973,997) );
  }



  @Test
  public void test90(){
    assertEquals(7450599L, solver.calc(10000000000000L,2,2,0,16777216) );
  }



  @Test
  public void test91(){
    assertEquals(47819197L, solver.calc(999173121312L,2,2,5,154456) );
  }



  @Test
  public void test92(){
    assertEquals(72411191L, solver.calc(10000000000000L,2,2,23000,270000) );
  }



  @Test
  public void test93(){
    assertEquals(96791648L, solver.calc(10000000000000L,2,2,1000000,1) );
  }



  @Test
  public void test94(){
    assertEquals(79850809L, solver.calc(10000000000000L,2,2,1234567,1) );
  }



  @Test
  public void test95(){
    assertEquals(330443974L, solver.calc(10000000000000L,2,2,123456,444) );
  }



  @Test
  public void test96(){
    assertEquals(16010084397L, solver.calc(10000000000000L,2,3,1,0) );
  }



  @Test
  public void test97(){
    assertEquals(232774981L, solver.calc(10000000000000L,2,2,2345,123797) );
  }



  @Test
  public void test98(){
    assertEquals(724865000L, solver.calc(10000000000000L,2,2,123456,0) );
  }



  @Test
  public void test99(){
    assertEquals(24595366566L, solver.calc(10000000000000L,2,3,0,0) );
  }



  @Test
  public void test100(){
    assertEquals(630709045L, solver.calc(10000000000000L,2,2,2,123321) );
  }



  @Test
  public void test101(){
    assertEquals(17592186044416L, solver.calc(8796093022208L,2,2,0,0) );
  }



  @Test
  public void test102(){
    assertEquals(2199023255552L, solver.calc(10000000000000L,2,2,2,2) );
  }



  @Test
  public void test103(){
    assertEquals(2199023255552L, solver.calc(10000000000000L,2,2,2,3) );
  }



  @Test
  public void test104(){
    assertEquals(104592532L, solver.calc(9999999999999L,2,2,1000000,0) );
  }



  @Test
  public void test105(){
    assertEquals(322241427L, solver.calc(10000000000000L,2,2,1001,104729) );
  }



  @Test
  public void test106(){
    assertEquals(7800976744450L, solver.calc(10000000000000L,2,2,1,0) );
  }



  @Test
  public void test107(){
    assertEquals(76283543L, solver.calc(10000000000000L,2,2,12345,324567) );
  }



  @Test
  public void test108(){
    assertEquals(148235861L, solver.calc(10000000000000L,2,3,453,345) );
  }



  @Test
  public void test109(){
    assertEquals(7800976744450L, solver.calc(10000000000000L,2,2,0,1) );
  }



  @Test
  public void test110(){
    assertEquals(506394388L, solver.calc(9999999999999L,2,2,0,182311) );
  }



  @Test
  public void test111(){
    assertEquals(250633419L, solver.calc(10000000000000L,2,2,0,390000) );
  }



  @Test
  public void test112(){
    assertEquals(250626223L, solver.calc(10000000000000L,2,2,0,390012) );
  }



  @Test
  public void test113(){
    assertEquals(8871503L, solver.calc(10000000000000L,2,2,10000000,47) );
  }



  @Test
  public void test114(){
    assertEquals(250204273L, solver.calc(10000000000000L,2,2,0,390717) );
  }



  @Test
  public void test115(){
    assertEquals(3829335023L, solver.calc(10000000000000L,3,2,7,5) );
  }



  @Test
  public void test116(){
    assertEquals(100135912L, solver.calc(10000000000000L,2,2,0,1048575) );
  }



  @Test
  public void test117(){
    assertEquals(3377145969L, solver.calc(1234567891011L,2,3,0,1) );
  }



  @Test
  public void test118(){
    assertEquals(249608366L, solver.calc(10000000000000L,2,2,0,391717) );
  }



  @Test
  public void test119(){
    assertEquals(246095851L, solver.calc(10000000000000L,2,2,0,397717) );
  }



  @Test
  public void test120(){
    assertEquals(3900488372226L, solver.calc(10000000000000L,2,2,1,2) );
  }



  @Test
  public void test121(){
    assertEquals(54025419L, solver.calc(10000000000000L,2,2,123,1234566) );
  }



  @Test
  public void test122(){
    assertEquals(401142982L, solver.calc(10000000000000L,2,2,234512,0) );
  }



  @Test
  public void test123(){
    assertEquals(1296998106L, solver.calc(10000000000000L,2,2,0,65536) );
  }



  @Test
  public void test124(){
    assertEquals(53867288L, solver.calc(10000000000000L,2,2,3,1757567) );
  }



}

