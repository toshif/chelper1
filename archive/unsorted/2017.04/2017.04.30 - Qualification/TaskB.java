package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskB {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int c = in.nextInt();

        Map<String, Integer> cities = new HashMap<>();
        String[][] av = new String[24][c];
        for (int i = 0; i < c; i++) {
            String city = in.next();
            cities.put(city, i);
            int confs = in.nextInt();
            for (int j = 0; j < confs; j++) {
                String schedule = in.next();
                String room = in.next();

                char[] sh = schedule.toCharArray();
                for (int k = 0; k < sh.length; k++) {
                    if ( sh[k] == '.' ) {
                        av[k][i] = room;
                    }
                }
            }
        }

        int m = in.nextInt();
        M:
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            List<Integer> rs = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                String s = in.next();
                rs.add(cities.get(s));
            }

            A:
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < a; k++) {
                    if (av[j][rs.get(k)] == null) {
                        continue A;
                    }
                }

                out.print("Yes ");
                for (int k = 0; k < a; k++) {
                    out.print(av[j][rs.get(k)] + " ");
                }
                out.println();
                continue M;
            }

            out.println("No");
        }

    }
}
