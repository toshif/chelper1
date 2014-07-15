package fuku;

import java.util.Arrays;

/**
  */
public class HappyLetterDiv2 {

    private int N;
    private int M;

    public char getHappyLetter(String letters){
        char[] ls = letters.toCharArray();
        N = ls.length;

        int[] cs = new int['z' - 'a' + 1];
        M = cs.length;
        for (int i = 0; i < ls.length; i++) {
            cs[ls[i] - 'a']++;
        }

        System.out.println("cs = " + Arrays.toString(cs));

        char okChar = '.';
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 0) continue;

            if ( isOK(cs.clone(), i) ){
                System.out.println("char is ok : " + (char)('a' + i));

                if (okChar == '.') {
                    okChar = (char)('a' + i);
                } else {
                    return '.';
                }
            }
        }
        
        return okChar;
    }

    boolean isOK(int[] cs, int c){
        int tot = N;
        while(tot > 1) {
            if ( cs[c] == 0 ) return false;

            cs[c]--;
            tot--;
            boolean found = false;
            for (int i = 0; i < M; i++) {
                if (i == c) continue;

                if (cs[i] > 0) {
                    // found
                    cs[i]--;
                    tot--;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return true;
            }
        }

        if (tot == 1 && cs[c] > 0) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] arg = new String[]{"aacaaa", "dcdjx", "bcbbbbba", "aabc", "a", "aaaaaa", "aaaaaabbbbbbbc"};
        for (String s : arg) {
            System.out.println(s + " -> "  + new HappyLetterDiv2().getHappyLetter(s));
        }
    }

}
