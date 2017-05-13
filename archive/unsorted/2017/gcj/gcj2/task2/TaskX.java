package gcj.task2;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "B-large.in";

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
            int testNumber = i + 1;
            System.err.println("------------------");
            System.err.println("test " + testNumber);
            Solver solver = new Solver();
            String ans = solver.solve(testNumber, in, out);
            out.println("Case #" + testNumber + ": " + ans);
            System.err.println("Case #" + testNumber + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        private int testNumber;
        private int N;
        private int C;
        private int M;

        class P implements Comparable<P> {
            int idx;
            int p;
            int b;

            @Override
            public int compareTo(P o) {
                if (Integer.compare(p, o.p) != 0) return Integer.compare(p, o.p);
                if (Integer.compare(b, o.b) != 0) return Integer.compare(b, o.b);
                return Integer.compare(idx, o.idx);
            }
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            this.testNumber = testNumber;
            N = in.nextInt();
            C = in.nextInt();
            M = in.nextInt();
            int[][] cs = new int[C][N];
            int[] cf = new int[C];
            int[] nf = new int[N];
            List<P> ps = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                int p = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                cs[b][p]++;
                cf[b]++;
                nf[p]++;

                P p1 = new P();
                p1.idx = i;
                p1.p = p;
                p1.b = b;
                ps.add(p1);
            }
            Collections.sort(ps);

            int mac = 0;
            for (int i = 0; i < C; i++) {
                mac = Math.max(mac, cf[i]);
            }

            int lo = mac; int hi = M;
            while (hi - lo > 1) {
                int mid = (lo + hi) / 2;
                if (isOK(mid, ps)) {
                    hi = mid;
                } else {
                    lo = mid;
                }
            }
            int r = hi;
            if(isOK(lo, ps)) r = lo;

            int adj = 0;
            for (int i = 0; i < N; i++) {
                if (nf[i] > r) {
                    adj += (nf[i] - r);
                }
            }

            String ans = r + " " + adj;
            return ans;
        }

        boolean isOK(int r, List<P> ps1) {
            List<P> ps2 = new ArrayList<>();
            ps2.addAll(ps1);
            Set<Integer> bs = new HashSet<>();
            for (int row = 0; row < r; row++) {
                bs.clear();
                int pos = 0;
                while(true) {
                    P found = null;
                    for (int i = 0; i < ps2.size(); i++) {
                        P p1 = ps2.get(i);
                        if (bs.contains(p1.b)) continue;
                        if (p1.p < pos) continue;

                        found = p1;
                        break;
                    }

                    if (found == null) break;

                    ps2.remove(found);
                    bs.add(found.b);
                    pos++;
                }

//                System.err.printf("row=%s, bs=%s\n", row, bs);
            }

            if (!ps2.isEmpty()) return false;

            return true;
        }
    }
}


