package fb1;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * @author fuku
 */
public class TaskD_1 {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "corporate_gifting.txt";

        URL inFileUrl = TaskD_1.class.getResource(inFile);
        InputStream inputStream =  new BufferedInputStream(new FileInputStream(inFileUrl.getFile()));
        Scanner in = new Scanner(inputStream);

        String outFile = inFile + ".out";
        PrintWriter out = new PrintWriter(new FileOutputStream(outFile));

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i+1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        List<Integer>[] nodes;

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            memo = new HashMap<>();

            nodes = new List[N+5];
            for (int i = 0; i < N + 5; i++) {
                nodes[i] = new ArrayList<>();
            }

            in.nextInt(); // skip root

            for (int i = 0; i < N-1; i++) {
                int parent = in.nextInt()-1;
                nodes[parent].add(i+1);
            }

            long[][] bes = new long[N][10];
            for (int i = N-1; i >= 0; i--) {
                for (int j = 1; j < 10; j++) {
                    best(i, j);
                }

            }

            //System.err.printf("nodes=%s\n", Arrays.toString(nodes));

            long best = best(0, -1);

            String ans = "" + best;
            return ans;
        }

        int M = 10;

        Map<Long, Long> memo;

        long best(int node, int parentVal){
            long mi = 1_000_000_000_000L;
            for (int val = 1; val <= M; val++) {
                if (val == parentVal) continue;

                long sum = 0;
                sum += val;

                List<Integer> children = nodes[node];
                for (int i = 0; i < children.size(); i++) {
                    sum += best(children.get(i), val);
                }
                mi = Math.min(mi, sum);
            }

            return mi;
        }
    }
}


