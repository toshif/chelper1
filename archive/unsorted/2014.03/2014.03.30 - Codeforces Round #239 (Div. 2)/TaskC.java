package fuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    class P {
        int x, y;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int ta = in.nextInt();
        int tb = in.nextInt();
        int a = Math.min(ta, tb);
        int b = Math.max(ta, tb);
        int c2 = b * b - a * a;

        List<P> pa = findPair(a);
        List<P> pb = findPair(b);
        List<P> pc = findPair2(c2);

        for (P a1 : pa) {
            for (P b1 : pb) {
                if (a1.x * b1.x == a1.y * b1.y && a1.y != b1.y) {
                    out.println("YES");
                    out.println("0 0");
                    out.println((-1 * a1.x) + " " + a1.y);
                    out.println(b1.x + " " + b1.y);
                    return;
                }
            }

            for (P b1 : pc) {
                if (a1.x * b1.x == a1.y * b1.y && a1.y != b1.y) {
                    out.println("YES");
                    out.println("0 0");
                    out.println((-1 * a1.x) + " " + a1.y);
                    out.println(b1.x + " " + b1.y);
                    return;
                }
            }

        }

        out.print("NO");
    }

    List<P> findPair(int c){
        List<P> ps = new ArrayList<>();
        for (int i = 1; i < 1001 && i < c; i++) {
            for (int j = 1; j < 1001 && i * i + j * j <= c * c; j++) {
                if (i * i + j * j == c * c) {
                    P p = new P();
                    p.x = i;
                    p.y = j;
                    ps.add(p);
                }
            }
        }
        return ps;
    }

    List<P> findPair2(int c2){
        List<P> ps = new ArrayList<>();
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j < 1001 && i * i + j * j <= c2; j++) {
                if (i * i + j * j == c2) {
                    P p = new P();
                    p.x = i;
                    p.y = j;
                    ps.add(p);
                }
            }
        }
        return ps;
    }
}
