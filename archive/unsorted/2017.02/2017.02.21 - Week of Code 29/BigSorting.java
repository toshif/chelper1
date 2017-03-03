package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ss.add(in.next());
        }
        Collections.sort(ss, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return Integer.compare(o1.length(), o2.length());
                }
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < n; i++) {
            out.println(ss.get(i));
        }
    }
}
