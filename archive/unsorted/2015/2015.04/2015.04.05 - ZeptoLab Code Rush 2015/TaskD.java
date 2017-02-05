package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        char[] cs = s.toCharArray();

        M = s.length();
        buildFailureFunction(s);

        System.err.printf("F=%s\n", Arrays.toString(F));
    }

    /* the length of the pattern */
    int M;

    int[] F;

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

}
