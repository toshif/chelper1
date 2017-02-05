package fuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int sum = in.nextInt();
        int limit = in.nextInt();

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            int t = i;
            int base = 1;
            while(t != 0) {
                if ((t & 1) == 1) {
                    if (sum >= base) {
                        sum -= base;
                        ans.add(i);
                    }
                    break;
                }
                base *= 2;
                t >>= 1;
            }
        }

        if (sum != 0) {
            out.println("-1");
            return;
        }

        out.println(ans.size());
        for (Integer an : ans) {
            out.print(an + " ");
        }
    }
}
