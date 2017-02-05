
package tc.p419_DI_1;

import java.util.Arrays;

// sys test passed
/*
  後ろから処理して、valid / invalid のマークをつけていくというアイデア
 */
public class Undo {

    String getText(String[] commands, int[] time){
        int n = commands.length;
        boolean[] valid = new boolean[n];
        Arrays.fill(valid, true);
        String[] types = new String[n];

        for (int i = n-1; i >= 0; i--) {
            if (!valid[i]) continue;

            String[] s = commands[i].split(" ");
            String co = s[0];
            if (co.equals("undo")) {
                int d = Integer.parseInt(s[1]);
                for (int j = i-1; j >=0 && time[i] - time[j] <= d; j--) {
                    valid[j] = false;
                }
            } else {
                types[i] = s[1];
            }
        }

        String ret = "";
        for (int i = 0; i < n; i++) {
            if (types[i] != null) ret += types[i];
        }

        return ret;
    }

}

