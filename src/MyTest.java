import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by toshif on 2/18/14.
 */
public class MyTest {
    void test(){
        int a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            a += i;
        }
        System.out.println("a = " + a);
    }
    
    public static void main(String[] args) {
        System.out.println("args = " + args + " for " + MyTest.class);

        int x = 1;
        System.out.println("x % 2 = " + x % 2);

        x = -1;
        System.out.println("x % 2 = " + x % 2);

        System.out.println("Long == Long -> " + (new Long(3) == new Long(3))); // false

        new MyTest().test();
    }
}
