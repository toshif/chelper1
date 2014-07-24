package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x = in.nextLong();
        long y = in.nextLong();
        long n = in.nextLong();

        int a = (int)(n % 6L);

        long ans = 0;
        switch (a){
            case 1:
                ans = x;
                break;
            case 2:
                ans = y;
                break;
            case 3:
                ans = y - x;
                break;
            case 4:
                ans = -x;
                break;
            case 5:
                ans = -y;
                break;
            case 0:
                ans = -y + x;
                break;
        }

        long MOD = 1000000007;

        ans += 3 * MOD;

        out.print(ans % MOD);
    }
}
