package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long C = in.nextLong();
        long hr = in.nextLong();
        long hb = in.nextLong();
        long wr = in.nextLong();
        long wb = in.nextLong();

        if (! ( hr * wb <  hb * wr) ) {
            // swap

            long ht = hr;
            long wt = wr;

            hr = hb;
            wr = wb;
            hb = ht;
            wb = wt;
        }


        long ma = 0;
        long nmb = C / wb;
        for (int i = 0; i < 10000000 && i <= nmb; i++) {
            long nb = nmb - i;
            ma = Math.max(ma, nb * hb + ((C - (nb * wb))/wr) * hr );
        }
        out.println(ma);
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
