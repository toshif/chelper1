package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class ChefAndNotebooks {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int X = Integer.parseInt(in.next());
        int Y = Integer.parseInt(in.next());
        int K = Integer.parseInt(in.next());
        int N = Integer.parseInt(in.next());

        boolean ok = false;
        for (int i = 0; i < N; i++) {
            if (ok) {
                in.next();in.next();
                continue;
            }

            int P = Integer.parseInt(in.next());
            int C = Integer.parseInt(in.next());

            if (X - Y <= P && K >= C) {
                ok = true;
            }
        }

        if (ok) out.println("LuckyChef");
        else out.println("UnluckyChef");
    }
}
