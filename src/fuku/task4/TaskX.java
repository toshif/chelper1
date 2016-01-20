package fuku.task4;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String inFile = "X-small.in";

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
            out.println("Case #" + (i+1) + ": \n" + ans);
            System.err.println("Case #" + (i+1) + ": \n" + ans);
        }
        out.close();
    }

    static class Solver {

        int[][] m;

        public String solve(int testNumber, Scanner in, PrintWriter out) {
            long start = System.currentTimeMillis();

            int N = in.nextInt();
            m = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    m[i][j] = in.nextInt();
                }
            }

            if (N == 1) {
                return "1 1";
            }

            int[] best = null;
            int[] worst = null;
            if (N <= 8) {
                int[] pm = new int[N];
                for (int i = 0; i < pm.length; i++) {
                    pm[i] = i;
                }
                int[][] ret = tor(pm);
                best = ret[0];
                worst = ret[1];
            } else {
                best = new int[16];
                worst = new int[16];
                Arrays.fill(best, 100);

                for (int i = 0; i < (1 << 16); i++) {
                    int bits = 0;
                    for (int j = 0; j < 16; j++) {
                        if ((1<<j & i) > 0) bits++;
                    }
                    if (bits != 8) continue;

                    int ai = 0;
                    int bi = 0;
                    int[] a = new int[8];
                    int[] b = new int[8];
                    for (int j = 0; j < 16; j++) {
                        if ((1<<j & i) > 0) {
                            a[ai++] = j;
                        } else {
                            b[bi++] = j;
                        }
                    }

                    int[][] trA = tor(a);
                    int[][] trB = tor(b);

                    int[] bestA = trA[0];
                    int[] worstA = trA[1];

                    int[] bestB = trB[0];
                    int[] worstB = trB[1];

                    int[] degBestA = degrade(bestA);
                    int[] degWorstA = degrade(worstA);

                    int[] degBestB = degrade(bestB);
                    int[] degWorstB = degrade(worstB);

                    // best and worst update
                    for (int j = 0; j < a.length; j++) {
                        best[a[j]] = Math.min(best[a[j]], degBestA[j]);
                        best[b[j]] = Math.min(best[b[j]], degBestB[j]);

                        worst[a[j]] = Math.max(worst[a[j]], degWorstA[j]);
                        worst[b[j]] = Math.max(worst[b[j]], degWorstB[j]);
                    }

                    // find the best of best
                    List<Integer> bestsInA = getBests(bestA, a);
                    List<Integer> bestsInB = getBests(bestB, b);
                    for (int j = 0; j < bestsInA.size(); j++) {
                        for (int k = 0; k < bestsInB.size(); k++) {
                            Integer xa1 = bestsInA.get(j);
                            Integer xb1 = bestsInB.get(k);
                            if (m[xa1][xb1] == 1) {
                                best[xa1] = Math.min(best[xa1], 1);
                                best[xb1] = Math.min(best[xb1], 2);
                                worst[xa1] = Math.max(worst[xa1], 1);
                                worst[xb1] = Math.max(worst[xb1], 2);
                            } else {
                                best[xb1] = Math.min(best[xb1], 1);
                                best[xa1] = Math.min(best[xa1], 2);
                                worst[xb1] = Math.max(worst[xb1], 1);
                                worst[xa1] = Math.max(worst[xa1], 2);
                            }
                        }
                    }
                }
            }

            String ans = "";
            for (int i = 0; i < N; i++) {
                ans += best[i] + " " + worst[i];
                if (i != N -1) {
                    ans += "\n";
                }
            }

            long end = System.currentTimeMillis();
            System.err.println("time=" + (end - start));

            return ans;
        }

        List<Integer> getBests(int[] best, int[] pm){
            List<Integer> bs = new ArrayList<>();
            for (int i = 0; i < best.length; i++) {
                if (best[i] == 1) {
                    bs.add(pm[i]);
                }
            }
            return bs;
        }

        int[] degrade(int[] orig) {
            int[] deg = new int[orig.length];
            for (int i = 0; i < orig.length; i++) {
                if (orig[i] == 1) deg[i] = 2;
                if (orig[i] == 2) deg[i] = 3;
                if (orig[i] == 3) deg[i] = 5;
                if (orig[i] == 5) deg[i] = 9;
            }
            return deg;
        }

        int[][] tor(int[] pm) {
            int N = pm.length;
            int[] best = new int[N];
            int[] worst = new int[N];
            Arrays.fill(best, 100);

            Permutation p = new Permutation(N-1);
            int[] nx;
            while ((nx = p.nextPermutation()) != null) {
                Queue<Integer> q = new LinkedList<>();
                q.add(0);
                for (int i = 0; i < nx.length; i++) {
                    q.add(nx[i]+1);
                }

                // fight
                int N2 = N;
                while(true) {
                    if (N2 == 1) {
                        // winner
                        int p1 = q.poll().intValue();
                        best[p1] = 1;
                        break;
                    }

                    for (int i = 0; i < N2 / 2; i++) {
                        int p1 = q.poll().intValue();
                        int p2 = q.poll().intValue();
                        if ( m[pm[p1]][pm[p2]] == 1 ) {
                            q.add(p1);
                            best[p2] = Math.min(best[p2], N2 / 2 + 1);
                            worst[p2] = Math.max(worst[p2], N2 / 2 + 1);
                        } else {
                            q.add(p2);
                            best[p1] = Math.min(best[p1], N2 / 2 + 1);
                            worst[p1] = Math.max(worst[p1], N2 / 2 + 1);
                        }
                    }

                    N2 /= 2;
                }
            }

            for (int i = 0; i < N; i++) {
                if (best[i] == 100) {
                    best[i] = worst[i];
                }
                if (worst[i] == 0) {
                    worst[i] = best[i];
                }
            }

            int[][] ret = new int[N][N];
            ret[0] = best;
            ret[1] = worst;
            return ret;
        }
    }

    public static class Permutation {

        private int[] arr;

        private int N;

        private int[] indexes;

        private int pStack = 1;

        public Permutation(int[] arr) {
            init(arr);
        }

        public Permutation(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            init(arr);
        }

        private void init(int[] arr) {
            this.arr = arr;
            N = arr.length;
            indexes = new int[N];
            Arrays.fill(indexes, -1);
        }

        public int[] nextPermutation() {
            if (pStack == -1) {
                // already ran out the permutations
                return null;
            }

            next();

            if (pStack == -1) {
                // just ran out all the permutations
                return null;
            }

            int[] ret = new int[N];
            for (int i = 0; i < N; i++) {
                ret[i] = arr[indexes[i]];
            }

            return ret;
        }

        @Deprecated
        private void next() {
            pStack--;

            while (true) {
                // ran out all the permutations
                if (pStack == -1) break;

                // found the next permutation
                if (pStack == N) break;

                boolean found = false;
                int base = indexes[pStack];
                int nextVal = base + 1;
                for (; nextVal < N; nextVal++) {
                    boolean isUsed = false;
                    for (int j = pStack - 1; j >= 0; j--) {
                        if (indexes[j] == nextVal) isUsed = true;
                    }

                    if (!isUsed) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    indexes[pStack] = nextVal;
                    pStack++;
                } else {
                    indexes[pStack] = -1;
                    pStack--;
                }
            }
        }

    }

}


