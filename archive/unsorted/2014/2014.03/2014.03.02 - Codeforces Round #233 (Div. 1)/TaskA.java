package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextInt();
        long b = in.nextInt();

        StringBuilder bu = new StringBuilder();

        long v = 0;
        if (a >= b) {
            long b1 = b /2;
            long b2 = b - b1;
            v = a * a - b1 * b1 - b2 * b2;
            out.println(v);

            for (int i = 0; i < b1; i++) {
                bu.append('x');
            }
            for (int i = 0; i < a; i++) {
                bu.append('o');
            }
            for (int i = 0; i < b2; i++) {
                bu.append('x');
            }
            out.println(bu.toString());
            return;
        }

        int ad=0;
        long admi = 0;
        for (int adi = 0; adi < a; adi++) {
            long ax = a - adi;
            long bb = b / (ax+1);
            long r = b % (ax+1);

            long adiv = - ( (bb+1)*(bb+1)*r + bb*bb*(ax+1-r) - (1+adi)*(1+adi) + 1 - ax);
            if (adiv < admi){
                ad = adi;
                admi = adiv;
            }
        }
        System.err.println("ad=" + ad);
        System.err.println("admi=" + admi);

        long ax = a - ad;
        long bb = b / (ax+1);
        long r = b % (ax+1);

        v = - ( (bb+1)*(bb+1)*r + bb*bb*(ax+1-r) - (1+ad)*(1+ad) + 1 - ax);
        out.println(v);
        boolean first = true;
        for (int i = 0; i < ax + 1; i++) {
            if (first) first = false;
            else {
                bu.append('o');
                for (int j = 0; j < ad; j++) {
                    bu.append('o');
                }
            }

            long len = bb;
            if (i < r) len++;
            for (int j = 0; j < len; j++) {
                bu.append('x');
            }
        }
        out.println(bu.toString());
    }
}
