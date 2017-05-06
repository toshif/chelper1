package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;
import java.util.TreeSet;

public class TaskA {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] idx = new int[n + 5];
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            idx[v] = i;
        }

        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (idx[i] > idx[i+1]) cnt++;
        }

        out.println(cnt + 1);

    }
}
