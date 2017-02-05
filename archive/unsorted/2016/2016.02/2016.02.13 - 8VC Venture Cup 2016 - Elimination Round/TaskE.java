package fuku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskE {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b.add(new Integer(in.next()));
        }

        if (n == 1) {
            out.println(1);
            out.println(b.get(0));
            return;
        }

        Collections.sort(b);

        List<Integer> v = new ArrayList<>();
        v.add(b.remove(0));
        v.add(b.remove(b.size() - 1));

        long sum = v.get(0) + v.get(1);

        double best = 0;
        String state = null;
        while (!b.isEmpty()) {
            int mean2 = 0;
            if (v.size() % 2 == 1) {
                mean2 = 2 * v.get(v.size() / 2);
            } else {
                mean2 = v.get(v.size() / 2) + v.get(v.size() / 2 - 1);
            }

            long scoreSize2 = sum * 2 - mean2 * v.size();

            Integer newV;
            if (v.size() % 2 == 0) {
                newV = b.remove(0);
            } else {
                newV = b.remove(b.size() - 1);
            }

            v.add(newV);
            Collections.sort(v);
            int newMean2 = mean2(v);

            long newSum = sum + newV;

            long newScoreSize2 = newSum * 2 - newMean2 * v.size();

            double newScore = 1.0 * newScoreSize2 / v.size();
            if (newScore >= best) {
                best = newScore;

                StringBuilder sb = new StringBuilder();
                sb.append(v.size() + "\n");
                Collections.sort(v);
                for (int i = 0; i < v.size(); i++) {
                    sb.append(v.get(i) + " ");
                }
                state = sb.toString();
            }

        }

        if (state == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(v.size() + "\n");
            Collections.sort(v);
            for (int i = 0; i < v.size(); i++) {
                sb.append(v.get(i) + " ");
            }
            state = sb.toString();
        }

        out.println(state);
    }

    int mean2(List<Integer> v) {
        int mean2 = 0;
        if (v.size() % 2 == 1) {
            mean2 = 2 * v.get(v.size() / 2);
        } else {
            mean2 = v.get(v.size() / 2) + v.get(v.size() / 2 - 1);
        }
        return mean2;
    }

}
