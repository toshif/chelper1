package gcj2.c;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "C-small-attempt1.in";

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
            in.nextLine();
            String[] sen = new String[N];
            for (int i = 0; i < N; i++) {
                sen[i] = in.nextLine();
            }

            Map<String, Integer> m = new HashMap<>();
            Set<Integer>[] sens = new Set[N];
            int nex = 1;
            for (int i = 0; i < N; i++) {
                Set<Integer> s = new HashSet<>();
                String[] words = sen[i].split(" ");
                for (int j = 0; j < words.length; j++) {
                    if (!m.containsKey(words[j])) {
                        m.put(words[j], nex);
                        nex++;
                    }
                    s.add(m.get(words[j]));
                }
                sens[i] = s;
            }

            int M = N - 2;

            int mi = 1000_000_000;

            Set<Integer> engBase = new HashSet<>();
            Set<Integer> frenchBase = new HashSet<>();

            engBase.addAll(sens[0]);
            frenchBase.addAll(sens[1]);

            int cntBase = 0;
            for (Integer f : frenchBase) {
                if (engBase.contains(f)) {
                    cntBase++;
                }
            }

//            System.err.printf("cntBase=%s\n", cntBase);

            if (M > 0) {
                for (int i = 0; i < (1 << M); i++) {
                    Set<Integer> eng = new HashSet<>();
                    Set<Integer> french = new HashSet<>();

                    for (int j = 0; j < M; j++) {
                        if (((1<<j) & i) > 0) {
                            // english
                            eng.addAll(sens[j+2]);
                        } else {
                            // french
                            french.addAll(sens[j+2]);
                        }
                    }

                    int cnt = 0;
                    for (Integer e : eng) {
                        if (engBase.contains(e)) continue;

                        if ( frenchBase.contains(e) || french.contains(e) ) {
                            cnt++;
                        }
                    }

                    for (Integer f : french) {
                        if (frenchBase.contains(f)) continue;

                        if ( engBase.contains(f) ) {
                            cnt++;
                        }
                    }

                    mi = Math.min(mi, cntBase + cnt);
                }
            } else {
                mi = cntBase;
            }

            String ans = "" + mi;
            return ans;
        }


    }
}


