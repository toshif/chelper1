package fuku;

public class SumOfPower {
    public int findSum(int[] array) {
        int tot = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                tot += sum;
            }
        }

        return tot;
    }
}
