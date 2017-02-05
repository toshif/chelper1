package fuku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * System test didn't pass
 */
public class Nisoku {
    public double theMax(double[] cards) {
        int N = cards.length;
        LinkedList<Double> ca = new LinkedList<>();
        ArrayList<Double> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            double d = cards[i];
            if (d >= 2.0) res.add(d);
            else ca.add(cards[i]);
        }

        while(true){
            if (ca.size() <= 1) break;

            Collections.sort(ca);

            Double d1 = ca.get(0);
            Double d2 = ca.getLast();

            if (d1 < 2.0) {
                ca.remove(0);
                ca.removeLast();
                res.add(d1 + d2);
            } else {
                break;
            }
        }

        System.out.println("ca = " + ca);

        res.addAll(ca);

        System.out.println("res = " + res);

        double tot = 1;
        for (int i = 0; i < res.size(); i++) {
            tot *= res.get(i);
        }

        return tot;
    }
}
