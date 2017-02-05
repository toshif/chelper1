package fuku;

// System Test Passed
public class SRMCodingPhase {
    public int countScore(int[] points, int[] skills, int luck) {
        int mi = 0;
        for (int a = 0; a <= 1 ; a++) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 0; c <= 1; c++) {
                    if (a * skills[0] + b * skills[1] + c * skills[2] <= 75 + luck){
                        int score = 0;
                        int remain = luck;

                        if (c == 1) {
                            int use = Math.min(skills[2] - 1, remain);
                            remain -= use;
                            score += points[2] - 8 * (skills[2] - use);
                        }

                        if (b == 1) {
                            int use = Math.min(skills[1] - 1, remain);
                            remain -= use;
                            score += points[1] - 4 * (skills[1] - use);
                        }

                        if (a == 1) {
                            int use = Math.min(skills[0] - 1, remain);
                            remain -= use;
                            score += points[0] - 2 * (skills[0] - use);
                        }

                        mi = Math.max(score, mi);
                    }
                }
            }
        }
        return mi;
    }
}
