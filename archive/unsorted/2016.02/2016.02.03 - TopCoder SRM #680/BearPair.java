package fuku;

public class BearPair {
    public int bigDistance(String s) {
        char[] cs = s.toCharArray();
        int ma = -1;
        for (int i = 0; i < cs.length; i++) {
            for (int j = i+1; j < cs.length; j++) {
                if (cs[i] != cs[j]) ma = Math.max(ma, j - i);
            }
        }

        return ma;
    }
}
