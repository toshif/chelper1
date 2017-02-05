package fuku;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        int k = in.nextInt();

        char[] cs = ("" + a).toCharArray();
        ArrayList<Integer> csi = new ArrayList<>();
        for (int i = 0; i < cs.length; i++) {
            csi.add(Integer.parseInt("" + cs[i]));
        }

        String ans = "";
        while(csi.size() > 0){
            if (csi.size() == 1) {
                ans += csi.get(0);
                csi.remove(0);
                break;
            }

            int base = csi.get(0);
            int maxv = base;
            int maxi = 0;
            for (int i = 1; i < csi.size() && i <= k; i++) {
                if (csi.get(i) > maxv) {
                    maxv = csi.get(i);
                    maxi = i;
                }
            }

            k -= maxi;
            ans += csi.get(maxi);
            csi.remove(maxi);
        }

        out.println(ans);
    }
}
