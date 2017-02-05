package fuku;

/**
 * Exampels are ok but didn't pass the system test.
 *
 *  -> DP
 *
 * http://apps.topcoder.com/wiki/display/tc/SRM+476
 */
public class SubAnagrams {
    public int maximumParts(String[] suppliedWord) {
        String s = "";
        for (String s1 : suppliedWord) {
            s += s1;
        }
        char[] cs = s.toCharArray();
        int N = cs.length;

        int[] must = new int[27];
        int[] next = new int[27];
        must[cs[0] - 'A']++;
        int cnt = 1;
        int nextCnt = 0;
        int tot = 1;
        String str = "";
        for (int i = 1; i < N; i++) {
            str += cs[i];
            int c = cs[i] - 'A';
            next[c]++;
            nextCnt++;

            if (must[c] > 0){
                must[c]--;
                cnt--;
            }

            if (cnt == 0){
                tot++;
                must = next;
                next = new int[27];
                cnt = nextCnt;
                nextCnt = 0;

                System.out.println("str = " + str);
                str = "";
            }
        }

        return tot;
    }
}
