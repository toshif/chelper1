package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    char[] s;
    int len;
    int[] si;

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        s = in.nextLine().toCharArray();

        len = s.length;

        si = new int[len];
        for (int i = 0; i < s.length; i++) {
            si[i] = Integer.parseInt("" + s[i]);
        }


        if (s[0] == '1') {

        } else {

        }

    }

    int[] calc (boolean nextBump, boolean prevBump) {
        int[] a = new int[len];
        for (int i = 0; i < len / 2; i++) {
            int l = i;
            int r = len - i;

            int a1 = si[l] / 2;
            int a2 = si[l] / 2;
            if ( si[l] % 2 != 0 ) {
                a2 += 1;
            }

            if (nextBump) {
                a1 += 5;
                a2 += 5;
            }

            if (si[l] == si[r]) {
                nextBump = false;

            } else if (si[l] +1 == si[r] && !prevBump) {
                nextBump = true;
                prevBump = false;
            } else if (si[l] == si[r] + 1 && prevBump) {
                nextBump = false;
                prevBump = false;
            }else {
                // fail
                return null;
            }

            a[l] = a1;
            a[r] = a2;
        }

        if (len % 2 != 0) {
            int l = len / 2 + 1;
            if ( si[l] % 2 != 0 ) {
                return null;
            }

            int a1 = si[l] / 2;

            a[l] = a1;
        }

        return a;
    }
}
