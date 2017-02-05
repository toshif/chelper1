package fuku.atbig14.p3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            BIT plus = new BIT(1_000_005);
            BIT minus = new BIT(1_000_005);

            int N = in.nextInt();
            for (int i = 0; i < N; i++) {
                int a = in.nextInt() + 1;
                int b = in.nextInt() + 1;

                plus.add(a, 1);
                minus.add(b + 1, 1);
            }

            long ma = 0;
            for (int i = 1; i <= 1_000_001; i++) {
                long v = plus.getHeadSum(i) - minus.getHeadSum(i);
                if (ma < v){
                    ma = v;
                }
            }
            out.println(ma);
        }
    }

    static class BIT {

        long[] data;
        private int n;

        public BIT(int n){
            this.n = n;
            data = new long[n+1];
        }

        void add(int idx, long val){
            while (idx <= n) {
                data[idx] += val;
                idx += (idx & -idx);
            }
        }

        long getHeadSum(int idx){
            long sum = 0;
            while(idx > 0){
                sum += data[idx];
                idx = idx & (idx - 1);
            }

            return sum;
        }

    }

}
