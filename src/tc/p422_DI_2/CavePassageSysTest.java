

package tc.p422_DI_2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CavePassageSysTest {

  CavePassage solver; 

  @Before
  public void setUp() {
    solver = new CavePassage();
  }

  

  @Test
  public void test0(){
    assertEquals(1, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},13) );
  }



  @Test
  public void test1(){
    assertEquals(9, solver.minimalTime(new int[]{1, 1, 1},new int[]{2, 3, 4},new String[]{"YYY", "YYY", "YYY"},2) );
  }



  @Test
  public void test2(){
    assertEquals(10, solver.minimalTime(new int[]{1, 1, 1},new int[]{2, 3, 4},new String[]{"YYY", "YYY", "NYY"},2) );
  }



  @Test
  public void test3(){
    assertEquals(19, solver.minimalTime(new int[]{1, 1, 1},new int[]{7, 13, 19},new String[]{"YYN", "NYY", "YNY"},3) );
  }



  @Test
  public void test4(){
    assertEquals(13, solver.minimalTime(new int[]{5, 3, 2, 1, 1},new int[]{3, 3, 5, 7, 7},new String[]{"YYYYY", "YYYYY", "YYYYY", "YYYYY", "YYYYY"},10) );
  }



  @Test
  public void test5(){
    assertEquals(5, solver.minimalTime(new int[]{3, 3, 6},new int[]{1, 1, 1},new String[]{"YYY", "YYY", "YYY"},6) );
  }



  @Test
  public void test6(){
    assertEquals(23, solver.minimalTime(new int[]{20, 20, 10, 10, 1, 1},new int[]{10, 10, 10, 10, 3, 3},new String[]{"YNNNYN", "NYNNYN", "NNYNNY", "NNNYNY", "YYYYYY", "YYYYYY"},32) );
  }



  @Test
  public void test7(){
    assertEquals(-1, solver.minimalTime(new int[]{43},new int[]{23},new String[]{"Y"},42) );
  }



  @Test
  public void test8(){
    assertEquals(23, solver.minimalTime(new int[]{1, 20, 20, 10, 10, 1},new int[]{3, 10, 10, 10, 10, 3},new String[]{"YYYYYY", "NYNNNY", "NNYNNY", "YNNYNN", "YNNNYN", "YYYYYY"},32) );
  }



  @Test
  public void test9(){
    assertEquals(1234, solver.minimalTime(new int[]{38, 132, 718, 350, 33, 736, 889, 116, 191, 537},new int[]{728, 724, 663, 631, 640, 118, 113, 691, 234, 887},new String[]{"YNNYYYYYYN", "YYYYNYYNYY", "YNYYYYYYNN", "NYYYYYYYYY", "NYYYYYYNNN", "NYYYYYYYYY", "YYYYYNYYYY", "YYYYYYYYYY", "YYYNYYYYYY", "YNNYYYNYYY"},3306) );
  }



  @Test
  public void test10(){
    assertEquals(1375, solver.minimalTime(new int[]{898, 622, 507, 923, 461, 784, 620, 203, 425, 501},new int[]{59, 650, 537, 336, 976, 326, 172, 324, 980, 355},new String[]{"YYNYYNNYYN", "YYYYYNYYNN", "NYYYYYYYYY", "NYNYYYYYYN", "YYNYYYYYYY", "YNYYYYNYYY", "YYYNYNYNNY", "NYYYYYNYYY", "YYYYYYNYYY", "YYYYYYYNYY"},3672) );
  }



  @Test
  public void test11(){
    assertEquals(1407, solver.minimalTime(new int[]{668, 837, 332, 773, 116, 636, 578, 658, 799, 859, 937},new int[]{18, 368, 324, 959, 702, 207, 12, 552, 616, 330, 20},new String[]{"YYYYNYYYNYY", "NYYNNYYYNNN", "YYYYYNYYYNY", "NNNYNYYNYYY", "YNYYYNYYYYY", "YNYYNYYNNYY", "YYYYNYYYYYY", "YYYYNYNYYNY", "YNYYYNYNYNY", "NNYYYNYNNYY", "YYNYYYNYYYY"},3071) );
  }



  @Test
  public void test12(){
    assertEquals(1000, solver.minimalTime(new int[]{603, 362, 88, 860, 847, 588, 953, 670, 463, 457},new int[]{443, 359, 416, 405, 102, 244, 605, 255, 293, 588},new String[]{"YNNYNNYYYY", "YYYNYNNYYY", "YYYYYYNYYN", "YYNYYYYNYN", "NYYNYYYNYY", "YYNYYYYYYN", "YYYYYYYYYY", "YNYYNYYYYY", "NYYYYNYYYY", "YYYNYYNYYY"},4245) );
  }



  @Test
  public void test13(){
    assertEquals(1951, solver.minimalTime(new int[]{284, 340, 368, 244, 363, 84, 47, 35, 489, 509},new int[]{853, 810, 856, 526, 27, 57, 807, 146, 366, 378},new String[]{"YYYNNYNYYY", "YYYNNYYYYY", "NYYNYNNNYY", "YYYYYYYNYY", "YYYYYNNYYY", "YYYYYYYNYN", "YYNNYYYYYY", "YYYYYYYYYY", "NNYYYYYNYY", "YYYYYNYYYY"},1048) );
  }



  @Test
  public void test14(){
    assertEquals(1266, solver.minimalTime(new int[]{790, 152, 388, 265, 473, 498, 106, 479, 840, 502},new int[]{935, 992, 137, 426, 534, 261, 954, 715, 13, 86},new String[]{"YNYYYNYYYN", "YYNYYYYYYY", "NNYNYYYNNN", "YNYYYNYNYY", "YYYYYNYYYN", "YYYYYYYYNY", "NYYYYNYYYN", "YNYYYYYYYY", "YYNNYNNNYY", "YNYNYYNYNY"},3231) );
  }



  @Test
  public void test15(){
    assertEquals(3002, solver.minimalTime(new int[]{7, 262, 655, 404, 444, 50, 517, 908, 939, 502, 657, 695},new int[]{1000, 545, 806, 513, 445, 837, 468, 137, 360, 511, 10, 657},new String[]{"YYNYYYYYYYYY", "NYYYYYYYNYNY", "YYYYYNYYYYYY", "YYYYYYYYYNNY", "YYNYYYYYNYYY", "YYYNYYYYYYYN", "YYYYNNYNYNYY", "YYYYNNNYYNYY", "YYYYYYYNYYNN", "YNNYYYYNNYYY", "NYNYYYYYYYYY", "YYYYNYYYYYYY"},1632) );
  }



  @Test
  public void test16(){
    assertEquals(3933, solver.minimalTime(new int[]{62, 917, 698, 982, 992, 491, 690, 697, 637, 909, 912, 299},new int[]{341, 774, 865, 501, 579, 663, 209, 525, 640, 267, 79, 248},new String[]{"YYYYYYYYYYYN", "YYYYYYYNYNYY", "NYYYYYYYYYYN", "YNYYYNYYYNNN", "YNYYYYYNYNYY", "NYYYNYYYYYNY", "NNYNYYYYYYYY", "YYYYYYNYYYYY", "YNYNYYNYYYYN", "YYYYYYYYNYYY", "YYYYYNYYYYYY", "YYYYYYYYNYYY"},1939) );
  }



  @Test
  public void test17(){
    assertEquals(5020, solver.minimalTime(new int[]{764, 569, 324, 485, 788, 690, 507, 455, 258, 305, 153, 775},new int[]{489, 244, 538, 503, 287, 777, 485, 665, 997, 549, 574, 42},new String[]{"YYYYYYYNYYYY", "NYYYNYYYYYYN", "YNYYNYYYYNYY", "YYYYYYYYNYYY", "NYYYYNYYYYYY", "YYYYNYYYYYYY", "NYYNYYYYYYYY", "NYNYYNYYYYYY", "YYNYNYYYYYYN", "YNYYYYYYYYYY", "YYNYYNYYYYYY", "NYYNYNYYYYYY"},1543) );
  }



  @Test
  public void test18(){
    assertEquals(2729, solver.minimalTime(new int[]{902, 338, 395, 593, 623, 44, 644, 315, 641, 379, 31, 58},new int[]{165, 144, 116, 101, 916, 637, 6, 218, 867, 774, 608, 483},new String[]{"YYNYYYYNNYYY", "YYYYYNYNYNNY", "NNYYYYYYYYYN", "YYYYYYYYYYYY", "NYNYYYNYNNYY", "YNYYYYYYYNYY", "YYYNNNYYNYYY", "YYYYNYNYYYNY", "YYYYYNYYYYYY", "YYYYYNYNNYYN", "NNYYNNYYYNYY", "YYNYYYYYYYYY"},1330) );
  }



  @Test
  public void test19(){
    assertEquals(3534, solver.minimalTime(new int[]{38, 98, 73, 341, 803, 178, 873, 977, 718, 204, 540, 194},new int[]{280, 460, 108, 290, 857, 833, 69, 986, 631, 503, 520, 139},new String[]{"YYYYNYYYYYYY", "YYYYYNYNYYYY", "YYYYYNYYNYNY", "YNYYNNNNYYYY", "YYYYYNYNYNYY", "YNYYYYYYYYNY", "YYYYYYYNYYNN", "YNYYYYYYYYNY", "YYNYYYYNYNYY", "NYYYYNYYYYYY", "YNYNNYNYYYYN", "YYYYYYYYYNYY"},1164) );
  }



  @Test
  public void test20(){
    assertEquals(8138, solver.minimalTime(new int[]{128, 128, 750, 33, 225, 968, 838, 989, 652, 592, 91, 957},new int[]{850, 965, 25, 624, 665, 166, 788, 905, 96, 365, 853, 524},new String[]{"YNYYYNNYYYYY", "NYYYYYYYYYYY", "YYYYYYYNNYYY", "YYYYNYYYYYYN", "NYYYYYYYNYYN", "YYNNYYYYNYYY", "NYNNYYYYYYYN", "YYYYYYNYYYNY", "YYYYNYNYYYYY", "YYYYNNYYYYYY", "YYYYYYYYYYYN", "YNYYYYYYYYYY"},1171) );
  }



  @Test
  public void test21(){
    assertEquals(2694, solver.minimalTime(new int[]{310, 345, 808, 120, 374, 479, 132, 614, 632, 324, 740, 982},new int[]{209, 585, 519, 283, 849, 443, 807, 579, 68, 574, 972, 199},new String[]{"YNYNYYYNYYYY", "YYYNYYYNYYYN", "YYYYNYYNYYYY", "YYYYYYYYYYNN", "YNYYYYYYYYNY", "YNNYYYYNYYYY", "YYYYYYYYYYYY", "YYNYYNNYNYNN", "YNYYYYNYYYYY", "YYYYYYYNYYYY", "YYYNYNYNYYYN", "YNYYYNNYYNNY"},1890) );
  }



  @Test
  public void test22(){
    assertEquals(2471, solver.minimalTime(new int[]{248, 840, 567, 325, 324, 656, 615, 880, 243, 604, 156, 239},new int[]{739, 125, 635, 8, 175, 342, 921, 867, 435, 799, 125, 537},new String[]{"YYYYNYYNYYYY", "NYYYYYYNYYYY", "NYYYNNYYYNYY", "YYYYNYYYYYNY", "NYYYYYYYYNYN", "YYNYYYYYYYNY", "YNYYYYYYYNYN", "NYNYYYYYNYYY", "YYYYYYYYYYYY", "YNNNYYYNYYNY", "YNYNYYYYYYYY", "YYNYYYYYNNNY"},1786) );
  }



  @Test
  public void test23(){
    assertEquals(1827, solver.minimalTime(new int[]{429, 513, 410, 492, 20, 495, 694, 199, 605, 416, 405, 310},new int[]{277, 655, 7, 416, 939, 8, 490, 488, 47, 730, 297, 413},new String[]{"YYNYYYYYYYNY", "NYYYYYYYYYNN", "NYYYYYNYYYNN", "NYYYYYYNNYYY", "YYYNYYNYNNNY", "YNYYYYNYNNYY", "NYYNYNYNYYNY", "NYYYYNYYYYYY", "YYYYNYYYYYYN", "YYNYYYYYYYNN", "NYYNYYYYNYYY", "YYYYYYYYYYYY"},1535) );
  }



  @Test
  public void test24(){
    assertEquals(3123, solver.minimalTime(new int[]{273, 550, 194, 351, 775, 318, 831, 548, 914, 491, 511, 18},new int[]{312, 543, 932, 299, 475, 438, 518, 403, 297, 850, 642, 862},new String[]{"YYYYNYYYYYYY", "NYYNYYYYYYNN", "NYYYYYYYYYNY", "YNYYNYYYYYYY", "YNNYYYYYYNNN", "YYYYNYYYNYYY", "YYYYNYYYNNYY", "YYNYYYYYYNNY", "YYYYYYYYYNNY", "NYYYYYYYNYYY", "YYYYNYYYYYYY", "YYYNYYYYYYYY"},1914) );
  }



  @Test
  public void test25(){
    assertEquals(1119, solver.minimalTime(new int[]{651, 80, 968, 515, 78, 178, 25, 743, 966, 870, 40, 974, 283},new int[]{207, 38, 311, 772, 762, 480, 30, 629, 669, 14, 882, 398, 149},new String[]{"YYYYYYYYYNYYN", "NYNYYNYYNNYYY", "YYYYNNYYNYYYY", "YYYYYYYNYNYYN", "NYNNYYYYYNYYN", "YNNNNYYYYYYNN", "YYNYNYYYYNNYY", "YYYYYYNYYYYYY", "YYYYNYYYYYYYY", "YYNYYYYYYYYNN", "YYYYYYYNYYYYY", "YYNNYYYYYYYYN", "YYYYYYYYYYYNY"},4664) );
  }



  @Test
  public void test26(){
    assertEquals(68, solver.minimalTime(new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 500, 500},new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},1000) );
  }



  @Test
  public void test27(){
    assertEquals(46, solver.minimalTime(new int[]{600, 600, 600, 600, 600, 800, 800, 800, 800, 800, 400, 400, 400},new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},new String[]{"YNNNNNNNNNYNN", "NYNNNNNNNNNYN", "NNYNNNNNNNYNN", "NNNYNNNNNNNYN", "NNNNYNNNNNYNY", "NNNNNYNNNNYNN", "NNNNNNYNNNNYN", "NNNNNNNYNNNNY", "NNNNNNNNYNYNN", "NNNNNNNNNYNYN", "NNNNNNNNNNYYN", "NNNNNNNNNNYYN", "NNNNNNNNNNNYY"},1000) );
  }



  @Test
  public void test28(){
    assertEquals(1369, solver.minimalTime(new int[]{45, 30, 129, 105, 107},new int[]{130, 366, 355, 195, 259},new String[]{"YNNYN", "NYNNN", "NNYYY", "NNNYY", "NNNYY"},1393) );
  }



  @Test
  public void test29(){
    assertEquals(1638, solver.minimalTime(new int[]{63, 281, 99, 53},new int[]{372, 309, 325, 291},new String[]{"YNNN", "NYYN", "NYYN", "NYNY"},1287) );
  }



  @Test
  public void test30(){
    assertEquals(3294, solver.minimalTime(new int[]{67, 84, 155, 117, 128, 2},new int[]{202, 154, 271, 33, 131, 494},new String[]{"YNNNNN", "NYNNNN", "NNYNNY", "NNYYNN", "NNNNYN", "NNYNYY"},2655) );
  }



  @Test
  public void test31(){
    assertEquals(1211, solver.minimalTime(new int[]{494, 389, 204, 275, 705, 452, 183},new int[]{220, 154, 49, 264, 198, 213, 40},new String[]{"YNNNNYN", "YYNNNYN", "NNYYNNY", "NNNYNNN", "NNNNYNN", "YNNNNYN", "NYNNYYY"},4490) );
  }



  @Test
  public void test32(){
    assertEquals(6125, solver.minimalTime(new int[]{79, 35, 64, 100, 120, 56, 92, 115},new int[]{434, 461, 101, 644, 688, 244, 683, 69},new String[]{"YNNYNNYN", "NYNNNYNN", "NNYYYNYN", "NNNYYNNN", "NNNNYNNN", "NNNNNYNN", "NYYYNNYN", "YNNNNNNY"},3043) );
  }



  @Test
  public void test33(){
    assertEquals(1141, solver.minimalTime(new int[]{446, 401, 213, 45, 646, 217, 323, 207, 423},new int[]{207, 231, 130, 36, 67, 235, 221, 119, 210},new String[]{"YNNNNYYNN", "NYNYNYNNN", "NNYNNNNNN", "NNNYNNYNN", "NNNNYNNYY", "NNNNNYNNN", "NNNNNYYYN", "YNNNNNNYN", "NYNNNNNNY"},4729) );
  }



  @Test
  public void test34(){
    assertEquals(6408, solver.minimalTime(new int[]{68, 366, 77, 410, 433, 79, 176, 329, 55, 316},new int[]{534, 427, 602, 63, 47, 612, 694, 117, 384, 96},new String[]{"YNNNNNNNNN", "NYNNNNNNNY", "NYYNNYNNNN", "YNNYNYNYNN", "NNYNYNNNNN", "NYNNNYNYNN", "NNNNNNYNNN", "NNNNNNYYNN", "NNNYNYYNYN", "NNNYNNNYNY"},1237) );
  }



  @Test
  public void test35(){
    assertEquals(2267, solver.minimalTime(new int[]{286, 66, 767, 84, 549, 389, 684, 484, 503, 713, 461},new int[]{304, 193, 55, 650, 412, 119, 653, 319, 501, 860, 314},new String[]{"YNNYNNNNYNN", "YYYYNNNYNNN", "NNYYNNNNNNY", "NNNYNNNNNNN", "NNNNYNYYNNY", "NNNNNYYNNYY", "NYNNNNYNNNN", "YYNNNNNYNYN", "NNNNNNNNYYN", "NNNNNNNYNYN", "NNNYNNNYNNY"},3863) );
  }



  @Test
  public void test36(){
    assertEquals(1886, solver.minimalTime(new int[]{22, 43, 25, 37, 9, 52, 36, 52, 27, 15, 14, 38},new int[]{479, 207, 35, 231, 387, 133, 331, 456, 9, 380, 282, 446},new String[]{"YNNNNNYNNNNN", "NYNNNYNNYNNN", "NNYNNNNNNNNN", "NYNYYYNNYNNN", "NNNNYNYNNNNN", "NNNNYYNNNNNN", "NNNNYNYNNNNN", "NNNNNNNYNNNN", "NNNNYNNYYNNN", "NNNNNNYNNYNY", "NNYYNNNYNNYN", "NNNNNYYYNNNY"},2709) );
  }



  @Test
  public void test37(){
    assertEquals(1742, solver.minimalTime(new int[]{548, 844, 266, 633, 851, 827, 209, 435, 819, 139, 485, 794, 820},new int[]{155, 110, 97, 223, 125, 93, 293, 238, 297, 123, 281, 389, 340},new String[]{"YNNNNNYNNNNNN", "NYNNYNNYYNNNN", "NYYNYNNNNNNYN", "NYYYNNNNNYNYN", "NNNYYNYNNYNYN", "NNNNYYYNNNNNN", "YNNYNNYYNNNNN", "NNNNNNNYYNNNN", "NNNNNNNNYNNNN", "NNNNNYNNYYNNY", "NNNNYNNNNNYNN", "NNYYNNNNNNNYN", "NNNYNNNYNYNNY"},3638) );
  }



  @Test
  public void test38(){
    assertEquals(45000, solver.minimalTime(new int[]{40, 403, 545, 533, 114, 324, 544, 319, 112, 315, 488, 52, 479},new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000},new String[]{"YNNNYNNNNNNNN", "YYNNNYNNYNNNN", "NYYNNNNNNNNYN", "YNNYNNNYNNNNN", "NNNNYNNNNNNNN", "NNNNNYNYNYNNN", "NNNNNNYNNNNNN", "NNNNNNNYNNNNN", "NNNNNNNNYNNNN", "NNNYNNNNNYNNN", "NNNNNNNNNNYNN", "NYYNYNNNYNNYN", "YYNYNNNNNNNNY"},4907) );
  }



  @Test
  public void test39(){
    assertEquals(23, solver.minimalTime(new int[]{43},new int[]{23},new String[]{"Y"},43) );
  }



  @Test
  public void test40(){
    assertEquals(-1, solver.minimalTime(new int[]{10, 20},new int[]{1000, 1000},new String[]{"YN", "YY"},100) );
  }



  @Test
  public void test41(){
    assertEquals(-1, solver.minimalTime(new int[]{20, 10},new int[]{1000, 1000},new String[]{"YY", "YY"},29) );
  }



  @Test
  public void test42(){
    assertEquals(1000, solver.minimalTime(new int[]{10, 20},new int[]{1000, 1000},new String[]{"YY", "YY"},30) );
  }



  @Test
  public void test43(){
    assertEquals(179, solver.minimalTime(new int[]{632, 538, 274},new int[]{60, 59, 60},new String[]{"YYY", "YYY", "YYY"},1325) );
  }



  @Test
  public void test44(){
    assertEquals(2659, solver.minimalTime(new int[]{522, 583, 127, 73},new int[]{6, 576, 190, 741},new String[]{"YNNY", "YYYY", "NYYN", "YNNY"},798) );
  }



  @Test
  public void test45(){
    assertEquals(214, solver.minimalTime(new int[]{411, 53, 725, 602, 473},new int[]{33, 11, 16, 23, 51},new String[]{"YNNNN", "NYNYN", "NNYNN", "NYYYN", "NYNNY"},3399) );
  }



  @Test
  public void test46(){
    assertEquals(5024, solver.minimalTime(new int[]{291, 332, 412, 107, 35, 379},new int[]{208, 516, 450, 118, 637, 69},new String[]{"YNYNNN", "YYNNYY", "YNYNNN", "NNNYNN", "YNNNYN", "NYNNNY"},717) );
  }



  @Test
  public void test47(){
    assertEquals(293, solver.minimalTime(new int[]{830, 500, 213, 674, 396, 4, 571},new int[]{64, 10, 105, 61, 103, 111, 47},new String[]{"YNYYNYN", "NYYYYNN", "NYYNNYN", "YYNYYNN", "NNNNYNY", "YYNYNYN", "NNNYYNY"},1828) );
  }



  @Test
  public void test48(){
    assertEquals(1298, solver.minimalTime(new int[]{222, 256, 119, 189, 83, 60, 265, 270},new int[]{8, 138, 340, 153, 77, 151, 136, 92},new String[]{"YYNNNNNY", "YYYYYNNN", "NYYYYYYN", "NNYYYYYN", "NNNYYNNY", "YNYYNYNY", "YYYYNYYN", "NYYNNNNY"},491) );
  }



  @Test
  public void test49(){
    assertEquals(901, solver.minimalTime(new int[]{479, 250, 760, 734, 10, 568, 484, 229, 745},new int[]{258, 145, 256, 73, 156, 124, 521, 231, 438},new String[]{"YYYYYYYYN", "YYNYYYNNY", "YNYNYYNYY", "NYNYNNYYN", "NNNYYYNNY", "NYYNYYNYN", "YNYYNNYYY", "YYNNNNYYY", "YNYNYYNNY"},2515) );
  }



  @Test
  public void test50(){
    assertEquals(518, solver.minimalTime(new int[]{592, 129, 27, 580, 156, 645, 83, 299, 730, 508},new int[]{37, 61, 85, 18, 44, 53, 32, 6, 98, 96},new String[]{"YYNYNYNNYN", "YYNNYNYYNY", "NYYNYYYNYN", "NYYYYYYNYY", "YYNYYYNNNY", "NNNYYYNYYY", "YYYYNYYYYN", "NYNNNYYYNN", "YNNNYNYNYY", "YYNNNNNNNY"},905) );
  }



  @Test
  public void test51(){
    assertEquals(128, solver.minimalTime(new int[]{421, 258, 217, 571, 312, 448, 532, 541, 155, 305, 143},new int[]{33, 56, 8, 52, 3, 25, 32, 19, 11, 44, 45},new String[]{"YYNYNYNYYYY", "NYYYYNYYYYY", "YYYNYYNNYYY", "NYNYNYNYNYY", "NYYNYNYYNNN", "YYYYYYYNYNY", "YYNNYYYNNYY", "NNYNYYNYYYN", "YYNYNYNYYYN", "YNNYNYYYYYN", "YYYYYYYNNYY"},1506) );
  }



  @Test
  public void test52(){
    assertEquals(2716, solver.minimalTime(new int[]{620, 496, 162, 590, 359, 376, 99, 98, 515, 28, 437, 135},new int[]{705, 879, 918, 867, 114, 739, 96, 317, 726, 620, 330, 718},new String[]{"YNNYNYNNYNNN", "NYYNNYNNNNNN", "NNYNNNNNYYNN", "YNNYYNYNNNYN", "NYNYYNYNYNYN", "NNNNYYNNNNNN", "YNNNNYYYNNNN", "NNYNYNYYNNNN", "NNNNYNNNYNNN", "NNYNNYNYNYNY", "NNNNNNNNNYYN", "YNNNYYYYNNNY"},1535) );
  }



  @Test
  public void test53(){
    assertEquals(217, solver.minimalTime(new int[]{1, 379, 512, 196, 720, 105, 769, 203, 160, 768, 267, 399, 132},new int[]{68, 11, 90, 3, 36, 26, 52, 60, 79, 22, 64, 21, 81},new String[]{"YYNNYYNNYYNYY", "NYYYNYYYNYYYN", "NYYYYNYYNYYYN", "YNYYYYNYYYYYY", "YNYYYYYYYYYNY", "YNNYYYNYYNYYY", "NYYNNYYNYNNNY", "NNYNYYYYNYYYN", "YYYNNYYYYYYYY", "YYYNYNYYYYNYN", "YYNYNYYNYYYYY", "YYNNYNYYYYYYN", "YNNYYYYNYNYYY"},1385) );
  }



  @Test
  public void test54(){
    assertEquals(1456, solver.minimalTime(new int[]{623, 704, 192, 578, 763, 722, 13, 544, 728, 84, 161, 767, 737},new int[]{185, 191, 125, 458, 149, 577, 282, 163, 151, 242, 597, 476, 510},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYNYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYN", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},2771) );
  }



  @Test
  public void test55(){
    assertEquals(829, solver.minimalTime(new int[]{221, 306, 679, 486, 385, 610, 427, 692, 657, 662, 242, 400, 401},new int[]{457, 124, 288, 439, 118, 84, 251, 325, 344, 326, 358, 205, 124},new String[]{"YNYYYYYNNYYYY", "NYNYNYNYYYYYY", "YYYNYYYYNYYYY", "YYYYNYNNYNNYY", "NYNYYYNYYNYYN", "NYNYYYYYNYNYN", "YNYYYYYYYNYYN", "YNNYYNYYNNYYY", "NYNYYYNYYYYYN", "NYNYYNNYYYYYN", "YYYNNYNYNYYNN", "NYYNYYNYYYYYY", "YYYNNYYYYYYNY"},3765) );
  }



  @Test
  public void test56(){
    assertEquals(666, solver.minimalTime(new int[]{348, 291, 448, 107, 407, 199, 137, 78, 480, 257, 271, 229, 197},new int[]{392, 294, 353, 171, 299, 27, 228, 332, 36, 181, 377, 422, 16},new String[]{"YYYYYYYNYYYYY", "NYNYYYNYNYYYY", "YYYYYYYYYYYYY", "YNYYYYYYNYYYY", "YYYYYNYYYYYNY", "YYYYYYYYYYNNY", "YYNYYYYYYYYYY", "YYYYNYYYYYYNY", "YYYYYYYYYNYYY", "YYYYYYYYYYYYY", "YYYYYYNYYYYYN", "YYNYYYYYYYYYY", "YYNNYYYYYYYNY"},2329) );
  }



  @Test
  public void test57(){
    assertEquals(1103, solver.minimalTime(new int[]{589, 529, 826, 710, 779, 685, 462, 548, 881, 602, 616, 707, 31},new int[]{413, 327, 53, 424, 308, 525, 498, 314, 99, 188, 490, 442, 429},new String[]{"YYNYNYYNYYYYY", "YYYYYYNYNYYYY", "YYYYYYYYYNYYY", "YYYYYNYYYYYYY", "YYYYYYYYYYYYY", "YYYNNYYYYYYYY", "YYYYYYYYYNYYY", "YYYYYYYYYYYYN", "YYYYYYYYYYYYY", "YYNYYYYNYYYYY", "YYYYYYYYYYYYY", "YYYNYYYNYYYYY", "YYYYYYYYYYYNY"},4241) );
  }



  @Test
  public void test58(){
    assertEquals(9, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new String[]{"YYNNNNNNNNNNN", "NYNNYNNNNNNNN", "NNYYNNNNNNNNN", "NNNYNYNNNNNNN", "NNYNYNNNNNYNN", "NNNNNYYNNNNNN", "YNNNNNYNNNNNN", "NYNNNNNYNNNNN", "NNNNNNNNYYNNN", "NNNNNNNYNYNNN", "NNNNNNNNNNYYN", "NNNNNNNNNNNYY", "NNNNNNNNYNNNY"},10) );
  }



  @Test
  public void test59(){
    assertEquals(10, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1},new int[]{1, 2, 3, 2, 1, 4},new String[]{"YYNNNN", "NYYNNN", "NNYYNN", "YYYYYY", "NNNNYY", "NNYNNY"},4) );
  }



  @Test
  public void test60(){
    assertEquals(47, solver.minimalTime(new int[]{1, 2, 3, 4, 3, 2, 1, 5, 3, 2, 2, 3, 1},new int[]{5, 8, 9, 12, 11, 6, 2, 3, 4, 5, 6, 7, 4},new String[]{"YNNNNYNNNNNNN", "NYNYYYYNNNNNN", "NNYYNNNYNNNNY", "YYNYNYYNYYNNN", "YNYYYYNYNNYNY", "NNNNNYYYNNNNN", "YNYNYNYNYNNNN", "YYYNNNNYYNYNN", "NNYNNYNNYNYNY", "NYNNNYNNNYYNN", "YYYNYNNYYNYNN", "NNNNNNNNYNNYN", "NYYYNYYNNNYYY"},8) );
  }



  @Test
  public void test61(){
    assertEquals(40, solver.minimalTime(new int[]{10, 10, 10, 1, 1},new int[]{10, 10, 10, 1, 1},new String[]{"YYYYY", "YYYYY", "YYYYY", "YYYYY", "YYYYY"},10) );
  }



  @Test
  public void test62(){
    assertEquals(2756, solver.minimalTime(new int[]{223, 323, 123, 912, 815, 293, 742, 12, 535, 32, 412, 628, 932},new int[]{500, 400, 123, 699, 900, 800, 700, 987, 819, 500, 623, 100, 109},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},2000) );
  }



  @Test
  public void test63(){
    assertEquals(3148, solver.minimalTime(new int[]{572, 10, 391, 839, 934, 720, 35, 893, 153, 689, 352, 855, 733},new int[]{608, 836, 16, 474, 548, 97, 723, 647, 661, 837, 6, 284, 210},new String[]{"YYYNYYNYYNYYY", "YYYYYNYYYYYNY", "YNYNYYYYNYYYY", "YYYYYYNYYYNYN", "YNYNYNYYNYYYY", "YYYYYYYYYYNYY", "YYNYNYYNYYYYY", "NYNYYYNYYYYNY", "YYYYYYYYYNYYY", "YYNYYYNYYYYYN", "YYYNYNYYYNYYY", "YYYYYNYYNYYYY", "NYYNYYYYNYYNY"},1500) );
  }



  @Test
  public void test64(){
    assertEquals(1746, solver.minimalTime(new int[]{724, 400, 673, 846, 522, 373, 458, 502, 667, 255, 233, 691, 704},new int[]{724, 400, 673, 846, 522, 373, 458, 502, 667, 255, 233, 691, 704},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},4500) );
  }



  @Test
  public void test65(){
    assertEquals(2166, solver.minimalTime(new int[]{814, 531, 955, 54, 600, 908, 747, 572, 115, 624, 907, 342, 784},new int[]{530, 803, 641, 384, 468, 162, 75, 663, 391, 781, 306, 703, 161},new String[]{"YYYNYNNYYYYYY", "YYYYYYYYNNYYN", "YYYYYYYYNYNYY", "YYYYNYNYNYYYY", "NYYYYYYYNNYNY", "NNYYNYYYYYYNY", "YYYYYNYYYYYYY", "YYNYNYYYYYYNY", "YNNNYYYNYNYYN", "YYNYYYYYYYYNY", "YYYNYYNNNYYNY", "YNYYYYYYNYNYY", "NYYYYYYNYNYYY"},2865) );
  }



  @Test
  public void test66(){
    assertEquals(2858, solver.minimalTime(new int[]{891, 23, 673, 923, 983, 867, 348, 945, 120, 23, 24, 999, 1000},new int[]{891, 23, 673, 923, 983, 867, 348, 945, 120, 23, 24, 999, 1000},new String[]{"YNYYYNYNYNYNY", "YYYYYNYNYYYNY", "YNYYYNYNYNYNY", "YNYYYNYYYNNNY", "YNYYYNYNYNYYY", "YNYYYYYNYNYNY", "YNYYYNYNYNYNY", "NNNYYNYYYNYNY", "YNYYYNYNYNYYY", "YNYYYNYNYYYNY", "YNYNYNYNYNYNY", "YNYYNNYNYNYYY", "YNNYYNYNYNYNY"},3000) );
  }



  @Test
  public void test67(){
    assertEquals(13, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},15) );
  }



  @Test
  public void test68(){
    assertEquals(5, solver.minimalTime(new int[]{1, 2, 3},new int[]{1, 1, 1},new String[]{"YNY", "YYN", "YYY"},4) );
  }



  @Test
  public void test69(){
    assertEquals(23, solver.minimalTime(new int[]{43},new int[]{23},new String[]{"Y"},142) );
  }



  @Test
  public void test70(){
    assertEquals(252, solver.minimalTime(new int[]{1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new String[]{"YYNNNNNNNNNNN", "YYNNNNNNNNNNN", "YYYNNNNNNNNNN", "YYNYNNNNNNNNN", "YYNNYNNNNNNNN", "YYNNNYNNNNNNN", "YYNNNNYNNNNNN", "YYNNNNNYNNNNN", "YYNNNNNNYNNNN", "YYNNNNNNNYNNN", "YYNNNNNNNNYNN", "YYNNNNNNNNNYN", "YYNNNNNNNNNNY"},11) );
  }



  @Test
  public void test71(){
    assertEquals(162, solver.minimalTime(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new int[]{13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},13) );
  }



  @Test
  public void test72(){
    assertEquals(78, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{50, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 45},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},2) );
  }



  @Test
  public void test73(){
    assertEquals(23, solver.minimalTime(new int[]{43},new int[]{23},new String[]{"Y"},50) );
  }



  @Test
  public void test74(){
    assertEquals(13, solver.minimalTime(new int[]{1, 1, 1, 1},new int[]{2, 3, 4, 5},new String[]{"YYNN", "NYYN", "NYYN", "NNYY"},3) );
  }



  @Test
  public void test75(){
    assertEquals(2371, solver.minimalTime(new int[]{384, 645, 965, 357, 468, 358, 957, 735, 382, 125, 474, 385, 175},new int[]{375, 306, 382, 496, 206, 783, 683, 934, 395, 385, 171, 864, 476},new String[]{"YNNYYNYNYNYYN", "NYNYYNNYNNNYN", "YNYNNYNNYYNYN", "YYNYNYYNNYYYN", "NYNNYNNNNNNNN", "YYYNNYNNNYNYN", "NNNNNNYNNYYYN", "NYYYNNNYNNYYN", "NNNYYYNNYNNYN", "NYYNNYNNNYNNN", "NNYYNNYNNYYNN", "NNNYNNYNNNYYN", "NNYNNYNNYNNNY"},2500) );
  }



  @Test
  public void test76(){
    assertEquals(66, solver.minimalTime(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},43) );
  }



  @Test
  public void test77(){
    assertEquals(30, solver.minimalTime(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "NNNNNNNNNNNYN", "YYYYYYYYYYYYY"},5000) );
  }



  @Test
  public void test78(){
    assertEquals(5, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1},new int[]{1, 1, 1, 1, 1, 1},new String[]{"YYNNNN", "YYNNNY", "YNYYYN", "NYNYNN", "YNNNYN", "NYYYYY"},3) );
  }



  @Test
  public void test79(){
    assertEquals(14, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},13) );
  }



  @Test
  public void test80(){
    assertEquals(2440, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{324, 455, 456, 435, 435, 35, 435, 435, 55, 56, 56, 56, 56},new String[]{"YYNNNNNNNNNNN", "NYYNNYNNNNNNN", "NNYYNNNNNNNNN", "NNNYYNNNNNNNN", "YNNNYNNNNNNNN", "NNNNNYYNNNNNN", "NNNNNNYYNNNNN", "NNNNNNNYYNNNN", "NNNNNNNNYYNNN", "NNNNNNNNNYYNN", "NNNNNNNNNNYYN", "NNNNNNNNNNNYY", "YNNNNNNNNNNNY"},10) );
  }



  @Test
  public void test81(){
    assertEquals(7, solver.minimalTime(new int[]{1, 1, 1, 10, 10},new int[]{1, 1, 1, 1, 1},new String[]{"YYYYY", "YYYYY", "YYYYY", "YYYYY", "YYYYY"},10) );
  }



  @Test
  public void test82(){
    assertEquals(18, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},10) );
  }



  @Test
  public void test83(){
    assertEquals(30, solver.minimalTime(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new String[]{"YYNNNNNNNNNNN", "YYNNNNNNNNNNN", "NNYYNNNNNNNNN", "NNYYNNNNNNNNN", "NNNNYYNNNNNNN", "NNNNYYNNNNNNN", "NNNNNNYYNNNNN", "NNNNNNYYNNNNN", "NNNNNNNNYYNNN", "NNNNNNNNYYNNN", "NNNNNNNNNNYYN", "NNNNNNNNNNYYN", "NNNNNNNNNNNNY"},1000) );
  }



  @Test
  public void test84(){
    assertEquals(17, solver.minimalTime(new int[]{1, 1, 1, 1},new int[]{1, 2, 9, 10},new String[]{"YYYY", "YYYY", "YYYY", "YYYY"},2) );
  }



  @Test
  public void test85(){
    assertEquals(2149, solver.minimalTime(new int[]{886, 727, 640, 595, 187, 142, 20, 261, 57, 108, 390, 118, 762},new int[]{574, 433, 17, 844, 434, 882, 902, 936, 180, 963, 842, 162, 118},new String[]{"YNYNNYYNYYYNY", "YYYNNYNNYYNYN", "NYYNYYYYYYYNN", "YNYYYYNYYNYNY", "NNYYYNYNNNYYN", "NNNNNYNYYNNYY", "YNNYNYYYNYYYN", "YYNYNYYYNNYYY", "YNNNNYYYYYNYN", "NYNNYNYYNYNNY", "YNYYYYNNYYYNN", "YNYYYYNYYYYYY", "NNNNYNNNNYNNY"},2198) );
  }



  @Test
  public void test86(){
    assertEquals(67, solver.minimalTime(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new int[]{9, 8, 7, 3, 5, 7, 4, 7, 3, 2, 8, 1, 9},new String[]{"YYYYYYYYYYYYY", "YYNYYNYYNNYNN", "NNYYYNYYNYYYY", "YNNYYNYNYYYNY", "NNYNYYYNYNNYY", "NNYYNYNNNNYYY", "NNNYYYYYYYYYY", "NNYYNYYYNNNNN", "YYYYYYNNYYYYY", "YYYYNNYYNYYYY", "YYYYYYYNNYYYN", "YYYYYYYYYYYYY", "YYYYYNYYYYYYY"},17) );
  }



  @Test
  public void test87(){
    assertEquals(76, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},2) );
  }



  @Test
  public void test88(){
    assertEquals(1516, solver.minimalTime(new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000},new int[]{194, 858, 217, 936, 333, 137, 264, 209, 84, 758, 38, 190, 562},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},5000) );
  }



  @Test
  public void test89(){
    assertEquals(84, solver.minimalTime(new int[]{9, 7, 12, 20, 9, 26, 22, 29, 24, 27, 12, 15, 12},new int[]{9, 7, 12, 20, 9, 26, 22, 29, 24, 27, 12, 15, 12},new String[]{"YYNYYYYNYYYYY", "YYNYYYNYYYYYY", "NYYYYYYYYYYYY", "NYYYYYNYYNNYN", "YYNNYYNYYYYYY", "NNYYYYYYYYNYN", "NYYNYYYYNYNNY", "NYNYYNYYYYYYY", "YYYNYYYYYYYYN", "NYYYYYYYYYYYY", "YYYYYYYNYYYYY", "NYYYNYYYYYYYY", "NYYNYYYYYYYNY"},85) );
  }



  @Test
  public void test90(){
    assertEquals(251, solver.minimalTime(new int[]{28, 19, 29, 17, 17, 25, 21, 24, 28, 16, 10, 22, 13},new int[]{8, 18, 19, 3, 13, 16, 12, 2, 20, 12, 17, 2, 8},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},35) );
  }



  @Test
  public void test91(){
    assertEquals(255, solver.minimalTime(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new int[]{20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},14) );
  }



  @Test
  public void test92(){
    assertEquals(1, solver.minimalTime(new int[]{1},new int[]{1},new String[]{"Y"},2) );
  }



  @Test
  public void test93(){
    assertEquals(3, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},12) );
  }



  @Test
  public void test94(){
    assertEquals(5, solver.minimalTime(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},new String[]{"YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY", "NNNNNNNNNNNNY"},1000) );
  }



  @Test
  public void test95(){
    assertEquals(1, solver.minimalTime(new int[]{1},new int[]{1},new String[]{"Y"},10) );
  }



  @Test
  public void test96(){
    assertEquals(2885, solver.minimalTime(new int[]{826, 519, 179, 293, 44, 203, 703, 677, 763, 934, 679, 342, 27},new int[]{889, 511, 425, 931, 638, 896, 160, 994, 83, 886, 925, 106, 151},new String[]{"YNYYNYNYYYYNN", "NYYYYYYYYYYNY", "YNYYYYYYNYNNY", "NYNYYNNYYNNYY", "YYNYYNNYYYNNY", "NYYYNYNYNYNYN", "YNNNYNYNYNYYY", "NNYNYYYYNYYYY", "YNNYYYYNYYYYY", "NNNNYYYNYYNNY", "YYYYYYYNYYYYN", "YNYNYYYYYYYYN", "YYYNYYNYYYYYY"},2000) );
  }



  @Test
  public void test97(){
    assertEquals(23, solver.minimalTime(new int[]{43},new int[]{23},new String[]{"Y"},43) );
  }



  @Test
  public void test98(){
    assertEquals(10, solver.minimalTime(new int[]{1, 1, 1, 1},new int[]{1, 2, 3, 4},new String[]{"YNYN", "NYYN", "NYYN", "NYNY"},3) );
  }



  @Test
  public void test99(){
    assertEquals(30, solver.minimalTime(new int[]{5, 5, 5, 5, 5, 5, 5},new int[]{5, 6, 4, 9, 3, 1, 6},new String[]{"YYYNNNY", "NYYNNNN", "YNYNNNN", "NNNYYYY", "NNNNYYN", "NNNYNYN", "NNYNNYY"},15) );
  }



  @Test
  public void test100(){
    assertEquals(25, solver.minimalTime(new int[]{10, 10, 10, 10},new int[]{5, 5, 5, 5},new String[]{"YYNY", "YYYN", "NYYN", "YNNY"},20) );
  }



  @Test
  public void test101(){
    assertEquals(17, solver.minimalTime(new int[]{1, 2, 3},new int[]{2, 3, 4},new String[]{"YNY", "YYY", "YYY"},4) );
  }



  @Test
  public void test102(){
    assertEquals(73, solver.minimalTime(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},new int[]{9, 8, 7, 3, 5, 7, 4, 7, 3, 2, 8, 1, 9},new String[]{"YYYYYYYYYYYYY", "YYNYYNYYNNYNN", "NNYYYNYYNYYYY", "YNNYYNYNYYYNY", "NNYNYYYNYNNYY", "NNYYNYNNNNYYY", "NNNYYYYYYYYYY", "NNYYNYYYNNNNN", "YYYYYYNNYYYYY", "YYYYNNYYNYYYY", "YYYYYYYNNYYYN", "YYYYYYYYYYYYY", "YYYYYNYYYYYYY"},16) );
  }



  @Test
  public void test103(){
    assertEquals(10619, solver.minimalTime(new int[]{2, 8, 2, 3, 5, 2},new int[]{296, 800, 5, 123, 767, 957},new String[]{"YNNNNN", "NYNNNN", "YNYYNY", "NNNYNN", "YNNNYN", "YNYYNY"},23) );
  }



  @Test
  public void test104(){
    assertEquals(32, solver.minimalTime(new int[]{2, 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2},new int[]{8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3},new String[]{"YYNNYYNYNYNYY", "YYNYYNYYNYYYN", "YNYNYYYYYYNNY", "NNNYNNNNNNYNY", "NNNYYYNYYNNNN", "NNYNNYYNYYNNN", "YYYYYNYNNYNYN", "YYNNNYYYYYNNN", "YNYYYNYNYNNYN", "NNYYYYYYYYYYY", "YNYNNNNNYNYNY", "NYNYNYNYYYNYN", "YNNNNYNYNNYNY"},20) );
  }



  @Test
  public void test105(){
    assertEquals(2128, solver.minimalTime(new int[]{834, 414, 959, 580, 863, 869, 307, 311, 267, 663, 896, 900, 684},new int[]{438, 580, 537, 747, 526, 592, 26, 87, 762, 297, 313, 226, 190},new String[]{"YNNNYNNNNNYNY", "YYNNNYYNYNNNY", "YYYNYYNNNYNYY", "YYNYYNNYNNNYN", "NNNYYNYYNYNNN", "YYNYNYYYNYYYN", "NNNYYNYNYYYYN", "NNNYYNYYYYNYY", "NYYNNNYYYNYNN", "YYYNYYNYYYNYY", "NNNYYYNYYYYYN", "YYNYNYNYYYYYN", "YNYNNYNNNNNNY"},2582) );
  }



  @Test
  public void test106(){
    assertEquals(1131, solver.minimalTime(new int[]{281, 421, 703, 37, 264, 84, 118, 21, 355, 7, 506, 595, 281},new int[]{281, 421, 703, 37, 264, 84, 118, 21, 355, 7, 506, 595, 281},new String[]{"YYYYYYYYNYYNY", "NYYYNYYYYYYYY", "YYYYYYYNYYNYY", "YYYYYNYYYYYNY", "YYYYYYYNYYYYY", "YYNYYYYYNYYYY", "YYYYYYYYYNYNY", "YNYNYYYYYYYYN", "YYYYYYYYYYYYY", "YYYYYYYYYYNYN", "YYYYNYYNYYYYY", "YYYYYYYYYYYYY", "YYYYYYYYYYYYY"},2000) );
  }



  @Test
  public void test107(){
    assertEquals(201, solver.minimalTime(new int[]{1, 1, 50, 60, 70, 80},new int[]{1, 1, 100, 100, 100, 100},new String[]{"YYYYYY", "YYYYYY", "YNYNNN", "YNNYNN", "NYNNYN", "NYNNNY"},132) );
  }



  @Test
  public void test108(){
    assertEquals(3386, solver.minimalTime(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},new int[]{300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312},new String[]{"YNNNNNNNNNNNY", "NYNYYNNNNNNNN", "NNYNNNNYNNNNY", "NNNYNNNNNNNYN", "NNNNYNNNNNNNN", "NNNYNYNNNNNNN", "NNNYNNYNYNNNN", "YNNNNNNYNNNNN", "NNNNNNNNYNNNN", "NYNNNNNNNYNNN", "NYNNNNNYYNYYN", "NNNYNNNNNNYYN", "YNNNNNNNNNYYY"},8) );
  }



  @Test
  public void test109(){
    assertEquals(10, solver.minimalTime(new int[]{10},new int[]{10},new String[]{"Y"},10) );
  }



  @Test
  public void test110(){
    assertEquals(11, solver.minimalTime(new int[]{1, 1, 1, 1},new int[]{1, 2, 3, 4},new String[]{"YYNY", "YYYN", "NYYY", "YNYY"},2) );
  }



  @Test
  public void test111(){
    assertEquals(102, solver.minimalTime(new int[]{1, 1, 1, 1},new int[]{1, 1, 1, 100},new String[]{"YYNN", "YYNN", "YYYN", "YYNY"},3) );
  }



  @Test
  public void test112(){
    assertEquals(3, solver.minimalTime(new int[]{1, 1, 10, 10},new int[]{1, 1, 1, 1},new String[]{"YYNN", "YYNN", "YYYN", "YYNY"},12) );
  }



  @Test
  public void test113(){
    assertEquals(3, solver.minimalTime(new int[]{1, 1, 1, 1},new int[]{1, 1, 1, 1},new String[]{"YYNN", "NYYN", "YYYY", "NYNY"},3) );
  }



  @Test
  public void test114(){
    assertEquals(28, solver.minimalTime(new int[]{5, 2, 3, 4, 3, 2, 7, 2, 3, 6, 3, 2, 9},new int[]{5, 2, 3, 4, 3, 2, 7, 2, 3, 6, 3, 2, 9},new String[]{"YYYYNNNNYYYYN", "NYNYNYNYNNYYY", "YYYNNYNYYNYNY", "NYNYYYNYYNYYY", "YYYYYYYYYYNNN", "YNYYNYYYNYNYN", "NYNYYYYYNYYYN", "NYNYYNYYYNYYY", "NYYYYYYNYYYNY", "NNYNYYNYYYYYY", "NNYYYNYYNYYNY", "YYNYNYYNYNYYN", "YYYYYYYYYYYYY"},17) );
  }



}

