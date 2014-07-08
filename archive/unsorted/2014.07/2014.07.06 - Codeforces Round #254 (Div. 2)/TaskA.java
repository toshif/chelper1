package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            char[] cs = s.toCharArray();

            String os = "";
            for (int j = 0; j < m; j++) {
                char c = cs[j];

                if (c == '-'){
                    os += '-';
                } else {
                    if ((i + j) % 2 == 0){
                        os += "B";
                    } else {
                        os += "W";
                    }
                }
            }
            out.println(os);
        }
    }
}
