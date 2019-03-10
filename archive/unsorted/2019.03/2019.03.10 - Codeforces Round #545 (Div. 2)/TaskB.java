package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskB {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        char[] a = in.nextLine().toCharArray();
        char[] b = in.nextLine().toCharArray();

        int both = 0;
        int aonly = 0;
        int bonly = 0;
        int nn = 0;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] == '1' && b[i] == '1') {
                both++;
                c[i] = 1;
            }
            else if (a[i] == '1') {
                aonly++;
                c[i] = 2;
            }
            else if (b[i] == '1') {
                bonly++;
                c[i] = 3;
            } else {
                // none
                nn++;
                c[i] = 4;
            }
        }

        boolean flip = false;
        if (bonly < aonly) {
            flip = true;
            int tmp = bonly;
            bonly = aonly;
            aonly = tmp;
        }

        // always aonly <= bonly

        // number of assignment from both to a
        int m = Math.min(both, bonly - aonly);
        int remain = both - m;
        int remain_each = remain / 2;
        int sub_b = 0;
        if (remain % 2 != 0) {
            if (bonly == 0) {
                out.println(-1);
                return;
            }
            sub_b = 1;
        }

        // for both people
        int rem_a = remain_each + m;
//        int rem_b = remain_each;
//        if (sub_b > 0) rem_b++;

        int sub_a = 0;

        if (flip) {
            sub_a = sub_b;
            sub_b = 0;

            rem_a = both - rem_a;
        }

        int nons = n/2 - (rem_a + aonly + sub_b);
        if (nn < nons) {
            out.println(-1);
            return;
        }

        List<Integer> as = new ArrayList<>();
        List<Integer> bs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int v = c[i];
            if (v == 1 && rem_a > 0) {
                rem_a--;
                as.add(i + 1);
            } else if (v == 1) {
//                rem_b--;
                bs.add(i + 1);
            } else if (v == 2) {
                if (sub_a > 0) {
                    bs.add(i + 1);
                } else {
                    as.add(i + 1);
                }
            } else if (v == 3) {
                if (sub_b > 0) {
                    as.add(i + 1);
                    sub_b--;
                } else {
                    bs.add(i + 1);
                }
            } else {
                if (nons > 0) {
                    as.add(i+1);
                    nons--;
                }
            }
        }

        for (int v: as) {
            out.print(v + " ");
        }
        out.println();
    }
}
