package fuku;

import com.sun.swing.internal.plaf.metal.resources.metal_it;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int ma = Math.min(m, n);
        if (ma % 2 == 0){
            out.println("Malvika");
        } else {
            out.println("Akshat");
        }

    }
}
