package fuku;

// Wrote to improve the code after reading other answers
// Using bit operations
public class SRMCodingPhase {
    public int countScore(int[] points, int[] skills, int luck) {
        int mi = 0;
        for (int i = 0; i < (1 << 3); i++) {
            int time = 0;
            int remain = luck;
            int score = 0;

            for (int j = 2; j >= 0; j--) {
                if (((1 << j) & i) > 0) {
                    int use = Math.min(remain, skills[j] - 1);
                    remain -= use;
                    time += skills[j] - use;
                    score += points[j] - (1<<(1+j)) * (skills[j] - use);
                }
            }

            if (time > 75) {
                continue;
            }

            mi = Math.max(mi, score);

        }

        return mi;
    }
}
