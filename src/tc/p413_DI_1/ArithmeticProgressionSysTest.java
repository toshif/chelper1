

package tc.p413_DI_1;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArithmeticProgressionSysTest {

  ArithmeticProgression solver; 

  @Before
  public void setUp() {
    solver = new ArithmeticProgression();
  }

  

  @Test
  public void test0(){
    assertEquals(6.75, solver.minCommonDifference(0,new int[]{6, 13, 20, 27}) , 1E-9);
  }



  @Test
  public void test1(){
    assertEquals(1.0, solver.minCommonDifference(1,new int[]{2, 3, 4, 5, 6}) , 1E-9);
  }



  @Test
  public void test2(){
    assertEquals(0.0, solver.minCommonDifference(3,new int[]{}) , 1E-9);
  }



  @Test
  public void test3(){
    assertEquals(0.2, solver.minCommonDifference(3,new int[]{3, 3, 3, 3, 4}) , 1E-9);
  }



  @Test
  public void test4(){
    assertEquals(-1.0, solver.minCommonDifference(1,new int[]{-3}) , 1E-9);
  }



  @Test
  public void test5(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 14}) , 1E-9);
  }



  @Test
  public void test6(){
    assertEquals(2000000.0, solver.minCommonDifference(-1000000,new int[]{1000000}) , 1E-9);
  }



  @Test
  public void test7(){
    assertEquals(326.25, solver.minCommonDifference(691937,new int[]{692263, 692589, 692915, 693242, 693568, 693894, 694220, 694547, 694873, 695199, 695525, 695852, 696178, 696504, 696830, 697157, 697483, 697809, 698135, 698462, 698788, 699114, 699440, 699767, 700093, 700419, 700745, 701072, 701398, 701724, 702050, 702377, 702703, 703029, 703355, 703682, 704008, 704334, 704660, 704987, 705313}) , 1E-9);
  }



  @Test
  public void test8(){
    assertEquals(89.70588235294117, solver.minCommonDifference(885027,new int[]{885116, 885206, 885296, 885385, 885475, 885565, 885654, 885744, 885834, 885924, 886013, 886103, 886193, 886282, 886372, 886462, 886552, 886641, 886731, 886821, 886910, 887000, 887090, 887179, 887269, 887359, 887449, 887538, 887628, 887718, 887807, 887897, 887987, 888077, 888166, 888256, 888346, 888435, 888525, 888615, 888704, 888794, 888884}) , 1E-9);
  }



  @Test
  public void test9(){
    assertEquals(363.32142857142856, solver.minCommonDifference(201850,new int[]{202213, 202576, 202939, 203303, 203666, 204029, 204393, 204756, 205119, 205483, 205846, 206209, 206573, 206936, 207299, 207663, 208026, 208389, 208753, 209116, 209479, 209843, 210206, 210569, 210933, 211296, 211659, 212023}) , 1E-9);
  }



  @Test
  public void test10(){
    assertEquals(6144.85, solver.minCommonDifference(-103259,new int[]{-97115, -90970, -84825, -78680, -72535, -66390, -60246, -54101, -47956, -41811, -35666, -29521, -23376, -17232, -11087, -4942, 1203, 7348, 13493, 19638, 25782, 31927, 38072, 44217, 50362, 56507, 62651}) , 1E-9);
  }



  @Test
  public void test11(){
    assertEquals(52.68181818181818, solver.minCommonDifference(-910980,new int[]{-910928, -910875, -910822, -910770, -910717, -910664, -910612, -910559, -910506, -910454, -910401, -910348, -910296, -910243, -910190, -910138, -910085, -910032, -909980, -909927, -909874, -909821, -909769, -909716, -909663, -909611, -909558, -909505, -909453, -909400, -909347, -909295, -909242, -909189, -909137, -909084, -909031}) , 1E-9);
  }



  @Test
  public void test12(){
    assertEquals(0.9666666666666667, solver.minCommonDifference(-297580,new int[]{-297580, -297579, -297578, -297577, -297576, -297575, -297574, -297573, -297572, -297571, -297570, -297569, -297568, -297567, -297566, -297565, -297564, -297563, -297562, -297561, -297560, -297559, -297558, -297557, -297556, -297555, -297554, -297553, -297552, -297551}) , 1E-9);
  }



  @Test
  public void test13(){
    assertEquals(304.2340425531915, solver.minCommonDifference(-277277,new int[]{-276973, -276669, -276365, -276061, -275756, -275452, -275148, -274844, -274539, -274235, -273931, -273627, -273322, -273018, -272714, -272410, -272106, -271801, -271497, -271193, -270889, -270584, -270280, -269976, -269672, -269367, -269063, -268759, -268455, -268150, -267846, -267542, -267238, -266934, -266629, -266325, -266021, -265717, -265412, -265108, -264804, -264500, -264195, -263891, -263587, -263283, -262978, -262674, -262370}) , 1E-9);
  }



  @Test
  public void test14(){
    assertEquals(55.5, solver.minCommonDifference(513379,new int[]{513434, 513490, 513545, 513601, 513656, 513712, 513767, 513823, 513878, 513934, 513989, 514045, 514100, 514156, 514211, 514267, 514322, 514378, 514433, 514489, 514544, 514600, 514655, 514711, 514766, 514822, 514877, 514933}) , 1E-9);
  }



  @Test
  public void test15(){
    assertEquals(207.26470588235293, solver.minCommonDifference(132385,new int[]{132592, 132799, 133006, 133214, 133421, 133628, 133835, 134043, 134250, 134457, 134664, 134872, 135079, 135286, 135493, 135701, 135908, 136115, 136323, 136530, 136737, 136944, 137152, 137359, 137566, 137773, 137981, 138188, 138395, 138602, 138810, 139017, 139224, 139432, 139639, 139846, 140053, 140261, 140468, 140675, 140882, 141090, 141297}) , 1E-9);
  }



  @Test
  public void test16(){
    assertEquals(113.68, solver.minCommonDifference(-825303,new int[]{-825190, -825076, -824962, -824849, -824735, -824621, -824508, -824394, -824280, -824167, -824053, -823939, -823826, -823712, -823598, -823485, -823371, -823257, -823144, -823030, -822916, -822803, -822689, -822575, -822461, -822348, -822234, -822120, -822007, -821893, -821779, -821666, -821552, -821438, -821325, -821211, -821097, -820984, -820870, -820756, -820643, -820529, -820415}) , 1E-9);
  }



  @Test
  public void test17(){
    assertEquals(23.897435897435898, solver.minCommonDifference(483992,new int[]{484015, 484039, 484063, 484087, 484111, 484135, 484159, 484183, 484207, 484230, 484254, 484278, 484302, 484326, 484350, 484374, 484398, 484422, 484446, 484469, 484493, 484517, 484541, 484565, 484589, 484613, 484637, 484661, 484685, 484708, 484732, 484756, 484780, 484804, 484828, 484852, 484876, 484900, 484924, 484947, 484971, 484995, 485019, 485043, 485067}) , 1E-9);
  }



  @Test
  public void test18(){
    assertEquals(48.46341463414634, solver.minCommonDifference(-425669,new int[]{-425621, -425573, -425524, -425476, -425427, -425379, -425330, -425282, -425233, -425185, -425136, -425088, -425039, -424991, -424943, -424894, -424846, -424797, -424749, -424700, -424652, -424603, -424555, -424506, -424458, -424409, -424361, -424313, -424264, -424216, -424167, -424119, -424070, -424022, -423973, -423925, -423876, -423828, -423779, -423731, -423682, -423634, -423586, -423537, -423489, -423440, -423392, -423343, -423295, -423246}) , 1E-9);
  }



  @Test
  public void test19(){
    assertEquals(182.63636363636363, solver.minCommonDifference(565849,new int[]{566031, 566214, 566396, 566579, 566762, 566944, 567127, 567310, 567492, 567675, 567858, 568040, 568223, 568405, 568588, 568771, 568953, 569136, 569319, 569501, 569684, 569867, 570049, 570232, 570414, 570597, 570780}) , 1E-9);
  }



  @Test
  public void test20(){
    assertEquals(86.41463414634147, solver.minCommonDifference(759001,new int[]{759087, 759173, 759260, 759346, 759433, 759519, 759605, 759692, 759778, 759865, 759951, 760037, 760124, 760210, 760297, 760383, 760470, 760556, 760642, 760729, 760815, 760902, 760988, 761074, 761161, 761247, 761334, 761420, 761507, 761593, 761679, 761766, 761852, 761939, 762025, 762111, 762198, 762284, 762371, 762457, 762544, 762630, 762716, 762803, 762889, 762976, 763062, 763148, 763235}) , 1E-9);
  }



  @Test
  public void test21(){
    assertEquals(87.96875, solver.minCommonDifference(-93495,new int[]{-93408, -93320, -93232, -93144, -93056, -92968, -92880, -92792, -92704, -92616, -92528, -92440, -92352, -92264, -92176, -92088, -92000, -91912, -91824, -91736, -91648, -91560, -91472, -91384, -91296, -91208, -91120, -91032, -90944, -90856, -90768, -90680}) , 1E-9);
  }



  @Test
  public void test22(){
    assertEquals(758.4285714285714, solver.minCommonDifference(476116,new int[]{476874, 477632, 478391, 479149, 479908, 480666, 481425, 482183, 482941, 483700, 484458, 485217, 485975, 486734, 487492, 488250, 489009, 489767, 490526, 491284, 492043, 492801, 493559, 494318, 495076, 495835, 496593, 497352}) , 1E-9);
  }



  @Test
  public void test23(){
    assertEquals(101.48275862068965, solver.minCommonDifference(750444,new int[]{750545, 750646, 750748, 750849, 750951, 751052, 751154, 751255, 751357, 751458, 751560, 751661, 751763, 751864, 751966, 752067, 752169, 752270, 752372, 752473, 752575, 752676, 752778, 752879, 752981, 753082, 753184, 753285, 753387, 753488}) , 1E-9);
  }



  @Test
  public void test24(){
    assertEquals(112.88888888888889, solver.minCommonDifference(615554,new int[]{615666, 615779, 615892, 616005, 616118, 616231, 616344, 616457, 616570, 616682, 616795, 616908, 617021, 617134, 617247, 617360, 617473, 617586, 617698, 617811, 617924, 618037, 618150, 618263, 618376, 618489, 618602, 618714, 618827, 618940, 619053, 619166, 619279, 619392, 619505, 619618, 619730, 619843, 619956, 620069, 620182, 620295, 620408, 620521, 620634, 620746}) , 1E-9);
  }



  @Test
  public void test25(){
    assertEquals(1501.0666666666666, solver.minCommonDifference(-102185,new int[]{-100684, -99183, -97682, -96181, -94680, -93179, -91678, -90177, -88676, -87175, -85674, -84173, -82672, -81171, -79669, -78168, -76667, -75166, -73665, -72164, -70663, -69162, -67661, -66160, -64659, -63158, -61657, -60156, -58655, -57153, -55652, -54151, -52650, -51149, -49648, -48147, -46646, -45145, -43644, -42143, -40642, -39141, -37640}) , 1E-9);
  }



  @Test
  public void test26(){
    assertEquals(1412.15, solver.minCommonDifference(-656644,new int[]{-655232, -653820, -652408, -650996, -649584, -648172, -646759, -645347, -643935, -642523, -641111, -639699, -638287, -636874, -635462, -634050, -632638, -631226, -629814, -628401, -626989, -625577, -624165, -622753, -621341, -619929}) , 1E-9);
  }



  @Test
  public void test27(){
    assertEquals(25.125, solver.minCommonDifference(116804,new int[]{116829, 116854, 116879, 116904, 116929, 116954, 116979, 117005, 117030, 117055, 117080, 117105, 117130, 117155, 117180, 117206, 117231, 117256, 117281, 117306, 117331, 117356, 117381, 117407, 117432, 117457, 117482, 117507, 117532}) , 1E-9);
  }



  @Test
  public void test28(){
    assertEquals(194.08333333333334, solver.minCommonDifference(705158,new int[]{705352, 705546, 705740, 705934, 706128, 706322, 706516, 706710, 706904, 707098, 707292, 707487, 707681, 707875, 708069, 708263, 708457, 708651, 708845, 709039, 709233, 709427, 709621, 709816, 710010, 710204, 710398}) , 1E-9);
  }



  @Test
  public void test29(){
    assertEquals(163.6, solver.minCommonDifference(998906,new int[]{999069, 999233, 999396, 999560, 999724, 999887}) , 1E-9);
  }



  @Test
  public void test30(){
    assertEquals(163.15625, solver.minCommonDifference(947268,new int[]{947431, 947594, 947757, 947920, 948083, 948246, 948410, 948573, 948736, 948899, 949062, 949225, 949389, 949552, 949715, 949878, 950041, 950204, 950367, 950531, 950694, 950857, 951020, 951183, 951346, 951510, 951673, 951836, 951999, 952162, 952325, 952489, 952652, 952815, 952978, 953141, 953304, 953467}) , 1E-9);
  }



  @Test
  public void test31(){
    assertEquals(74.0909090909091, solver.minCommonDifference(347360,new int[]{347434, 347508, 347582, 347656, 347730, 347804, 347878, 347952, 348026, 348100, 348175, 348249, 348323, 348397, 348471, 348545, 348619, 348693, 348767, 348841, 348915, 348990, 349064, 349138, 349212, 349286, 349360, 349434, 349508, 349582, 349656, 349730, 349805, 349879, 349953, 350027, 350101, 350175, 350249, 350323}) , 1E-9);
  }



  @Test
  public void test32(){
    assertEquals(246.57692307692307, solver.minCommonDifference(-349586,new int[]{-349340, -349093, -348847, -348600, -348354, -348107, -347860, -347614, -347367, -347121, -346874, -346628, -346381, -346134, -345888, -345641, -345395, -345148, -344902, -344655, -344408, -344162, -343915, -343669, -343422, -343175, -342929, -342682, -342436}) , 1E-9);
  }



  @Test
  public void test33(){
    assertEquals(14.761904761904763, solver.minCommonDifference(-290591,new int[]{-290577, -290562, -290547, -290532, -290518, -290503, -290488, -290473, -290459, -290444, -290429, -290414, -290400, -290385, -290370, -290355, -290341, -290326, -290311, -290296, -290281, -290267, -290252, -290237, -290222, -290208, -290193, -290178}) , 1E-9);
  }



  @Test
  public void test34(){
    assertEquals(1162.9166666666667, solver.minCommonDifference(925809,new int[]{926971, 928134, 929297, 930460, 931623, 932786, 933949, 935112, 936275, 937438, 938601, 939764, 940926, 942089, 943252, 944415, 945578, 946741, 947904, 949067, 950230, 951393, 952556, 953719, 954881, 956044, 957207, 958370, 959533, 960696, 961859, 963022}) , 1E-9);
  }



  @Test
  public void test35(){
    assertEquals(3549.1153846153848, solver.minCommonDifference(-275915,new int[]{-272366, -268817, -265268, -261719, -258170, -254621, -251072, -247523, -243973, -240424, -236875, -233326, -229777, -226228, -222679, -219130, -215581, -212031, -208482, -204933, -201384, -197835, -194286, -190737, -187188, -183638, -180089, -176540, -172991, -169442, -165893, -162344, -158795, -155246, -151696, -148147, -144598, -141049, -137500, -133951, -130402, -126853}) , 1E-9);
  }



  @Test
  public void test36(){
    assertEquals(98.4375, solver.minCommonDifference(-771738,new int[]{-771640, -771542, -771443, -771345, -771246, -771148, -771049, -770951, -770853, -770754, -770656, -770557, -770459, -770360, -770262, -770163, -770065, -769967, -769868, -769770, -769671, -769573, -769474, -769376, -769278, -769179, -769081, -768982, -768884, -768785, -768687, -768588, -768490, -768392, -768293, -768195, -768096, -767998, -767899, -767801, -767703, -767604, -767506, -767407, -767309}) , 1E-9);
  }



  @Test
  public void test37(){
    assertEquals(118.0625, solver.minCommonDifference(957500,new int[]{957618, 957736, 957854, 957972, 958090, 958208, 958326, 958444, 958562, 958680, 958798, 958916, 959034, 959152, 959270, 959389, 959507, 959625, 959743, 959861, 959979, 960097, 960215, 960333, 960451, 960569, 960687, 960805, 960923, 961041, 961159, 961278, 961396, 961514, 961632, 961750, 961868, 961986, 962104, 962222, 962340, 962458, 962576}) , 1E-9);
  }



  @Test
  public void test38(){
    assertEquals(127.875, solver.minCommonDifference(833747,new int[]{833874, 834002, 834130, 834258, 834386, 834514, 834642, 834770, 834897, 835025, 835153, 835281, 835409, 835537, 835665, 835793, 835920, 836048, 836176, 836304, 836432, 836560, 836688, 836816, 836943, 837071}) , 1E-9);
  }



  @Test
  public void test39(){
    assertEquals(13.52, solver.minCommonDifference(704252,new int[]{704265, 704279, 704292, 704306, 704319, 704333, 704346, 704360, 704373, 704387, 704400, 704414, 704427, 704441, 704454, 704468, 704481, 704495, 704508, 704522, 704535, 704549, 704562, 704576, 704590, 704603, 704617, 704630, 704644, 704657, 704671, 704684}) , 1E-9);
  }



  @Test
  public void test40(){
    assertEquals(76.25, solver.minCommonDifference(254423,new int[]{254499, 254575, 254651, 254728, 254804, 254880, 254956, 255033, 255109, 255185, 255261, 255338, 255414, 255490, 255566, 255643, 255719, 255795, 255871, 255948, 256024, 256100, 256176, 256253, 256329, 256405, 256481, 256558, 256634, 256710, 256786, 256863, 256939, 257015, 257091, 257168, 257244, 257320, 257396, 257473, 257549}) , 1E-9);
  }



  @Test
  public void test41(){
    assertEquals(97.20454545454545, solver.minCommonDifference(-593957,new int[]{-593860, -593763, -593666, -593569, -593471, -593374, -593277, -593180, -593083, -592985, -592888, -592791, -592694, -592597, -592499, -592402, -592305, -592208, -592111, -592013, -591916, -591819, -591722, -591625, -591527, -591430, -591333, -591236, -591139, -591041, -590944, -590847, -590750, -590653, -590555, -590458, -590361, -590264, -590167, -590069, -589972, -589875, -589778, -589680, -589583, -589486, -589389, -589292, -589194, -589097}) , 1E-9);
  }



  @Test
  public void test42(){
    assertEquals(17.941176470588236, solver.minCommonDifference(-194324,new int[]{-194307, -194289, -194271, -194253, -194235, -194217, -194199, -194181, -194163, -194145, -194127, -194109, -194091, -194073, -194055, -194037, -194019, -194002, -193984, -193966, -193948, -193930, -193912, -193894, -193876, -193858, -193840, -193822, -193804, -193786}) , 1E-9);
  }



  @Test
  public void test43(){
    assertEquals(20475.2, solver.minCommonDifference(257414,new int[]{277889, 298364, 318839, 339314, 359790, 380265, 400740, 421215, 441690, 462166, 482641, 503116, 523591, 544066, 564542, 585017, 605492, 625967, 646442, 666918, 687393, 707868, 728343, 748818, 769294, 789769, 810244, 830719, 851194, 871670, 892145, 912620, 933095, 953570, 974046, 994521}) , 1E-9);
  }



  @Test
  public void test44(){
    assertEquals(142.89795918367346, solver.minCommonDifference(225654,new int[]{225796, 225939, 226082, 226225, 226368, 226511, 226654, 226797, 226940, 227082, 227225, 227368, 227511, 227654, 227797, 227940, 228083, 228226, 228369, 228511, 228654, 228797, 228940, 229083, 229226, 229369, 229512, 229655, 229798, 229940, 230083, 230226, 230369, 230512, 230655, 230798, 230941, 231084, 231227, 231369, 231512, 231655, 231798, 231941, 232084, 232227, 232370, 232513, 232656, 232798}) , 1E-9);
  }



  @Test
  public void test45(){
    assertEquals(1032.8684210526317, solver.minCommonDifference(142060,new int[]{143092, 144125, 145158, 146191, 147224, 148257, 149290, 150322, 151355, 152388, 153421, 154454, 155487, 156520, 157553, 158585, 159618, 160651, 161684, 162717, 163750, 164783, 165815, 166848, 167881, 168914, 169947, 170980, 172013, 173046, 174078, 175111, 176144, 177177, 178210, 179243, 180276, 181309, 182341, 183374, 184407, 185440, 186473, 187506, 188539, 189571}) , 1E-9);
  }



  @Test
  public void test46(){
    assertEquals(35.58620689655172, solver.minCommonDifference(-107574,new int[]{-107539, -107503, -107468, -107432, -107397, -107361, -107325, -107290, -107254, -107219, -107183, -107147, -107112, -107076, -107041, -107005, -106970, -106934, -106898, -106863, -106827, -106792, -106756, -106720, -106685, -106649, -106614, -106578, -106542, -106507, -106471}) , 1E-9);
  }



  @Test
  public void test47(){
    assertEquals(25.6875, solver.minCommonDifference(537709,new int[]{537734, 537760, 537786, 537811, 537837, 537863, 537888, 537914, 537940, 537965, 537991, 538017, 538042, 538068, 538094, 538120, 538145, 538171, 538197, 538222, 538248, 538274, 538299, 538325, 538351, 538376, 538402, 538428, 538453}) , 1E-9);
  }



  @Test
  public void test48(){
    assertEquals(199.84615384615384, solver.minCommonDifference(164238,new int[]{164437, 164637, 164837, 165037, 165237, 165437, 165636, 165836, 166036, 166236, 166436, 166636, 166836, 167035, 167235, 167435, 167635, 167835, 168035, 168234, 168434, 168634, 168834, 169034, 169234, 169434}) , 1E-9);
  }



  @Test
  public void test49(){
    assertEquals(97.48717948717949, solver.minCommonDifference(469190,new int[]{469287, 469384, 469482, 469579, 469677, 469774, 469872, 469969, 470067, 470164, 470262, 470359, 470457, 470554, 470652, 470749, 470847, 470944, 471042, 471139, 471237, 471334, 471432, 471529, 471627, 471724, 471822, 471919, 472017, 472114, 472212, 472309, 472407, 472504, 472602, 472699, 472797, 472894, 472992, 473089}) , 1E-9);
  }



  @Test
  public void test50(){
    assertEquals(159.97619047619048, solver.minCommonDifference(373106,new int[]{373265, 373425, 373585, 373745, 373905, 374065, 374225, 374385, 374545, 374705, 374865, 375025, 375185, 375345, 375505, 375665, 375825, 375985, 376145, 376305, 376465, 376625, 376785, 376945, 377105, 377265, 377425, 377585, 377745, 377905, 378065, 378225, 378385, 378545, 378705, 378865, 379025, 379185, 379345, 379505, 379665, 379825}) , 1E-9);
  }



  @Test
  public void test51(){
    assertEquals(38.516129032258064, solver.minCommonDifference(-291121,new int[]{-291083, -291044, -291006, -290967, -290929, -290890, -290852, -290813, -290775, -290736, -290698, -290659, -290621, -290582, -290544, -290505, -290467, -290428, -290390, -290351, -290313, -290274, -290236, -290197, -290159, -290120, -290082, -290043, -290005, -289966, -289927, -289889, -289850, -289812, -289773, -289735, -289696}) , 1E-9);
  }



  @Test
  public void test52(){
    assertEquals(59.333333333333336, solver.minCommonDifference(-684185,new int[]{-684126, -684067, -684007, -683948, -683889, -683829, -683770, -683711, -683651, -683592, -683533, -683473, -683414, -683355, -683295, -683236, -683177, -683117, -683058, -682999, -682939, -682880, -682821, -682761, -682702, -682643, -682583, -682524, -682465}) , 1E-9);
  }



  @Test
  public void test53(){
    assertEquals(28.342105263157894, solver.minCommonDifference(900905,new int[]{900933, 900961, 900990, 901018, 901046, 901075, 901103, 901131, 901160, 901188, 901216, 901245, 901273, 901301, 901330, 901358, 901386, 901415, 901443, 901471, 901500, 901528, 901556, 901585, 901613, 901641, 901670, 901698, 901726, 901755, 901783, 901811, 901840, 901868, 901896, 901925, 901953, 901982, 902010, 902038, 902067, 902095, 902123, 902152, 902180, 902208, 902237}) , 1E-9);
  }



  @Test
  public void test54(){
    assertEquals(106.65517241379311, solver.minCommonDifference(35410,new int[]{35516, 35623, 35729, 35836, 35943, 36049, 36156, 36263, 36369, 36476, 36583, 36689, 36796, 36903, 37009, 37116, 37223, 37329, 37436, 37543, 37649, 37756, 37863, 37969, 38076, 38183, 38289, 38396, 38503, 38609, 38716, 38822, 38929, 39036, 39142, 39249, 39356, 39462}) , 1E-9);
  }



  @Test
  public void test55(){
    assertEquals(239.3846153846154, solver.minCommonDifference(-934220,new int[]{-933981, -933742, -933502, -933263, -933024, -932784, -932545, -932305, -932066, -931827, -931587, -931348, -931108, -930869, -930630, -930390, -930151, -929912, -929672, -929433, -929193, -928954, -928715, -928475, -928236, -927996, -927757, -927518, -927278}) , 1E-9);
  }



  @Test
  public void test56(){
    assertEquals(361.8, solver.minCommonDifference(334991,new int[]{335352, 335714, 336076, 336438, 336800, 337161, 337523, 337885, 338247, 338609, 338970, 339332, 339694, 340056, 340418, 340779, 341141, 341503, 341865, 342227, 342588, 342950, 343312, 343674, 344036, 344397, 344759, 345121, 345483, 345845}) , 1E-9);
  }



  @Test
  public void test57(){
    assertEquals(0.4358974358974359, solver.minCommonDifference(2,new int[]{2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 13, 13, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 19, 20, 20, 21, 21}) , 1E-9);
  }



  @Test
  public void test58(){
    assertEquals(0.0, solver.minCommonDifference(1000000,new int[]{1000000, 1000000, 1000000}) , 1E-9);
  }



  @Test
  public void test59(){
    assertEquals(0.0, solver.minCommonDifference(1,new int[]{1}) , 1E-9);
  }



  @Test
  public void test60(){
    assertEquals(5.5, solver.minCommonDifference(0,new int[]{5, 11, 16}) , 1E-9);
  }



  @Test
  public void test61(){
    assertEquals(1.0, solver.minCommonDifference(1,new int[]{2}) , 1E-9);
  }



  @Test
  public void test62(){
    assertEquals(0.75, solver.minCommonDifference(1,new int[]{1, 2, 3, 4, 4}) , 1E-9);
  }



  @Test
  public void test63(){
    assertEquals(6.75, solver.minCommonDifference(0,new int[]{6, 13, 20, 27, 33}) , 1E-9);
  }



  @Test
  public void test64(){
    assertEquals(0.8, solver.minCommonDifference(3,new int[]{3, 4, 5, 6, 7}) , 1E-9);
  }



  @Test
  public void test65(){
    assertEquals(1848.896551724138, solver.minCommonDifference(-1219,new int[]{629, 2478, 4327, 6176, 8025, 9874, 11723, 13572, 15421, 17269, 19118, 20967, 22816, 24665, 26514, 28363, 30212, 32061, 33910, 35758, 37607, 39456, 41305, 43154, 45003, 46852, 48701, 50550, 52399, 54247, 56096, 57945, 59794, 61643, 63492, 65341}) , 1E-9);
  }



  @Test
  public void test66(){
    assertEquals(6.666666666666667, solver.minCommonDifference(-33,new int[]{-27, -20, -13}) , 1E-9);
  }



  @Test
  public void test67(){
    assertEquals(1.0, solver.minCommonDifference(-2,new int[]{-1}) , 1E-9);
  }



  @Test
  public void test68(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{5, 10, 16, 22}) , 1E-9);
  }



  @Test
  public void test69(){
    assertEquals(0.02, solver.minCommonDifference(-1000000,new int[]{-1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -1000000, -999999}) , 1E-9);
  }



  @Test
  public void test70(){
    assertEquals(0.02, solver.minCommonDifference(0,new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}) , 1E-9);
  }



  @Test
  public void test71(){
    assertEquals(0.5, solver.minCommonDifference(-1,new int[]{-1, 0, 0, 1}) , 1E-9);
  }



  @Test
  public void test72(){
    assertEquals(2.5, solver.minCommonDifference(-10,new int[]{-8, -5, -3}) , 1E-9);
  }



  @Test
  public void test73(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{5, 5, 100, 5, 5}) , 1E-9);
  }



  @Test
  public void test74(){
    assertEquals(6.75, solver.minCommonDifference(0,new int[]{6, 13, 20, 27}) , 1E-9);
  }



  @Test
  public void test75(){
    assertEquals(1.5, solver.minCommonDifference(-10,new int[]{-9, -7}) , 1E-9);
  }



  @Test
  public void test76(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 13, 20, 28}) , 1E-9);
  }



  @Test
  public void test77(){
    assertEquals(0.02, solver.minCommonDifference(3,new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4}) , 1E-9);
  }



  @Test
  public void test78(){
    assertEquals(0.2857142857142857, solver.minCommonDifference(3,new int[]{3, 3, 3, 4, 4, 4, 5}) , 1E-9);
  }



  @Test
  public void test79(){
    assertEquals(2000000.0, solver.minCommonDifference(-1000000,new int[]{1000000}) , 1E-9);
  }



  @Test
  public void test80(){
    assertEquals(-1.0, solver.minCommonDifference(3,new int[]{2, 2}) , 1E-9);
  }



  @Test
  public void test81(){
    assertEquals(9.119047619047619, solver.minCommonDifference(17,new int[]{26, 35, 44, 53, 62, 71, 80, 89, 99, 108, 117, 126, 135, 144, 153, 162, 172, 181, 190, 199, 208, 217, 226, 235, 244, 254, 263, 272, 281, 290, 299, 308, 317, 327, 336, 345, 354, 363, 372, 381, 390, 400, 409, 418, 427, 436, 445, 454, 463, 472}) , 1E-9);
  }



  @Test
  public void test82(){
    assertEquals(0.5, solver.minCommonDifference(3,new int[]{3, 4, 4}) , 1E-9);
  }



  @Test
  public void test83(){
    assertEquals(0.0, solver.minCommonDifference(3,new int[]{3, 3, 3, 3, 3, 3}) , 1E-9);
  }



  @Test
  public void test84(){
    assertEquals(1000000.0, solver.minCommonDifference(-1000000,new int[]{0, 1000000}) , 1E-9);
  }



  @Test
  public void test85(){
    assertEquals(0.0, solver.minCommonDifference(5,new int[]{}) , 1E-9);
  }



  @Test
  public void test86(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 1, 1, 1, 2, 3}) , 1E-9);
  }



  @Test
  public void test87(){
    assertEquals(1.0232558139534884, solver.minCommonDifference(999909,new int[]{999910, 999911, 999912, 999913, 999914, 999915, 999916, 999917, 999918, 999919, 999920, 999921, 999922, 999923, 999924, 999925, 999926, 999927, 999928, 999929, 999930, 999931, 999932, 999933, 999934, 999935, 999936, 999937, 999938, 999939, 999940, 999941, 999942, 999943, 999944, 999945, 999946, 999947, 999948, 999949, 999950, 999951, 999953, 999954, 999955, 999956, 999957, 999958, 999959, 999960}) , 1E-9);
  }



  @Test
  public void test88(){
    assertEquals(-1.0, solver.minCommonDifference(-10,new int[]{-8, -7}) , 1E-9);
  }



  @Test
  public void test89(){
    assertEquals(1.0, solver.minCommonDifference(1,new int[]{2, 3, 4, 5, 6}) , 1E-9);
  }



  @Test
  public void test90(){
    assertEquals(1.0, solver.minCommonDifference(0,new int[]{1}) , 1E-9);
  }



  @Test
  public void test91(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 3, 4, 6, 7, 9, 10, 12, 11}) , 1E-9);
  }



  @Test
  public void test92(){
    assertEquals(-1.0, solver.minCommonDifference(-1,new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}) , 1E-9);
  }



  @Test
  public void test93(){
    assertEquals(0.0, solver.minCommonDifference(3,new int[]{3, 3, 3, 3, 3}) , 1E-9);
  }



  @Test
  public void test94(){
    assertEquals(1123.5, solver.minCommonDifference(1790,new int[]{2913, 4037, 5160, 6284}) , 1E-9);
  }



  @Test
  public void test95(){
    assertEquals(-1.0, solver.minCommonDifference(1,new int[]{3, 2}) , 1E-9);
  }



  @Test
  public void test96(){
    assertEquals(0.0, solver.minCommonDifference(0,new int[]{0}) , 1E-9);
  }



  @Test
  public void test97(){
    assertEquals(0.14634146341463414, solver.minCommonDifference(-5,new int[]{-5, -5, -5, -5, -5, -5, -4, -4, -4, -4, -4, -4, -4, -3, -3, -3, -3, -3, -3, -3, -2, -2, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}) , 1E-9);
  }



  @Test
  public void test98(){
    assertEquals(1.0, solver.minCommonDifference(-3,new int[]{-2}) , 1E-9);
  }



  @Test
  public void test99(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}) , 1E-9);
  }



  @Test
  public void test100(){
    assertEquals(3.0, solver.minCommonDifference(0,new int[]{3}) , 1E-9);
  }



  @Test
  public void test101(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 14, 22, 30}) , 1E-9);
  }



  @Test
  public void test102(){
    assertEquals(0.5, solver.minCommonDifference(0,new int[]{0, 1, 1}) , 1E-9);
  }



  @Test
  public void test103(){
    assertEquals(2.0, solver.minCommonDifference(-9,new int[]{-7, -5, -3, -1, 1}) , 1E-9);
  }



  @Test
  public void test104(){
    assertEquals(2.0, solver.minCommonDifference(-7,new int[]{-5}) , 1E-9);
  }



  @Test
  public void test105(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 3, 2}) , 1E-9);
  }



  @Test
  public void test106(){
    assertEquals(-1.0, solver.minCommonDifference(5,new int[]{3, 1}) , 1E-9);
  }



  @Test
  public void test107(){
    assertEquals(3.4, solver.minCommonDifference(-10,new int[]{-7, -4, 0, 3, 7}) , 1E-9);
  }



  @Test
  public void test108(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 1, 1, 2, 2, 3}) , 1E-9);
  }



  @Test
  public void test109(){
    assertEquals(1.98, solver.minCommonDifference(13,new int[]{14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112}) , 1E-9);
  }



  @Test
  public void test110(){
    assertEquals(2.0, solver.minCommonDifference(1,new int[]{3}) , 1E-9);
  }



  @Test
  public void test111(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 1, 1, 1, 1, 1, 1, 1}) , 1E-9);
  }



  @Test
  public void test112(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{9, 10}) , 1E-9);
  }



  @Test
  public void test113(){
    assertEquals(1.25, solver.minCommonDifference(1,new int[]{2, 3, 4, 6, 7}) , 1E-9);
  }



  @Test
  public void test114(){
    assertEquals(0.3333333333333333, solver.minCommonDifference(0,new int[]{0, 0, 1, 1}) , 1E-9);
  }



  @Test
  public void test115(){
    assertEquals(0.0, solver.minCommonDifference(-1,new int[]{-1}) , 1E-9);
  }



  @Test
  public void test116(){
    assertEquals(1.5, solver.minCommonDifference(0,new int[]{1, 3, 4}) , 1E-9);
  }



  @Test
  public void test117(){
    assertEquals(2.0, solver.minCommonDifference(-4,new int[]{-2}) , 1E-9);
  }



  @Test
  public void test118(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 1}) , 1E-9);
  }



  @Test
  public void test119(){
    assertEquals(1.5, solver.minCommonDifference(-100,new int[]{-99, -97, -96, -94, -93}) , 1E-9);
  }



  @Test
  public void test120(){
    assertEquals(1.3333333333333333, solver.minCommonDifference(2,new int[]{3, 4, 6}) , 1E-9);
  }



  @Test
  public void test121(){
    assertEquals(0.6666666666666666, solver.minCommonDifference(0,new int[]{0, 1, 2}) , 1E-9);
  }



  @Test
  public void test122(){
    assertEquals(0.0, solver.minCommonDifference(3,new int[]{}) , 1E-9);
  }



  @Test
  public void test123(){
    assertEquals(1.8, solver.minCommonDifference(0,new int[]{1, 3, 5, 7, 9, 10}) , 1E-9);
  }



  @Test
  public void test124(){
    assertEquals(0.2, solver.minCommonDifference(3,new int[]{3, 3, 3, 3, 4, 4}) , 1E-9);
  }



  @Test
  public void test125(){
    assertEquals(0.3333333333333333, solver.minCommonDifference(1,new int[]{1, 1, 2, 2}) , 1E-9);
  }



  @Test
  public void test126(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 3, 4, 5, 6, 7}) , 1E-9);
  }



  @Test
  public void test127(){
    assertEquals(3.5, solver.minCommonDifference(0,new int[]{3, 7, 10}) , 1E-9);
  }



  @Test
  public void test128(){
    assertEquals(0.0, solver.minCommonDifference(8,new int[]{}) , 1E-9);
  }



  @Test
  public void test129(){
    assertEquals(1.3333333333333333, solver.minCommonDifference(0,new int[]{1, 2, 4, 5}) , 1E-9);
  }



  @Test
  public void test130(){
    assertEquals(-1.0, solver.minCommonDifference(-100000,new int[]{3, 3, 3, 3, 3}) , 1E-9);
  }



  @Test
  public void test131(){
    assertEquals(1.0, solver.minCommonDifference(2,new int[]{3}) , 1E-9);
  }



  @Test
  public void test132(){
    assertEquals(0.5, solver.minCommonDifference(-1,new int[]{-1, 0, 0}) , 1E-9);
  }



  @Test
  public void test133(){
    assertEquals(2.5, solver.minCommonDifference(0,new int[]{2, 5, 7}) , 1E-9);
  }



  @Test
  public void test134(){
    assertEquals(4.0, solver.minCommonDifference(1,new int[]{5}) , 1E-9);
  }



  @Test
  public void test135(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{3, 5}) , 1E-9);
  }



  @Test
  public void test136(){
    assertEquals(1.0204081632653061, solver.minCommonDifference(0,new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50}) , 1E-9);
  }



  @Test
  public void test137(){
    assertEquals(6.5, solver.minCommonDifference(-100,new int[]{-94, -87}) , 1E-9);
  }



  @Test
  public void test138(){
    assertEquals(6.75, solver.minCommonDifference(-100,new int[]{-94, -87, -80, -73}) , 1E-9);
  }



  @Test
  public void test139(){
    assertEquals(999999.0, solver.minCommonDifference(0,new int[]{999999}) , 1E-9);
  }



  @Test
  public void test140(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 2, 3, 4, 5, 10000, 7, 8, 9, 10}) , 1E-9);
  }



  @Test
  public void test141(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 3, 4, 5}) , 1E-9);
  }



  @Test
  public void test142(){
    assertEquals(0.25, solver.minCommonDifference(3,new int[]{3, 3, 3, 4, 4}) , 1E-9);
  }



  @Test
  public void test143(){
    assertEquals(0.35714285714285715, solver.minCommonDifference(-999902,new int[]{-999902, -999902, -999901, -999901, -999901, -999900, -999900, -999900, -999899, -999899, -999899, -999898, -999898, -999897, -999897, -999897, -999896, -999896, -999896, -999895, -999895}) , 1E-9);
  }



  @Test
  public void test144(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{-1}) , 1E-9);
  }



  @Test
  public void test145(){
    assertEquals(6.666666666666667, solver.minCommonDifference(0,new int[]{6, 13, 20, 26}) , 1E-9);
  }



  @Test
  public void test146(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{2, 1}) , 1E-9);
  }



  @Test
  public void test147(){
    assertEquals(6.333333333333333, solver.minCommonDifference(0,new int[]{6, 12, 19, 25}) , 1E-9);
  }



  @Test
  public void test148(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 20}) , 1E-9);
  }



  @Test
  public void test149(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{0, 0, 0, 0, 0, 2}) , 1E-9);
  }



  @Test
  public void test150(){
    assertEquals(1000000.0, solver.minCommonDifference(0,new int[]{1000000}) , 1E-9);
  }



  @Test
  public void test151(){
    assertEquals(1.25, solver.minCommonDifference(0,new int[]{1, 2, 3, 5, 6}) , 1E-9);
  }



  @Test
  public void test152(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 13, 20, 27, 30}) , 1E-9);
  }



  @Test
  public void test153(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{7, 13, 20, 27}) , 1E-9);
  }



  @Test
  public void test154(){
    assertEquals(0.3333333333333333, solver.minCommonDifference(-1,new int[]{-1, -1, 0}) , 1E-9);
  }



  @Test
  public void test155(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{6, 11, 17}) , 1E-9);
  }



  @Test
  public void test156(){
    assertEquals(-1.0, solver.minCommonDifference(-5,new int[]{-3, -2}) , 1E-9);
  }



  @Test
  public void test157(){
    assertEquals(5.666666666666667, solver.minCommonDifference(-2,new int[]{3, 9, 15}) , 1E-9);
  }



  @Test
  public void test158(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{7, 13}) , 1E-9);
  }



  @Test
  public void test159(){
    assertEquals(-1.0, solver.minCommonDifference(0,new int[]{1, 2, 2}) , 1E-9);
  }



  @Test
  public void test160(){
    assertEquals(-1.0, solver.minCommonDifference(1,new int[]{3, 5, 4, 7}) , 1E-9);
  }



}

