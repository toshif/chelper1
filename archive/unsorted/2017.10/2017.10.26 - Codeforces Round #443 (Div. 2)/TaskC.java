package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int a = 1023;
        int b = 0;
        for (int i = 0; i < n; i++) {
            String op = in.next();
            int val = in.nextInt();

            if (op.equals("&")) {
                a &= val;
                b &= val;
            }

            if (op.equals("|")) {
                a |= val;
                b |= val;
            }

            if (op.equals("^")) {
                a ^= val;
                b ^= val;
            }
        }
        
        int xor = 0;
        int or = 0;
        int and = 0;

        for (int i = 0; i < 10; i++) {
            int bit = 1 << i;
            if ((a & bit) > 0 && (b & bit) == 0) {
                and |= (1 << i);
            }
            if ((a & bit) == 0 && (b & bit) == 0) {
            }
            if ((a & bit) > 0 && (b & bit) > 0) {
                and |= (1 << i);
                or |= (1 << i);
            }
            if ((a & bit) == 0 && (b & bit) > 0) {
                and |= (1 << i);
                xor |= (1 << i);
            }
        }

        out.println(3);
        out.println("^ " + xor);
        out.println("| " + or);
        out.println("& " + and);
    }
}
