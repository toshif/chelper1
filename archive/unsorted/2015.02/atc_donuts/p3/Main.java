package atc1.p3;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();

            TreeSet<Integer> hs = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                int h = in.nextInt();

                out.println(hs.size());

                while(!hs.isEmpty()){
                    Integer f = hs.first();
                    if (f < h) {
                        hs.pollFirst();
                    } else {
                        break;
                    }
                }

                hs.add(h);

            }
        }
    }

}
