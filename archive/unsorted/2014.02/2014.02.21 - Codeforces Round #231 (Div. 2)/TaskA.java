package fuku;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        String[] ss = s.split("\\+|=");
        int a = ss[0].length();
        int b = ss[1].length();
        int c = ss[2].length();

        if (a + b == c) {
            out.println(s);
            return;
        }

        if (a + b - c == 2) {
            if (a != 1) {
                a -= 1;
                c += 1;
            } else if (b != 1) {
                b -= 1;
                c +=1;
            } else {
                out.println("Impossible");
                return;
            }
        } else if (a + b - c == -2) {
            if (c != 1) {
                a += 1;
                c -= 1;
            } else {
                out.println("Impossible");
                return;
            }
        } else {
            out.println("Impossible");
            return;
        }

        p(a,b,c,out);
    }
    
    void p(int a, int b, int c, PrintWriter out) {
        for (int i = 0; i < a; i++) {
            out.print("|");
        }
        out.print("+");
        for (int i = 0; i < b; i++) {
            out.print("|");
        }
        out.print("=");
        for (int i = 0; i < c; i++) {
            out.print("|");
        }
    }
}
