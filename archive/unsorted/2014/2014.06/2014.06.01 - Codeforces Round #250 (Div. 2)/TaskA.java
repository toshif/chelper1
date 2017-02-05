package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] =in.nextLine().length() - 2;
        }

        boolean isSEnough = false;
        boolean isLEnough = false;

        int s = 0;
        int la = 0;
        for (int i = 0; i < 4; i++) {
            boolean isS2 = true;
            boolean isL2 = true;
            for (int j = 0; j < 4; j++) {
                if (i == j) continue;

                if ( l[j] < l[i] * 2 ) isS2 = false;
                if ( l[j] * 2 > l[i]  ) isL2 = false;
            }

            if (isS2) {
                isSEnough = true;
                s = i;
            }
            if (isL2) {
                isLEnough = true;
                la = i;
            }
        }

        if (isSEnough && isLEnough) out.print("C");
        else if (isSEnough) out.print((char)('A' + s));
        else if (isLEnough) out.print((char)('A' + la));
        else out.print("C");
    }
}
