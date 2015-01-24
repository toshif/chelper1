package fb1;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author fuku
 */
public class TaskACheck {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "A-small.in";

        URL inFileUrl = TaskACheck.class.getResource(inFile);
        InputStream inputStream = new FileInputStream(inFileUrl.getFile());
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

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();

            int tot = 0;
            for (int i = A; i <= B; i++) {
                if (primes[i] == K){
                    tot++;
                }
            }

            String ans = "" + tot;
            return ans;
        }
    }

    static int[] primes;

    static {
        primes = getParr();
    }

    static int[] getParr(){
        // int N = 10_000_009;
        int N = 100_000;
        int[] ret = new int[N];
        int[] remain = new int[N];
        int[] pi = new int[N];
        int[] check = new int[N];

        for (int i = 2; i < N; i++) {
            remain[i] = i;
            pi[i] = i;
            // check[i] = factor(i);
        }

        for (int i = 2; i * i <= N; i++) {
            if (remain[i] == 1) continue;

            for (int j = 2; i * j < N; j++) {
                int idx = i * j;
                int tgt = remain[idx];

                boolean first = true;
                while(true) {
                    if (tgt < i) break;
                    if (tgt % i == 0) {
                        tgt /= i;
                        if (first) {
                            first = false;
                            ret[idx]++;
                        }
                    } else {
                        break;
                    }
                }

                remain[idx] = tgt;
            }
        }

        for (int i = 2; i < N; i++) {
            if (remain[i] != 1) {
                ret[i]++;
            }
        }

        /*
        for (int i = 0; i < N; i++) {
            if (check[i] != ret[i]) throw new RuntimeException("fail");
        }
        */

        System.err.printf("pa=%s\n", Arrays.toString(ret));
        System.err.printf("pi=%s\n", Arrays.toString(pi));
        return ret;
    }

    // for sanity check
    static int factor(long n) {
        Set<Long> ret = new HashSet<>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        return ret.size();
    }



}


