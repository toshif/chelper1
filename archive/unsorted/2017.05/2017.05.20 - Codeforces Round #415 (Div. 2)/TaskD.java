package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskD {
    private MyReader in;
    private PrintWriter out;
    int n;

    List<Integer> vs = new ArrayList<>();

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
        n = in.nextInt();
        int k = in.nextInt();

        if (n == 2) {
            out.println(2 + " " + 1 + " " + 2);
            out.flush();
            return;
        }

        int a1 = bi(1, n);
        if (a1 == -100) {
            out.println(2 + " " + vs.get(0) + " " + vs.get(1));
            out.flush();
            return;
        }

        int a2 = -1;
        if (1 < a1) {
            if (ask(a1 - 1, a1)) {
                a2 = a1 - 1;
            }
        }
        if (a1 < n) {
            if (ask(a1 + 1, a1)) {
                a2 = a1 + 1;
            }
        }

        if (a2 > 0) {
            out.println(2 + " " + a1 + " " + a2);
            out.flush();
            return;
        }

        int x = 1;
        int y = a1 - 1;
        int mid = (x + y) / 2;
        boolean found = false;
        while (y - x > 1) {
            mid = (x + y) / 2;
            out.println(1 + " " + x + " " + mid);
            out.flush();
            String s = in.next();
            if (s.equals("TAK")) {
                // found
                found = true;
                break;
            } else {
                x = mid;
            }
        }

        if (found) {
            int d = Math.abs(mid - x);
            bi(x - d, x + d);
            out.println(2 + " " + vs.get(0) + " " + vs.get(1));
            out.flush();
            return;
        }

        // right search
        x = n;
        y = a1 + 1;
        mid = (x + y) / 2;
        found = false;
        while (Math.abs(y - x) > 1) {
            mid = (x + y) / 2;
            out.println(1 + " " + x + " " + mid);
            out.flush();
            String s = in.next();
            if (s.equals("TAK")) {
                // found
                found = true;
                break;
            } else {
                x = mid;
            }
        }

        int d = Math.abs(mid - x);
        bi(x - d, x + d);
        out.println(2 + " " + vs.get(0) + " " + vs.get(1));
        out.flush();
    }

    int bi(int x, int y) {
        while (y - x > 1) {
            int mid = (x + y) / 2;
            out.println(1 + " " + x + " " + y);
            out.flush();
            String s = in.next();
            if (s.equals("TAK")) {
                y = mid;
            } else {
                x = mid;
            }
        }

        out.println(1 + " " + x + " " + y);
        out.flush();
        String s1 = in.next();
        out.println(1 + " " + y + " " + x);
        out.flush();
        String s2 = in.next();

//        if (s1.equals("TAK") && s2.equals("TAK")) {
//            vs.add(x);
//            vs.add(y);
//            return -100;
//        }

        int a1 = 0;
        if (s1.equals("TAK")) {
            a1 = x;
        } else {
            a1 = y;
        }

        vs.add(a1);

        return a1;
    }

    boolean ask(int x, int y) {
        out.println(1 + " " + x + " " + y);
        out.flush();
        String s1 = in.next();
        return s1.equals("TAK");
    }
}
