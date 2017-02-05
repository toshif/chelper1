package fuku;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Stack;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k1 = in.nextInt();
        LinkedList<Integer> d1 = new LinkedList<>();
        for (int i = 0; i < k1; i++) {
            d1.add(in.nextInt());
        }
        int k2 = in.nextInt();
        LinkedList<Integer> d2 = new LinkedList<>();
        for (int i = 0; i < k2; i++) {
            d2.add(in.nextInt());
        }

        for (int i = 0; i < 100000; i++) {
            if (d1.isEmpty()) {
                // player 2 win
                out.printf("%s %s", i, 2);
                return;
            }
            if (d2.isEmpty()) {
                // palyer 1 win
                out.printf("%s %s", i, 1);
                return;
            }

            Integer c1 = d1.removeFirst();
            Integer c2 = d2.removeFirst();

            if (c1 > c2) {
                d1.addLast(c2);
                d1.addLast(c1);
            } else {
                d2.addLast(c1);
                d2.addLast(c2);
            }
        }

        out.println(-1);
    }
}
