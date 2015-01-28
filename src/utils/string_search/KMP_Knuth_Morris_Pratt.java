package utils.string_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * http://community.topcoder.com/tc?module=Static&d1=tutorials&d2=stringSearching
 * <p/>
 * Created by toshif on 2015/01/19.
 */
public class KMP_Knuth_Morris_Pratt {

    /* the length of the text */
    int N;

    /* the length of the pattern */
    int M;

    /**
     * Failure function
     * <p/>
     * The index of the longest proper suffix which is also the prefix of pattern
     * <p/>
     * For example,
     * <p/>
     * ABC -> "empty string" : 0
     * ABA -> "A" : 1
     * ABAB -> "AB" : 2
     * ABABA -> "ABA" " 3
     */
    int[] F;

    public static void main(String[] args) {
        KMP_Knuth_Morris_Pratt kmp = new KMP_Knuth_Morris_Pratt();

        List<Integer> ans;

        // 0, 3
        ans = kmp.kmpSearch("ABCABC", "ABC");
        System.err.printf("ans=%s\n--\n", ans);

        // 0, 2
        ans = kmp.kmpSearch("ABABABACXYZ", "ABABA");
        System.err.printf("ans=%s\n--\n", ans);

        // 2
        ans = kmp.kmpSearch("ABABABACXYZ", "ABABAC");
        System.err.printf("ans=%s\n--\n", ans);

        // 0, 1
        ans = kmp.kmpSearch("AAAA", "AAA");
        System.err.printf("ans=%s\n--\n", ans);
    }

    void buildFailureFunction(String pattern) {
        F = new int[M + 1];

        F[0] = F[1] = 0; // always true

        for (int i = 2; i <= M; i++) {
            char ichar = pattern.charAt(i - 1);

            // j is the index of the largest next partial match (the largest suffix/prefix) of the string under
            // index i - 1
            int j = F[i - 1];
            for (;;) {

                /* check to see if the last character of substring [0..i] ( = pattern[i - 1] ) "expands" the current
                 * "candidate" best partial match
                 */
                if (pattern.charAt(j) == ichar) {
                    F[i] = j + 1;
                    break;
                }

                if (j == 0) {
                    F[i] = 0;
                    break;
                }

                // go to the next best "candidate" partial match
                j = F[j];
            }
        }
    }

    /**
     * @return the list of indexes which the pattern starts from.
     * <p/>
     * eg.) text=ABCABC, pattern=ABC --> 0 and 3
     */
    List<Integer> kmpSearch(String text, String pattern) {
        N = text.length();
        M = pattern.length();

        List<Integer> ret = new ArrayList<>();

        buildFailureFunction(pattern);

        System.err.printf("F=%s\n", Arrays.toString(F));

        int i = 0; // the initial state of the automaton is the empty string
        int j = 0; // the first character of the text

        for (;;) {
            if (j == N) break; // we reached the end of the text

            // if the current character of the text "expands" the
            // current match
            if (text.charAt(j) == pattern.charAt(i)) {
                i++; // change the state of the automaton
                j++; // get the next character from the text
                if (i == M) {
                    // match found
                    ret.add(j - M);

                    // search next
                    i = F[i];
                }
            }

            // if the current state is not zero (we have not
            // reached the empty string yet) we try to
            // "expand" the next best (largest) match
            else if (i > 0) i = F[i];

                // if we reached the empty string and failed to
                // "expand" even it; we go to the next
                // character from the text, the state of the
                // automaton remains zero
            else j++;
        }

        return ret;
    }

}
