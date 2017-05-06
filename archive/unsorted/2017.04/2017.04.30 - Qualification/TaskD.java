package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TaskD {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int t = in.nextInt();

        long[] a = new long[57];
        for (int i = 0; i < a.length; i++) {
            a[i] = (long) Math.pow(2, i);
        }

        T:
        for (int i = 0; i < t; i++) {
            long v = in.nextLong();
            A:
            for (int k = 1; k <= 60; k++) {
                int remain = k;
                long kv = k * v;
                List<Integer> an = new LinkedList<>();
                for (int j = a.length - 1; j >= 0; j--) {
                    long av = a[j];
                    if (av <= kv) {
                        kv -= av;
                        remain--;
                        an.add(j);
                    }
                    if (remain < 0) continue A;
                }

                while (remain > 0) {
                    Collections.sort(an);
                    Collections.reverse(an);
                    Integer a1 = an.remove(0);
                    if (a1 == 1) {
                        continue A;
                    }
                    an.add(a1 - 1);
                    an.add(a1 - 1);
                    remain--;
                }

                out.print(k + " ");
                for (Integer a1 : an) {
                    out.print(a1 + " ");
                }
                out.println();
                continue T;
            }
        }
    }
}
