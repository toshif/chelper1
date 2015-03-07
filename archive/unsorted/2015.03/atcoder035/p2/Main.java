package atcoder.p2;

import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Solver().solve(in, out);
        out.flush();
    }

    static long MOD = 1_000_000_007;

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();

            TreeMap<Integer, Integer> m = new TreeMap<>();
            for (int i = 0; i < N; i++) {
                Integer T = Integer.valueOf(in.nextInt());

                if (!m.containsKey(T)) {
                    m.put(T, 0);
                }

                m.put(T, m.get(T) + 1);
            }

            long tot = 0;
            long time = 0;
            long way = 1;
            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                int T = e.getKey();
                int M = e.getValue();
                for (int i = 0; i < M; i++) {
                    time += T;
                    tot += time;

                    way *= (M - i);
                    way %= MOD;
                }
            }

            out.println(tot);
            out.println(way);

        }
    }

}
