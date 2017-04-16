package gcj1a.task3;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "C-small-attempt0.in";

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

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int Hd = in.nextInt();
            int Ad = in.nextInt();
            int Hk = in.nextInt();
            int Ak = in.nextInt();
            int B = in.nextInt();
            int D = in.nextInt();

            int req = 1000_000_000;
            for (int i = 0; i < 105; i++) {
                int cnt = i;
                cnt += Hk / (Ad + i * B);
                if (Hk % (Ad + i * B) != 0) cnt++;
                req = Math.min(req, cnt);
            }

//            System.err.println("req=" + req);

            int mi = 1000_000_000;
            for (int i = 0; i < 105; i++) {
                int h = Hd;
                int Dremain = i;
                int Kattack = Ak;
                int reqRemain = req;
                for (int j = 0; j < 1000_000; j++) {
                    if (reqRemain == 1) {
                        reqRemain--;
                    } else if (h - Kattack > 0) {
                        if (Dremain > 0) {
                            Dremain--;
                            Kattack -= D;
                            if (Kattack < 0) Kattack = 0;
                        } else {
                            reqRemain--;
                        }
                    } else {
                        h = Hd;
                    }

                    if (reqRemain == 0) {
                        mi = Math.min(mi, j + 1);
                        break;
                    }

                    h -= Kattack;
                }
            }

            String ans = "" + mi;
            if (mi == 1000_000_000) {
                ans = "IMPOSSIBLE";
            }
            return ans;
        }
    }
}


