package gcj2017.task3;

import java.io.*;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "C-large.in";

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
            long N = in.nextLong();
            long K = in.nextLong();

            TreeMap<Long, Long> t = new TreeMap<>();
            t.put(N, 1L);
            long rem = K;
            long mi = 0;
            long ma = 0;
            while(rem > 0) {
                Map.Entry<Long, Long> last = t.pollLastEntry();
                rem -= last.getValue();
                mi = (last.getKey() - 1L ) / 2L;
                ma = last.getKey() / 2L;
                if (!t.containsKey(mi)) {
                    t.put(mi, 0L);
                }
                if (!t.containsKey(ma)) {
                    t.put(ma, 0L);
                }
                t.put(mi, t.get(mi) + last.getValue());
                t.put(ma, t.get(ma) + last.getValue());
            }

            String ans = ma + " " + mi;
            return ans;
        }
    }
}


