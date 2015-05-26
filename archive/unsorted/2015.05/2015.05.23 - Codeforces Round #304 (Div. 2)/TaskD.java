package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {

    static final int N = 5000001;
    static final int[] v = new int[N];
    static final int[] p = new int[N];
    static final BIT bit = new BIT(N);

    static {
        for (int i = 1; i < N; i++) {
            v[i] = i;
        }
        for (int i = 2; i < N; i++) {
            for (int j = i; j < N; j += i) {
                while(v[j] % i == 0) {
                    v[j] /= i;
                    p[j]++;
                }
            }
        }

        for (int i = 1; i < N; i++) {
            bit.add(i, p[i]);
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int a = Integer.valueOf(in.next());
            int b = Integer.valueOf(in.next());
            long diff = bit.getHeadSum(a) - bit.getHeadSum(b);
            ans.append(diff+"\n");
        }
        out.print(ans);
    }

    public static class BIT {

        long[] data;
        private int n;

        public BIT(int n){
            this.n = n;
            data = new long[n+1];
        }

        /**
         * Adds val to the index idx
         *
         * log2(n)
         */
        void add(int idx, long val){
            while (idx <= n) {
                data[idx] += val;
                idx += (idx & -idx);
            }
        }

        /**
         * Gets the sum of 1, 2, ... idx (inclusive)
         *
         * log2(n)
         */
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
