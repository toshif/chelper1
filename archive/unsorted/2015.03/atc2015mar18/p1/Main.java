package atc2015mar18.p1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) + 1);
        }
    }

}
