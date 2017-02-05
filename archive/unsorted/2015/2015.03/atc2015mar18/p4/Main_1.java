package atc2015mar18.p4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_1 {

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

            LinkedList<Integer>[] b = new LinkedList[C+10];
            for (int i = 0; i < C + 10; i++) {
                b[i] = new LinkedList<>();
            }

            for (int i = 0; i < N; i++) {
                Integer a = Integer.valueOf(in.next());
                b[a].add(i);
            }

            // System.err.printf("b=%s\n", Arrays.toString(b));

            final long tot = sum(N);
            for (int i = 1; i <= C; i++) {
                b[i].addFirst(-1);
                b[i].addLast(N);

                long t = tot;
                int M = b[i].size();
                for (int j = 0; j < M-1; j++) {
                    long num = b[i].get(j+1).intValue() - b[i].get(j).intValue() - 1;
                    t -= sum(num);
                }

                out.println(t);
            }
        }

        long sum(long n){
            return n * (n+1) / 2;
        }
    }



}
