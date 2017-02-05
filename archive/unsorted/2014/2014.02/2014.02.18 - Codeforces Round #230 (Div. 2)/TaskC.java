package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        if (n == 0) {
            out.println(1);
            return;
        }

        int tot = 0;
        Set<String> pre = new HashSet<>();
        Set<String> now = new HashSet<>();
        int y = n;
        A:
        for (int x = 1; x <= n; x++) {
            long n2 = (long)n * (long)n;
            now.clear();
            if (dis2(x, y) > n2){
                if ( dis2(x-1, y) <= n2) pre.add((x-1) + "-" + y);
                if ( dis2(x, y-1) <= n2) now.add(x + "-" + (y-1));
            }
            while ( dis2(x, y - 1) > n2 ) {
                y--;

                if (y == 0) break A;

                if (dis2(x, y) > n2){
                    if ( dis2(x-1, y) <= n2) pre.add((x-1) + "-" + y);
                    if ( dis2(x, y-1) <= n2) now.add(x + "-" + (y-1));
                }
            }

            tot += pre.size();
            pre.clear();
            pre.addAll(now);
        }

        out.println(tot * 4);
    }

    long dis2(long x, long y){
        return x*x + y*y;
    }
}
