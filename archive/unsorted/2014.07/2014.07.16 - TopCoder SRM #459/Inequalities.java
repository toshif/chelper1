package fuku;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 自分で解いた
 *
 * System Test Passed
 *
 * http://apps.topcoder.com/wiki/display/tc/SRM+459
 */
public class Inequalities {
    public int maximumSubset(String[] inequalities) {
        int N = inequalities.length;
        LinkedList<Integer> gt = new LinkedList<>(); // <, <=
        LinkedList<Integer> lt = new LinkedList<>(); // >, >=
        LinkedList<Integer> eq = new LinkedList<>(); // =
        for (int i = 0; i < N; i++) {
            String s = inequalities[i];
            String[] ss = s.split(" ");
            int val = Integer.valueOf(ss[2]) * 10;

            switch (ss[1]){
                case "<=":
                    gt.add(val);
                    break;
                case "<":
                    gt.add(val - 1);
                    break;
                case ">":
                    lt.add(val + 1);
                    break;
                case ">=":
                    lt.add(val);
                    break;
                case "=":
                    eq.add(val);
                    break;
            }
        }

        Collections.sort(gt);
        Collections.sort(lt);
        Collections.sort(eq);

        int ma = 0;
        for (int i = -1; i < lt.size(); i++) {
            int left = -100000000;
            if (i != -1) {
                left = lt.get(i);
            }

            for (int j = gt.size(); j >= 0 ; j--) {
                int right = 100000000;
                if (j != gt.size()) {
                    right = gt.get(j);
                }

                if (left <= right){
                    ma = Math.max(ma, (i + 1) + (gt.size() - j));

                    for (Integer e : eq) {
                        if (left <= e && e <= right){
                            ma = Math.max(ma, (i + 1) + (gt.size() - j) + 1);
                        }
                    }
                }
            }
        }

        return ma;
    }
}
