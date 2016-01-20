package fuku.task1;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "coding_contest_creation.txt";

        URL inFileUrl = TaskX.class.getResource(inFile);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

        System.err.printf("Class = [%s]\n", TaskX.class);
        System.err.printf("Input File = [%s]\n", inFileUrl);
        System.err.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.err.println("------------------");
            System.err.println("test " + (i+1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.err.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] ps = new int[N];
            for (int i = 0; i < N; i++) {
                ps[i] = Integer.parseInt(in.next());
            }

            int tot = 0;
            List<Integer> p = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                p.add(ps[i]);
                if (i == N-1) {
                    tot += calc(p);
                    p.clear();
                    continue;
                }
                if (ps[i+1] <= ps[i]) {
                    tot += calc(p);
                    p.clear();
                    continue;
                }
            }

            String ans = "" + tot;
            return ans;
        }

        private int calc(List<Integer> p) {
            int req = 0;
            for (int i = 0; i < p.size()-1; i++) {
                int a = p.get(i);
                int b = p.get(i+1);
                req += (b - a - 1) / 10;
            }

            int x = p.size() + req;
            if (x % 4 > 0) {
                req += (4 - (x % 4));
            }

            return req;
        }
    }
}


