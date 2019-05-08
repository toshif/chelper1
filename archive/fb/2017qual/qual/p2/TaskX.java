package fb.qual.p2;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "lazy_loading.txt";

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
            System.err.println("test " + (i + 1));
            Solver solver = new Solver();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i + 1) + ": " + ans);
            System.err.println("Case #" + (i + 1) + ": " + ans);
        }
        out.close();
    }

    static class Solver {

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            LinkedList<Integer> ws = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                ws.add(in.nextInt());
            }
            Collections.sort(ws);

            int count = 0;
            while (!ws.isEmpty()) {
                Integer hw = ws.removeLast();
                if (hw >= 50) {
                    count++;
                    continue;
                }

                int req = 50 / hw;
                if (50 % hw != 0) req++;
                req--;

                if (ws.size() < req) break;

                for (int i = 0; i < req; i++) {
                    ws.removeFirst();
                }
                count++;
            }


            return  "" + count;
        }
    }
}


