package fuku;

/**
 * System Test Passed
 */
public class ChildlessNumbers {
    public int howMany(int A, int B) {
        int cnt = 0;
        for (int i = A; i <= B; i++) {
            if (isChildless(i)) cnt++;
        }

        return cnt;
    }

    boolean isChildless(long x){
        boolean isless = true;
        for (int i = 1; i <= 100; i++) {
            long y = x * i;

            String ystr = ("" + y);
            long dy = 0;
            for (int j = 0; j < ystr.length(); j++) {
                dy += Integer.valueOf("" + ystr.charAt(j));
            }

            if (y % dy == 0 && y / dy == x) {
                System.out.printf("x = %s, y=%s, dy=%s\n", x, y, dy);
                isless = false;
                break;
            }
        }

        if (isless) {
            System.out.printf("x=%s\n", x);
        }

        return isless;
    }
}
