

package tc.p417_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TemplateMatchingSysTest {

  TemplateMatching solver; 

  @Before
  public void setUp() {
    solver = new TemplateMatching();
  }

  

  @Test
  public void test0(){
    assertEquals("something", solver.bestMatch("something","awesome","ingenious") );
  }



  @Test
  public void test1(){
    assertEquals("a", solver.bestMatch("havka","eto","papstvo") );
  }



  @Test
  public void test2(){
    assertEquals("a", solver.bestMatch("a","b","c") );
  }



  @Test
  public void test3(){
    assertEquals("abrac", solver.bestMatch("abracadabra","habrahabr","bracket") );
  }



  @Test
  public void test4(){
    assertEquals("ippi", solver.bestMatch("mississippi","promise","piccolo") );
  }



  @Test
  public void test5(){
    assertEquals("a a", solver.bestMatch("a a a a a a","a a","a") );
  }



  @Test
  public void test6(){
    assertEquals(" bdmztq c", solver.bestMatch("z vt no k bdmztq ct lk ot e bref vr czff","tcrmy qrxw cl w","cj zi dp") );
  }



  @Test
  public void test7(){
    assertEquals("q", solver.bestMatch(" e mcytuzce u msgh fgi lw quyukw b"," wapl yl s kq","abw rv") );
  }



  @Test
  public void test8(){
    assertEquals(" rjg", solver.bestMatch("ogpu rjgq mtf z"," k","gzk") );
  }



  @Test
  public void test9(){
    assertEquals("aq", solver.bestMatch("n xfixx g j ouii tez uaqmehobr bh ltdw qu","z s mi nv xlc a","qif") );
  }



  @Test
  public void test10(){
    assertEquals(" g", solver.bestMatch(" yvy iz hoc t awib p g"," yl g"," n s") );
  }



  @Test
  public void test11(){
    assertEquals("u tnj jfdh hz zhr em", solver.bestMatch("x jv u tnj jfdh hz zhr emo nmv","gmu","m c") );
  }



  @Test
  public void test12(){
    assertEquals("h kdm ", solver.bestMatch(" a pc e cg h y g opyeijc t eonjwoh kdm q o","h","m rhnp nnzig qj") );
  }



  @Test
  public void test13(){
    assertEquals("b", solver.bestMatch("e pnwd zwthplk l k ybkbv elbbcqi w cbv d wyz wab"," ln irp qamkui g d ndwb","pj hci ef t v r j ulpdg p i j") );
  }



  @Test
  public void test14(){
    assertEquals(" a", solver.bestMatch(" xx crahded mitc aj i y k qiamjtls"," ud kg","acp fte iaj") );
  }



  @Test
  public void test15(){
    assertEquals("a", solver.bestMatch("eu mdvv un z y laer fk vk f vx x xb g kwmu gg"," e iua a","t kpwbd m") );
  }



  @Test
  public void test16(){
    assertEquals(" ", solver.bestMatch("gn i","ro"," h") );
  }



  @Test
  public void test17(){
    assertEquals(" h", solver.bestMatch("bwpoq hd jo q recw bg obmq k vr ct kkljcjx","u ljikxxhzc as","hyd p") );
  }



  @Test
  public void test18(){
    assertEquals(" na ", solver.bestMatch(" xb yl qmof di ctqpq na icdrlgkq fjbej"," n"," lw") );
  }



  @Test
  public void test19(){
    assertEquals("rd qm ", solver.bestMatch("kqkoefah ys i jfhguzrd qm q k lra","qe kp mmr","m dfp bc y m vt") );
  }



  @Test
  public void test20(){
    assertEquals("bfqxdn ", solver.bestMatch("tmuh rlbfqxdn t g atd zggby","gfv fb"," mo un vpi v s") );
  }



  @Test
  public void test21(){
    assertEquals("zp", solver.bestMatch("zppowg qzreqw rjj qh pixa v","suc","zpa d t") );
  }



  @Test
  public void test22(){
    assertEquals(" ", solver.bestMatch("eq hc q t lnvw","x"," ef ok t") );
  }



  @Test
  public void test23(){
    assertEquals("z", solver.bestMatch(" u wczb v","z","sox") );
  }



  @Test
  public void test24(){
    assertEquals(" ax bjwwis ymh w knup", solver.bestMatch("bqevduspk jn jnw k u gv yf ax bjwwis ymh w knup","ghwdrovpwwbywm ryr","pp qqd") );
  }



  @Test
  public void test25(){
    assertEquals("a", solver.bestMatch(" fed vvd gweac odk a lbderviy la q tyar r snr p","o yhg rgda","zv opmmcquup") );
  }



  @Test
  public void test26(){
    assertEquals("im ", solver.bestMatch("kgs gjb klormak s cbx xvh im oaj o dt c n l","b j dojez foxyi"," yto v z aibbe r pde g") );
  }



  @Test
  public void test27(){
    assertEquals(" agmah b", solver.bestMatch(" xcq n l ldro k kgb n j xwkno ukc b l t r agmah b","p y he"," bwokq hav") );
  }



  @Test
  public void test28(){
    assertEquals(" c", solver.bestMatch(" cu ldp oyjy c tso rw b hkp pd"," bm q ihn"," ccxw") );
  }



  @Test
  public void test29(){
    assertEquals(" ", solver.bestMatch(" kcy"," g","o x") );
  }



  @Test
  public void test30(){
    assertEquals("z ", solver.bestMatch("gpz t c vd u yqof","on fkz"," n") );
  }



  @Test
  public void test31(){
    assertEquals("a", solver.bestMatch(" xnt reje l uvi lzca tlbqelkjd wp kik","d zpg yvnota","o") );
  }



  @Test
  public void test32(){
    assertEquals(" d", solver.bestMatch("fl wn dkf"," vx m","d") );
  }



  @Test
  public void test33(){
    assertEquals(" ", solver.bestMatch("jhxc le lizh zt","w","vvucg v") );
  }



  @Test
  public void test34(){
    assertEquals(" ", solver.bestMatch("qn okxyo"," ybx p"," d") );
  }



  @Test
  public void test35(){
    assertEquals(" q", solver.bestMatch("pcu r byga x g z k ab x hcn e qw th","ktukuq j q","pp gmi") );
  }



  @Test
  public void test36(){
    assertEquals(" ", solver.bestMatch(" dkx vo j","g","sqc") );
  }



  @Test
  public void test37(){
    assertEquals("pdyu ", solver.bestMatch("r o tejmrmdpdyu daz zw jnattfbhpo","o gt p jcnapp"," ksd f ww y") );
  }



  @Test
  public void test38(){
    assertEquals(" ", solver.bestMatch(" d wbhxydy v twjpc aj c dazklu qt cexf ed"," ycc i dgto vn"," lgf zz q g") );
  }



  @Test
  public void test39(){
    assertEquals(" e", solver.bestMatch("ig lv msttp wk iuki ezwfnuxdq odg","wf lsi ua hbaa","epg mfvs ft lpwk x") );
  }



  @Test
  public void test40(){
    assertEquals(" ", solver.bestMatch(" k t zdr","m","c") );
  }



  @Test
  public void test41(){
    assertEquals(" ght", solver.bestMatch(" ght w xq g m g r"," s w ue","tp") );
  }



  @Test
  public void test42(){
    assertEquals("e", solver.bestMatch("q kbf pzyc tqlw ateaozmdprzkw s t v ieyofyn","dtmx w mehp e","gkkac") );
  }



  @Test
  public void test43(){
    assertEquals(" m d  zb j", solver.bestMatch("z s agzjztn iqo b qnu  m d  zb jd hi figsckyho q","f rfkw dxt hf    q m","jrxwfis xt f padqx c hfl   ut ") );
  }



  @Test
  public void test44(){
    assertEquals("c ", solver.bestMatch("x gv   xdw  vvj v hmlwsaz atftosucne  fc  ocf"," pryxfkt v s m   z   wr k  p jftz  byc ","s i arf  wyleqmyou frxs lk") );
  }



  @Test
  public void test45(){
    assertEquals("n", solver.bestMatch(" p lqq g ix ndc  oix gnh lk qiw gafz mzqxqp vxw ","    qcsq    mn","u") );
  }



  @Test
  public void test46(){
    assertEquals("j ", solver.bestMatch("e  stjlv   s  iis lphme  io k jgvj ls p at","svfv  a zic dlz  sb gej ","  w x  tpye  ") );
  }



  @Test
  public void test47(){
    assertEquals("  ", solver.bestMatch("  teysti ycqvy  djqvu zpusk py iflwnmf   zf   cw e","  l f     m dbwr    pr dtg","  s  y   vt tjb e  q  w  l upovs") );
  }



  @Test
  public void test48(){
    assertEquals(" pgviscr ", solver.bestMatch("bg f mcc  pgviscr vd   d orom qje bnduuoc","qfof hyfkix xiyuxk p"," s cca onl u") );
  }



  @Test
  public void test49(){
    assertEquals("ez  s", solver.bestMatch("opgez  sii rahs ny  em xwy   crboz  zfmnkkoioe "," lfwo bpww nd   lfkaa ftvemdmdvc  wom ie","  sxiu ws d r j obbu xnsm nfs ond sa") );
  }



  @Test
  public void test50(){
    assertEquals("l   ctq", solver.bestMatch("ml   ctqwd  soaug dhwj zm u ewwo     z ef","mdy   tcxsvja  s bsng zjqrpya ajsdy  sl k c   l  ","qciwpmeti hn j w  tr   hhisdi bhzq h ") );
  }



  @Test
  public void test51(){
    assertEquals("   ", solver.bestMatch("lcxeux  pambpclh  gs i ik  eg n    lkmn aw yl","y dsg e uqtz     th xvm wahe  ","   r tmp  hb j wrzb  odhgon  jniq  ov zir") );
  }



  @Test
  public void test52(){
    assertEquals("    f  zhosk qphy gryyt o", solver.bestMatch("ayo lth y    f  zhosk qphy gryyt og dmpnzm   g we "," j    f  y gx tezejhrx atizkmu x "," ou wftloc n hcnkbzv slhv") );
  }



  @Test
  public void test53(){
    assertEquals("y", solver.bestMatch("mwdvp bu lu z gbnex      h zqd njfe denxm yplj","frktdsdyqx gv w  pey","slpxkqltc t ffhlbfcywtf") );
  }



  @Test
  public void test54(){
    assertEquals("bom ", solver.bestMatch("cz cu orlmjfksa  jlqabom dh  kqbtzbs qavdo   k  v ","x  hcb zho zn  arg cuu udc mb"," npo e   pedhtbh uvw ") );
  }



  @Test
  public void test55(){
    assertEquals("xrrq m  hob pqcenf   ntjz", solver.bestMatch(" we  sybh nr pxrrq m  hob pqcenf   ntjzypxo"," e  slkmbu mlpxsyai g efryp opl qw  aa x","zrie  qujljv nglukgam enhjq") );
  }



  @Test
  public void test56(){
    assertEquals(" ", solver.bestMatch("f fv hr jakiy qz  o zxaismar p ergzmoovxojwg","xc g d ul r a o  l ym  urin lolg c csni ","nq  eyeb") );
  }



  @Test
  public void test57(){
    assertEquals("j", solver.bestMatch(" jkqcquk tfdrkbtffr t fk bctrcbkbjcvc r sm y mm","  y mndmwvue  t yptd   f dij","n y slowf  mtgew g    lewkb ") );
  }



  @Test
  public void test58(){
    assertEquals("i", solver.bestMatch("qythmoqh rq boftg ypex g  og g p wis c dh r"," frnjzkvuqv lw gi gy dftt  isgmmwds aupdhi","ay  w  f y pu  dcq kdu nyn  ") );
  }



  @Test
  public void test59(){
    assertEquals("  n up xeuopw w ypawc", solver.bestMatch("qp pesgwq ox  ue  n up xeuopw w ypawctwax    qs g","z fym jh b uq   rufmp     heogc mwvxz  zrnuci","cjszu   soubczr") );
  }



  @Test
  public void test60(){
    assertEquals("l", solver.bestMatch("kay   msqblixtzxau qit  omk xz kltfmevbdsvj ud","zsvl   gpmk ionqrgjuirbss  no xbos  pfl","w") );
  }



  @Test
  public void test61(){
    assertEquals("ofk ", solver.bestMatch("syvf yh g  brfsj vxhgofk k ecey zknp  ttp  cjn tg ","rn ofjic   i dbtji a y szdqo"," ") );
  }



  @Test
  public void test62(){
    assertEquals(" midzkpuo", solver.bestMatch("qlmujs midzkpuon  glikqm t t puxu c jspmbpujur","t zui ppw   jyd ","uof   w k slkfkf sfbhsu vbz vsa kznq ") );
  }



  @Test
  public void test63(){
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", solver.bestMatch("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa") );
  }



  @Test
  public void test64(){
    assertEquals("y    gln ghn zhpxyzqqn ar vxb", solver.bestMatch(" oriyty    gln ghn zhpxyzqqn ar vxbln dg zmzzfcaf "," d   ox   rds gwblg bcx qb vf czf kdgyliyy j  esoy","bfbpi hhlxg obd g e ruqhq  ie   xy lxm   t u ef   ") );
  }



  @Test
  public void test65(){
    assertEquals("wyjc y x  h qlkteom mf it krj  juuvb", solver.bestMatch("ahdaqbfwyjc y x  h qlkteom mf it krj  juuvbsttva f","  h ptnybkqd  m wemklzn  o   fcf breg  ie  lyxlx w","b   gs b t  u af mw p zj jq  iwdg  ew  t  w h   uh") );
  }



  @Test
  public void test66(){
    assertEquals("   zzo qt  hgm rpneh ", solver.bestMatch("wrr   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx","yigx e wpujledx  ohut  a  ey v de  lkzt    x  juvl","h ke  rjpskpidwbg zojhc rsdjsi hobbxglyr rp tgh a ") );
  }



  @Test
  public void test67(){
    assertEquals("   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx", solver.bestMatch("wrr   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx","   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx","wrr   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu") );
  }



  @Test
  public void test68(){
    assertEquals("wrr   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx", solver.bestMatch("wrr   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx","wrr   zzo qt  hgm rpneh awte  o pcjvaa rb  axgu","  zzo qt  hgm rpneh awte  o pcjvaa rb  axgu cx") );
  }



  @Test
  public void test69(){
    assertEquals("b", solver.bestMatch("ab","b","a") );
  }



  @Test
  public void test70(){
    assertEquals("dsgssippi", solver.bestMatch("missidsgssippi","proddmise","piddccolo") );
  }



  @Test
  public void test71(){
    assertEquals("b", solver.bestMatch("bcd","efg","hjk") );
  }



  @Test
  public void test72(){
    assertEquals("b", solver.bestMatch("b","x","y") );
  }



  @Test
  public void test73(){
    assertEquals("aba", solver.bestMatch("abababbab","ababababaab","abaababab") );
  }



  @Test
  public void test74(){
    assertEquals(" ", solver.bestMatch("aaaa aaaaaa","  qqqqqqqqqq","  ssss s") );
  }



  @Test
  public void test75(){
    assertEquals("i", solver.bestMatch("iiiiii","a","b") );
  }



  @Test
  public void test76(){
    assertEquals("t", solver.bestMatch("tttt","aaa","bbb") );
  }



  @Test
  public void test77(){
    assertEquals("b", solver.bestMatch("bbbb","aaaa","ccccc") );
  }



  @Test
  public void test78(){
    assertEquals(" ", solver.bestMatch(" ","a","b") );
  }



  @Test
  public void test79(){
    assertEquals("r", solver.bestMatch("r","x","b") );
  }



  @Test
  public void test80(){
    assertEquals("b", solver.bestMatch("bc","d","e") );
  }



  @Test
  public void test81(){
    assertEquals("z", solver.bestMatch("zz","a","a") );
  }



  @Test
  public void test82(){
    assertEquals("b", solver.bestMatch("b","a","a") );
  }



  @Test
  public void test83(){
    assertEquals("abacabadabaca", solver.bestMatch("bacabadabacabaeabacabadabacaba","abacabada","bacac") );
  }



  @Test
  public void test84(){
    assertEquals("a", solver.bestMatch("az","b","c") );
  }



  @Test
  public void test85(){
    assertEquals("a", solver.bestMatch("abc","e","f") );
  }



  @Test
  public void test86(){
    assertEquals("defghijklmnopq r s t uvwx", solver.bestMatch("abcdefghijklmnopq r s t uvwx","abcdefg r s   jldf fjd","uvwxyz") );
  }



  @Test
  public void test87(){
    assertEquals("bxxxxxefgcd", solver.bestMatch("bxxxxxefgcdxxxxabxxxxcd","ttab","efgcdtt") );
  }



  @Test
  public void test88(){
    assertEquals("dbabccaddaddbd", solver.bestMatch("cabacbaddadaaddbabccaddaddbdacadbabddbbcdacdcbc","dbddaddaaadacadabdaadbbcaadddaaaabcbdabadaabcdcdb","dbddaddaaadacadabdaadbbcaadddaaaabcbdabadaabcdcdb") );
  }



  @Test
  public void test89(){
    assertEquals("h", solver.bestMatch("hzvkz","eto","papstvo") );
  }



  @Test
  public void test90(){
    assertEquals("abcd", solver.bestMatch("abcd","abc","bcd") );
  }



  @Test
  public void test91(){
    assertEquals("abcba", solver.bestMatch("abdbaabcba","ab","ba") );
  }



  @Test
  public void test92(){
    assertEquals("asdfasdaas", solver.bestMatch("aafdasdfasdaasfdasdffdasdfasdaafdasdfasd","afasdfatrhertghsfsdhsdfaassaafdasdfasddfasdfasdf","aasdfasdfaafdasdasfasdfasfdasfdyrefasdaafdasdfasda") );
  }



  @Test
  public void test93(){
    assertEquals("aaaa", solver.bestMatch("aaaaa","f","aaaa") );
  }



  @Test
  public void test94(){
    assertEquals("z", solver.bestMatch("z","x","y") );
  }



  @Test
  public void test95(){
    assertEquals("b", solver.bestMatch("b","c","d") );
  }



  @Test
  public void test96(){
    assertEquals("b", solver.bestMatch("bcd","x","z") );
  }



  @Test
  public void test97(){
    assertEquals("fea", solver.bestMatch("xxxeabxxxfeaxxx","dfe","abc") );
  }



  @Test
  public void test98(){
    assertEquals("axxxxkkkt", solver.bestMatch("axxxxxxxtyyyaxxxxkkktyyy","llla","tlll") );
  }



  @Test
  public void test99(){
    assertEquals("a", solver.bestMatch("ab","fgg","ghhh") );
  }



  @Test
  public void test100(){
    assertEquals("aba", solver.bestMatch("aba","xxx","aba") );
  }



  @Test
  public void test101(){
    assertEquals("b", solver.bestMatch("bb","a","c") );
  }



  @Test
  public void test102(){
    assertEquals("b", solver.bestMatch("bcd","gf","ij") );
  }



  @Test
  public void test103(){
    assertEquals("heta", solver.bestMatch("chetan","he","ta") );
  }



  @Test
  public void test104(){
    assertEquals("a", solver.bestMatch("havak","eto","papstvo") );
  }



  @Test
  public void test105(){
    assertEquals("zbcdefghjik", solver.bestMatch("zbcdefghjik","q","zbcdefghjik") );
  }



  @Test
  public void test106(){
    assertEquals("a", solver.bestMatch("ab","x","y") );
  }



}

