package example;

/**
 * Created by vaiouser on 8/16/14.
 */
public class TestIntegerBit {

    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE in Binary = " + Integer.toBinaryString(Integer.MAX_VALUE));

        System.out.println();

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE in Binary = " + Integer.toBinaryString(Integer.MIN_VALUE));

        System.out.println();

        System.out.println(" 124 = " + Integer.toBinaryString(124));
        System.out.println("-124 = " + Integer.toBinaryString(-124));

        // Reference : BIT
        // [1] http://d.hatena.ne.jp/naoya/20090606/1244284915
        // [2] http://hos.ac/slides/20140319_bit.pdf
        System.out.println("124 & -124 = " + Integer.toBinaryString(124 & -124));
    }

}
