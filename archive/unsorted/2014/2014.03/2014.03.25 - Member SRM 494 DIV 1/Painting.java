package fuku;

/**
 * System Test Passed
 */
public class Painting {

    char[][] cs;

    public int largestBrush(String[] picture) {
        cs = new char[picture.length][picture[0].length()];
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length(); j++) {
                cs[i][j] = picture[i].charAt(j);
            }
        }

        for (int s = 1; s < 51; s++) {
            if ( !check(s) ) return s -1;
        }
        
        return 50;
    }

    private boolean check(int s) {
        int[][] used = new int[cs.length][cs[0].length];

        for (int i = 0; i < cs.length - (s-1); i++) {
            A:
            for (int j = 0; j < cs[0].length - (s-1); j++) {
                if (cs[i][j] != 'B') continue A;

                for (int x = 0; x < s; x++) {
                    for (int y = 0; y < s; y++) {
                        if (cs[i+x][j+y] == 'W') continue A;
                    }
                }
                for (int x = 0; x < s; x++) {
                    for (int y = 0; y < s; y++) {
                        used[i+x][j+y] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < cs.length; i++) {
            for (int j = 0; j < cs[0].length; j++) {
                if (cs[i][j] == 'B' && used[i][j] != 1) return false;
            }
        }

        return true;
    }
}
