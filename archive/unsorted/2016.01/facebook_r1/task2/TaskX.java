package fuku.task2;

import java.io.*;
import java.net.URL;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "laundro_matt.txt";

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

        class Washer implements Comparator<Washer>, Comparable<Washer>{
            long id;

            long t; // when to finish
            long W;

            @Override
            public int compare(Washer o1, Washer o2) {
                if ( Long.compare(o1.t, o2.t) != 0 ) return Long.compare(o1.t, o2.t);
                if ( Long.compare(o1.W, o2.W) != 0 ) return Long.compare(o1.W, o2.W);
                return Long.compare(o1.id, o2.id);
            }

            public Washer(long id, long t, long w) {
                this.id = id;
                this.t = t;
                W = w;
            }

            @Override
            public int compareTo(Washer o) {
                return compare(this, o);
            }
        }

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            long L = in.nextLong();
            long N = in.nextLong();
            long M = in.nextLong();
            long D = in.nextLong();

            PriorityQueue<Washer> pq = new PriorityQueue<>();
            for (int i = 0; i < N; i++) {
                long w = Long.parseLong(in.next());
                pq.add(new Washer(i, w, w));
            }

            PriorityQueue<Long> dpq = new PriorityQueue<>();
            boolean enoughDriers = false;
            if (M > 1_000_005L) {
                enoughDriers = true;
            } else {
                for (int i = 0; i < M; i++) {
                    dpq.add(0L);
                }
            }

            long dryEndTime = 0;
            for (int i = 0; i < L; i++) {
                Washer washer = pq.poll();

                if (enoughDriers) {
                    dryEndTime = washer.t + D;
                } else {
                    // dryer available time
                    long dt = dpq.poll();
                    // dryner next available time
                    long nt = dt;
                    if (dt <= washer.t) {
                        // use it immediately
                        nt = washer.t + D;
                    } else {
                        // wait and then use it
                        nt = dt + D;
                    }
                    dryEndTime = nt;
                    dpq.add(nt);
                }

                // System.err.printf("washed it at %s and will dry it at %s\n", washer.t, dryEndTime);

                washer.t += washer.W;
                pq.add(washer);
            }

            String ans = "" + dryEndTime;
            return ans;
        }
    }
}


