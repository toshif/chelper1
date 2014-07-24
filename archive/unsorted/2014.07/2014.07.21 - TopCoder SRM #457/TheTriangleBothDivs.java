package fuku;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * System Test Passed
 *
 * http://apps.topcoder.com/wiki/display/tc/SRM+457
 */
public class TheTriangleBothDivs {
    public String fix(String time) {
        time = time.replace("GMT", "");
        time = time.replace(":", "");

        System.err.printf("time=%s\n", time);
        char[] cs = time.toCharArray();

        String min = "";
        min += cs[2] == '?' ? '0' : cs[2];
        min += cs[3] == '?' ? '0' : cs[3];

        LinkedList<Integer> h1 = new LinkedList<>();
        LinkedList<Integer> h2 = new LinkedList<>();

        LinkedList<Integer> pm = new LinkedList<>();
        LinkedList<Integer> pmh = new LinkedList<>();

        // hour
        if ( cs[0] == '?' ) {
            for (int i = 0; i < 3; i++) {
                h1.add(i);
            }
        } else {
            h1.add(Integer.valueOf("" + cs[0]));
        }


        if ( cs[1] == '?' ) {
            for (int i = 0; i < 10; i++) {
                h2.add(i);
            }
        } else {
            h2.add(Integer.valueOf("" + cs[1]));
        }

        // 5
        if ( cs[5] == '?' ) {
            pm.add(1); pm.add(-1);
        } else {
            if (cs[5] == '+') pm.add(-1);
            else pm.add(1);
        }

        // 5
        if ( cs[6] == '?' ) {
            for (int i = 0; i < 10; i++) {
                if (cs[5] == '-' && i == 0) continue;

                pmh.add(i);
            }
        } else {
            pmh.add(Integer.valueOf("" + cs[6]));
        }

        int mi = 1000;
        for (Integer h1v : h1) {
            for (Integer h2v : h2) {
                for (Integer pmv : pm) {
                    for (Integer pmhv : pmh) {
                        int hour = h1v * 10 + h2v;
                        if (hour >= 24) continue;

                        int h = hour + pmv * pmhv;
                        h += 24 * 3;
                        h %= 24;
                        mi = Math.min(mi, h);
                    }
                }
            }
        }

        return String.format("%02d:%02d", mi, Integer.valueOf(min));
    }
}
