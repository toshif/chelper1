package fuku;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();

        LinkedList<Integer> a  = new LinkedList<>();
        char[] cs = s.toCharArray();
        for (int v = 0; v < n; v++) {
            int i = Integer.parseInt("" + cs[v]);
            if (Arrays.asList(2,3,5,7).contains(i)) {
                a.add(i);
            } else if (i == 4) {
                a.add(2);
                a.add(2);
                a.add(3);
            } else if (i== 6) {
                a.add(3);
                a.add(5);
            } else if (i== 8) {
                a.add(2);
                a.add(2);
                a.add(2);
                a.add(7);
            } else if (i==9) {
                a.add(3);
                a.add(3);
                a.add(2);
                a.add(7);
            }
        }

        Collections.sort(a);
        Collections.reverse(a);
        String ans = "";
        for (Integer i : a) {
            ans += i;
        }

        out.println(ans);

    }
}
