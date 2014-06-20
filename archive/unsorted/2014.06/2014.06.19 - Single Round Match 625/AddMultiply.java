package fuku;

public class AddMultiply {
    public int[] makeExpression(int y) {
        for (int i = -1000; i <= 1000; i++) {
            if (i == 0 || i == 1) continue;
            for (int j = -1000; j <= 1000 ; j++) {
                if (j == 0 || j == 1) continue;

                int x2 = y - (i * j);
                if (-1000 <= x2 && x2 <= 1000 && x2 != 0 && x2 != 1 && ( i * j + x2) == y) {
                    return new int[]{i, j, x2};
                }
            }
        }
        return null;
    }
}
