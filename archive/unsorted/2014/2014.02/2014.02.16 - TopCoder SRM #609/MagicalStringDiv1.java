package fuku;

// System Test Passed
public class MagicalStringDiv1 {
    public int getLongest(String S) {
        int ma = 0;
        for (int i = 0; i < S.length(); i++) {

            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                if (S.charAt(j) == '>') left++;
            }

            for (int j = i; j < S.length(); j++) {
                if (S.charAt(j) == '<') right++;
            }

            ma = Math.max(Math.min(left, right) * 2, ma);
        }

        return ma;
    }
}
