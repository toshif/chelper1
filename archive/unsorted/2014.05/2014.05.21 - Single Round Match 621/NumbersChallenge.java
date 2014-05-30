package fuku;

public class NumbersChallenge {

    boolean[] ok = new boolean[21 * 100_000];

    public int MinNumber(int[] S) {
        int N = S.length;
        for (int i = 0; i < (1 << N); i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (((i >> j) & 1) == 1){
                    sum += S[j];
                }
            }
            ok[sum] = true;
        }

        for (int i = 1; i < ok.length; i++) {
            if (!ok[i]) return i;
        }

        return 0;
    }
}
