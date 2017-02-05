package fuku;

/**
 * System Test Passed
 */
public class TheBasketballDivTwo {
    private String[] table;
    private int n;

    public int find(String[] table) {
        this.table = table;
        n = table.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < table[i].length(); j++) {
                if (table[i].charAt(j) == '?') cnt++;
            }
        }

        int mi = 1000;
        for (int i = 0; i < (1 << cnt); i++) {
            mi = Math.min(calc(i), mi);
        }
        
        return mi;
    }

    int calc(int mask){
        int idx = 0;
        int[] win = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = table[i].charAt(j);
                if (c == 'W') win[i]++;
                else if (c == 'L') win[j]++;
                else if (c == '?') {
                    if ((mask & (1 << idx)) > 0){
                        win[i]++;
                    } else {
                        win[j]++;
                    }
                    idx++;
                }
            }
        }

        int ma = 0;
        for (int i = 0; i < n; i++) {
            ma = Math.max(ma, win[i]);
        }

        return ma;
    }

}
