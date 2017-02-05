package atc2015mar18.p4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
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
            int N = in.nextInt();
            int C = in.nextInt();
            final long tot = sum(N);

            int[] b = new int[C+10];
            long[] ans = new long[C+10];
            for (int i = 0; i < C + 10; i++) {
                b[i] = -1;
                ans[i] = tot;
            }

            for (int i = 0; i < N; i++) {
                Integer a = Integer.valueOf(in.next());

                long num = i - b[a] -1;
                ans[a] -= sum(num);
                b[a] = i;
            }

            for (int i = 1; i < C+10; i++) {
                ans[i] -= sum(N - b[i] - 1);
            }

            for (int i = 1; i <= C; i++) {
                out.println(ans[i]);
            }
        }

        long sum(long n){
            return n * (n+1) / 2;
        }
    }



}
