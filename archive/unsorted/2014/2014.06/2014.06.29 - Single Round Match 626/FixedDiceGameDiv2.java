package fuku;

public class FixedDiceGameDiv2 {
    public double getExpectation(int a, int b) {
        int cnt = 0;
        int tot = 0;
        for (int i = 2; i <= a; i++) {
            for (int j = 1; (j < i) && (j <= b); j++) {
                cnt++;
                tot += i;
            }
        }

        return (1.0 * tot) / cnt;
    }
}
