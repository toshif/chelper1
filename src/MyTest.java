/**
 * Created by delluser on 2/18/14.
 */
public class MyTest {
    void test(){
        for (int i = 0; i < 5; i++) {
            
        }
    }
    
    public static void main(String[] args) {
        System.out.println("args = " + args + " for " + MyTest.class);

        int x = 1;
        System.out.println("x % 2 = " + x % 2);

        x = -1;
        System.out.println("x % 2 = " + x % 2);

        System.out.println("System.getProperties() = " + System.getProperties());
    }
}
