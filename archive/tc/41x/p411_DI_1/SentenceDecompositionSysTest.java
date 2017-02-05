

package tc.p411_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SentenceDecompositionSysTest {

  SentenceDecomposition solver; 

  @Before
  public void setUp() {
    solver = new SentenceDecomposition();
  }

  

  @Test
  public void test0(){
    assertEquals(8, solver.decompose("neotowheret",new String[]{"one", "two", "three", "there"}) );
  }



  @Test
  public void test1(){
    assertEquals(2, solver.decompose("abba",new String[]{"ab", "ac", "ad"}) );
  }



  @Test
  public void test2(){
    assertEquals(-1, solver.decompose("thisismeaningless",new String[]{"this", "is", "meaningful"}) );
  }



  @Test
  public void test3(){
    assertEquals(10, solver.decompose("ommwreehisymkiml",new String[]{"we", "were", "here", "my", "is", "mom", "here", "si", "milk", "where", "si"}) );
  }



  @Test
  public void test4(){
    assertEquals(0, solver.decompose("aaaaa",new String[]{"aa", "aaa", "aaa"}) );
  }



  @Test
  public void test5(){
    assertEquals(0, solver.decompose("aaaa",new String[]{"aa", "aaa", "aaa"}) );
  }



  @Test
  public void test6(){
    assertEquals(-1, solver.decompose("a",new String[]{"aa", "aaa", "aaa"}) );
  }



  @Test
  public void test7(){
    assertEquals(0, solver.decompose("aaaaa",new String[]{"aaa", "aa", "aaa"}) );
  }



  @Test
  public void test8(){
    assertEquals(12, solver.decompose("bcdaedfbgcha",new String[]{"abcdbedfagch"}) );
  }



  @Test
  public void test9(){
    assertEquals(8, solver.decompose("zacaedfd",new String[]{"acaz", "dfde", "azacdedf"}) );
  }



  @Test
  public void test10(){
    assertEquals(8, solver.decompose("ogodtsneeencs",new String[]{"go", "good", "do", "sentences", "tense", "scen"}) );
  }



  @Test
  public void test11(){
    assertEquals(8, solver.decompose("ogodtsneeencs",new String[]{"go", "good", "od", "sentences", "tense", "scen"}) );
  }



  @Test
  public void test12(){
    assertEquals(-1, solver.decompose("sepawaterords",new String[]{"separate", "words"}) );
  }



  @Test
  public void test13(){
    assertEquals(50, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb",new String[]{"bbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaa"}) );
  }



  @Test
  public void test14(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a"}) );
  }



  @Test
  public void test15(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "b", "aaa", "ab"}) );
  }



  @Test
  public void test16(){
    assertEquals(-1, solver.decompose("abbababbabababababababbbabababaaaabababababaababab",new String[]{"ab"}) );
  }



  @Test
  public void test17(){
    assertEquals(2, solver.decompose("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzx",new String[]{"xz", "zz"}) );
  }



  @Test
  public void test18(){
    assertEquals(2, solver.decompose("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzx",new String[]{"xz", "zzz"}) );
  }



  @Test
  public void test19(){
    assertEquals(21, solver.decompose("abcdefghijklmnopqrstuvwxyz",new String[]{"kgvaiequpmbxjlfyrwcshdztno", "vpzifhecnqbjrgxsmdoulytwka", "tmrjenvxgbliszocwdafuyqkph", "ohnvqfxjegczysmutwbpalrkdi", "zrftliockpndwaqsmxvybgjheu", "pvocimxfzsjewaktrunbgydhlq", "qfhmkaxdzonplijbvtwugrysec", "mwgjcdbkuzlivqraexynstpfho", "btxsncuplkogzdirawhjvqeymf", "ixjchrznepvdqyakwgtusbmolf", "gprenhkiuwoszfqtmjlydxavbc", "hkpxglnqdjmcuvboztiefrywas", "cqbvnthkiexawfgzprudmjsyol", "zjyxtisrfwgkqumhlcbvoedapn", "copiqerfhbzdkgjaxvuymwtsln", "hbxrjuzigcywmnqeplvsodatfk", "hyacfmnegwpikzutvjxsqlrdbo", "ankjtwdfhqbsuolgiempzvcyxr", "kjrazbfvqxmthwelsgdcnpiuyo", "rchtwevszipajynlugmqdofkxb", "lsbgzpnjrqtyhfvcaxmdeouwik", "rjyeifldoahxbsznvpkwgmtcqu", "mhrzqdfjvsxypiuecnbwgatolk", "odvfwuqhigplzaeyxsrcmtnkjb", "taurlwejbvckgsqnofmidzxpyh", "wcnflouxihmdzveptkbjqagsry", "bswcphnduzmofqrvxjlyiektag", "vmlsnwxfokupqbgrdzieyactjh", "tadbreshjolkmnucgqwyfvpxzi", "pgqexscvmbtunjoazkyrilfwdh", "tzjnmixdrlqaepbvfcwhykougs", "ycfwzuhmisxlkqdaobjrtpgnve", "irqjbfeozctxghvdsynapmukwl", "tojzamiurvywplbdxgfskqcnhe", "ldwgxpakntbmicsujfrhoevzqy", "kbvgqwytixocdnujezslmafrhp", "xljcibkuqpefhosydvnzragtwm", "ypgaledfswrcuzmvhnojqbtkxi", "kpizasrvghmdbxlywcftqujone", "opxtlnzrvcuagedjshymqkibwf", "ehgbvrzjqaowdikstuxfpclmny", "kvcxztnhdwifmjebraolpqsugy", "zxewfhqsrkgpudjaconitybvlm", "txbfqsvepgwhraunokdjilmcyz", "qcvkwgjpubmfdiytohslzeraxn", "ebtjzdiuksxynlfmcqvwrhoagp", "frtmnsckegwvbpzuaqdxojilhy", "nfmtqsrwicdxljhvzpebagkuyo", "oejxdkwgucaqbtnmzpvfrihyls", "orqyvmeuabkwcitjzlpfhdgxns"}) );
  }



  @Test
  public void test20(){
    assertEquals(22, solver.decompose("bqejuwshfzaoycmgkplndixrtv",new String[]{"mrpzcylfqwsxukeanvbigojdth", "lvopsrtdnizbcykuefqmawjxhg", "ubrdzhjmptloiasyneqcvwgkxf", "xbkpgyealdtucrsnmoqiwhjfzv", "tpkorlxnzbmejaygwfdhvuqsci", "xonlcwvfpibtzuamdesyrkjghq", "ugzvomistrpfdkjlqxwhaynebc", "ykqbpgxfrliahtvzuwjcnomdes", "nazlgidobkprhfwjxcsmeyquvt", "msbrlaiqfjxgthwkeznpvdoyuc", "bvqhfcpyjgelmwrasdxniuotkz", "wmcjzdbpvatyoglekxushirfqn", "bwfjquosgaedprkchvlmztixny", "hzctjqwgbkfplsraoyxvidenum", "sdopegmfzlnhwqjuibvrtxykac", "nqezujfcwrkdiobapyvhxmstlg", "ufixdhrszmkpjlbvtcaoegywqn", "ibsqlvfcmtapuzoyhwrxjgdnek", "cxuahksgbeimqyfndtowzjpvrl", "lkudbwyrcetiofhqgnsmxvjzap", "fxqisythcmbgdaevnpoljwuzrk", "gpyhjikwlcqoxusrvbtzanfedm", "vgebiwksjqxfzcdhtpnouaylmr", "adrticxflzbypkvhomgeqwunjs", "xtrwboyzsckqapdnvihmeufgjl", "vcizpxknryjbtwaodeqguflsmh", "bluzxycjwpkdqesngvtfrohiam", "yofejtlhcmikxrbznqawvgpsdu", "idnhrjbaulzqyptmwefxgkcosv", "qilfxhmzuodbepgykrjnvsatwc", "ctzxyesknviqjohbupfawgrmdl", "ifmdkqxyvzarujhesonlcbwtgp", "zkwveynxhfjapbmcqiorslgdtu", "ijmpygtulzhdkasrfvqwoncexb", "lvxfchsbizqwdrknoeyjmgaupt", "trqoxdslwvcjapziefkmnuhygb", "cfmlwednhgyxbosurpzqtaijkv", "ynpvgbikumhqlxarjwsozftdce", "dtfjlaoxcysguwmprkbnheziqv", "tkdmuqypiarfehbxvnwcgzljso", "ebvdksqmjlrxithwnpagofcyuz", "qaykhronugxidvswjtfzlpemcb", "jhupksbzefntyxmogcqliadvrw", "oplyntajmbfuwsgcdvkxeziqhr", "npsyvflgamexzuhtdobkwrjiqc", "uhcgeqbxrnizsywafkptvlmojd", "zmvtbjkgrlphiexyaucwdnsqof", "xwkiepybnrzdqagolhvuscmtjf", "yupaetsmqxzowdhlvfijnrcgkb", "ecxwobtzqydaughfkrnmspjivl"}) );
  }



  @Test
  public void test21(){
    assertEquals(41, solver.decompose("enykglmxtdqjhicvrbszpuowfndxipzbvrkcfelymtsgjwqohu",new String[]{"uhxefrbioylpgqvmkzwnctdsj", "iszngxylhpkouedctmvjfrwbq", "ucsxeplmwztkvyjnoiqbrfdgh", "dynxkujqobpeflwzhtmsvrigc", "fjnrudwbolkxgqhypzimtvesc", "dcnrgpfsqoivzyeblmuktjxwh", "ugzfdbikqxwcroshvynempjtl", "ytiwuzqhnrmbflpsdjecoxgvk", "tbnipyhuqmdkgclwsezxrvojf", "wdxyjtibsgzlfoqpkuernchvm", "ukmnodstprcfqxihzgylbevjw", "ljmycbrikfdhptwvxuqgnezos", "usglwjnhrmcdkivpxytoezbqf", "uxcjhitonmypdwvblfgeqzskr", "mjtpdwgyexzfbikhquvcrnlos", "gwktprvxsfnjicozheqblyumd", "gesjuybxvrtihdmqcfwlknpzo", "sjuwyxtleoigmnhfbkqzprcvd", "qdhbgmtruozjwfyvlcnkespxi", "rgfbshwckvpeqmuntzdjyilox", "efzjsmnlchkrqpuvgbodityxw", "lnethwgrufydbjcxioszkqmpv", "jfoqgpuzvtmhykxdrenbsicwl", "nqielpcgtvkxhwzmboyrjdfus", "plomnbqyjfgtwkxzuhdrcesvi", "uktmgfxvozqrijhwlsbenpcdy", "stycbofukqpmvxrzhjgendwil", "xjwgboiyvkqrmczfhtnulpeds", "cohuvrwxlsfmnbtjgkqediypz", "bxosirlquegzwtmcpfyjvdhkn", "ilzrbdwkpfucsgxojnehtyqmv", "xyngfjhrbtzsovmkupwicedql", "erbgsqjftnoxpdkvilmczuywh", "jsvtfgqeurwdicxyonphklzbm", "oivrwqcbmkhzxsgpndetyfluj", "dlzrksfmcuopbvgnxiywhetjq", "xymdoclwgrhuqjbvsezitknpf", "etkfuxmgqwjorhsbcnpiyzvld", "fkopnvrzcyhuxjqgembtsdlwi", "givqnzdukhoyslbefpxjwctmr", "npbhszrgvtyecqiwfdulmxjko", "bpzednyghsfkctouvixqmljwr", "imvewlpxdhytzjrqgcsofbkun", "cqyfrmhevxbudskjwizopltng", "eydzvurbjkfotgwxlsqnihcmp", "jswkipvrxdbqechzolgfumtyn", "tmlxcyzghnbqiwsrvjkeofupd", "mqnpebvcuogtlhirxkzywdfjs", "qogyerflhbitkjczpwxnusmdv", "nwyjiolxgtdukvhmbfqzscrep"}) );
  }



  @Test
  public void test22(){
    assertEquals(33, solver.decompose("wequnjoiiyjdpshyhwemzwplkyvoyusdmuwjudhjodyiuhxl",new String[]{"qew", "fgopyhvvluqcmyao", "hlx", "yodi", "koyv", "pysh", "yhaccyrldhhrvnhdyxmgseovqhaocvweu", "jyggpbdnqqbuizrwqwyzvjrgapesbyqkxdoldkkmwjloxnwaa", "drykar", "exroqvirs", "hwy", "emz", "sph", "gjylupmtvkvilxlohmezwsorzgnyutqvkzrkryspvog", "nwjecxmaxoxllbimywelzhwsfurfzabqfymbmpjrmziydqdw", "yuds", "zlpw", "atkcqpirojawdxmfefoyvpcfgvltfjelkecofagcdaeva", "kvy", "odj", "vxfprwzxsnqbmwzv", "wlp", "hyfkufxbokjhwktcecnxr", "uiy", "oiwfaibclhuvcqmtywcdu", "jduh", "njio", "juw", "gukgxlpgooiaawgcxdzshsaaiimccymou", "vaxudzpkngfqcwizewffeisuh", "gcqrzduldlyoodipgawmxnvswogc", "mds", "diyj", "rlmwpfucfypofaunjwshwyysv", "jdy", "exaqgzfbhfdoxngzpzfs", "yuo", "horhepdfktsqzdtaheiprbsoxhliucvfydulrwrd", "jnu", "qewu", "xuhl", "faqpymeeomgqecoxnkkqhzcfh", "jwmu", "iio", "uhd", "mewh"}) );
  }



  @Test
  public void test23(){
    assertEquals(27, solver.decompose("lbqcabxcbygiauhdmhkszlzdsueggtqrpkdmkijlwa",new String[]{"nxufxuiofsszcjpwtwafcdkppvctzdtixuhvfaewmpntu", "ijk", "lwikaj", "lsmgtunzecjotyxmgrpbwrzsrjjxhkusbimnpxwibviby", "ktgrqpd", "gsuetg", "iubycga", "sdhhkzm", "dlz", "mlaikwj", "rpkmdq", "fgkqzacidgdomqeeovjnwosvtuhqwkcwyj", "hdm", "lqb", "esu", "bac", "l", "lwa", "hua", "kzzlds", "rnagtwypxnrcjglmkjhzauyjzcnixijrguzqtmlptcx", "bacxqlb", "huhadm", "arvhxyuahqlsvceqeklmpjtdcwtuqwotdnpcqwthtlnt", "gsmsftvpo", "kdm", "yig", "qcbbla", "xdlh", "phecdrgjoqianawjvalfstlxptkrxovfi", "idzosmd", "leszugd", "pqr", "cpafrdrgfslgbhmjiu", "cbx", "yxgcbi", "tgg", "bawhh", "kzs"}) );
  }



  @Test
  public void test24(){
    assertEquals(20, solver.decompose("xvwxuaocalvuylcmnkolhqwajgggyzdgwduv",new String[]{"jggg", "cly", "ggvdydwuz", "olh", "ohlgqawjg", "vcllnumky", "ggj", "cnlmyk", "wqa", "vxwx", "duv", "wdg", "yzg", "nkol", "vuwaxx", "axvouwaxc", "uxa", "wvx", "uvl", "zgdy", "vwud", "lcvuoa", "oacu", "avul", "lmyc", "dguvwd", "aco", "nkm", "jgzggy", "hwqa", "qoawlh"}) );
  }



  @Test
  public void test25(){
    assertEquals(-1, solver.decompose("a",new String[]{"aa"}) );
  }



  @Test
  public void test26(){
    assertEquals(-1, solver.decompose("abc",new String[]{"abcabc", "rando"}) );
  }



  @Test
  public void test27(){
    assertEquals(24, solver.decompose("dznskkedyyyoddgcebebjznciaavjuhmxzdntqghdnlnonsjof",new String[]{"vdxhzjumn", "skkdnz", "nhd", "qtg", "ncz", "jslnon", "hqgt", "njs", "dcdgbzcbeenj", "bbee", "thdgqn", "hxzmdn", "yoyy", "dyeyyo", "gohnndqlt", "njcz", "dzn", "ndxz", "yyo", "ksk", "avai", "of", "ydgyobecd", "mhx", "dszeknkyd", "onl", "sx", "ujv", "ejb", "udxjziamanhv", "nzbjec", "umhj", "szdn", "eoydzsyynkkd", "aia", "bce", "dgd", "hstnogdnqnlj", "kked", "dcgedb", "gdjfha", "sonj", "aiabjnzce", "uaaivj", "eyd", "dnln", "sfnjo", "eyybzflhbdbbocgmtzktnxdluxffgetqvitvtnzpbqeaqgjuqg", "ddcg"}) );
  }



  @Test
  public void test28(){
    assertEquals(21, solver.decompose("bdabcadaabaabaabadabaacadcbddccccdadcdaaddcdabd",new String[]{"sknghrcgriqnuowrngnoerheyuyzglizsckwvmkqbw", "ndejiggnaxqktwypioppiqbtvnkzy", "ccc", "owidhjahmcjthrdawfsegmulnzoedperlubr", "ezfkuqkus", "dixruiivgvlaffmvgfsgctmvgbrdqrnuggfj", "tccoanjrvxtooztusnfgyamzuskntggnrf", "baa", "adb", "cdd", "oldazgxlczypalpcazctuvlq", "bac", "ada", "zubhfwfgvxern", "hqt", "caa", "f", "zsctkutaxlnprigqvb", "mgwbgtamxcjcqiqjgtpwfapsggqgihazayww", "cfmm", "dbc", "add", "db", "xejalafmupakyejicngepmlli", "cda", "fladfpklsalobuckqvnuxyoynngltxxuladuxvdxe"}) );
  }



  @Test
  public void test29(){
    assertEquals(22, solver.decompose("dadcbcbbaddcabdbaababbdaccdccbaaddacadbbcdddcdacd",new String[]{"norietfmnpmx", "cbaa", "zvu", "ofxuqncdkemsymakqykfrdxmybeivgpi", "aba", "mrinahvuxdfwdjkkkesckjxjkilbsztebelxe", "ada", "dcc", "bda", "bab", "pwtdvjcgldlsvrtveiwzvzczcwqmanax", "dda", "abaa", "cdda", "mpxfovkzn", "apbeuhdqgxhpwnjxmvoug", "fzcchiebxebgiubkxbonpnssyzlayfzdcwayftadgickvliwt", "cdcc", "ajpiapivlevckwcyrkqmomxlmofyuprzdtmlwteao", "xbmpqdybnyypchmk", "cbbb", "bcquddapjamt", "ccddbabaacdaaadcabdbcdcccabdbcabdddbbdbaddccddaab", "latydaigphzkuwqpwb", "cbd", "qooyehgzrpwzhsjmeloaoylll", "ccad", "poxnlrksiqztxjjjndtrrvlfjiyslpp", "gyemfjsqjbxwiavuoxvxiaduowmgbywzmmahnhjvoypzi", "bcc", "apwtkjdgmsvaxjdotyjusekhxxlenllubiy", "esnqhavhobelfkgppltxexrhmaaaooknyftqswo", "jnusiifcnucqmezxbrmwsekwpkewdwluo", "jxribmyuusekxyoatqnbgtgxtmfizcmruwkcbgqnaj", "ddcd", "xaiwytjgmzzbwmxbfncnclint", "cda", "d", "siarnfopyrtmxoaibihgdjvseufoshzxdoizplhzjb", "qabfekhhgvzuehamveogwfhyhleapplwscxietgjcimm", "dcd", "dbba"}) );
  }



  @Test
  public void test30(){
    assertEquals(12, solver.decompose("noonnonnmnnomoonnmooonmnmnnommnomoomommooonommonn",new String[]{"mmo", "omon", "mmno", "non", "ono", "nono", "n", "mon", "nomn", "ooonomomnmnmmmnmononmoonomnonnoonoonmonnnmonommon", "mnn", "omom", "moo", "nonn", "oono", "ooo"}) );
  }



  @Test
  public void test31(){
    assertEquals(18, solver.decompose("yzzxyzyxxzxxzzyxyyxyzxyyxzzzxzzyzzyyzxyxxzzxyyxz",new String[]{"zxzz", "zzx", "zyz", "xxyz", "xzx", "xyx", "xzyy", "zzyx", "zzyy", "yzx", "xxzx", "xyy", "yzy", "zxxz", "yyyx"}) );
  }



  @Test
  public void test32(){
    assertEquals(22, solver.decompose("zzyzzyzyzzzyxxxxxzyyxzzxzzyxxxzzxxyzxxzyxzzxxyxz",new String[]{"zyz", "xyz", "xxx", "zxx", "yxy", "zxz"}) );
  }



  @Test
  public void test33(){
    assertEquals(21, solver.decompose("daeeaedccdcefcfafebcbebdbafddbfccfbadd",new String[]{"ebbdcbbfa", "ecdfaceff", "bccfdadfb", "eabfc", "daecdeadce", "dd", "bdbfdbbaed", "eadeeda", "dfadb", "dfccecc", "ebbdb", "cddec", "cfcfe", "cefbfba", "bfcfc", "dceeecaad", "afcdfdbc", "abfdebd", "dda", "cfefcefbac", "aaede", "cbdfbfc"}) );
  }



  @Test
  public void test34(){
    assertEquals(0, solver.decompose("a",new String[]{"a"}) );
  }



  @Test
  public void test35(){
    assertEquals(-1, solver.decompose("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaa", "aaaaa", "aaaa", "aaa", "aa", "a"}) );
  }



  @Test
  public void test36(){
    assertEquals(-1, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaa", "aaaaa", "aaaa", "aaa", "aa", "a"}) );
  }



  @Test
  public void test37(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaa", "aaaaa", "aaaa", "aaa", "aa", "a"}) );
  }



  @Test
  public void test38(){
    assertEquals(2, solver.decompose("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaa", "aaaaa", "aaaa", "aaa", "ab", "a"}) );
  }



  @Test
  public void test39(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaba",new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaa", "aaaaa", "aaaa", "aaa", "ab", "a"}) );
  }



  @Test
  public void test40(){
    assertEquals(18, solver.decompose("agabgfgbiahbgafeahbchfagbcahdifaciibba",new String[]{"baib", "aef", "bgagif", "fhcaahbg", "bbici", "fbachh", "i", "bagcdh", "abagh", "bfahc", "f", "a", "dicfiai", "hafc", "ah", "bag", "idaf", "aifc", "hgcab", "igbah", "gabgabgf", "ggbaa", "eafaigbh", "bfgig", "cahb", "bb", "hbg", "baga", "abhef"}) );
  }



  @Test
  public void test41(){
    assertEquals(18, solver.decompose("biafebbciahfbgccifdbdifichhdeabdbacged",new String[]{"ddb", "ca", "bci", "chcigibciddff", "feabib", "ib", "fbd", "cgcb", "b", "i", "bdb", "d", "bbecfhbbfiaia", "fi", "daheh", "hfa", "aef", "fcbcfiidd", "fe", "gde", "icabebh", "efb", "ihhdc", "cbgifcfeaedgfdibhdiabiebbcdabafcibcdhh", "fdi", "fbihacb", "af", "bbhadde", "iicbadhcbfaihhfeifddcbbcg", "deah", "hc", "gcbfic", "bg", "bai", "ciafh", "chgbddbaaede", "dgbecdab", "cdaeg", "adcbbegea", "iichf", "cfiid", "db"}) );
  }



  @Test
  public void test42(){
    assertEquals(12, solver.decompose("bfcabehicifechhabegcbahfcfhcfecbgdcdih",new String[]{"ccgabhhffeccbef", "hchea", "b", "h", "ehffc", "cg", "cghddi", "fbbcahie", "dgc", "cebddfcg", "eb", "bcg", "bcafebh", "chff", "ccbedgd", "hicibfcfabe", "cfa", "cahfb", "hche", "ic", "cdgifecchdb", "f", "fcab", "cfh", "iehicchf", "a", "bchha", "fbhafcc", "fici", "bhe", "iacchfehi", "ebag", "cbf", "ahhc", "cf", "fhegcbca", "bec", "cb", "hf", "eehcfibhfcahbcag", "efcgbbbehchfhhfcaacieih", "eccfhbf", "iacfcfeehbi", "hc", "ih", "bcbgeaa", "beg", "eba", "ef", "ihd"}) );
  }



  @Test
  public void test43(){
    assertEquals(17, solver.decompose("qeexwbyhmdqnjzavixdaygbcaclacmwhgepgqk",new String[]{"md", "xeqe", "qjdnymh", "bdyxehewm", "yhmd", "ccala", "n", "bcg", "cgaydcalbxmac", "kgq", "chwalm", "jaz", "vjnaz", "hg", "kghegpq", "qe", "hy", "w", "nj", "xajnqivz", "byag", "z", "wex", "gbayc", "d", "edjqynwheqxbm", "mewxbdehqy", "gqkp", "eg", "peghqgwkm", "bdqzvmjiywnah", "vjnaiyxdaz", "q", "wccalma", "mqkpegxacgaqwabyngcvzihwycblhqmjeaeddx", "gcbca", "cixdbgay", "ac", "zaxvid", "b", "wbeqex", "eqpgkg", "acml", "aidvxczabayg", "ayd", "acqcgehwgkmpl", "vaix", "c", "xbew", "pe"}) );
  }



  @Test
  public void test44(){
    assertEquals(0, solver.decompose("jjhqhmdqqnsqtsololiarelmisnargmlranfnhgiasrfmgfksf",new String[]{"k", "e", "q", "hhq", "an", "nh", "sq", "nf", "m", "h", "fk", "f", "r", "s", "sqt", "i", "o", "n", "nfn", "gh", "so", "dqm", "l", "is", "lmi", "rl", "jj", "lgrm", "llo", "sn", "qqn", "g", "li", "a", "qd", "rae", "fr", "el", "t", "nar", "ais", "nsq", "sk", "d", "j", "st", "qhj", "lo", "gm", "hm"}) );
  }



  @Test
  public void test45(){
    assertEquals(0, solver.decompose("aabaaabaaababbabaaaaaaaaabbbaabababbaabaaabbbabaab",new String[]{"baaaaa", "bbaab", "aaa", "aaaba", "aaba", "a", "bbab", "ba", "bb", "aaaaa", "aab", "abbaaabaaabbaabaaababaababa", "bababbabbaabbaaaa", "bbb", "aa", "bba", "b", "aabb"}) );
  }



  @Test
  public void test46(){
    assertEquals(0, solver.decompose("bacbaabaccabcccabcbcacabaabaccbaabaaaabbccbbcbccac",new String[]{"aa", "ccca", "cacb", "c", "bb", "cbccbbccaccacababbabcaaa", "cbaab", "cb", "b", "cc", "bbc", "abbc", "a", "cbc", "aab", "baabcaabacabcbcbaaacbcabcbbbabcaccccbbaaacacaacccb", "cac", "cccba", "aaa", "cbbcb", "abaaa", "ab", "aabc", "ac", "aacba", "acbabbacaccccaaacabbbabcba"}) );
  }



  @Test
  public void test47(){
    assertEquals(24, solver.decompose("badabdcbcbdedbaabdccecbcbcbaceeebdacddababecccaacc",new String[]{"ebde", "edbdbeeacccadabecca", "bbacccbebedcecaaeaccbddb", "dacbadbcb", "aadbb", "ca", "dadceabbad", "cacabcbbdcecb", "ba", "badeadbbddcbbc", "e", "a", "caac", "bcceedbdacbbbacedccdadcebabbabdecdbbdcaa", "edbccdcbdbaae", "dcdaabcecb", "c", "caacccce", "dacbddbcbcbcbcdecbabecdaeadcccdacbacbbbeeacaaeacbd", "abcbcb", "debabda", "cccaacc", "dbcecdb", "bceee", "accbbdbccec", "ed", "cca", "dab", "cbbdabc"}) );
  }



  @Test
  public void test48(){
    assertEquals(38, solver.decompose("ebdbdbbbabdaaadecdccbaedacccaaedecbbeceecbddeeecee",new String[]{"e", "eddeabaebcebebcecddbaebaaebbcdaedccebcddbaeaccecd"}) );
  }



  @Test
  public void test49(){
    assertEquals(45, solver.decompose("acaadeeeabceacbdadabebaeaaedcdcedacbbaedaaeaeeaccc",new String[]{"nywipsiajtixhuobzjlsrqknctqtzoklhyj", "jokulfvhvoukfkahiywkqfziulfqepzcvjhqjcfwxyg", "aaoucrnquyscgxsym", "ntxcctmytidsgrw", "shhzbkxdluaxjkpgibbbwpijgwkgnjalfw", "mr", "acedceacaea", "mxejcenthajfdg", "wsvusguwsvmwpqvygbpaspcwpzqtevegekcckirat", "cjjhsnmzhir", "lsp", "knjvxsmgauuuqrzk", "vtcxafzyjabqibk", "jgntqrfudhivtfpcjogpbaxwfxqkuzdxd", "ucfguydvj", "czdwmoqwpomogjhxkqnhhgqxsxinllrtkgppib", "qchudzdvoglip", "eebaaadccaddceeaebebbccaaddaeceabdbaeaa"}) );
  }



  @Test
  public void test50(){
    assertEquals(10, solver.decompose("ommklpqehjclmjncpopgjfngfodlmigcmdfnmindnmleiiffc",new String[]{"hj", "mclj", "lpk", "ldo", "dmn", "cmfnmdni", "mfdc", "dfjonfg", "fgn", "eii", "jmn", "gn", "pq", "f", "gp", "pmlccnjj", "dn", "mi", "d", "of", "c", "eq", "ppoc", "j", "l", "mom", "mncmdgfjgigfnmodlf", "jg", "mkmlo", "ml", "inimeld", "po", "pgo", "i", "nm", "ffi", "n", "qmcpekxapickctmulitjkzzqztepihr", "cf", "e", "opnqpmjhlclpjmckemo", "pheq", "glim", "ni", "mdf", "enlnimid", "fi", "lk", "g"}) );
  }



  @Test
  public void test51(){
    assertEquals(7, solver.decompose("egjqegfopgcpckogjqpeqflqqmmff",new String[]{"gp", "jqeg", "cgp", "lq", "ffm", "epq", "qpj", "ffqlqmm", "f", "go", "eqj", "ge", "ckp", "ff", "pcqogjkc", "mqq", "eqfg", "c", "utnphbyrmynokvv", "q", "ejg", "gefopg", "m", "p", "epkfgcpggpjoceqo", "qfle", "ogf", "eqf", "qm", "o", "lyweughtiibjqmdlxmpmhx", "qfqqfmfml", "pq", "gko", "j"}) );
  }



  @Test
  public void test52(){
    assertEquals(0, solver.decompose("s",new String[]{"fkslilgwztakkwcefpchshr", "dwtzyqfohjkjvfyea", "pyuumsvhes", "utubswwyoveedhxelynjgypfkguj", "yptgsfzxrpvfgsafqihtewdp", "sg", "tpmkkvqhhspbyormgfeycwz", "anqj", "jlezlyinayxfotxvlrmwtlabvei", "krsay", "efukdjghuvjmrifqeoh", "aytloppziwyhsafnpry", "gjxcgychbkrxmhylmmhzxezubfmwmmxhmbtymhmwnkaoaalkz", "whze", "pcwnipxpygjbbla", "qyhnb", "khlzyxegtxejpdrlwrxrsdxnexnfwody", "vclbxawc", "wcrytpceaaqnmwznbwgpyaozkivqzdtuyggmsbaaupjggej", "oktfzivfcdxitdviivoonpuh", "ilnxjhdcypdvxhueadwukhokarolkjplollviftr", "bapxxnhgon", "s", "fpljlewrvsgyahbhipdbmwanzi", "rbzluwsrqodlqd", "ddjsseoaoqayzydzndloedpdshvcputkhfowuto", "qyujyhbqgwgxajlykfcfnodftzgufomwwptsxqstttgbjvmsl"}) );
  }



  @Test
  public void test53(){
    assertEquals(0, solver.decompose("ja",new String[]{"ja", "pyroixzploajiufmvsumduwvqzrrluwq", "vntgfboqgspuwizqzkyzevr", "zndtvrhkcgacjqwoxpqvvyndkijbhwsmbpywgr", "annum", "wxkckzfegqzpcybzneitkzcruplrxjksbih", "vkmzugjoesbxkdeouwgyrnttfnshodwwvookcl", "vfshvivmlzvrrkjxzlghtgbfd", "qnejzifc", "wzmmsazeaepzaotcwiyeqbpenmxwmfm", "jmewzcztickufgrqfjtervauvxyqrugsaccbiid", "jtojaihtytcyjjnnpcaj", "kbggzwsjmdtcpiphknmiidjiqmg", "hkhedqsoxjhqccbesrsibma", "nwfngfawrubovzgpyqixkfwqzsspoescppeaugrfbnfnji"}) );
  }



  @Test
  public void test54(){
    assertEquals(3, solver.decompose("gjncubfsac",new String[]{"mmwwpmjetiwbyywzmutnpqpw", "imzrwfqoeqgfweswlwuolnbvup", "zlbnrariafynpcgoode", "ucjgn", "welcwgfsfcbmylwjv", "mfvegccuywojt", "dqflayxqgfrezpgv", "mhnamehnunhfygbezzxwjmraffwcoepeoqu", "wofiudarfcvrgqosgc", "fpvjrwfbaglutjpgjnbafbegumdgedb", "c", "txzakcynfcdbuepgudaeftsfrcxbszwrg", "g", "jn", "b", "uwekrvqvxmksaezvbordhfsqoirzlrrxmgpetjyfrsw", "oi", "pmfymvwoizyrum", "bcu", "f", "fsa", "hvjz", "as", "csaf", "ngj", "whvlulmaqkovijixfgu"}) );
  }



  @Test
  public void test55(){
    assertEquals(0, solver.decompose("hjcrjqjdhzymclshsfmsgkwbwnnrzqmrggesfvhjswarjvtrnd",new String[]{"e", "c", "f", "l", "ajllmxyqqnbehsvjxriqvqcsaoydcgxjfytaafhv", "rligdowckgaqbloporuerjrzsrukdgncpt", "spkfjyefbksymyrfprfbpuuonifrthxdtbkzvecxedfs", "y", "g", "v", "zgehoiwpyuperasvkzjtltzpfk", "w", "fxn", "tjdkojjhteognoxrwhvbwtwrnajsxuccimf", "ndpddxflkddrvjeyvafftilcefunjiyxrwtokaikogs", "xvqbpahcvjdapmeiujyncrjyejmjkcjrqogvzyochrh", "ydydjsrmsapcbtpapghx", "a", "ywsxwwlfbhkjkomdtsfnxovhjqmrg", "z", "qfblrybgwhgttwnbgyghiyxebrmcbmyhigbyq", "q", "h", "despwkupanbcab", "k", "s", "tewzgaweyblklfctzhsrlsivnovbnrlwacqac", "ffblrcjxyuiouqohibjywytnapjlxyldgqnck", "yxefoladz", "r", "zayvbfwxyizxpdrmiietvqsp", "hp", "vxzjizajiqxdegvmrqyznskrnjehzteq", "t", "tgwjamppxfgwyefgwvxmftft", "j", "b", "zdnhqjcvucqliiotntjltckseptutnfu", "ebkvvyugexn", "ptummkzjxdaai", "d", "psrzsllwuusfxjfcjvligasmua", "n", "ezqwfruomcvakwwzbyviaakxlbohzjwiiqhtib", "rcaseurkzsykpouielvxtzjlnvmqqdtbkzkmwyvwtyv", "zktiuptsjiscfvprdhgdgwzklbjvywclkriubhqvqhtr", "m", "bhsymssiajsqwtyzczdqttomutivzypvwodorrg"}) );
  }



  @Test
  public void test56(){
    assertEquals(36, solver.decompose("ekmmlglvplpszvdkinqpzvntuxsdxtxaiqrxrarpfybmdtbkpc",new String[]{"qovtzhbcnbhljtrdujnhvlalmgvyptyvacwgpcimsnptvi", "xrar", "vvcrpoanyvhjxauajkhmpkfpolrsnt", "xosujumsgiakptobbuwixkgnodcqoaylyeckwnnanockt", "sdcttxkdjdqpleabsxoovtebiwjeu", "emmkl", "kymdfbbpt", "ritsdotm", "xtduxs", "pvzn", "pc", "g", "qidvkn", "lslzpvp", "riqaxt", "yzmjixiduirpygxxqqapkawnisuxbzhrdzcelfpjgwkkhawqca"}) );
  }



  @Test
  public void test57(){
    assertEquals(25, solver.decompose("otkdgczpylzlvoiaauefleeitghftyjmmmjwetoqhomaihjfxk",new String[]{"w", "aai", "eowtq", "k", "ytmmjjm", "u", "tegi", "xhjfk", "xikfmojha", "zlvo", "lzioavyl", "feuel", "jewyjmmm", "vallozia", "g", "ohtq", "miofjah", "zplkzdgcy", "ot", "t", "iha", "gefthefiel", "tdk", "tetfijhgy", "mtooqah", "hf", "fj", "mmfhyjt", "hmo", "ovalai", "l", "fhkixaj", "qo", "x", "o", "gkopzytcd", "i", "ehifgte", "h", "kx", "e", "pyllzvgzc", "y", "ua", "mjmmw", "dogkzpct", "efl", "todk", "mwqmhtojeo", "liueaoeaf"}) );
  }



  @Test
  public void test58(){
    assertEquals(35, solver.decompose("scfeiqfifmolyiwqhqtcbsotyowdakthzklmokcvq",new String[]{"ialycjocgnhkvyhsnure", "ytfyiofoqcctwfsmislqebqoih", "etqtcwztyacyawov", "dsulstxkvlgsch", "pgmxnfkjnztriigaalsrxaqxlbaypukfcmawi", "wahzmkdtokl", "ykldtoszcoawhtbk", "kqvc", "wr", "wwrhitogccclosimxssolbhxoxgfaubceh", "bhjmrqidqnnuqcozkzue", "fjbsgppfdyzlzooommvggptwobqhblajgllt", "t", "mvockqklz", "hthobcwqdqasttyko", "lmyffeqwioicsif", "eiimoyfhftqqciwqlf", "s", "inoarftdnfbilfowmajxfvdwvzyealpydghnzchfppbs", "kmqcvo", "tsydkwwsyhfpbnpznctmijcvfwhnkye", "osozkh", "yzrppsdpnlxuasbypbsmuodhgdsnr", "nvuhtjfwifrntgbxkmmffs"}) );
  }



  @Test
  public void test59(){
    assertEquals(34, solver.decompose("jysohnwxsooodfmrhxczrqowxhgggbbilajwxnf",new String[]{"sibgcskjutlofvhxslgscmcrhgatmxppytqljufemk", "yfnninipoetesuazbqtzax", "cogyxdiuhzwnxrdzuumepiifw", "bqze", "bhgxrbjfmchgxosjhowoyaozogslwdinrxq", "bjgakyklvayvwnzugwicjebjaxupozvydnaoi", "qtdquxfqyooylvzhp", "maxfkjprcq", "ffhcvrlutjszyfnqszwqunhlbaajfxwtxoxgdumvqwonaxe", "ogiwxxqybfzalgosdnwojsrwhbhoxmjcxfnoghr", "chzaxzylamfvnfpdsnxtwiqqdm", "zmfmiinnjygignaipkvnnkrcyswrvhlzqiotxyhsqwnpxcskn", "quirtnfpimjhimgqxmeovgpvepfnqhvogyucjhfa", "bwwqxyg", "hlmlijjznobueqgisdudhwuojjkohhrvqeevtuqvqfytr", "fuwnhbbwntujt", "qbtrhldvzgsraupriauhccrqtphcdlfufczjvuwknqgazexhh", "inplmvzdwiduhrgttzppwkcvj", "oondfjlyjfyzda", "gblagwbjfngxi", "txtoet", "zozvqtoayrtmhwhqkzbxlg", "wlglxukxngchcpgwhqgqzzt", "lbxqzjgdctmchspyzlpwj", "nvt", "geerdimhpwcbblnzmaxztbosrjxbhgqjwqtojiwyj", "wxajphlkazwvoacndddxorrgtsawnyfokzvgy", "lkwomzqhwzqxskhneoovqzwwyhfhtfiahcauuwdrzmavvyk", "osonxswoxhorhjmyfd", "kyffbdoxhjqifgskepdqw", "mpkrkbyhygefghm", "ewtoxzlfcueidgiklsgkwgnuvsowuzwewgusjprojuzptsjjw", "xwnf", "qmlgxmjkvarufgzyeciymrwlhhehirkwrtkzwy", "bomwhmtywcxhfitjgdpasozvullhgpqnjjjkrvximd", "ttmredxydrlomqjhkkjaumi", "aferhpniczuqji", "kxqpkmfpphbbzfzngknuaumofwurojkaifgqgvtnugx", "zyixcktalnzqyvdn", "xrohzwcq", "cchpbsjdzeilrdyeprshmxqwzrsvccwyamixojxtozt", "sv", "zxnaekdqgkdlopjvyytqypqtoiyjv"}) );
  }



  @Test
  public void test60(){
    assertEquals(27, solver.decompose("hfdfeahhdbidcggffdicficagffaddchbcigefa",new String[]{"cdvbtxlpkynoiku", "jdsijyrmuciaxsvb", "a", "gfcdfbhhghfddiafed", "bohcznghfabrcjudhkbehvruhsrzqcn", "nkxbdvlfdgcegxysnmzxveltqipgghqzlargqotcdas", "ifddfchagac", "cif", "ffidgc", "g", "vrdqnrhvsifmeyrrzi", "hgbybpoastvdjopxqleiwrbccqkewmqijjus", "dsigosahnjfxwuyjdopwciuigltmnorxsvrl", "thwkvftjawkvkkdrusmregagjqfncgvbopftii", "cardiaqtioul", "snppjlhjkjjkijndusshclumxjqdmdtjlecijccxsmhtgt", "fadf", "dcig", "ojuffqkdiidwvazouqjhlnkevvdbqdfre", "gzzxklvqdawjetaonyuettxifevsjpgrblxnqofnfxg", "ccmrvnnoxcwouljo", "ihccdgb", "fzgzwjwxjktizocxrhbaqrfhnbpevsvxqsefsctyxgndi", "abegicf", "bycjxcdzii", "aqyagbbwwdsffzjqsqorpytefgdesxwq", "febjqhah", "i", "fe", "uld", "adghfiaccgifefdieidffbdhggfcdahcfbfahcd", "bd", "haeh", "jkmmiprdqunrwzp", "dffh", "tzcofjnfqcwxdnqleftrnyoiuqp", "gsjoddfixvdpjbxnemzwmvbrexpoye", "cfia", "paulilmwafnxgptrhcegpblzxcngefcebwscxdjmqamfxneqq", "lnpfmphctkjahr", "qrawteikglfjhsplhnmpbqzhnluqabvvytbybo"}) );
  }



  @Test
  public void test61(){
    assertEquals(25, solver.decompose("efaidfhceaecihgaacfgeccbhigcbfihegbbiia",new String[]{"zgxjfaqzgnjepoddjbivxkieuknaiuuxvkag", "jgatkizstqhp", "zzkyekhbhhrnblcjdkfnsjzbrdurdvmf", "wrujt", "lrzxhikjqmtdaxcdcqvbviezzgsljuvtwbjmi", "ecgbchcf", "yqzntpkxmsciqijdqeerbudqpdrhevrdmteylfdt", "jftdzkpwnwlssqbekpnyfjwzlehxpykmx", "wrujt", "caahfaiiagecehgcdeff", "usxfvapsdfiqpsmtnkqfzgpojzllmpeb", "sgwsxzpmfdueo", "usxfvapsdfiqpsmtnkqfzgpojzllmpeb", "sdtvxmtyoimzhhtiulbnduokgvseucguuadjxcjlnxgqx", "ajsnytjbkysvjxgdgvboqkrsk", "uibnvfkeeyfiiztednebawgxezxymwstbcmsojq", "fecgc", "eaf", "igiabibfiebghc", "wrujt", "ebeiciibgbhfhgcibca", "jyfmeunvqlprsmxr", "i", "binepewekzaiou", "bicbghf", "ulunhphupppenfdpejzdztvggzulo", "eaf", "lhqrnynvzoluccaicaeixmmusmqhojfzyrcv", "bayuflqtspjmdmsmihtgwvavgqnrqvmby", "bghe", "jyfmeunvqlprsmxr", "caag", "mytaortpfjaijnodhnxb", "nxummrxapcpdxtvzxzssrnuymdrmpweuohcukyf", "hziceptxgrsmltguaoelav", "ajsnytjbkysvjxgdgvboqkrsk", "akjqhvranqfwdnhzrqgwrnfhrlapwkpmsopecant", "ihaagechfadafecie", "aecih", "uibnvfkeeyfiiztednebawgxezxymwstbcmsojq", "jyfmeunvqlprsmxr", "jyfmeunvqlprsmxr", "cfheid", "eaf", "koqclmzy", "njhpbgbgwtfgjxaclxkgxohffstamamtwjwklpurrgdx", "drlejckilezkbpg", "binepewekzaiou", "sgwsxzpmfdueo", "iaib"}) );
  }



  @Test
  public void test62(){
    assertEquals(2, solver.decompose("iecabccgdhibiebdcfchfehccfchfadbihcghgibbabhffeidf",new String[]{"dgcc", "ibd", "g", "chib", "cfc", "fei", "dh", "di", "c", "hfa", "dfachcf", "ba", "ebaic", "novuf", "fche", "ch", "ce", "t", "hfb", "zfuggthgwdf", "f", "kpxutteecflgaspspcueuxqemsxyzpdwlekykjhztztzlo", "h", "hfcfec", "ghg", "fd", "db", "gh", "diebbi", "e", "gc", "bi", "oryagmafuutfsqjwsdrdoffeavl", "ffeh", "gcdch", "d", "fh", "ig", "ghc", "uexfnppqdfwn", "nptqmkjoubdwlle", "bbia", "ihb", "adf", "he", "fbdce", "bbaib", "i", "b", "erzs"}) );
  }



  @Test
  public void test63(){
    assertEquals(4, solver.decompose("hcfiacbhccfbaggbhecdhehchfeieeiegdffiaahcieddebcgi",new String[]{"ee", "dbeed", "edg", "ff", "ce", "ee", "eded", "e", "cfb", "dh", "bggh", "chf", "bhc", "ic", "cf", "eegie", "echfehi", "hgcbe", "gdff", "chf", "cehhd", "gi", "bigc", "ihc", "gag", "h", "bc", "dde", "aia", "i", "ef", "hb", "aah", "fcbacg", "cig", "d", "ei", "ech", "iac", "dbeed", "ccbch", "c", "hceif", "cig", "afci", "aah", "ia", "fab", "acih", "h"}) );
  }



  @Test
  public void test64(){
    assertEquals(0, solver.decompose("aaccbabccbbbbcaacbccbcaabcbbbcbabaaccaaccbccabbaac",new String[]{"caccba", "cc", "epa", "caac", "abaa", "b", "caccba", "c", "babbbca", "qmgowrvzd", "bcaba", "bc", "tyxhifisbbnjdhpvlslqqamnjatpitol", "abacacb", "tyxhifisbbnjdhpvlslqqamnjatpitol", "aca", "bcbb", "acc", "bbbb", "vwpjxcoizlqyaxsqpxvkdmvazrbpjworosfzftuixh", "caab", "bcaca", "jvmjagfqqumywzqhhntbgsddmjocedyfbtgabekqmexgxfnj", "ca", "cccb", "cccabcb", "bcb", "caccba", "tyxhifisbbnjdhpvlslqqamnjatpitol", "cab", "cacbb", "abacacb", "c", "c", "xhflerllwwclnxzsvukrvvqullsxttekcnd", "caac", "ozjrbldnijydcqyajmdocdcinwfvqu", "bcaba", "caac", "ccabc", "ab", "nlxjlajuqpmlmkgfrzovqlmquspqdrhctplu", "c", "tyxhifisbbnjdhpvlslqqamnjatpitol", "baab", "ca", "nzrdxogtqgqfkfxrwmfcpcmyjfal", "abaa", "ozjrbldnijydcqyajmdocdcinwfvqu", "aa"}) );
  }



  @Test
  public void test65(){
    assertEquals(8, solver.decompose("bccccaaabcaaacccaaaaacabbbcccbabbcabccaabcbacacbcb",new String[]{"a", "bbca", "a", "aaacb", "tbyjphp", "bbca", "txywddtnbrjhjjncyyldfoifzxaszcvklupoyeb", "rtaewtox", "bbc", "bcc", "bcc", "abca", "bacaaaa", "bcabc", "babaaccc", "cbbba", "aabaabac", "babaaccc", "a", "bcabc", "cbcbbacb", "abacb", "bbcccaa", "c", "cc", "bccc", "bccc", "bac", "babaaccc", "rtaewtox", "caacbcaac", "caacaccb", "cacccb", "caacbcaac", "aca", "dxizpgbeavbwboyehwuwrnouvtmbgrvouddyx", "bccabbacc", "bbca", "acaa", "aaa", "aabaabac", "afsmaukgqtfuhopwqxfejjdbljzcfmixvlvvcyg", "bcc", "aabaabac", "afsmaukgqtfuhopwqxfejjdbljzcfmixvlvvcyg", "cbcbbacb", "txywddtnbrjhjjncyyldfoifzxaszcvklupoyeb", "aaacb", "ccaa", "encemanewrmuhkhakbrvkhejrkqmiomjcwv"}) );
  }



  @Test
  public void test66(){
    assertEquals(0, solver.decompose("adbaaddeaeabbdeadacdcaebdbeeddcdabbdcdbaeabaeeaeba",new String[]{"daaabebbcdcdddceee", "dd", "eca", "baddadaadaebabcaeacaaeddabecaedacdbaaedcdcddbbdc", "cbaeddbbaacbdabbdeeebbacdbcbcedecdeadaee", "ebe", "bcbbabddeceabccccdcdbbbeddabbbebeaaddeb", "eab", "a", "ea", "ada", "ddc", "ddaacdbeedbbbcedbded", "bcdd", "dbaeedbddbaebeebbececbbbdbacbccdaddaabdeadbaacbbc", "dbaa", "ad", "bba", "bda", "aded", "decd", "ed", "bda", "ddbaebadccbbcbadabccbbcdcbadedcaebcaddebacbdbae", "ba", "ea", "bed", "eacedcbedccacedacdaabdcceedbdbbcbeaaecbddb", "beceadbdddaaadecded", "ccbdcacbecebecbbbdebbcbdadeaeadcdbbbcbdeccecebabda", "abcb", "cd", "aeea", "ed", "db", "bda", "bb", "dca", "d", "c", "cabde", "b", "ecdcbbcbdaebaedbbaeedadadcacaabcbaaabbdeaedbec", "ebabeeddebdcdcb", "ee", "aab", "bdbbbaedbabccdeaddacedcedaeeeccabe", "e", "bdacaebbcceaadbcbcdebaddcceedbeea", "bbda"}) );
  }



  @Test
  public void test67(){
    assertEquals(0, solver.decompose("bccaccaacacaaccaccbcbcbabcaaaccaacacabccaaacacabbc",new String[]{"caacc", "cabbc", "bcccbcabbacabbbcacaabbccbaabbabccabbbccb", "abb", "acccacbcccbcbbabacbbbbcc", "bcabbbaccaacccabbbaaac", "b", "bbbabcaabcbcbcba", "c", "ccabacbbacaacaaccaacbabcbaabcaacccccbabacacbbbaba", "a", "bbcbccbababaacbaaacaaaaaaccccbbbcaaccabab", "cc", "aa", "cbbaabcbbccaaa", "aaa", "c", "bbac", "ccbbcbbacbbaaabbcc", "ccab", "ccb", "cabcbbbbacbc", "bccac", "caaa", "acccbaacbccbccacacc", "bcbbcbbcaacabacbbccabcbaaccbccbcaaaaaabacacb", "cac", "cabbc", "bbcbccbababaacbaaacaaaaaaccccbbbcaaccabab", "ab", "b", "acccacbcccbcbbabacbbbbcc", "aaccaaaaaaa", "aac", "abccbbc", "bccbbbbcaaabaccccbbaaccacbbaaccbaacca", "aababcababcaababbbbabcac", "abb", "aac", "acac", "cb", "bcccbcabbacabbbcacaabbccbaabbabccabbbccb", "bbaccabcabbbab", "bbaccabcabbbab", "bbaaaacabaaacaaaabaaabbaccbacbaccccba", "ccacbcbaaaabacbaaacccbcbbacacbaccbbababbbca", "acaccbbacababbacbbacbacbaccbbbbcccc", "aabcbccacbabcabcb", "ca", "cbbaaaaaacbbacbcbcb"}) );
  }



  @Test
  public void test68(){
    assertEquals(0, solver.decompose("cbbbaacaabbcaaabaabaaccbaaccaccbaacbbabccbbacbcccc",new String[]{"aba", "bcb", "cacababaaabcbccaacaabaabaababcabbcbb", "abca", "a", "bcbacccbaccabacbcbaccbcaaccabbcccabbccacabbaaaa", "ccb", "bbba", "ab", "abb", "cbcc", "bcbcbccaaccaabbcabbacbabacccbccccaaacbcacbabacabcb", "acac", "bc", "cbbac", "abbcabbbbabaaac", "ac", "caaa", "baacaabaa", "accabcaaacccbcbacbbabbcabcbaacabc", "cbacbcb", "c", "aabcbbacbcbbbaccacccca", "caa", "cbccabbcbbaabbaccacbabbaaccccacccaababcabcbbcaaabc", "cba", "abacb", "abaa", "bcbacccbaccabacbcbaccbcaaccabbcccabbccacabbaaaa", "cccb", "cc", "cbaccabab", "accac", "acacaabacbacabacacababcc", "aacb", "baaccbacacaccacbbbabca", "bb", "cbccc", "babaaccc", "bacc", "bbacb", "ccbab", "babacabbbacacaaacabcccabbbabbbbca", "accccbcccaaabbbaaabac", "aabcbcbbaa", "bcbbac", "babc", "abaac", "b", "acbacca"}) );
  }



  @Test
  public void test69(){
    assertEquals(0, solver.decompose("bbbabaaaaaaaabaabbabaabbabbabbbbbaabaabaaabaabbaab",new String[]{"aababbbabb", "a", "baaaababab", "aababbabbaabaaabbbbb", "bbaabbbab", "aab", "bbbbbb", "bbaabbbbbabaaba", "aabaababb", "bbb", "aa", "bbaaababababaaabababbbbabaaaababb", "aabaaabaaaababbabbbbbabaaabbaabababbb", "bbbbbbbbbabbbaabbba", "aaaabbabaaabaaabbabaababbaa", "aaababaababbbabbabababbababababba", "baaaa", "aaabbbbbaaabaabaaaabbbaabbbabbaaaaabba", "bbbbaa", "bbbabbbabbbabaabbaabaaba", "ababba", "bbbaabbaabab", "bbaaabbaaababbbaabbaaaa", "babbababaabbabaabbbb", "baaa", "babbbabaabab", "bbab", "baaaabaabbabbbabb", "ba", "bbbba", "bbbbb", "aaaabbbaa", "abab", "bb", "aaa", "b", "bbbabbabbbbbbabbaabbbaabaabbabbbbaa", "a", "bb", "babbbbabaaababaaababbabbaba", "bbaaabbaaababbbaabbaaaa", "bab", "aababbaaaaaababababbbabaaab", "aaaa", "aaaaa", "aabaabbbbbbbabbabaaabaaaabb", "babbbbabaaababaaababbabbaba", "b", "abaab", "baabb"}) );
  }



  @Test
  public void test70(){
    assertEquals(0, solver.decompose("bbabbaaaaaabaaaabaabbbbaaaaabbbabbbbabbbababaabbbb",new String[]{"bb", "bba", "aa", "aabaa", "abbbb", "bbb", "aaaaaab", "abbaab", "bbabaabbbb", "ab", "bbb", "a", "aaaabbbbbabbaababbabbbabbababbbaababbbbbaaaab", "bba", "aaaa", "bbb", "bba", "aabaa", "bbbbaba", "b", "baa", "abbbb", "abbabb", "bbbbaba", "abbabaaaaaaababbabbbaabaaabbbababbab", "baaaaa", "abbabaaaaaaababbabbbaabaaabbbababbab", "babb", "bbabaabbbb", "bbb", "aaaabbbbbabbaababbabbbabbababbbaababbbbbaaaab", "baab", "aaba", "abbabb", "bbbbaba", "bbbbaba", "abbbb", "a", "bbabaabbbb", "aabab", "baab", "aaaa", "a", "ab", "aaaa", "bbbbaba", "a", "bbb", "aa", "bbb"}) );
  }



  @Test
  public void test71(){
    assertEquals(22, solver.decompose("hbdfbgabccagfiiggdihgdabhfghhibadcbghdcggdgcaahagi",new String[]{"gdhba", "bcabd", "caggd", "dgbah", "bagcc", "igdgh", "ghhif", "ihgfh", "faiig", "afgii", "agccb", "bbdac", "ggdhc", "aahig", "agdcg", "cgagd", "gadgc", "dcabb", "ghdgc", "aahgi", "hcdgg", "bghad", "gihfh", "ggcdh", "gifai", "hidgg", "dfbbh", "bbdhf", "ghihf", "hagia", "agiif", "gidhg", "dcbab", "ifhhg", "hbdfb", "agdbh", "cgbac", "hgdgc", "dcgag", "cdabb", "cgabc", "gaifi", "aaghi", "ighgd", "bccga", "bbdhf", "dihgg", "gdhba", "agiha", "hfbdb"}) );
  }



  @Test
  public void test72(){
    assertEquals(-1, solver.decompose("mpgacoiztqssujwcyokpwunnnxgjcbisdgjuoqdiswormjebxr",new String[]{"gxn", "zti", "juw", "gmp", "kwp", "gpm", "nnu", "coa", "oac", "pkw", "oca", "nxg", "gnx", "aoc", "sqs", "wkp", "jcb", "izt", "xng", "wju", "kpw", "tiz", "ocy", "jbc", "ssq", "yco", "wju", "zit", "wuj", "ocy", "pgm", "qss", "qss", "nun", "pgm", "tiz", "pkw", "jcb", "cjb", "juw", "coa", "yoc", "nnu", "gmp", "qss", "unn", "xng", "yoc", "bjc", "unn"}) );
  }



  @Test
  public void test73(){
    assertEquals(-1, solver.decompose("ewtzksfkfpdvwurpzynkynxtqomjjvtvpmhfeyngrwjitwnjob",new String[]{"ruw", "tew", "pyz", "jjv", "fkf", "ffk", "skz", "dvp", "ykn", "etw", "yzp", "etw", "oqm", "moq", "ksz", "zks", "vjj", "tew", "nyk", "omq", "mqo", "wru", "ypz", "ffk", "tnx", "pvd", "vjj", "ffk", "jvj", "kny", "wur", "jvj", "zks", "urw", "vpd", "szk", "ynk", "kff", "dpv", "xtn", "ntx", "ntx", "mqo", "yzp", "ntx", "vpd", "wur", "tew", "zpy", "nky"}) );
  }



  @Test
  public void test74(){
    assertEquals(23, solver.decompose("izzzoxghoyrbbiwealjzaxmskpmdptsxjzuccsoequaqsnatnf",new String[]{"pmkd", "sxma", "zizz", "qaqu", "sant", "oxgh", "atns", "ibew", "csoe", "ceos", "zzzi", "pstx", "dmpk", "xmsa", "ntas", "zjla", "yrbo", "xhog", "hgxo", "xhgo", "jzuc", "esoc", "beiw", "xspt", "qqua", "zjla", "zziz", "amxs", "jazl", "xtps", "xsam", "ptxs", "jalz", "uczj", "ewbi", "yrob", "fn", "ewbi", "uqqa", "auqq", "zucj", "jcuz", "ceso", "tsan", "rbyo", "dmpk", "zzzi", "kdmp", "broy", "fn"}) );
  }



  @Test
  public void test75(){
    assertEquals(19, solver.decompose("nlngqslfokoeltjhibkhthgsaebqsfamidiqfnkbsfksaarokl",new String[]{"ooek", "lqfs", "samf", "ltjh", "thgs", "aeqb", "bkhi", "kssf", "koeo", "ljth", "fknb", "ssfk", "msaf", "qabe", "kbhi", "slfq", "sfks", "nlgn", "ngnl", "lk", "iidq", "bkih", "iqid", "fnkb", "idiq", "raao", "aaor", "beqa", "lqfs", "skfs", "aoar", "nfbk", "oeok", "safm", "ngnl", "aaor", "hjlt", "bnkf", "flqs", "lthj", "hsgt", "qaeb", "lk", "lnng", "hsgt", "qdii", "kbhi", "keoo", "ghst", "safm"}) );
  }



  @Test
  public void test76(){
    assertEquals(22, solver.decompose("bdcabibdcghghjecibdcgdjafjfhffeffcfbcejahgahfijbae",new String[]{"fbji", "ajce", "fhjf", "ae", "hagh", "jffh", "feff", "fbij", "dacb", "bcda", "hgha", "ehcj", "aejc", "ajdg", "fibj", "gdja", "efff", "efff", "gjda", "bidb", "hgcg", "ghha", "jech", "abdc", "dcib", "ghcg", "bdbi", "ea", "hggc", "gjad", "caej", "cbff", "abcd", "dbbi", "bcff", "idbc", "bjfi", "cidb", "jfhf", "ceaj", "bidb", "jech", "cggh", "cbff", "hhga", "ffef", "icbd", "ffbc", "jche", "jffh"}) );
  }



  @Test
  public void test77(){
    assertEquals(7, solver.decompose("bbaabaaaaaaabcaacabbcabcccaacaabaacbcacbcbcbbccacb",new String[]{"cabc", "cbac", "aabc", "bbca", "acca", "abac", "cb", "aaaa", "cabc", "acbc", "bcab", "caab", "acab", "cbcb", "aaaa", "abaa", "cbaa", "cacb", "acac", "aaba", "aabb", "ccbb", "cbac", "bbac", "cbca", "aabc", "baca", "acac", "bbac", "bbaa", "baaa", "abac", "bcbc", "bbaa", "bcca", "abab", "cb", "aaaa", "ccaa", "cacb", "caba", "cbac", "cbca", "bccb", "bacc", "acba", "abca", "aaaa", "abca", "baaa"}) );
  }



  @Test
  public void test78(){
    assertEquals(6, solver.decompose("zxzzzzxzxzyzzzzyxyyyxxyxyyyzxxzyxzzyxxzxxxzxzzzxzx",new String[]{"xzxy", "xxxz", "zzxz", "yyzy", "xxyx", "zzzx", "yxxx", "yzzx", "xzzz", "yyxy", "zxzz", "yxzx", "yxzx", "zzxz", "xxxz", "zxzz", "yxyy", "zxzz", "xzxx", "xxzx", "zzzy", "xzxx", "zx", "yyyz", "xz", "yyxy", "xyxx", "yzzz", "yzyy", "zzxy", "zxzz", "zzxz", "zxxx", "yzyy", "yzxz", "zxxx", "zxyz", "xyzz", "zyzz", "zxzy", "zzzx", "zzzx", "xxyx", "yyxy", "xzxx", "xzzz", "zxxy", "xzzy", "xyzz", "yzzz"}) );
  }



  @Test
  public void test79(){
    assertEquals(2, solver.decompose("llklkllkkkklkllllklkkklklllklklkklklkllkllkklllklk",new String[]{"lllk", "kkll", "klll", "lllk", "lkll", "lkll", "lkll", "klkl", "kkll", "kkll", "klkl", "lk", "kllk", "lklk", "llkk", "lkll", "lkkl", "kklk", "kkll", "kllk", "lkkk", "lkll", "lklk", "kkll", "kkll", "klkk", "kklk", "lkll", "klkl", "kllk", "klkl", "kl", "kkll", "klll", "lklk", "klll", "llkk", "klkk", "klkl", "lllk", "lkll", "lkll", "kkkl", "lkll", "klll", "lkkk", "klkl", "klkk", "kkll", "kkll"}) );
  }



  @Test
  public void test80(){
    assertEquals(0, solver.decompose("aaaabbabbbabaabbbbbbbabbabbabbaaaaaabbaaabababaaba",new String[]{"bb", "ab", "aa", "aa", "ab", "bb", "ba", "bb", "bb", "aa", "aa", "ba", "aa", "bb", "bb", "ba", "aa", "ba", "aa", "ba", "ba", "bb", "aa", "bb", "aa", "bb", "ab", "ab", "bb", "aa", "ab", "ba", "bb", "aa", "aa", "ba", "bb", "ab", "aa", "ba", "bb", "aa", "aa", "aa", "bb", "bb", "bb", "ab", "ba", "ab"}) );
  }



  @Test
  public void test81(){
    assertEquals(8, solver.decompose("babaabbbbbbbbbbbababbabbabaaabbaabbaabbbabbbbaaaab",new String[]{"bbbbababbb", "baaaabbbba", "bbbbbbabab", "abbbbaabbb", "babbbaaaba", "babbabbaba", "abbbaaaabb", "bbbbbbabab", "babbbbabbb", "bbaabbabaa", "aabbabbaab", "bbabbbaabb", "abbbbabaaa", "baaabbbaba", "abbbaababa", "babbabbaaa", "baabbababb", "bbababaaba", "abbabbbbaa", "bbabbabaaa", "aabaababbb", "baabbbaabb", "babbbbbbba", "bbbbbbbbaa", "bbaababbaa", "bbbaabbbab", "aaabbbbbab", "bbbbbababb", "bbbabbbbaa", "bbbbbbabaa", "bbabbaabba", "bbbbabbabb", "bbaaabbbab", "babbabbbba", "babababbaa", "aababbbabb", "aababbabba", "baabbabbbb", "baabbaaabb", "bbbbaababb", "baaabbbabb", "babbbaabbb", "baaabbbabb", "bbaababbbb", "bbaaaaabbb", "ababbbaaab", "bbbaabbbbb", "babbbbaaaa", "aabbbababa", "abbabbbbbb"}) );
  }



  @Test
  public void test82(){
    assertEquals(17, solver.decompose("cbbaabaccbcacbbacababbcaaccaaaacbccccbcaccbcacbcab",new String[]{"accabcaaba", "babccccacb", "aabcacbcbb", "ccbaabbccc", "bbaaacacac", "ccabccccab", "acbccacbcb", "bbacacacaa", "cbabccccba", "aacbbbacca", "babacabcbc", "ababcccaab", "bacbcbaaca", "cccaccbacb", "caccabcbcc", "bcacbcccac", "ccbacccacb", "cbcccabacc", "baabcacacb", "acbbcbbaac", "abbbacccba", "cabbaacabc", "ccaababaca", "cbbacccacc", "cbaacaaabc", "cabaaabacc", "cbbcbaaaac", "accababbcb", "bbbccaacaa", "bccaaacaba", "accabbbbac", "aacbbaacca", "cbaaccbccb", "cccacbabbc", "baaabaccca", "baccccbacc", "acaababacc", "caacbccbcb", "accbcccacb", "abaacacbbc", "accbcbaaba", "bcccaacbbc", "abaccacbab", "abaccbbacb", "bbcbaccaba", "bbcaccbacc", "aabcbaccbb", "cabacbabcb", "cbccabbacc", "accbaccccb"}) );
  }



  @Test
  public void test83(){
    assertEquals(16, solver.decompose("caabbbcacaaccacaacccbcaaacaaaabcabcbbbbcccacaabccc",new String[]{"aaacccac", "acacacac", "bcacccaa", "caacaaab", "abaacaac", "cbbbbcba", "cc", "aaccbbba", "cc", "bccaacca", "ccbaabab", "acacacac", "baaccbba", "accabcca", "bacbbaca", "ccbaaaaa", "baaacccc", "caccaabc", "accacbca", "bacacacc", "baaacccc", "accaaaba", "bbacbbcb", "caacbbab", "cbbbbabc", "cabcbbaa", "acccaabc", "cccbcaaa", "aaacccac", "aababccb", "cccaaaca", "bbbbbcac", "acbcccaa", "cbcaaaaa", "ccaaacac", "acccabac", "bcacaacc", "bbbccbba", "cacccaba", "aaaabcac", "bbabcbcb", "aaabaacc", "bcbacbbb", "abbacacb", "caccacaa", "aacaccac", "cacacacb", "aaccabaa", "bbcbcabb", "aaccacbc"}) );
  }



  @Test
  public void test84(){
    assertEquals(34, solver.decompose("farnkasicvayezmgckwtduunscbgikxwwunbkffygbweyxqtsd",new String[]{"sibkgxcw", "bckigwsx", "nukfbwyf", "kifnaars", "funwyfbk", "gxiskbwc", "macygzev", "xegqtwyb", "wundcutk", "btewqyxg", "zecvagym", "wdunuktc", "yamgvcze", "wytqebxg", "xiwsbkcg", "faarsink", "sd", "fbfnkywu", "ucdwktnu", "cwukudtn", "uffbynkw", "biwkxscg", "bxsigkcw", "gyzeacmv", "aniafrsk", "afiasnkr", "iksrafan", "nfiraksa", "yvmagecz", "teqwxgyb", "uwnfkybf", "gzycevam", "twkcnuud", "wgxbskci", "udnuctwk", "inksafar", "bgwyxqet", "uwckudnt", "aegyzvcm", "tdunkwcu", "cbxikwgs", "ainaskfr", "fwnfkbuy", "wgxteqby", "evcgzmay", "yewxqgbt", "uknbyfwf", "gwxebqty", "uyfkbnfw", "sd"}) );
  }



  @Test
  public void test85(){
    assertEquals(27, solver.decompose("mkcssxwjkkylkjputgzbiofosiltsteihadlhjrxkypkzsesjv",new String[]{"zotgfobi", "ogbtzfio", "otgboifz", "sisettli", "bzfgooit", "uyklkpjk", "scwsmjkx", "pkklyjku", "stileist", "syzkkpes", "titlessi", "oozfgbit", "xhjadlrh", "cxwkssjm", "sesykzpk", "skxmwscj", "jkkypkul", "tesiltis", "ofzgotib", "iittssle", "kupkjkly", "ogitbofz", "hhlrdaxj", "hjhrdlxa", "mswkcxjs", "kkkjplyu", "kzkseyps", "vj", "kyjlkpuk", "ttileiss", "kxwjsscm", "yeskzspk", "dajlhhrx", "tigobofz", "cwxmsskj", "skeyskzp", "wsjsxmkc", "xkwcsmsj", "kyeskzps", "lkupjkky", "stieilts", "sitleits", "lxjdrhah", "zyekskps", "kpjyulkk", "raldjhxh", "vj", "hjxdlahr", "pkskszye", "lhadxjhr"}) );
  }



  @Test
  public void test86(){
    assertEquals(-1, solver.decompose("qutmansnlvsxcniwnizskzpgywbedlfixfiodiplxanhsbpogl",new String[]{"snl", "man", "nsl", "tuq", "utq", "man", "qut", "nma", "qtu", "snl", "nls", "lns", "sln", "qtu", "anm", "qtu", "uqt", "anm", "nam", "qtu", "qtu", "snl", "vxs", "snl", "lns", "vxs", "uqt", "tuq", "amn", "qtu", "qut", "anm", "mna", "man", "mna", "mna", "anm", "snl", "utq", "lns", "sln", "nma", "uqt", "man", "uqt", "lns", "snl", "nsl", "mna", "snl"}) );
  }



  @Test
  public void test87(){
    assertEquals(-1, solver.decompose("nhgufibafujilzkdtvvglddfxkjfthfnfmtmvnsclkgizvkysg",new String[]{"ufi", "uji", "ufi", "nhg", "fiu", "ufi", "hng", "gnh", "ifu", "bfa", "ghn", "gnh", "hgn", "fba", "gnh", "fiu", "fiu", "baf", "hng", "fui", "ufi", "iuf", "ghn", "ifu", "fiu", "afb", "bfa", "bfa", "ngh", "fiu", "uif", "abf", "nhg", "fab", "ifu", "jui", "hng", "hgn", "fab", "abf", "abf", "gnh", "fab", "hgn", "iuf", "abf", "fba", "bfa", "hgn", "afb"}) );
  }



  @Test
  public void test88(){
    assertEquals(-1, solver.decompose("adnkqhqwjlpfawhttruwluyvezotvkaopuxawtddnmcryihf",new String[]{"nda", "qwj", "qjw", "wqj", "plf", "kqh", "hkq", "dna", "adn", "hkq", "and", "dan", "nda", "nda", "hkq", "dna", "qwj", "qkh", "hqk", "qhk", "hqk", "dan", "khq", "jqw", "jqw", "adn", "dna", "qkh", "kqh", "jqw", "dan", "hkq", "jqw", "adn", "jwq", "hqk", "qjw", "wjq", "qwj", "qwj", "khq", "dna", "and", "lpf", "jwq", "nda", "wjq", "hkq", "qjw", "hkq"}) );
  }



  @Test
  public void test89(){
    assertEquals(24, solver.decompose("ypxgkrdcdhsjwcoohpnhuxjskaonowqdaaxiqrbeuswemlwd",new String[]{"hnhp", "jsux", "dhsj", "weus", "xaia", "aonk", "rbeq", "uwes", "gypx", "owco", "pnhh", "cowo", "djhs", "nhhp", "nkao", "xjsu", "bqre", "xaia", "rdck", "lmdw", "dqwo", "bqre", "pgxy", "gypx", "sjdh", "aokn", "kcrd", "sxju", "aiax", "nhph", "ldwm", "crkd", "mlwd", "qdwo", "owoc", "qwod", "noka", "jsdh", "owco", "wuse", "rdck", "sjux", "dwqo", "ypgx", "uswe", "mdwl", "xaia", "ebrq"}) );
  }



  @Test
  public void test90(){
    assertEquals(17, solver.decompose("mmfmbhfoiphckfbiogfjihfmofjpmnadikdiioamcdfoebli",new String[]{"ilbe", "adnm", "ohbf", "jgfo", "iamo", "ocfd", "hmif", "opfj", "elbi", "hfob", "cdfo", "omai", "imao", "eilb", "leib", "idik", "ojgf", "kifb", "fbho", "ihpc", "hifm", "kfib", "fogj", "kidi", "iikd", "fkib", "cfdo", "ojpf", "madn", "nmda", "fikb", "oami", "hfim", "bohf", "mmmf", "phci", "ihfm", "pihc", "jfpo", "pfjo", "pcih", "mmmf", "idik", "mnad", "mfmm", "fdco", "jogf", "mmfm"}) );
  }



  @Test
  public void test91(){
    assertEquals(25, solver.decompose("lonocpjofmlfjlieglmgdacpbabbgmjendpgndfbhbnnempg",new String[]{"gdnp", "dbnf", "iejl", "nool", "pcoj", "gmgl", "jgem", "lfmf", "ilej", "bbab", "nhbn", "pmeg", "jmeg", "dnbf", "nfbd", "gdpn", "pdca", "dgpn", "glmg", "nhbn", "nool", "ljei", "mgej", "jcpo", "adcp", "onlo", "flfm", "gpme", "bhnn", "opjc", "glgm", "pcad", "mepg", "leji", "nloo", "jopc", "nfbd", "bhnn", "bbba", "cdpa", "gmlg", "gndp", "emgj", "mpge", "abbb", "mffl", "babb", "mffl"}) );
  }



  @Test
  public void test92(){
    assertEquals(16, solver.decompose("bfdeedfeafdefbacccbcdfbafacccdbfdcdddfcddffdedcd",new String[]{"edbaf", "afefd", "dbfee", "bffad", "edefb", "fbeed", "fbeda", "cccda", "fdbcd", "cfddd", "ccbcc", "ffedd", "edebf", "dcacc", "cdd", "dcd", "cdd", "dccca", "efadf", "beedf", "deffa", "cccbc", "fdeab", "dfddc", "dfefd", "ddeff", "cadcc", "cbccc", "efdfd", "cdd", "afefd", "fdabe", "fabde", "cdddf", "dfbaf", "afdfb", "ddfcd", "affed", "ddc", "ccccb", "dfdfe", "bdffa", "fdcdd", "bfdaf", "ccccb", "ddbfc", "dfdbc", "cbfdd", "ccdac", "dfdcb"}) );
  }



  @Test
  public void test93(){
    assertEquals(0, solver.decompose("caaac",new String[]{"cacaa", "acaac", "caaac", "cacaa", "aacac", "ccaaa", "acaac", "ccaaa", "acaac", "cacaa", "ccaaa", "aaacc", "aacca", "cacaa", "caaac", "acaca", "caaac", "caaca", "accaa", "ccaaa", "caaac", "cacaa", "caaca", "aacac", "aacca", "aacac", "ccaaa", "aacac", "aacac", "ccaaa", "aacca", "acaac", "caaca", "aaacc", "acaca", "cacaa", "aacca", "caaca", "acaca", "cacaa", "acaac", "acaca", "caaca", "ccaaa", "aacac", "acaca", "acaac", "aaacc", "accaa", "acaac"}) );
  }



  @Test
  public void test94(){
    assertEquals(4, solver.decompose("acbbbaacbbcacaabbbcacbccbcaacaaacaaabbcbacaaaccc",new String[]{"aca", "bab", "bcc", "acc", "aaa", "caa", "bac", "aca", "bbb", "abc", "aaa", "cab", "cac", "bac", "aaa", "ccb", "bcc", "cba", "cba", "abb", "acb", "caa", "caa", "cba", "bca", "aaa", "acb", "cab", "caa", "bbc", "ccc", "bcb", "bbb", "bab", "bac", "aaa", "caa", "acc", "bca", "abc", "ccc", "ccc", "caa", "aaa", "caa", "cab", "cbb", "bbb"}) );
  }



  @Test
  public void test95(){
    assertEquals(0, solver.decompose("abbbababbbabbaaabbbabbbaababbabbbbbaaabbbbabaaab",new String[]{"bbb", "abb", "aba", "abb", "abb", "bbb", "abb", "bba", "baa", "aab", "bba", "bba", "abb", "bbb", "bab", "baa", "abb", "abb", "bba", "aba", "bba", "bbb", "baa", "abb", "bab", "abb", "bba", "bba", "bba", "bba", "bba", "abb", "bba", "aba", "bba", "aab", "aab", "bab", "bab", "baa", "aba", "bbb", "aba", "bab", "aba", "aba", "aab", "bbb"}) );
  }



  @Test
  public void test96(){
    assertEquals(2, solver.decompose("abaaaabbabaababbbbbbabaaabbaabaaaabbbbaaaabbaaba",new String[]{"abab", "aaab", "bbaa", "aaba", "abba", "abaa", "abaa", "aaba", "abab", "abab", "bbaa", "aaba", "abab", "abbb", "bbaa", "aaba", "baab", "aaba", "aaab", "aabb", "baab", "aaba", "aaab", "aaba", "bbba", "bbbb", "bbab", "abba", "abba", "bbaa", "baaa", "abab", "aaab", "baaa", "aaba", "bbbb", "baaa", "abba", "bbbb", "baab", "abbb", "baab", "aaab", "abaa", "bbaa", "bbbb", "abab", "baaa"}) );
  }



  @Test
  public void test97(){
    assertEquals(2, solver.decompose("bbbabaaaababbaabaabaaababbaaabbbbabaaaaaaaabbaab",new String[]{"babb", "babb", "abaa", "aaaa", "babb", "aaab", "babb", "aaaa", "bbaa", "aaab", "abba", "baaa", "baab", "baba", "aaab", "bbab", "bbaa", "baab", "bbaa", "abaa", "aabb", "aaaa", "bbaa", "abab", "abaa", "aaab", "aaaa", "abab", "abaa", "baba", "baaa", "abba", "baba", "bbab", "abab", "bbba", "baaa", "abaa", "aaba", "baab", "aabb", "abab", "aabb", "babb", "aaba", "abaa", "baba", "aaab"}) );
  }



  @Test
  public void test98(){
    assertEquals(4, solver.decompose("bbbbacaabcccbabbcbcaabaabbbcbcbaccbaaccbbbcbbabc",new String[]{"cacb", "cccb", "bbbc", "cbac", "cbbb", "bbbb", "aaca", "aaca", "abcb", "acbb", "bcac", "bcbb", "cbbb", "cbab", "abaa", "bbbb", "babb", "acbb", "aaac", "bcba", "bcca", "ccbc", "bcca", "aaba", "bbbb", "aaab", "cacb", "acaa", "bccc", "cbca", "abbb", "bbba", "cbcc", "bbbb", "bbcb", "acbc", "abbc", "bbbc", "bacc", "bcca", "ccba", "cbbb", "baaa", "cbab", "bbca", "acbc", "bcbb", "bbba"}) );
  }



  @Test
  public void test99(){
    assertEquals(14, solver.decompose("cacacbcaabaccbcaabaaabbaccbbcaacbacacbbaabcbcbcb",new String[]{"aabcb", "bacbc", "abacc", "bcaab", "caacc", "aaaba", "bbaca", "accac", "accac", "cacbb", "bbaac", "bcaba", "baaaa", "acccb", "ccabb", "abbcc", "acabb", "abcab", "aaaab", "cbcac", "cabca", "aaaba", "ccabb", "babca", "bbcaa", "cbcab", "caabb", "accbb", "acbcb", "bacab", "cbb", "acccb", "cacba", "abcba", "abbac", "bcb", "cbacb", "cbb", "cbb", "cccab", "bcbca", "aaaba", "aabcc", "ccabc", "acabb", "accac", "caacc", "bacab", "bbc", "cbaca"}) );
  }



  @Test
  public void test100(){
    assertEquals(14, solver.decompose("cbababbccbcacacacabcaabbbcccbabcbbcaccbbccabbabaab",new String[]{"abbab", "abccc", "aabcc", "babaa", "bacbc", "bbaab", "ababa", "caabc", "cbbbc", "bcbcb", "baaba", "cbbac", "cccba", "cbbbc", "accca", "abbab", "bccbb", "abbba", "cacca", "acacc", "abcba", "cbbcb", "bbcbc", "bcaac", "acbac", "babab", "baccc", "bbccb", "cbcbb", "accac", "ccabb", "cbbcb", "babac", "abbcc", "ccaca", "baaba", "bcbaa", "bccca", "bcbca", "cabac", "bbcac", "cbcab", "cbcbb", "cabbc", "babaa", "bcacc", "abbcc", "cbbaa", "cbaab", "bccba"}) );
  }



  @Test
  public void test101(){
    assertEquals(19, solver.decompose("acacabacacbaabcccbacaaacacabccbabcabcbbacabccccbcb",new String[]{"aacacaacbc", "acabaaccca", "aabcacccaa", "acbbcacbca", "bcababacbb", "acaaacacbc", "bcccbcaaab", "bccbbacaac", "aaabacccca", "ccacaacaba", "abbbabccba", "abccabccba", "abacbacccb", "baabcbbbac", "cabbccbccc", "bbaabacbcb", "cacbcaacaa", "caaacaccab", "cacaaaccba", "ccbccbbacc", "cbcbaccbcc", "acbbcccccb", "aaacbaccac", "ccaaacbcbb", "bcbacabcac", "bbbcacacac", "bcbbababac", "acacaabcac", "accccaaaab", "cacbbbaabb", "cbccabcccb", "aaccacacba", "cbccbbcacc", "cccacbaaaa", "bccbbabbaa", "cabacacaac", "cccaaaaabc", "cbcbababba", "cbcbccacbc", "caabbacbbb", "acbacaacac", "abbccccaba", "cbcabcacba", "aacbcacaca", "aaacccbaac", "bcbbccccca", "bbabbcaacb", "bcbccbccca", "acacccbaaa", "ccacbccbbc"}) );
  }



  @Test
  public void test102(){
    assertEquals(10, solver.decompose("bbbbbabbbbaababbbbababbaaaaababbbbbbabbaaabaabbbaa",new String[]{"bbabbbbbbb", "abbbbaabba", "ababaaaaab", "babbbbbaaa", "bbbbbabaaa", "bbbaabbbbb", "aaaabaaabb", "aabbabbaaa", "bbbbaabbbb", "aabbbaaaab", "bbabaabaaa", "bbbbbbbaba", "baabbbbbbb", "aaabbabaaa", "bbbbbbabbb", "bbbbbbbbba", "bbbbbaabbb", "baaaaababb", "bbabaaabaa", "aaaabaabab", "baabbbbbaa", "bbbbaabbaa", "babbaababb", "babbbbbbba", "aaaabbaaab", "babbbaaabb", "bbbbbbbbaa", "bbabbbabbb", "abaabbabaa", "bbbbabbbbb", "abbbbbabbb", "bbbbbbabbb", "baaaaaabab", "aababaaaab", "aababbaaaa", "aabbbabbab", "bbbbabbbbb", "bbbbaaaabb", "abbbaaaaba", "bbbbbbabbb", "abbabaaaaa", "bbbabbbbbb", "abaabbbaaa", "aaaabbabba", "babbbaaabb", "bbbbbbbabb", "bababaaaaa", "bbbbbbbabb", "bbaabaaaba", "babbbbbbab"}) );
  }



  @Test
  public void test103(){
    assertEquals(12, solver.decompose("bbbaabaababbaaabbaaaabaaabbaaabbbaabbbaaabbbbaaa",new String[]{"babbaaaaabbb", "abbababbaaba", "abbbaabbbaaa", "baabbabaabab", "baaaaabbbbab", "aaabaaabbbbb", "abbbbaabaaba", "baabbbaabaab", "abaabaaabbbb", "bbaaaaabbabb", "abbbabaabaab", "baabaaabaaaa", "babbaaaababb", "bbabbababaaa", "aaabaabaaaab", "baaababbabab", "babaabbbabaa", "abababbbaaba", "bababbbbaaba", "aaaaabbaabaa", "baaabbbbaabb", "aabaababaaaa", "bbaababbabaa", "aabbbabbabab", "ababbbbababa", "baaaaaaabbaa", "bbababaabaab", "babbbaaaabbb", "aabaaaaababa", "aaabbaabaaaa", "aababbbbbaba", "abbbababbaab", "aaabbabaaaaa", "bbbbaabaaaba", "bbababbabbaa", "ababbbabaabb", "baabaabababb", "baaabbbbaaba", "abbbaaaabbbb", "aabbabababbb", "baabaabaaaaa", "aaaaaabaabba", "ababbababaab", "aaaabbbaaaaa", "baabbbabbaba", "babbbbaaabaa", "aaaaaaababab", "aaabbbbbbaaa"}) );
  }



  @Test
  public void test104(){
    assertEquals(4, solver.decompose("aabbbabaaaabbbaabaabaabaabbaabbababaabaaaaaababbbb",new String[]{"aabbb", "bbabb", "baabb", "aaaba", "baaaa", "baaaa", "ababb", "babba", "bbbab", "aabbb", "babba", "aaabb", "baabb", "abbaa", "aaaab", "abaaa", "babba", "aabbb", "bbbba", "abbaa", "abbab", "baaaa", "babbb", "aaaba", "bbaab", "aabbb", "bbbaa", "aabbb", "abbbb", "aabba", "babba", "baabb", "aaaab", "bbbaa", "aaaba", "aaaab", "baaaa", "aaaba", "aaaba", "aabaa", "abbaa", "aaaab", "bbaab", "aaaab", "bbaab", "baaaa", "baaaa", "babab", "aaaab", "aabaa"}) );
  }



  @Test
  public void test105(){
    assertEquals(16, solver.decompose("bbbaababbaaaabaabababbbaabaabbbbabbbaaabbaababbaba",new String[]{"babbababbbbabaaaaabbabbba", "aaababbabaababbabbbabaaab", "bbbabbbbaabbababaabaabaab", "aaaabbbabbbbaabbaaaabbaba", "aababababbbbbabaaaababbaa", "abaaabbabbbaabbbaababaaba", "bababbabbabbabbaaabaabbab", "aabaaabbbbbababbbbaabbaab", "bababaaababababbaababbbaa", "bbaabbababbbabaaaabbaabbb", "baabababaabaaababbbbababa", "bbaabbaaabaaabbbbaaabbbaa", "babbbababbabaaababbabaabb", "abbbbbababaaaabaabbbbabba", "abbaaaaabbabbabbbbaabbbab", "bbbabaaababaabaabbabbabaa", "baabaabbbaabbbabaaabababa", "abbbabaaabbbabbbabababaab", "aaababbaaabaabababbaabbbb", "bababaaabbaabaabbbbbbbbaa", "bbbbbbaaaaabbbbabaaabbbaa", "bbabbaaabbabaaaaaababbbab", "bbababababbbbbbbaaabaabaa", "abbabbbabbbbaaabaabaaabbb", "baaabaaabbbabbabbbabbbaba", "abaaaabbbabbbbaabababbbba", "aaabaaabbabbbabbbaaabbbaa", "babbbaaabbaababaaaaabbbba", "bbbbbabbbababbabaabaaaaab", "bbbbabbabbabbaaababaabaab", "abbbababbaaaabbbabaaaaabb", "abbbbabaabaabababbbaaaaab", "aabbbababababbaaabbaaaabb", "ababbbaaababbababbbaabaaa", "bbbbbababbaabbbaaaaabaabb", "babaaaabaaababbaaaabbbbbb", "bbbabbaabaabaabaaabbaaabb", "baaaababbabbbbbbbbaaaabab", "bbaabbaabaaabbbbbaabbbaab", "bbababaabbabbababbaaaaaab", "baaaabaabbbbaaaabbbbbbbba", "babababbbaaaabbbbbaaabbba", "aabbbabbbababababbbabaaba", "aabaabbbbbbbbbaaaaaaaabab", "aabbbbbbbabaaaabaaabbbaaa", "bbabbbbaaabaabaababaabaab", "baaababbabaaabbbbbaabaaba", "bbabbaaaababbbbaabbabbaab", "aaabababbabbbabaaaaaabbbb", "abbbbabaabbbbabbababbaaaa"}) );
  }



  @Test
  public void test106(){
    assertEquals(12, solver.decompose("aaabaaababbbbaaaaabaabaaaaababaabbaaaabaabbbbaabab",new String[]{"aaabaabbabbbaaaaabaa", "bbaababbba", "bababbabab", "aaabbbaabbabaaaaaaaa", "bbbaabbaba", "abababaaaaaabaaabbba", "bbaabaaaabaabaaabaaa", "aababaaaaaaababaabbb", "ababbbbaba", "abaaaaababbaababbaaa", "aaaabbbbaaaabaaabaaa", "aaaaaaaaabbbbaaaabba", "abbbbaaaaaaaababaaba", "baaabaaaabababaaabab", "aaababbaabbaaaaaaaab", "aabaabaaaababbabaaaa", "abbabbaabaaaaaabbaaa", "abbabbabba", "aaaaaabaabaababaaabb", "aabaaaabbaaaaaababab", "aaaaaaabaabaabbbaaba", "bbbaaababaaabaaaaaaa", "abaabaabaaaababaaabb", "aaaaabaabbbaaabbaaab", "aabbaaabababaababaaa", "baabbbaabaaaaababaaa", "baaabbaabbaaaaaaabaa", "abaababbbb", "baabaabbaaabaabaaaba", "aaabaaabbbbabaaaaaaa", "ababaaaaabbaaaaaabba", "abaaaaaaaaaabaababbb", "babbaababb", "baaaabaaabaababaaaba", "babbaaaababaaaaaabab", "aaaaabbbaabbaaabbaaa", "aaaabbbaaaabaaaaaabb", "baabbaabaaaaabaaabaa", "bbaabaabbaaaaaaaabaa", "baaabaaabbbbaaaaaaba", "baabaaabaabbaabaaaab", "bababaaaaaabaabababa", "aabaabbbaabbaabaaaaa", "babbababab", "baaaaaaabaaababbbaba", "aabbaaaaaaaaaabbabba", "abbbaaabbb", "baaabbabbb", "aabbabaaabbaaaaaaaba", "baabbbaaaaaaababaaba"}) );
  }



  @Test
  public void test107(){
    assertEquals(0, solver.decompose("abaaaaababbaabbaabbbbbabbbaabbbababbabbaaabaabaaaa",new String[]{"abbaaaa", "aaabbaabbabababbaaba", "abaaababbbbaa", "aaabbbaabaaa", "ababbaaaababbbaabbaa", "bbbaabbaababbbbababb", "abababbabbbb", "baabbabaaabb", "aabaaaabaa", "bbbbbabaaabbbaabbbab", "baaaa", "aa", "babbbbbbbabbbaaababa", "babaab", "b", "bbbbbabaabbaabbabbab", "bbabbbbbbabaaabbaabb", "abbbbaaaaaababbbbaaa", "abbabba", "a", "abbbabbbbbbaaabbaabb", "aaababaaaa", "abababaabaababbbaaba", "aaaaabaaba", "aaabba", "bbaaabaaabbbbaababaa", "aaabbaaaaa", "abbaa", "bbbbabaab", "aabaaabaaa", "baaaaabaaa", "aabbbbababaabaaabbaa", "bbbabaaab", "baaabbaabaaaab", "bbbbbbbaaaabaabaabbabbbbaaaabb", "bbaaaaaaaa", "bbabbbbbababababbbbaa", "aaaababaaa", "abbbabbbbabbbbaaabba", "aaaabaaaba", "bbaabbabbbbb", "babaaabbaabaaababbba", "aaaabababbbbabbabaaa", "aabbabaaababbab", "babbabbbbbaaaaabbbbb", "aabaababbabbbaaaabba", "aaabaaaaba", "babbbbabaabbbbbabaab", "abbaabbbbbaabbabbbab", "baaaaabaaabababbabbb"}) );
  }



  @Test
  public void test108(){
    assertEquals(10, solver.decompose("aabaababbabaaaabbaababbbaabbbbaabaaabbbaabaaabbbbb",new String[]{"baabbbabbb", "bababbbaab", "babaaabbbb", "abbbaaabbabbaba", "babbbaabbb", "baabaaabba", "aaaabbbaba", "bbbbbbabaa", "baabaabbbb", "baababbbbb", "bb", "aaababbaab", "bbbb", "aabaaaabbb", "aabaaabbba", "babbbabaab", "bbbaaabbbbabbbbaababaaaaabaabbaaa", "bbbbabbabbbaaaaa", "aaaabbbaab", "aababb", "abbaabbaaa", "baaababbaa", "abababababbbbaaabbbaaabbb", "aaabbaabab", "abbababaaa", "bbbb", "abbbaabbba", "aababbaaab", "babbbaabbb", "babbaaabaa", "aaabaabbab", "baaabbbaaa", "aababababa", "baaababbaa", "abbaabbbbb", "bbababbabb", "abbbbbbaab", "babaaabbaa", "babbbaabab", "bbabababba", "baaabbabaa", "babababaaa", "abbbaabaaa", "babababaaa", "babaaaabba", "aaaabbaaaabbbbaaaabababbabbaababaabbababbb", "aababaaabb", "babaabbbaabaababaaaaaaaaababbbbbabb", "bababbbbaa", "ababaababa"}) );
  }



  @Test
  public void test109(){
    assertEquals(29, solver.decompose("klkzxxrvadadnsxehkyhciyjokldhpbtroeufbeongmdyzawfd",new String[]{"dvrxa", "klzxk", "cuooenhdfbjhgkyirbhyeptokl", "sxdan", "khdlp", "breto", "ymgnd", "zadymw", "otbpehr", "ykehh", "zlkxk", "ofbeu", "uobfe", "pkdhl", "wdazf", "etrbo", "azdwf", "oyijc", "wzdfa", "xvrad", "keyhh", "rtboe", "lzkkx", "mgdny", "boert", "bhrpodt", "dlhpk", "d", "fuebo", "rxvad", "jyyikhco", "ikcyhjy", "kzkxl", "axsnd", "jicoy", "ykehh", "yojci", "rldkndkaecxahibksolyvxyjxphhzkd", "ocijy", "dxnas", "bueof", "hehyk", "dxrav", "bhoeioucjtyprlhkd", "wdfaz", "odtnbdmzefgepuohyrab", "kdhpl", "mgndy", "snxda", "gndmy"}) );
  }



  @Test
  public void test110(){
    assertEquals(30, solver.decompose("keozrxmybdzjxnwdtcvrgelwddxzgtytpdpbterhcossexrxmw",new String[]{"sceos", "rplctjgwzewzddgtxnvtdyx", "kzero", "gxzdt", "kroez", "osesc", "bt", "eokzr", "trcbeh", "ddygnybgdprzxmtdvxxzdwcejtwplt", "znxwj", "mbydx", "gtzyxd", "dxbmy", "dppty", "dwzdxdertttgypcgdlv", "kzeor", "mbdxy", "gledw", "vtgdgwzzxydetnlwxctrjd", "mrxxw", "xgdzt", "hbter", "gdelw", "rtehb", "cdrtv", "ltecgvrd", "soc", "pytpd", "tvrcd", "tehrb", "zxgtd", "vtcrd", "secos", "jzxwn", "wlged", "nzwxj", "bdxmy", "mxwrx", "pydtp", "osesc", "xwmxr", "glewd", "erhtb", "ssco", "ppdty", "wnzxj", "tdrvc", "mxwrx", "gzxdt"}) );
  }



  @Test
  public void test111(){
    assertEquals(36, solver.decompose("cizyiwahvokgjumfbtcdzsuxesjqoawuyyztphaqkcnxrbrwks",new String[]{"autzwoysdzqjxcyseu", "uuxybjpkzomgadyahjqoavssthciyzewtuzfwiqc", "rb", "brkwxrs", "paytzh", "k", "prchwkqxrbsank", "nx", "c", "rbwk", "qxckrbwarnk", "jxqse", "w", "qyuaswjeox", "wr", "xnbcrk", "k", "rbwrxn", "kzcwysomptewiaiajujasdqukxqyvfbhzoythczgcu", "s", "xnr", "s", "wkr", "uaymiciozhvgfjtwbk", "atckpqzh", "xrrwb", "wyaypzhtou", "n", "srxrknbw", "k", "rhcrpwqtbkanyzx", "r", "krcxn", "arusyxzhontkepxjacwqqy", "skw", "xbnrr", "xkbwrrn", "y", "rw", "hawiovzckyi", "ykpqahzt", "ks", "swk", "wehstdzcosypyauuxjqz", "ztpyh", "tzhkbiymwiagcfuuosvjcdz", "rxn", "xbnr", "wkr", "y"}) );
  }



  @Test
  public void test112(){
    assertEquals(40, solver.decompose("wwuylryacauhtptzrcktmosuuevjzyatvmxhqxryeecejyfgpx",new String[]{"fpgx", "emuxeszpfykqyzctetwrpjcuycmhljthruyyuvavxxrataoge", "ww", "gf", "yxegjfp", "yrlozhtvttkyzaersypumavautmjcuc", "yul", "rwlyywu", "yuyrl", "g", "cchatxxscpteerurezjfymyguytvpezyqhokjvtaaumx", "eyfj", "zhxyjacqtcmoutmsytrkztuyrxyavepluharv", "souhtktztcmpzurevj", "tmthxvkuyuasoevcmzj", "hrtzrmuptalctyvzaukyjcsuueo", "yrzpuluatyacwrht", "umzcatkuaazyrjohevtpcutsry", "x", "wwu", "rwuly", "ehxmzrvyoyusxjqmktutva", "zvvjzkayaxtetuceurchtxetyhaomeqpsmyyjucr", "grqcexfyjeepyx", "cpuryxtevmayjaxzejtmkaozphucvyqrrshugclfetyyet", "w", "gpx", "px", "jfey", "gf", "gp", "gvrzmatfstujyhxetvqeouzectyekyhaacjmcppuxr", "g", "yfej", "yezjmxtraexvqevuuyh", "yruqctutkfegxszcyahvepmjmvjyoxee", "aucthmsqjxvzzacvaurxlhrruyyptettkyumyowe", "varexuumeyjxvqtyezycjeh", "c", "suptrhzktucyjvemotz", "exehevmtqxrayyyfjc", "g", "arvtuehrcjyyuyavztxtlkmaeoqxtuchczempusyr", "x", "wmapuhzjfrprcyutkyuhvectycartuxxtgeawzvmleyoqjyes", "fejgy", "ecee", "hacztrapkrytmsyluctou", "ucaa", "cwphatvlhseuamyxkutqzomrcjytyuvuztra"}) );
  }



  @Test
  public void test113(){
    assertEquals(3, solver.decompose("nnkamcnlywen",new String[]{"nacnmk", "n", "n", "ywel", "y", "e", "wamklcyn", "naklcym", "wly", "lyn", "lcknmynna", "e", "e", "nnkcalmn", "clnamnky", "n", "klanymnc", "l", "wy", "y", "lwenny", "lywamckne", "ln", "wyen", "nnwley", "ak", "n", "e", "ly", "nywe", "ne", "mkca", "w", "n", "nn", "w", "w", "nmcnknyal", "nn", "ywnl", "ne", "wknlyncman", "en", "wenlny", "n", "kncmawlnye", "ew", "ynl", "nckma", "w"}) );
  }



  @Test
  public void test114(){
    assertEquals(27, solver.decompose("dxqxsladhunhblyvflkbohvljvfvajxgbxfop",new String[]{"obvskglfqxfjxxabvudnvljlxhhvdfhlaoyb", "f", "x", "jfvvl", "f", "ofp", "xxgbfoj", "jxfgxb", "o", "f", "xjag", "pfo", "f", "jlafjvv", "fx", "pxbjgxfo", "x", "p", "qsddhxyalbxulnhv", "gabxxj", "vjxgbxpafof", "xbgx", "p", "axj", "xudndhaqxls", "bgvjvxaljf", "of", "xb", "fx", "a", "l", "vhvjjyhoblbklvlffav", "p", "p", "lvj", "jgxxba", "fpo", "bsodhylhvkvladqulbxxfnh", "bofgxp", "xjabopfxg", "abfxxjg", "p", "p", "fop", "fbx", "vfxgjbvalxj", "xf", "oxbf", "xbf", "xg"}) );
  }



  @Test
  public void test115(){
    assertEquals(2, solver.decompose("lnwjhrmhouso",new String[]{"mjhhr", "m", "rhm", "hrlwjn", "uo", "rm", "huomsr", "rhojumh", "soouhm", "husoo", "o", "uhosom", "mh", "suo", "o", "h", "s", "ou", "hj", "uos", "hmou", "r", "lrnwshoumjoh", "sou", "nlw", "shuojromh", "o", "omrh", "o", "rosmhuo", "so", "so", "ouormsjhh", "mrho", "mhohjur", "mr", "huo", "u", "o", "rjmohshuo", "o", "os", "o", "uoos", "hjrm", "rhj", "s", "o", "jhr", "s"}) );
  }



  @Test
  public void test116(){
    assertEquals(2, solver.decompose("qyfpaurgfbzkr",new String[]{"gfzbk", "yq", "fugbypkrfaqz", "r", "rk", "kfypzqgbaurf", "g", "fzb", "agzrpufb", "b", "rk", "bz", "qpyfa", "fkzgbr", "p", "r", "zk", "fpa", "fyaqfgrbup", "kzbr", "f", "r", "razkugrbfp", "paurg", "kzrb", "uqprafgyf", "gakzprufrbyqf", "rkzb", "zk", "rzk", "ap", "f", "r", "yupqafr", "gbf", "fg", "pfa", "zkb", "g", "yugpkbzfqrfa", "z", "gbzf", "k", "bzgf", "fzkb", "rk", "z", "yq", "rgu", "u"}) );
  }



  @Test
  public void test117(){
    assertEquals(28, solver.decompose("ciyruvulvabwqykibqcbzfunpaetkwhvxiyxcjji",new String[]{"ewqfhwbviuvbbixyyanczckprvlqiakuyut", "jcyxiixj", "yricu", "xhwivy", "cwjxyxvihjtk", "hvw", "c", "wqbcqiky", "ji", "ehxiaubqcbypqiwtznwfykkv", "cjx", "ji", "vnqpqafewbuurzyavycbubilkic", "vyckybbwiqucablquirv", "j", "ewphtuank", "lwnyvebqrtycziickvbfaauubqupk", "unzwkaeptf", "ijj", "hxitkwv", "trevvkavwuiyizbkqbupbfqyccnlwahu", "icxxvy", "yxvi", "c", "epfkzawtun", "aezpunf", "jxixytwkvch", "cijj", "aunfkbvwtpehzx", "vujwijnzkfyciexhtxap", "y", "thkw", "whv", "i", "i", "ix", "wtk", "hvktxwi", "xyxi", "wh", "cyjxxvi", "yjxicj", "yvaruubilv", "iyxv", "xhwkivt", "cxj", "xi", "ivxh", "fz", "i"}) );
  }



  @Test
  public void test118(){
    assertEquals(14, solver.decompose("uwdcxlivgexbtpseczblgdkcp",new String[]{"epbsgzlc", "gld", "kcgdp", "czgepdpcblkts", "cuxwd", "uwd", "ceplbzgsd", "dtxpedibsbcxvcwglgzel", "sgeebxiwulxpgvzcdbdltc", "vxilcgtexb", "u", "cvtizplwcbxesxlbdcuekgdg", "weiltggcbxvlbcpzsdxe", "pc", "ezcbl", "ixelcetdcgvwpsxb", "xbtescpe", "g", "dlgbezc", "kd", "pes", "d", "p", "kdpc", "evxgbil", "cgkpld", "vli", "es", "lkdg", "p", "pbszce", "s", "eepibzxgstlbcv", "lgvi", "ldbzgcecpsk", "bclkzcgd", "sxeeptb", "glpbdeszc", "gbexcxtdluiwv", "cplgsbze", "dkpglc", "glzxspcbiexwbdeduvtclg", "lbcz", "p", "p", "ppelxkvsbxegdcgzdtuiwbclc", "p", "cezb", "beclpstbvilxzeg", "spe"}) );
  }



  @Test
  public void test119(){
    assertEquals(23, solver.decompose("aipidnavczjuibygmflahuuhwdtlbnrmoroh",new String[]{"uhwhu", "h", "o", "roo", "ulhtdwu", "l", "h", "o", "mroorh", "bnmror", "dwuuht", "ltdb", "h", "fgcuzhnaabuimpahiliduwjvy", "lbdwhuut", "norrom", "o", "roomnr", "n", "uhhtbudlw", "nrb", "auhyiawuugcfilbmnhpidjzva", "dlt", "dmbljavpcuiaaynzgifi", "ouhrlbwthonumdr", "romo", "nbl", "twduh", "uiaabmoodhgftvbrnwzpujmalirychinldu", "brtrmldno", "whudt", "nmhrboordlt", "lrmbdtn", "whhuudt", "dtl", "uabivliraomzhdtchflagduuibrmjnwypn", "h", "htlwdubn", "u", "izduamhpagiyjvfilcabn", "ufwibibpnlyltihuhzuadcgajamvd", "huuwhdt", "n", "hmoor", "mo", "noodhmrrltbuhw", "uwh", "morrbnl", "o", "td"}) );
  }



  @Test
  public void test120(){
    assertEquals(24, solver.decompose("vajynabffupskowtjpybrsoqyacamptrqamcl",new String[]{"aqycmaop", "l", "cm", "l", "bjuavfpaskfny", "jtypswuobkp", "ytjowyoqrpbs", "aopmkanrawfcsmsqbrtlofpuaqypyacjbvytj", "a", "pbfkfaus", "yajnv", "pokmwbspjycrtaaqoy", "pm", "bafupsf", "crmpat", "qpraamt", "l", "qmparat", "t", "pbryj", "lc", "tmrp", "t", "cratrcamaysopqqml", "fjypbutsfpaswbokr", "atocyqlarsmmqapc", "armqacltmpc", "qypaqomccmtsraa", "amapct", "a", "q", "qmaactrpm", "l", "lcmqa", "pma", "qtrcmaap", "tmrpaaq", "c", "navajfbfy", "ca", "owyfkaqrausjnbsjfoytbpayvp", "captoqaayqmrs", "sqcaoy", "tqmpar", "c", "cm", "lcaqm", "wroptbyj", "mtpr", "pkwusto"}) );
  }



  @Test
  public void test121(){
    assertEquals(9, solver.decompose("kluedyjwjgswnttfosggug",new String[]{"gu", "gjs", "nsftgwtjogs", "lwdkuyej", "swogftntg", "ugg", "tn", "ggug", "jsgfttwnos", "tswnt", "g", "ytksuoelgwtnfwjsdgj", "gtungssjgotwf", "wn", "gtogfs", "tfnwgutgsgo", "gskujnfedlgjwgsoyttw", "g", "gugg", "os", "gu", "gugg", "nwtgtfgjoss", "f", "jg", "ug", "ygeujwkswdjl", "wtnstg", "g", "j", "fuggos", "u", "nttf", "osf", "towfsjntgs", "ggsugo", "g", "g", "usnogtftgg", "wsgnj", "otgfgs", "gu", "twn", "sjnwtgt", "g", "logysjtesuggnjftdkwguw", "ug", "ug", "gws", "u"}) );
  }



  @Test
  public void test122(){
    assertEquals(27, solver.decompose("xqbuwdmnmdhhmsieygchfeudflfuyupimaxjfkuni",new String[]{"k", "nfku", "y", "mfxiaj", "imjax", "i", "nuk", "kf", "nledsgcefypwuhdmuayhmidufxifxhubqmm", "fdleuf", "im", "lqadfhyuedwceufugmfxhxbpnidsimhyumm", "bmxhuqdmwmndh", "axmipubhmxcfinhmddweljdsfuuymygfqeuhf", "cshegyi", "k", "xgcffalpisdkuyeujuufemhfyni", "dfpyfulufeu", "niku", "jaimx", "xmai", "uyp", "uupuyfeffidl", "niu", "ecydgfhisue", "i", "j", "imp", "fpujmyixa", "inukfj", "yluffefdu", "maxfjki", "k", "amupiyufuxffflekdj", "fkniu", "f", "yfpuuxiam", "i", "ef", "cixelusujffhiymipkgdnfufueya", "euiygefayhfdsxpcilfmuu", "un", "wsyhumdnhedgibxmmduceqfh", "ymmephshumfffuibwlijauedymcfxinquunkghxdd", "uhnhbquelukyefwimdpuyncfdhijfmadgfxummxs", "eudyifhwyqmfmujbnxifcfaghduhpulmsxkumend", "eycuighefs", "fuuy", "mxuapji", "iceyuehusfgfdfl"}) );
  }



  @Test
  public void test123(){
    assertEquals(21, solver.decompose("nurgddgnbvrgolozvpvoyahkyhvbduimxiw",new String[]{"udibm", "vhvyaykho", "bvgndnugdr", "oydyapvhuilbvrhkovmgoz", "hbxyvihdukm", "x", "oykybhhvvad", "miux", "v", "y", "w", "umiix", "iimwbudx", "x", "vorolvzopg", "ndngrdpbolrgvguozv", "mixiu", "xwimi", "vpvhlagkyyooroz", "iixum", "h", "ayzrovhidikowhyulboxgmpvv", "vpbluovydgyrgghonoakrdnzv", "xmwii", "mx", "i", "zvvopo", "wi", "w", "xvibmuid", "bimud", "hvadixihkwyovbyum", "ogopduzbvodnvadryggkyubvhlhnrv", "iiwmx", "hyvbamxkyuidh", "imwixu", "dokhvybhvyau", "poazyvvo", "bvidu", "dbvh", "rlhzoovybnddgnavropkgguv", "uodvlrgndgrgnb", "khyydovbahv", "i", "bvyhd", "w", "dngur", "i", "ybvh", "umi"}) );
  }



  @Test
  public void test124(){
    assertEquals(3, solver.decompose("ciskvjjezbqi",new String[]{"ej", "c", "iqb", "zqjieb", "q", "ci", "zej", "zjvekbj", "j", "vekszijj", "qbzje", "jezj", "ibezq", "cvjejisk", "q", "q", "jej", "cikvs", "i", "jibqezj", "sjkv", "j", "iksvc", "jqbizvekj", "jijcvks", "qib", "zsicvejjk", "qi", "b", "jjzbqei", "zb", "sevjjikc", "qibz", "jj", "b", "ze", "bqzi", "e", "eqzb", "zeb", "z", "vzjcjisek", "jj", "jekvjs", "bzq", "i", "jzebqj", "ibvejzjkcs", "ibzq", "cis"}) );
  }



  @Test
  public void test125(){
    assertEquals(24, solver.decompose("fupdmgyydaegxesptpndspqpncsxpinvfmcjqm",new String[]{"spncpqx", "petpxpnspdsq", "c", "syymdtxsenqpneppapdgg", "udqnpxgynsdypdpfmeaptesgp", "gsedvpygyppascecjpinmftqdsxnnxpm", "xe", "p", "ncsx", "psndp", "apefysdgpgdeumtxy", "xp", "cmvfjipn", "c", "csnp", "xipmnsvf", "pfcnivxsn", "xsp", "npvsmpqcdippnfnxs", "c", "q", "qj", "pstnscdpnqpxsp", "qpn", "ppnnxcsvi", "gyugydmpedaf", "qp", "sdpppnq", "egdyfxagudpemy", "udfp", "ivn", "qm", "q", "pgfdenyqcmduppptdxpnysasspxeg", "fxpnesdtdypppydumaeggs", "qtipsgenqspxmmapxndfgpmycucsyjppvddfne", "m", "fmnvi", "vpjixnfmc", "jcnfvmspix", "apnixgusypjtpgpvfpmedsqxeydcmfcpnnsd", "qmmjfc", "mxvnjipcsnqcf", "m", "j", "cqjfm", "xpvispnnfqc", "m", "p", "nvi"}) );
  }



  @Test
  public void test126(){
    assertEquals(10, solver.decompose("nelwnjoqryerpipoiifm",new String[]{"qpojirrepy", "rjryeoq", "fm", "rjrpyieoq", "o", "erypr", "lnwen", "pyqjerorpi", "m", "ieiinrmjrqpywopfol", "iiof", "iio", "lronqjw", "en", "rojlqnpweyr", "mifio", "yppriroe", "iop", "yjefoiwnnpoiireprlmq", "ppi", "eoweirnrlypojipqn", "eioyrpp", "rwjerpolniyq", "eyrr", "opiip", "piifpio", "oylqoimrjifprenwpi", "ipopi", "eryrpq", "i", "pirery", "en", "ojpinyewqrrlp", "if", "ii", "mifoi", "prypeiqro", "peryriop", "m", "wnenjlo", "oiipif", "m", "fim", "miif", "pi", "m", "pi", "erryiifppio", "lqenwjon", "fmiipo"}) );
  }



  @Test
  public void test127(){
    assertEquals(36, solver.decompose("bcgxgzxnczjovrxwujhboxykevxjcpwithcxmgyqicbfyzgz",new String[]{"gycfzbz", "mxvcwxhpetijc", "gxnxbgcz", "pivwjxchoxbytek", "rbkzijcxgwjxjvhpctxvocmixxzonyyuggqxhbwec", "yfz", "z", "x", "ev", "wxzejjovpcrwkycihjxxobnuv", "iwptchmgx", "cmfigyqzcygxb", "kvowcjpexxbyi", "xchujxbxrxogznwoczbvygjk", "wctxhivecpj", "cncggzxbzjx", "c", "icqb", "g", "qy", "zgfcqiyyb", "b", "oucjqtjhxvpcwkzrbxxcyvymihijxegwo", "gycqi", "ctyhgxmpiw", "zg", "gzz", "gbcfzqyi", "xyvkbeo", "gwgvzobrxcnzucjxxhj", "kpcxhvhtexyijwcxob", "z", "zy", "wnxggcjzrzoxxucbv", "tycgjihxcxzipfqbmcwgy", "icbq", "gwxhiptmc", "fbcyiq", "gwmpcytqihx", "g", "xfgimhbcytqc", "zgzy", "xrowjuv", "wxvejcpi", "gptvxmxhwrcjuihecxojkxyzbwbcxvxonzcjgg", "gkzbczxhumtvpoijjjcrywgcxbhxcxwvnexox", "gyxgpbjgkmjiyxrztzxjoohcvwqccxxnhvxicbuew", "xcj", "cxwpigymht", "czggxxb"}) );
  }



  @Test
  public void test128(){
    assertEquals(34, solver.decompose("vaduwobyninewyfoxfavrahabbpuhwoyjlnxuuvykukmym",new String[]{"bp", "julxynvku", "xyulkunujv", "km", "ykku", "yunkujxoukvwly", "klnyoxujvwuyuk", "ylwoxnuvyuj", "munlvmxykyuku", "mk", "rdpaxybufbiakuvoyenauhwovfjaoynxnuvluywbhw", "brfhbvaaa", "umukuykv", "muymk", "ym", "kkyuvuu", "lunjkvuhxyuywou", "m", "ywuxopljnh", "plouhxjuwuyn", "hlboxupwnjy", "jxuhuabhflorvuwbnavpya", "afhabvra", "y", "harapubbh", "yuhow", "l", "fav", "wevabndiofwnabboaxyufyrahv", "u", "ukxuykumlnvj", "my", "afouvhhapbaivaorwnyyebdnfwuxb", "uuvkuyk", "yowhu", "anwhlruafbvxuoyajubvhp", "lnuxvjuyk", "nhuwolxjpy", "myk", "km", "xaonuvrhlxdywfwuujywkiynnbboeyoakhfbuupvvaa", "ayeofixndbuynwvow", "wvonuyuyljx", "wpuwowbyaaynabfovuhibenyofrdxhav", "mmy", "abrwyhjofaavphbu", "oynwlj", "m", "kum", "jyxvuynwlkouuk"}) );
  }



  @Test
  public void test129(){
    assertEquals(5, solver.decompose("jmtwltxlipckxgmn",new String[]{"lxcpitk", "kx", "mnlclwimtktxxpgj", "mtjlw", "lciltxp", "itlmlwjxpt", "n", "xtl", "ignckpmx", "tl", "gckmxp", "g", "lxi", "tx", "m", "lxt", "xgmxitknlcp", "kxg", "g", "tltjklxcxgmpiw", "lxt", "g", "j", "n", "k", "l", "ipxnmkmtgwcxllt", "n", "tl", "glctlkxxipm", "mn", "ltmwt", "n", "l", "icmnkpgx", "ngckilpxm", "nxmg", "gtpmkwxljxmictl", "klngpmicx", "pc", "k", "txxpcillk", "ckpimgxl", "n", "pkglmxctxiln", "ixtlkpclx", "ltx", "nm", "kcnxmgp", "mjwt"}) );
  }



  @Test
  public void test130(){
    assertEquals(18, solver.decompose("eddbgvkbhletinxmnperipknpmfbnm",new String[]{"ebitlnpimrghkvxne", "mnbfpkp", "nnxhdveemblpkidegbt", "dbetkvbhdgle", "mfbn", "nppmk", "pmkpn", "ehgdmxneprldbtkeviibn", "n", "rpnbepfkim", "kvgdb", "fbn", "b", "pn", "impnpk", "refnbixndbidmknemegtbmlhvpppnk", "nmkpp", "n", "nkmpfb", "de", "lnbbgxmvtehdik", "nmfp", "lregtxnkhienbpmv", "mipfnkpebprmnmn", "rppine", "mp", "mfnb", "nibeimtrkpnpvnmhgldbkxep", "pmnbfm", "bf", "lirxkenmevpkibgpnth", "bfmpnn", "m", "fmpkn", "fpmnpk", "pbknfppmnimrenm", "mnpfb", "m", "gvnbthikelx", "ipk", "phibnxdblgntvkem", "nmrkppibmpnfe", "hnkpnpfrmbkimienbnplevtxg", "b", "m", "m", "knmppf", "tinkpgebrlmpinpvmnhekx", "de", "dedb"}) );
  }



  @Test
  public void test131(){
    assertEquals(2, solver.decompose("bzfyitkilywh",new String[]{"zfyb", "wh", "w", "lywh", "hw", "w", "fbiytkzli", "i", "ybtfikz", "h", "w", "w", "iyklitw", "yw", "y", "hw", "il", "fykztbi", "tifkybz", "h", "wy", "k", "y", "hw", "l", "bylhfiywkizt", "lkti", "yhw", "h", "bzfy", "why", "ki", "i", "w", "kzlyibyfit", "iklywiytfzb", "kithwyl", "iyzbft", "yl", "w", "yl", "hw", "wly", "itik", "kflyibtiz", "w", "kt", "ktil", "wbzyktyfhiil", "wh"}) );
  }



  @Test
  public void test132(){
    assertEquals(25, solver.decompose("pumgqaepzhruhdjzhehiwxjqkpjcggiqncgu",new String[]{"jhxwekcjpiq", "mgpu", "u", "jgqcgiugcn", "jpuwjeqihgmhprhpdhxqauzzek", "kcjgjqpg", "qgpiggnjcc", "hhujezhhijpxwzrde", "uhjzehapupqgmhdrz", "u", "giqncg", "gqmpua", "p", "ijgzqxuhhzhwepjgaicepjdkpghqrumq", "gcgi", "jgkheqhrxpwiphdjzueqhapuzm", "gicqg", "cgpjg", "j", "aqwehuqxrdejizjzhhph", "rhzdhezpujhe", "gcjp", "gkinpqgqjcj", "pcqjjk", "uhejzarqdpemuhhgzp", "iwujjzkhnhzchijaxdeeqhgpqpqgr", "qnggi", "ijqjckigxpwg", "ewijhpjxqgck", "u", "gqjcixkjigwqp", "ngqcgi", "up", "ixhew", "cng", "pquadrgehehmzzhuhpj", "iggcqn", "gkijqpqxncwijg", "kjgpcg", "wxi", "hrdjquwighgkhxizjpcqaeemhgzqpj", "jcp", "u", "u", "pmqazpgurehu", "jnqccpiggkgq", "qgijgc", "ggjqpckj", "dhiqekreqahjzhpuphjzxw", "k"}) );
  }



  @Test
  public void test133(){
    assertEquals(19, solver.decompose("shcmetfpppmzeehuumnwfyimrrsqwshztm",new String[]{"pmmensruphmfzriywque", "hz", "hstz", "wtsqhzs", "eremppmpfuwrnyhuftmiez", "z", "m", "z", "tsmzwh", "uewhqtmnifmphpzumswmreyzsr", "rwrzihssmq", "h", "wsq", "tm", "qhzsw", "m", "qyszpfumpnswmueptmzhifetrrhew", "i", "wzhst", "m", "ymepifhpueewfprnsmzrtmu", "schm", "hswq", "m", "m", "tszh", "w", "srqmiwshr", "i", "mzt", "wtzqssh", "wyemupmehnfzup", "hs", "rrszfpzwsynumphwemmeqhiu", "m", "t", "sq", "sewhmwrppmrshzmemspfftuneuiycqh", "rmhqistzswr", "rrmi", "emcpsfht", "m", "mzt", "zwsh", "iwszrrthmsq", "zhs", "tz", "zmrpfmyenpurieuswhm", "q", "s"}) );
  }



  @Test
  public void test134(){
    assertEquals(18, solver.decompose("ygfgdrzlmvindveijmqcsbzgziou",new String[]{"o", "g", "zig", "uo", "gzio", "qzisebgcmj", "u", "gz", "gsibzmioezcqj", "z", "dlygrmzfg", "giz", "ozi", "czgbisvvjedinmq", "scgzb", "zg", "i", "njqvmvisbcdie", "io", "mzrcjlqbidzvegdymvggifns", "bzcgs", "u", "o", "g", "zsjcbqm", "jvrgzzivcyeqlbinzgddgfmsm", "lzgydgfmr", "ie", "qsvjmizebngvczdioi", "ozig", "u", "zoig", "u", "oi", "u", "igz", "i", "imgdnfglrvyz", "o", "ogzzi", "zoi", "szbgc", "zzig", "meijq", "zgz", "ou", "ivdnv", "z", "vbcvqdiisnjem", "qejmzvdvbcnsii"}) );
  }



  @Test
  public void test135(){
    assertEquals(6, solver.decompose("datcaewiknxisvvy",new String[]{"ixivnksw", "ixkn", "v", "teawcda", "kxni", "iktacawend", "vs", "si", "caawdet", "y", "svkixn", "ciawdate", "ixkiwn", "i", "tiiwdnacaekx", "svi", "vinsxvk", "yv", "v", "svv", "y", "v", "nvksiix", "kwnix", "kxin", "da", "y", "ctae", "xknivwsi", "catkndvweaxsivi", "i", "y", "nkisx", "waietnixkc", "aiawencdxkti", "xkn", "svyv", "vs", "nivxsvy", "vivsy", "vnsixik", "y", "ink", "vvsi", "nkxi", "ad", "siwnkxivv", "xivvnskyi", "ktewaic", "vvsxkiin"}) );
  }



  @Test
  public void test136(){
    assertEquals(36, solver.decompose("qlxfcfabriczucajhskrmtnywrqwawftgjkgvcsrmtbvn",new String[]{"yvmwarftvwtktsrmqcnbjwgg", "chusxcbfacjfzrqail", "m", "jrkagtmvsyqwnntgwwfbcvrt", "acuqcvttwzxbljwstkfasfmikcmggbaqnrcwrhfvrryj", "rtm", "ajvrwqmntmktgcgjrskywtfawsrh", "w", "qwr", "fsgkjwctvg", "rhsbkuajzrfcacic", "gtfwjngqkyrwatw", "scuiaazfchcrjb", "yftgnwrwgkqjvwat", "m", "mvrbstc", "wft", "kr", "k", "yrwktnm", "b", "stvcmbngvr", "cskbgatjwrftmgvw", "yvcawtwtqrwjfngkg", "btm", "qcbflzrucxicaf", "tmsr", "rcscmhibackzarfuj", "wqtywmtfwanrg", "agjsnrtwvrkcygfqwwt", "nwagkqtwvgrjytwf", "rqw", "rwqwwratmytnkgf", "mrt", "nv", "n", "lqfx", "vsbmtfvkrcjtgwnwga", "bt", "fjgt", "nramywtqw", "tmrb", "kjvgc", "asqfclhjaribxuccfz", "gft", "tmkryn", "nqwwamtrwy", "bcjmskvgtgtwrf", "n", "n"}) );
  }



  @Test
  public void test137(){
    assertEquals(33, solver.decompose("imzhkdjgdbxncluinobbfrcrmbbhyvjkfrzhwgukfhekp",new String[]{"bubcrxnfnobildcgr", "hekkf", "libgnduxc", "p", "mofrcbrb", "y", "yfwkvhjzr", "boni", "fhzrk", "obbni", "kfu", "gubdlxcn", "k", "dxgbn", "kghmrkhjufzvfobwrbfcybrb", "kkfhe", "jcbvbykbrhmbrffozr", "fku", "fuhhkgw", "hukwkhefrgz", "fhvrbywkkbughzfj", "obb", "nxbdg", "kwrheupffzgkkh", "bbgfyfkurjzmwhkvh", "mbrbobhncfbr", "ekh", "bwbhcidnzjucnhklgvryobmibmfjrhfgbdzrxk", "cbnbfilcuor", "whgku", "fk", "hguwrz", "ufhek", "hepfk", "kf", "p", "dxcbnglniu", "ugfzhhrkewk", "emrwvkjhyhfbbfuzhrkgk", "frmcbfbjbbrykvho", "bvhfbbycobjrrm", "ion", "khizjdm", "u", "bfcgbwijzrnvobhhbrrkfym", "vbjmyhb", "ygickkcbnrhwujlrfbuofzhvbrmb", "bicdnnxbglobu", "khzufgwr", "hrnybbbcribfom"}) );
  }



  @Test
  public void test138(){
    assertEquals(35, solver.decompose("kgguthimpuczfypvwelnqwfiqgjpdopjubfacfgjrgvtnb",new String[]{"b", "vgt", "gvt", "nbt", "ujdcfjogppqrijafwbgf", "b", "b", "utppiygezicfugploqjfwwvpmdjgkqnhu", "b", "ntvbg", "bn", "pzqfelpmvycuwn", "anvctrjfgg", "gv", "b", "tn", "hkitugg", "fb", "gbvnt", "b", "rtvjgg", "fgyudipffzwcgwgcqfubievpnjlhmaupjqtkop", "b", "b", "b", "cjafdigbpjprffggjquovt", "b", "t", "bn", "vg", "fvlmcunpwqewqypgifz", "b", "fjfabcgr", "b", "jhpkiyoggumffeggapcfdqqrfpubtujjwznivplwc", "nbvtg", "n", "btn", "tn", "bpfuqpwqdjccffwinjgpugoyvapezlmfj", "vtbng", "n", "kvgyiphgtqnuecuzmwlpf", "nb", "bn", "b", "fvjacfggbtr", "b", "n", "w"}) );
  }



  @Test
  public void test139(){
    assertEquals(37, solver.decompose("kpzhgujmlyxwggexocvrdhdirgxugueiosracwvwqtbg",new String[]{"g", "g", "atbqcrvww", "dcihxmlrdogpxxjuvuyekrggghwgz", "b", "ghxoovkucgwcqayrieevgduxwldmwsigrzprhgtxju", "arvsqcww", "teiwubsqxrgwuagovcr", "yxlegcxvgmow", "g", "b", "gxiuuegr", "wcv", "wbtqv", "bg", "uoresi", "k", "lgrpgjuyekwgxxcmovzh", "uuxge", "b", "hdrid", "evrgwrusoxcaiug", "xjulcoggxgmpzehwy", "wsqribtwacevo", "tb", "qwwcvar", "g", "btg", "asieworcv", "rcusawioe", "rdh", "cexgovg", "eirso", "tb", "dh", "wbgvwtcq", "caw", "qtw", "gatexvibrwquogwsuc", "ujlmxkgwyzph", "wowqaecivsr", "ihrgddr", "u", "sieou", "w", "u", "g", "ariddgxriuregsuoh", "ioe", "phujzkg"}) );
  }



  @Test
  public void test140(){
    assertEquals(18, solver.decompose("rpnjqsirzedynoosqagcpgzwpezr",new String[]{"sogznipyqercoadg", "yoidzocngrepnqsqasj", "wzpe", "qwepsaggzpc", "sreoozsydni", "oggczowapqsp", "dznzwerqpqpyajipscsnrogog", "asgq", "qga", "z", "pr", "qsga", "sjgzeipnczppwqrgosrdyqona", "rz", "sqa", "ydpsrjnqirnez", "eriz", "pw", "z", "gsqyoepcagnridoz", "qsoao", "wsgpcgenazqdpoyo", "gredgniqzsczypoao", "pgpzzwec", "edy", "e", "ep", "gzgscaqp", "eyd", "nsrqirjzp", "gcosqgaop", "nqesjzir", "yd", "ewzp", "z", "riqs", "qqnszsnggcpyierrpdoozja", "qzoeypiggscarszqond", "qs", "odngqyepoagsc", "jn", "wz", "q", "zooeynd", "zwgp", "wp", "zsnynesodqjroi", "epw", "yirzde", "dpnrysrozqjineo"}) );
  }



  @Test
  public void test141(){
    assertEquals(8, solver.decompose("mzoibpjiavwgxbms",new String[]{"mioz", "bx", "pgivajxw", "pjovigimwzba", "xwbmvsgai", "imizpwabojvg", "gxvmiabws", "zijbopm", "s", "gx", "wgxiabvm", "oiapbbgzwixmvj", "bxmsg", "ajiv", "w", "s", "pzoijavib", "bmx", "gx", "s", "iwjgabxpbv", "m", "amgiwbsjxv", "xmb", "g", "wg", "mb", "bmx", "wmbsgx", "s", "bm", "x", "b", "b", "opbzjim", "waivgbx", "zbgwvpiiamoj", "gwbx", "pzibom", "bx", "xbg", "wipgvbaxbjm", "wijgva", "x", "xb", "b", "bx", "gxb", "m", "waijvg"}) );
  }



  @Test
  public void test142(){
    assertEquals(-1, solver.decompose("pwfhmfkpyvitdslzzixzvokdkiyptborwhngyam",new String[]{"dzithylfovpzmvxikzsk", "mfkh", "zsiltzd", "xdkbzwyiplszvkootizr", "ypv", "nyga", "a", "byraowyignpth", "ya", "gny", "rgnowh", "yhgnwro", "fwp", "gn", "zi", "wr", "hywrptob", "yizzxpvovpklsyitkktdidz", "vfkpytimd", "yidpzvtlzks", "oynpbyrhtwig", "ya", "hfwmfp", "zzkkpthiivfyotzvixsydkpbmld", "dvzxtilzdizsokk", "hgrtpbanwyyo", "i", "pyxozztditvyzdvskbpkiil", "ynag", "dsxlizytkvkoivzdzp", "z", "irpyngohtwb", "hwfp", "wkhpfmf", "a", "izdszoxypitzvikdylvtpk", "yiplzztixdsv", "howr", "idlztzis", "nyg", "hvfdipyktm", "rtpwoyb", "rbptyo", "pdzlvitsy", "iokdzkv", "h", "ytp", "bkyztxdkovoipiz", "vzizytdiytszdixvpkpbokl", "zxiiszdlt"}) );
  }



  @Test
  public void test143(){
    assertEquals(-1, solver.decompose("sgaxzumvgqnnhudbmxxj",new String[]{"gduvxnqhmxbnzmux", "xuzvmga", "xnbqhdngum", "nvgq", "mbx", "x", "xmx", "x", "xx", "asg", "dnubh", "dunhb", "uhnqn", "db", "bm", "agsxz", "zasnuxvqggm", "bmxx", "xzum", "mdnuhb", "x", "sg", "b", "gs", "nmdgbqhunx", "x", "xbxm", "umagzxnunqvhd", "uqgdnhnb", "hunbd", "x", "xx", "mx", "ngdzahquuxmnvbgs", "qnuhmvubgxzdnxm", "zvnhmamudnxbguq", "xdmb", "zmgvxu", "xvmgnxmsuanbdquhzxg", "unh", "mbuzvngxgxxshuqdnma", "nzxgmuqsgav", "uhn", "gv", "xx", "mxzvu", "mbd", "xmbx", "auxz", "uvhxgqnmuzn"}) );
  }



  @Test
  public void test144(){
    assertEquals(-1, solver.decompose("rizfychxucfhkonwgixnc",new String[]{"wkgfcnhxio", "hucyhfxc", "hccouwyfixnhxkg", "won", "n", "fcouhk", "xhochnyzffuck", "czxfyhu", "hcryfizxu", "onkwicxhfg", "hiccxruzyf", "okfh", "wixg", "giw", "zf", "gknwofh", "riyhcuchfxfz", "y", "xhyczf", "gninxow", "f", "n", "kignow", "hknigwxnfo", "x", "ncgxhkiofuw", "niwgx", "ir", "owikfgxchn", "ngioxw", "hcf", "fckhxcuh", "cxuf", "hxchfrzfcukyi", "ifhygochxxwncnku", "yfzir", "fz", "xi", "xfhkcu", "wngok", "rychifz", "xch", "kichwofgn", "chf", "uyxch", "yicnkfghnfxuwhcoxz", "x", "no", "ixhfucczryf", "gnw"}) );
  }



  @Test
  public void test145(){
    assertEquals(-1, solver.decompose("kpdzsgyoaq",new String[]{"o", "a", "oy", "a", "oy", "y", "zsg", "a", "dkozgpsy", "dkp", "zs", "spzkgdy", "a", "sgz", "gy", "soyg", "yzgs", "z", "zsgyo", "kpzd", "aygo", "szpgkd", "ao", "syzg", "dkp", "y", "sdpzk", "ogy", "yoa", "yo", "s", "oy", "g", "yosgz", "sgy", "sg", "oy", "a", "yoa", "y", "ogay", "sogy", "yo", "yao", "zs", "g", "pdk", "pygsdkz", "gpskdz", "ayo"}) );
  }



  @Test
  public void test146(){
    assertEquals(4, solver.decompose("aivwbpjjctklt",new String[]{"kct", "vjbipwja", "kltjc", "pvbwjj", "aibvw", "cjklt", "jbwpjiv", "cvbwjipj", "a", "l", "tc", "wjblpjkct", "j", "tlkc", "i", "jj", "wbp", "t", "bw", "vawbi", "tkcl", "wbjvpij", "t", "ct", "pjcj", "ctj", "wibv", "p", "jpbwcj", "c", "j", "jcpwjb", "kt", "bpivwa", "ivwab", "jjwbtkcp", "ctlk", "pjjtc", "jjbcwtkp", "a", "ai", "kctj", "wjipbvj", "bjctvwjp", "jjct", "via", "i", "i", "pwcvtjjb", "wjbjpcklt"}) );
  }



  @Test
  public void test147(){
    assertEquals(-1, solver.decompose("gfwcwddzwxcald",new String[]{"cw", "zdcwwfwgd", "ddw", "cdzdw", "dwzwcd", "w", "a", "wz", "a", "zdwwdc", "z", "czxdwa", "lac", "zw", "lacwx", "fwg", "cxw", "ldacxwzwd", "axc", "wgf", "wdadzcwxc", "xwcz", "a", "xdwdcwz", "dwdcz", "la", "gfcw", "xc", "c", "zxw", "x", "c", "cx", "ddcw", "zcwx", "dzdw", "cgcdwzdwwxf", "c", "zcdwfgwd", "fxdcwgwdzw", "czxwwdald", "lcax", "wzcax", "ddgwwcf", "l", "xcdwwdz", "awcwxddz", "xw", "dcw", "al"}) );
  }



  @Test
  public void test148(){
    assertEquals(-1, solver.decompose("vipvswykmfnxsd",new String[]{"nsx", "f", "sx", "kxnsfm", "mknfyw", "n", "vxfmyivwpksn", "nmkf", "nskmwpiyfvxvs", "xs", "n", "fmkn", "xs", "s", "mwkyf", "x", "fkm", "ynxsfwkm", "xs", "kfmn", "sxn", "wy", "x", "nf", "kwvpymivs", "ivspv", "n", "sxn", "snx", "xn", "x", "s", "sx", "xn", "yw", "s", "fxn", "mk", "xnf", "vsvpi", "wvpvmykifs", "mnkyxwf", "xnsf", "i", "piwsyvv", "syvipvw", "v", "iswypvmkfv", "wxyfsmnvpikv", "xn"}) );
  }



  @Test
  public void test149(){
    assertEquals(-1, solver.decompose("zhqholvxafvle",new String[]{"fvl", "vfxa", "xqolzhafvh", "xa", "l", "axvf", "v", "v", "z", "hhxvlqfzolav", "lv", "a", "xavf", "lqhvho", "z", "xv", "l", "vohlqh", "ax", "vafl", "lfxlvova", "flva", "fax", "hqoh", "hvzaqlhxo", "l", "af", "fav", "vlhaoxhq", "l", "oqhlh", "lhqvhzo", "favlx", "vfxa", "x", "vlf", "fv", "qzohlhxv", "l", "vafx", "ol", "ohhfavvxlqz", "z", "lvhofhqax", "afohzqhxvl", "zvqhloh", "xfalv", "ohqh", "z", "hhzq"}) );
  }



  @Test
  public void test150(){
    assertEquals(-1, solver.decompose("ykxrcyfvbyxo",new String[]{"xycfryk", "xr", "rx", "bvycxyrf", "bxryvcf", "by", "yb", "fvb", "f", "kyxcr", "b", "yf", "v", "c", "vf", "by", "yrkx", "rcyyfbv", "xvkycbyfr", "bv", "cbfyryvxx", "crkyx", "yb", "xrc", "cfvbryy", "fxyyckr", "fcy", "xykr", "vfy", "x", "yk", "xr", "ykrx", "ycr", "vyrfxc", "yx", "cy", "yvfycb", "byfv", "ryc", "y", "xvkcyryf", "xy", "ycxfrv", "xybfrcvyx", "vfb", "yf", "xrybcfkvy", "vfyby", "xbyfvcry"}) );
  }



  @Test
  public void test151(){
    assertEquals(-1, solver.decompose("norlrlbptqxtmlvna",new String[]{"mvtlx", "orln", "nlv", "vmln", "pbqrxtl", "r", "m", "xttpqm", "qnotpblrrl", "brxqltp", "n", "rronl", "btrlp", "prblt", "mtx", "tlm", "vl", "vl", "vtml", "rpxrltmntlvolbq", "m", "l", "q", "vl", "n", "pqtbltx", "lrnlbttrxoqp", "bpltr", "qlttxm", "rlnor", "mlvn", "x", "lvmn", "loltlptbnxnvmrqr", "vn", "t", "tlbp", "tm", "xltlprtvqmb", "mlv", "lpb", "l", "mtvltxq", "tbllroxrntmpq", "n", "lv", "tvmxql", "rlborln", "rrnlbol", "mtpbqrltx"}) );
  }



  @Test
  public void test152(){
    assertEquals(-1, solver.decompose("nbuvaeqmssqsmfyuqggklwnljwrebyzdlnzwrkzwvycobymdbu",new String[]{"wycdmrbzokwvyb", "nzrwwcvkzy", "aseqmvu", "rkvwz", "maqssqsevu", "qkvmqusmgyalfgusesqnw", "qsskavmygseuqnqfgmulw", "kwnzr", "eyrndwlzbwzj", "d", "nb", "aqllvfssgjqnwgmqkmsyuue", "qmgyufwglk", "lrwvwzdbkznycoy", "rrnknbwlledzlwyjwkz", "mwvrbzykwdoyc", "vbgkwnqylzmsgdwjaqzowdzkrnlwsfbulyueeycqbvysmrm", "lssqgsmueuyymqealrfbwkgwvjqn", "uwbzveknwaegllzysusmnkbndgqsqfrwljrymq", "odyybcm", "wnkrz", "zwbmrkywvocy", "reb", "lbrjlynzkewldw", "dwklbjzezzylnrrw", "lzvdykwwzyrenbrz", "zw", "rk", "lndzjbrzeyw", "b", "czvyyobw", "qsemmsggfsvuqyqau", "wzmozvbynyrkcw", "wkjbnlwnzwkrlvdcwyzelyozr", "mwsqmbluygsvrjflunkeqeyzgswaq", "rdwcwlrjvbzzlezknwyokywln", "nwbkzyzjedlrzwwr", "ljwnwdezrylzb", "vcwyz", "rbejlwy", "vwwdnlzzkbdymrbocy", "obybdm", "jmgnlwlsmvnufaqsksgyquqewb", "cmybybdo", "vmzckbdoryzwylwdbzn", "wzv", "wnlkl", "z", "ysulsswqkflvmnrjbmnqwequagbeg", "rbcmwkyovzy"}) );
  }



  @Test
  public void test153(){
    assertEquals(-1, solver.decompose("kwwnsumtfv",new String[]{"wkw", "utfm", "wnwk", "ft", "wwk", "swnw", "wtmfunwsk", "w", "wnuksw", "t", "sutm", "f", "smtu", "tmf", "um", "uns", "mfstu", "wnskmftuw", "fmsunt", "s", "mustn", "m", "su", "nuwskwm", "wwk", "t", "tnwsuwmf", "k", "u", "uswwn", "fstnmu", "wskwn", "wnw", "usmtf", "mstwun", "knww", "mwsuwn", "wn", "f", "tfm", "wsfwtmnu", "ustm", "wk", "f", "u", "f", "t", "mt", "ftsum", "sun"}) );
  }



  @Test
  public void test154(){
    assertEquals(-1, solver.decompose("afxsluqpblxeyojrzkticbd",new String[]{"ublqp", "k", "etyzjirok", "kzxlyejorb", "ykztoejr", "yzjro", "uq", "b", "tibkc", "k", "rilkeyczxtobj", "fpxblaslqxu", "b", "b", "kit", "tic", "ozyrj", "lbqup", "bc", "ticb", "uepxblq", "olklpqcuzxfjxbeiyabstr", "c", "r", "pbql", "kz", "pcrqallbzoxeubxsfkitjy", "itk", "j", "u", "xpbktylrecjzuqio", "c", "jlxqrkypzteob", "bc", "laqfsux", "c", "ikt", "sflax", "b", "bequpxl", "axlfupslbq", "olybkxzjert", "u", "ozxbryekjl", "ic", "oy", "tic", "jlfruslqbyexxzapo", "ckbit", "qup"}) );
  }



  @Test
  public void test155(){
    assertEquals(-1, solver.decompose("rteodivgthclatbeyebsbfujdkauuoqgckwarbkogluhjeh",new String[]{"wotljukukflerudabqbbcyekgusagoab", "ok", "uuoq", "kokgoqbcuwagur", "ubtcbeaylehbsjf", "esebybb", "wbcark", "adk", "eeadctbtirvtghol", "bybdkeasjuetwakqfguucbor", "hkbolusaajqecdycerfuakubtbgw", "fyerusgabdlkhttouedacgiuvjebtqbo", "vaiotrltdtcehg", "j", "ksedjbbyuf", "owbuahrcoukdgukjgqkal", "uau", "fcubldokeoyurbasgbaegkwqbukj", "grakcbwok", "dotirgtve", "je", "kd", "j", "ulqrbowcugokgka", "uowbakglkr", "yetb", "uehj", "lughej", "athlc", "ok", "eqwbhkkotjsfcdebabglcbhaouualrkuyug", "k", "b", "b", "eiacbfletksrwjgoyratduahtcuokbqedvugb", "auqkcduog", "hacl", "dusafbjkeb", "uu", "eujh", "roqwgckba", "ufj", "bbefyuesb", "bk", "e", "c", "hjgkoul", "hc", "uhrjkoablkegw", "uhj"}) );
  }



  @Test
  public void test156(){
    assertEquals(-1, solver.decompose("hmpoxxijnk",new String[]{"xij", "xhopxm", "pixox", "n", "jxi", "x", "m", "j", "n", "x", "mpho", "xxnji", "j", "ipxmnjxo", "hm", "i", "nji", "n", "n", "h", "ijnx", "x", "nij", "ixmojxnhp", "jxi", "ixohxmjnp", "x", "n", "pxo", "oxpmhx", "x", "ji", "jopxxmih", "po", "xi", "x", "xipox", "xij", "n", "n", "ixj", "xij", "jixx", "x", "jn", "i", "hpxjixom", "njxxpoi", "xxipoj", "ojpxix"}) );
  }



  @Test
  public void test157(){
    assertEquals(-1, solver.decompose("kuvrnkcdtignlzoqgtml",new String[]{"nltkqzdgcogit", "tcdgnlkzoiq", "nrgdznlkqvuktico", "uk", "zlginot", "uvnrkk", "lnoicdgtz", "t", "zlgtoncdki", "g", "tdigqcotlgnz", "kitcd", "onqztlgmg", "dicnlvkgrnt", "rvnkc", "kunldvtorngczki", "igcnzlktd", "idvkncrt", "ldqggnttozi", "mt", "uovknnldrqgizktcg", "gtoqm", "ogqltzcind", "qmgt", "mt", "cigdtn", "gt", "tdlnig", "q", "itkngcd", "ilgqgonz", "mtonlqggz", "vrn", "dtnizlg", "drtvnukkc", "t", "q", "o", "tgmq", "d", "rkvkunc", "zloudtvknrickng", "t", "tm", "gotqlz", "idtkrucnvklzgn", "dimglqnkzttcgo", "v", "qintoklgcdgz", "ztncdoglqki"}) );
  }



  @Test
  public void test158(){
    assertEquals(-1, solver.decompose("wcpwlshmxvmhctzocrfbtxz",new String[]{"xtbrf", "slcwwmtcpmhhxv", "x", "w", "wmcopvrhhtmcxcswlz", "rfc", "xfrctbotcz", "mlvtxmhsch", "x", "r", "xrftb", "t", "vsctlmzhxhm", "fr", "fbr", "h", "fzcbttocr", "czo", "mv", "r", "zoc", "mctczohv", "ctzowlmhmxschv", "cvcobmfzrth", "crbfo", "x", "xt", "x", "vmchmxt", "v", "mh", "mrbvtfxcctozh", "thcoz", "cxtsmvhwmzhl", "cblwhomprztmtsxxhcvcwf", "swxmhl", "frbt", "txb", "vm", "hwcxzmscvlorhmt", "bfhrcctoz", "lwhs", "bt", "xvtwhsmhlcm", "cmslvhwmxwp", "tb", "x", "cbtrzcof", "ctz", "cpw"}) );
  }



  @Test
  public void test159(){
    assertEquals(2, solver.decompose("vcshyvvqswtjbdjdt",new String[]{"btj", "djdb", "sdtjqbvw", "wsjdtbj", "tw", "vq", "v", "sqtjdwbj", "sychvv", "t", "swvdbtvyjchsqv", "j", "sqw", "vc", "vjtbqdwjds", "dbj", "qwhvtvssy", "jbdjd", "hvsjsvtwqy", "wtqs", "jbd", "stw", "tw", "hsyvv", "v", "cyshv", "sq", "vq", "s", "wtsj", "jsdbqjwt", "qstwdbjj", "hvcs", "wsvq", "bwtj", "wt", "djtbwj", "v", "bdjd", "wbdtj", "cvvhysv", "c", "tjbw", "jtsw", "sq", "cvshyv", "shvvy", "jcdhvbstwvqdvysj", "sc", "djb"}) );
  }



  @Test
  public void test160(){
    assertEquals(-1, solver.decompose("egqqwpqpfbsmxfcpclkbud",new String[]{"pwqsukflpbcxbpmcf", "eqgq", "lkb", "fccmbxsp", "cusmbbcpfklx", "cuklb", "cbmpsfkclx", "kl", "l", "l", "ucklb", "plwbgqfqcmfbpqexscukp", "xbms", "kulbpc", "cp", "skflbbxcpmc", "pc", "k", "klcp", "fpxqcbwepbfgcqqslkmp", "u", "bppxwmfqs", "sb", "pqbwpfemsgfqxq", "pcc", "fepgqqwpq", "xlfcbkpumc", "clk", "lpc", "cfkmsbuxbplc", "cckpl", "kb", "lck", "qpwqfbgpqes", "u", "cpfkblc", "mfckxpbcsl", "u", "cpcf", "clbk", "pqefpqgwq", "plc", "pccfkl", "l", "bfcpxslmc", "fcpc", "c", "bcmpsfx", "p", "pfc"}) );
  }



  @Test
  public void test161(){
    assertEquals(-1, solver.decompose("maejknucjrdoacaocmblqxwvusmhxjfsseqo",new String[]{"njjuokdrec", "s", "essf", "vxlxhmsusjsqfw", "lubxmvqw", "qmbfoxhjcmvxlsaacwsu", "efxsjs", "wxmoxhausmaqcvclb", "kej", "omjcranauodakcejc", "ajeumnk", "xshmqwvlxuj", "knevobjcxwuqamcroajdlc", "d", "umbawkjlnajrdosuxqvccmcoe", "rcjun", "joomucncaamcadrejbk", "u", "f", "s", "camjxxejfkhcjbqnmosvlamdacuorwu", "ma", "lsmmuoexhjsqvwbcsxf", "es", "s", "croad", "mflohxjscswsxmquvb", "vcxhumboradamoccjwslq", "abecukmujvoqlnwjrdcoaxc", "kejnucj", "xoscxjsvclammbsfwdaqhuo", "sqse", "ajmke", "ajaducnorco", "ojjuenakcdmr", "nu", "rdjoc", "xjseufsmqhs", "mqhsesfsxj", "xhjsm", "aoaracdnjcujkme", "ajxucojwvqonaccmamelbrkd", "ahmaqobcucvmwxjxlrosd", "qwuhjoasldjvonrcaxmcucbmx", "jssxhmf", "qess", "essfq", "onjlcamchacuqjfrxmajmbvkxwsoude", "avcuwqbjuxorcncodasml", "mbuwfssacolajvxhmxcq"}) );
  }



  @Test
  public void test162(){
    assertEquals(-1, solver.decompose("goquvvemnfrzwealbwijgdqmmjezgxcagipxkyhptizjevdsqf",new String[]{"hyk", "gzx", "mje", "acg", "dsv", "enm", "zrf", "eaw", "dmq", "dsv", "oqg", "qgo", "ixp", "itp", "igj", "ewa", "blw", "frz", "wlb", "ijg", "xzg", "xpi", "xgz", "agc", "ezj", "q", "vuv", "frz", "vuv", "tpi", "khy", "q", "ewa", "jig", "qmd", "lwb", "jze", "uvv", "ezj", "ixp", "nem", "qgo", "mej", "jem", "mne", "dsv", "dmq", "ykh", "pti", "cga"}) );
  }



  @Test
  public void test163(){
    assertEquals(-1, solver.decompose("iajxbigemmsnudxtrupzqsvtliazjduuwrlidyoivgvsfwdbik",new String[]{"fvs", "wdb", "egm", "fvs", "iaj", "zpq", "oyd", "mns", "bwd", "svt", "ixb", "rli", "jzd", "jia", "ial", "dux", "i", "dyo", "xud", "bix", "giv", "ila", "rtu", "gme", "vsf", "aij", "lir", "ali", "uwu", "bdw", "wuu", "tsv", "i", "zjd", "xud", "gem", "tur", "vig", "wuu", "mns", "xib", "dyo", "vts", "lri", "zpq", "dzj", "zqp", "nms", "rut", "ivg"}) );
  }



  @Test
  public void test164(){
    assertEquals(-1, solver.decompose("jsuqlhfigeeifrhhtltfkfcaguqxzodvbspwmxbausbkinvavo",new String[]{"bxm", "tfk", "fhr", "lht", "v", "tfk", "fca", "usa", "ozx", "mbx", "ibk", "qug", "acf", "htl", "gif", "jsu", "zox", "dbv", "qug", "hql", "pws", "eie", "qug", "fca", "frh", "pws", "tkf", "fig", "sau", "nav", "hlq", "gfi", "usj", "nva", "eie", "oxz", "psw", "vna", "jsu", "xbm", "ibk", "v", "qhl", "bdv", "bik", "eie", "usa", "hrf", "lht", "bvd"}) );
  }



  @Test
  public void test165(){
    assertEquals(-1, solver.decompose("uqcvloluuylztecwkaekqdmpewqqtiwgcvieyuegsddezfnoot",new String[]{"dpm", "ucq", "wka", "ewq", "gcw", "qit", "onf", "zed", "keq", "tec", "gsd", "uey", "uul", "lvo", "yue", "tiq", "ewq", "o", "dmp", "ovl", "zde", "pmd", "cqu", "qke", "luu", "uye", "nfo", "qti", "gwc", "tec", "etc", "iev", "weq", "lyz", "zyl", "iev", "yzl", "ucq", "wgc", "akw", "keq", "nof", "luu", "vie", "lov", "gsd", "o", "sdg", "dez", "akw"}) );
  }



  @Test
  public void test166(){
    assertEquals(-1, solver.decompose("wjeutntaifytaqnwqmdsdwcojyfhpqyljbitldumrbbytijnmu",new String[]{"lud", "m", "qna", "fyj", "iat", "tnu", "ljy", "nut", "bit", "cow", "tib", "itb", "dsd", "mrb", "woc", "bty", "jni", "owc", "phq", "qhp", "udl", "dds", "yfj", "tnu", "tia", "m", "udl", "wej", "mwq", "anq", "ait", "dsd", "tyb", "jfy", "ljy", "aqn", "jni", "ewj", "qph", "jwe", "mbr", "rmb", "yft", "jni", "wmq", "wqm", "ytf", "ytf", "jyl", "bty"}) );
  }



  @Test
  public void test167(){
    assertEquals(-1, solver.decompose("wzpetdoomfhvlckhfgkguvmymqsyjfpbjxuhmmmypsblyasqql",new String[]{"ugk", "ylb", "jpb", "kug", "pjb", "hgf", "pzw", "oom", "mmm", "dte", "xhu", "pys", "wzp", "oom", "moo", "ckl", "ysp", "fvh", "fhg", "ybl", "qms", "pzw", "yfj", "hgf", "spy", "hfv", "sqm", "jpb", "klc", "fyj", "lck", "qsa", "myv", "q", "fjy", "vhf", "ted", "ybl", "mmm", "mmm", "aqs", "kug", "tde", "xuh", "hxu", "qsa", "q", "mqs", "vym", "ymv"}) );
  }



  @Test
  public void test168(){
    assertEquals(-1, solver.decompose("hdiuyxjzknfxahzalvslzdcjwgjspndiasnwvokcsyvvxglzra",new String[]{"vko", "nps", "yxu", "hdi", "dcj", "kvo", "vvx", "psn", "dia", "vxv", "gwj", "haz", "nsw", "r", "cjd", "ysc", "spn", "uxy", "nsw", "szl", "lav", "slz", "gjw", "slz", "vok", "zjk", "r", "fxn", "lzg", "dia", "lgz", "hid", "jzk", "vxv", "xfn", "hdi", "avl", "ycs", "xfn", "uxy", "avl", "ahz", "dai", "kzj", "zha", "wsn", "syc", "jcd", "glz", "wjg"}) );
  }



  @Test
  public void test169(){
    assertEquals(-1, solver.decompose("vauuwmvxzatmsepcpzzbnektkwwfnevgrottdcnzhoeadigaal",new String[]{"vrg", "a", "pzc", "hoz", "sep", "a", "iga", "wwk", "tek", "cnd", "uav", "xzv", "ekt", "tto", "iga", "zvx", "ott", "dnc", "atm", "nef", "tot", "spe", "cpz", "fen", "bzn", "zbn", "spe", "vrg", "ade", "mat", "gai", "kww", "vgr", "hzo", "vau", "pcz", "wkw", "efn", "tam", "mwu", "dae", "uva", "dae", "bzn", "uwm", "uwm", "ozh", "vxz", "tke", "dcn"}) );
  }



  @Test
  public void test170(){
    assertEquals(-1, solver.decompose("taulakhunkqssyyskduwajkssutzwwsybyudbsugbissfljejm",new String[]{"ssf", "j", "nhu", "stu", "sjk", "ksj", "igb", "wua", "yys", "unh", "auw", "j", "kqs", "zww", "ubs", "uyd", "lak", "uta", "ejl", "skj", "qsk", "sub", "lej", "bus", "tus", "qks", "ksd", "fss", "alk", "duy", "gib", "kds", "sby", "aut", "aut", "udy", "wau", "sdk", "sfs", "ysb", "syb", "ysy", "hnu", "lka", "tus", "gib", "wzw", "zww", "syy", "lej"}) );
  }



  @Test
  public void test171(){
    assertEquals(-1, solver.decompose("lwfzhqandojyydevyzglnoyezjnlsoanyukfjafgretgtldkuq",new String[]{"nad", "jfa", "nya", "yoe", "kfu", "jaf", "dye", "oey", "yvz", "kdl", "lgn", "u", "ojy", "jnz", "ojy", "lgn", "ttg", "dey", "nya", "oyj", "vyz", "zvy", "tgt", "nzj", "dna", "wfl", "lfw", "rge", "zqh", "lso", "slo", "ldk", "nad", "ttg", "ger", "ayn", "eoy", "qhz", "slo", "faj", "u", "gre", "kuf", "zjn", "lwf", "kdl", "ngl", "kfu", "zqh", "yde"}) );
  }



  @Test
  public void test172(){
    assertEquals(-1, solver.decompose("afirgkixtvzargwggeqdjippiwopctitklohjjsjklzaqqlmcw",new String[]{"rifag", "wtcpo", "shjjj", "ioltk", "mclq", "jjhjs", "afrgi", "lokti", "olkti", "iotkl", "vikxt", "ippij", "cptow", "ocpwt", "jjhsj", "kivxt", "qmcl", "qzakl", "cmql", "pwtoc", "gedqg", "tvikx", "lqcm", "jjjhs", "gdgeq", "wrzga", "ppiij", "edggq", "vtikx", "gzarw", "gifra", "figar", "iagrf", "jppii", "kliot", "pijpi", "qaklz", "txivk", "qgegd", "ipijp", "zgwar", "egqgd", "hjsjj", "aqzlk", "qzalk", "lakqz", "grawz", "wrzga", "ptwco", "qcml"}) );
  }



  @Test
  public void test173(){
    assertEquals(-1, solver.decompose("gudrlfgzxwchncrffurtinvyffcmymkvxhbazagwticxsyoemj",new String[]{"rnhcc", "moye", "rccnh", "mmcyf", "duglr", "nrchc", "wgfzx", "hkvbx", "xfzwg", "zfgxw", "gulrd", "yvfin", "ctsix", "gazaw", "cmymf", "vhbxk", "ixstc", "cmymf", "fxzgw", "oyem", "rdulg", "zxgwf", "mmcfy", "xhvbk", "rfftu", "emyo", "ugrld", "rftfu", "zwaga", "cstxi", "ictsx", "ccnhr", "drglu", "ccnhr", "omey", "hvxkb", "vnfyi", "aagzw", "yinvf", "fmymc", "vfiyn", "oyem", "trfuf", "ftfur", "zwgaa", "fnyiv", "csixt", "azgwa", "fufrt", "hkxbv"}) );
  }



  @Test
  public void test174(){
    assertEquals(-1, solver.decompose("qwjoisaimnooghbywzsxyhjoxkkmffcluxcemdpbqyfxzsdpnm",new String[]{"oxhyj", "fxqzy", "fqzyx", "lcucx", "qyxzf", "mkkff", "jwoiq", "wjoqi", "spdn", "fmkfk", "zsywx", "dpns", "gohbo", "bgooh", "ghobo", "spnd", "xcucl", "fkkmf", "asmni", "mansi", "xhjoy", "yxszw", "xlucc", "cuxlc", "medpb", "psdn", "zwysx", "hjxyo", "wzysx", "dempb", "jqoiw", "wxsyz", "dpebm", "msina", "nsaim", "xcluc", "qjoiw", "pbmde", "jyhxo", "snami", "mkkff", "xjohy", "xfqyz", "bohog", "bmpde", "nsdp", "owjiq", "obogh", "qfxzy", "fkkfm"}) );
  }



  @Test
  public void test175(){
    assertEquals(-1, solver.decompose("bsnoydfalhptmycjeyrefytjiigcwfhjmmjvefkdiokszfwxab",new String[]{"eyrje", "tmcyp", "oybsn", "yerej", "bsnoy", "mcypt", "eyejr", "mptcy", "byons", "vekdf", "ctmyp", "gcifw", "fgicw", "zoksi", "osizk", "xafw", "ftijy", "xfaw", "lfhda", "cptym", "faldh", "alfdh", "yrjee", "ytjif", "iyjtf", "fldah", "faxw", "mhmjj", "gcifw", "fkedv", "zsoik", "afwx", "nsoyb", "hmjjm", "yobns", "erjey", "jjmmh", "tifyj", "fedvk", "iwcfg", "sizko", "fdkev", "mjhmj", "tfjyi", "vdekf", "adhfl", "fxwa", "ziosk", "jhmmj", "gifwc"}) );
  }



  @Test
  public void test176(){
    assertEquals(-1, solver.decompose("sqwzjwoekbqhtufumrkmbrvmrhupoanxohviphkvphgbvdjfab",new String[]{"hpuoa", "bmrrv", "fdja", "zjswq", "krmmu", "ftqhu", "pvikh", "rummk", "bhvgp", "ukrmm", "wbkeo", "oahup", "bvrmr", "phvgb", "vrbrm", "jfda", "dfaj", "uqfht", "rvmrb", "ivpkh", "zjswq", "fqthu", "hpvbg", "zwsqj", "bekow", "kowbe", "ouaph", "hnxov", "ipvkh", "dajf", "phbgv", "mrmku", "wzjsq", "ipvhk", "ohnvx", "uqfth", "zsjwq", "mmukr", "uapoh", "vmrbr", "ebokw", "hoapu", "quthf", "pvhki", "vnxoh", "eowkb", "xvnoh", "pvbgh", "vxonh", "fdja"}) );
  }



  @Test
  public void test177(){
    assertEquals(-1, solver.decompose("moetltwviyscisgchamhzkzqanhoplwdjvlxkynqyngegzeobx",new String[]{"bzeo", "chamh", "yxnqk", "hchma", "ahhmc", "issgc", "nkxqy", "tmleo", "letmo", "zzakq", "hplon", "tiywv", "oezb", "jdwlv", "tviwy", "qzazk", "scgis", "bezo", "vwyti", "nkyqx", "boze", "gssci", "vdlwj", "yqkxn", "iwtvy", "hmahc", "icgss", "ggyne", "jdlvw", "lvjdw", "zqzka", "zzkqa", "toelm", "gegyn", "ygneg", "lvdwj", "nlhop", "xkyqn", "pholn", "leotm", "pnolh", "hacmh", "qzzak", "tvyiw", "plnoh", "ynegg", "engyg", "zboe", "csisg", "moetl"}) );
  }



  @Test
  public void test178(){
    assertEquals(-1, solver.decompose("ksthjynnwgumsllkgtlowvfdytwzbkczzjvzaheivuovrygazu",new String[]{"wgnyn", "rvuov", "zvcjz", "gyaz", "fdwvy", "gklto", "ngwny", "gzya", "zbkwt", "czjvz", "yvdwf", "bzwkt", "tkshj", "vyfdw", "zhiae", "aezih", "lulms", "vurov", "mlslu", "rvvou", "ieazh", "fvdyw", "aygz", "hieaz", "jksth", "lkgot", "ygza", "lslmu", "lmslu", "klotg", "ihaez", "vuorv", "vzjzc", "gltko", "tzwkb", "ktbzw", "fydwv", "zayg", "zktwb", "lotgk", "htkjs", "zzvjc", "yngwn", "jtskh", "lmslu", "hktjs", "gnwyn", "ynwng", "cvzjz", "rvvuo"}) );
  }



  @Test
  public void test179(){
    assertEquals(-1, solver.decompose("mxpluihtessyigvqrmomapjrbrkwgtwzbqxpfitdbafyvyjmng",new String[]{"ormmq", "gktwr", "rpajb", "plxum", "syvig", "xzbwq", "eshit", "ithse", "idftp", "yivgs", "yivgs", "qmorm", "bvyfa", "jymn", "pxmlu", "zwbxq", "fayvb", "esiht", "uxmlp", "ymjn", "wzqxb", "pabjr", "gwrtk", "qmomr", "xbzqw", "jrbap", "yafvb", "brajp", "mnjy", "umpxl", "ftipd", "vfyba", "krtgw", "oqmmr", "qmmro", "itesh", "njym", "yvfab", "tiehs", "wtrkg", "ivsgy", "njym", "gyvsi", "trkwg", "mxlup", "ptfid", "arpjb", "itpfd", "zbwqx", "tpfdi"}) );
  }



  @Test
  public void test180(){
    assertEquals(-1, solver.decompose("qputtnxeciexyiqzyrhxqpggcsjtfvqekwygmsoakogiixjvea",new String[]{"hrzxy", "ttuqp", "pgqcg", "iecxn", "inecx", "kgioi", "gikio", "eykwq", "yeqxi", "yewqk", "yewkq", "rzyhx", "jvex", "gcqgp", "ggcpq", "qtutp", "eqiyx", "hyzrx", "ogmas", "goiik", "kgiio", "osmga", "cpgqg", "goiik", "xjev", "tvsfj", "iqxye", "tpuqt", "moasg", "incex", "fjtsv", "pqgcg", "eqykw", "ftsvj", "ejxv", "gmosa", "vjxe", "hyxrz", "gosma", "exnic", "ecxin", "uqptt", "jvxe", "tptqu", "exqiy", "yrzxh", "ywqek", "svfjt", "tfjsv", "eixyq"}) );
  }



  @Test
  public void test181(){
    assertEquals(-1, solver.decompose("oxqixnkbxecnwthjqjgqhogaxvdsatvaocdrlfwylofthrckjl",new String[]{"hgxao", "gqqjj", "vacod", "lfywr", "frlwy", "ebkxn", "tolhf", "qqjgj", "cadov", "ywlfr", "advoc", "xxiqo", "knxeb", "nbxke", "ixoqx", "krcj", "doacv", "jqgqj", "stvad", "wrlfy", "flhot", "ixoqx", "hcwtn", "xxiqo", "gxoah", "wncth", "vcado", "wctnh", "ckjr", "tadvs", "jrkc", "ckjr", "ioqxx", "jrkc", "nkxbe", "sdatv", "tlhof", "dsvat", "tdsav", "haogx", "whtcn", "hntwc", "oftlh", "goahx", "eknxb", "jqqjg", "frwly", "qjjqg", "hftlo", "aohgx"}) );
  }



  @Test
  public void test182(){
    assertEquals(8, solver.decompose("neotowheret",new String[]{"one", "two", "three", "there"}) );
  }



  @Test
  public void test183(){
    assertEquals(0, solver.decompose("ssssssssssssss",new String[]{"sssss", "ss", "sss"}) );
  }



  @Test
  public void test184(){
    assertEquals(10, solver.decompose("ommwreehisymkiml",new String[]{"we", "were", "here", "my", "is", "mom", "here", "si", "milk", "where", "si"}) );
  }



  @Test
  public void test185(){
    assertEquals(-1, solver.decompose("ancbdkkajwndjdsrunwjdhucnwjudbdsqoioh",new String[]{"asd", "asddd", "qwe", "qweee", "qweeeeqweqew", "qeqeqweq", "qeqe", "qeetf", "ererer"}) );
  }



  @Test
  public void test186(){
    assertEquals(-1, solver.decompose("abbbacaddaddabbabbbadbbbabbbcbbabbbdbabbbaaaabbbac",new String[]{"babab", "bbbca", "accbbbbbabdb", "acaddacbbdaabb", "abbab", "aa", "bb", "cc", "abbabbdabbcabcc", "cca", "caaabb"}) );
  }



  @Test
  public void test187(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test188(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test189(){
    assertEquals(0, solver.decompose("ababababababababababababababababababababababababab",new String[]{"ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab"}) );
  }



  @Test
  public void test190(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaabaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "aa", "a", "a", "a", "a", "a", "a", "aaaaaa", "aaaaaaaaaa", "aaaaaaaa", "aaa", "aa", "aaa", "aa", "aaa", "aa", "aaa", "aaa", "aaa", "aaa", "aa", "aaa", "aa", "a", "ab"}) );
  }



  @Test
  public void test191(){
    assertEquals(-1, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test192(){
    assertEquals(32, solver.decompose("abbccaaabbccaabbccaabbccaabbccaabbccaabbccaabbccaa",new String[]{"ba", "cb", "ac", "ccbba", "a"}) );
  }



  @Test
  public void test193(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"}) );
  }



  @Test
  public void test194(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test195(){
    assertEquals(8, solver.decompose("ogodtsneeencs",new String[]{"go", "good", "do", "sentences", "tense", "scen"}) );
  }



  @Test
  public void test196(){
    assertEquals(-1, solver.decompose("aaabbbabcabc",new String[]{"aa", "ba", "aaa", "bba", "abb", "cba"}) );
  }



  @Test
  public void test197(){
    assertEquals(0, solver.decompose("ssssssssssssssssssssssssssssssssssssssssssssssss",new String[]{"s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s"}) );
  }



  @Test
  public void test198(){
    assertEquals(0, solver.decompose("aaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test199(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa"}) );
  }



  @Test
  public void test200(){
    assertEquals(0, solver.decompose("aabaabbaaabaaabaabbaaabaaabaabbaaabaaabaabbaaaba",new String[]{"aab", "aab", "aab", "aab", "aab", "aab", "aab", "baa", "baa", "baa", "baa", "baa", "baa", "aba", "aba", "aba", "aba", "aba", "aba"}) );
  }



  @Test
  public void test201(){
    assertEquals(0, solver.decompose("ababababababababababababababababababababababababab",new String[]{"ab", "ba"}) );
  }



  @Test
  public void test202(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb",new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "b", "bb", "bbb", "bbbb", "bbbbb", "bbbbbb", "bbbbbbb", "bbbbbbbb", "bbbbbbbbb", "bbbbbbbbbb", "bbbbbbbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbbbb", "bbbbbbbbbbbbbb", "bbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbb"}) );
  }



  @Test
  public void test203(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"}) );
  }



  @Test
  public void test204(){
    assertEquals(2, solver.decompose("xyzababababababababababababababababababababab",new String[]{"a", "b", "aa", "bb", "zyx", "ab", "ba"}) );
  }



  @Test
  public void test205(){
    assertEquals(3, solver.decompose("asddsaasddsaasddsaasddssdasdadadasddsaasddsaasddsa",new String[]{"asddsa", "asd", "asdasdasd", "dsadsadsa", "adsasdasdasd", "dsadasdaaddasdadsa", "asdasdasddas", "dsaadsasddsaasdasd", "dsadsadadsadsadas", "adasdasddsa", "sadasdasdas", "dasdasd", "sdadasda", "aasd", "dadads", "asdad", "asdadasdasd", "asddddd", "sdadadad", "asd", "d", "asd", "asdadsadas", "adasdadada", "adasdadasdsad", "asdasdadasda", "adsadasdasda", "dasdadasdad", "dasadsdasadsdas", "daadsadsads", "das", "sadasdadsdsaads", "dasasdadsads", "asasd", "dasdasdasadsdsa", "dasadsadsds", "adsadssa", "ads", "das", "dasads", "ads", "dasdasdsadsa", "dasadsadsasd", "das", "adsdasasdasdads", "adsadsdasdasdasads", "asdadssadadsasd", "adsdasadsads", "dsadsadsadsadda", "asdasd"}) );
  }



  @Test
  public void test206(){
    assertEquals(0, solver.decompose("ababababababababababababababababababababababababab",new String[]{"a", "b", "ab", "ba", "ba", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ba", "ba", "ba", "ba", "ba", "ab", "ab", "ab", "ba", "ba", "ba", "ab", "ab", "ba", "ba", "ab", "ba", "ba", "ba", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ba", "ba", "ba", "ba"}) );
  }



  @Test
  public void test207(){
    assertEquals(0, solver.decompose("ssssssssssssssssssssssssssssssssssssssssssssssssss",new String[]{"s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s", "s"}) );
  }



  @Test
  public void test208(){
    assertEquals(-1, solver.decompose("sepawaterords",new String[]{"separate", "words"}) );
  }



  @Test
  public void test209(){
    assertEquals(2, solver.decompose("abcbcabc",new String[]{"abc", "cba", "cb"}) );
  }



  @Test
  public void test210(){
    assertEquals(-1, solver.decompose("aab",new String[]{"abb"}) );
  }



  @Test
  public void test211(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}) );
  }



  @Test
  public void test212(){
    assertEquals(-1, solver.decompose("ab",new String[]{"aa"}) );
  }



  @Test
  public void test213(){
    assertEquals(7, solver.decompose("neopayqeabcc",new String[]{"pay", "yapo", "ne", "one", "baeq", "abcc", "payq", "c"}) );
  }



  @Test
  public void test214(){
    assertEquals(0, solver.decompose("aaaa",new String[]{"bbbbbbb", "aaaa"}) );
  }



  @Test
  public void test215(){
    assertEquals(50, solver.decompose("ababababababababababababababababababababababababab",new String[]{"babab", "bbbca", "dababd", "addadb", "cbacab", "cba", "ba", "cba", "cabcc", "bcc", "aaab", "baaa", "baaa", "aaaaab", "ba", "aaa", "bbb", "ba"}) );
  }



  @Test
  public void test216(){
    assertEquals(-1, solver.decompose("abb",new String[]{"aab"}) );
  }



  @Test
  public void test217(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test218(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test219(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}) );
  }



  @Test
  public void test220(){
    assertEquals(2, solver.decompose("abcdefg",new String[]{"abc", "efgd", "abcdegf"}) );
  }



  @Test
  public void test221(){
    assertEquals(-1, solver.decompose("aabb",new String[]{"ab"}) );
  }



  @Test
  public void test222(){
    assertEquals(0, solver.decompose("ababababababababababababababababababababababababab",new String[]{"ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab", "ab"}) );
  }



  @Test
  public void test223(){
    assertEquals(2, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaxy",new String[]{"a", "aa", "yx"}) );
  }



  @Test
  public void test224(){
    assertEquals(8, solver.decompose("ogodotsneeencs",new String[]{"go", "good", "do", "sentences", "tense", "scen", "odo"}) );
  }



  @Test
  public void test225(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "aa"}) );
  }



  @Test
  public void test226(){
    assertEquals(0, solver.decompose("abababababababababababababababababababababababab",new String[]{"a", "b", "ab", "ba", "aba", "abb", "bba", "bab", "aab", "abab", "a", "ba", "abbb", "aba", "bab", "ab", "b", "a", "abababab", "abababb", "bbaaba", "babab", "ababab", "ababab", "bababababa", "ababababababab", "babababa", "b", "a", "bab", "aba", "babba", "bbbaaaa", "aaaaaaabbbbbbb", "b", "a", "a", "a", "a", "b", "b", "b", "aaaabbbb", "baba", "aba", "bbbaaaa", "ba", "ab", "ab", "bbbaaaa"}) );
  }



  @Test
  public void test227(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa", "a", "aa", "aaa", "aaaa", "aaaaa"}) );
  }



  @Test
  public void test228(){
    assertEquals(0, solver.decompose("abcdefghjiklmnopqrstuvwxyz",new String[]{"ab", "bc", "cd", "de", "ef", "fg", "gh", "hi", "ij", "jk", "kl", "lm", "mn", "no", "op", "pq", "qr", "rs", "st", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "st", "tu", "uv", "vw", "wx"}) );
  }



  @Test
  public void test229(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "aaa", "aaaa", "aaaaa", "aaaaaa"}) );
  }



  @Test
  public void test230(){
    assertEquals(0, solver.decompose("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",new String[]{"aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa"}) );
  }



  @Test
  public void test231(){
    assertEquals(3, solver.decompose("abcdef",new String[]{"cab", "def", "fedabc"}) );
  }



}

