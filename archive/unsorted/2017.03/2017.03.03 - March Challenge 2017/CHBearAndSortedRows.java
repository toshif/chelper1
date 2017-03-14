package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class CHBearAndSortedRows {

    private int N;
    private P[] orig;

    class P {
        int x;
        int y;
    }

    class Q {
        int x;
        int y;
        long d;

    }

    boolean[][] used;

    void bfs(int x, int y, int min, int max) {
    }

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        N = in.nextInt();
        int[][] g = new int[N][N];
        used = new boolean[N][N];
        orig = new P[N * N + 10];
        P[] current = new P[N * N + 10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int v = in.nextInt();
                g[i][j] = v;

                P p = new P();
                p.x = i;
                p.y = j;
                orig[v] = p;
            }
        }

        boolean[] rev = new boolean[N];
        for (int i = 0; i < N; i++) {
            int[] row = g[i];
            int[] sorted = row.clone();
            Arrays.sort(sorted);
//            if (dist(row, sorted) < 0) {
            if (i % 2 == 1) {
                reverse(sorted);
                rev[i] = true;
            }
            for (int j = 0; j < N; j++) {
                int v = sorted[j];
                P p = new P();
                p.x = i;
                p.y = j;
                current[v] = p;
            }
            g[i] = sorted;
        }

        for (int q = 0; q < 3; q++) {
            for (int i = 0; i < N; i++) {

                A:
                for (int j = 0; j < N; j++) {
                    int v1 = g[i][j];
                    P p1 = current[v1];

                    if (p1.x == orig[v1].x && p1.y == orig[v1].y) continue;

                    if (Math.abs(p1.x - orig[v1].x) < 30 && Math.abs(p1.y - orig[v1].y) < 30) {
                        continue;
                    }

                    int left = j == 0 ? (rev[i] ? N * N + 1 : 0) : g[i][j - 1];
                    int right = j == N - 1 ? (rev[i] ? 0 : N * N + 1) : g[i][j + 1];

                    int min = Math.min(left, right) + 1;
                    int max = Math.max(left, right) - 1;

                    for (int k = min; k <= max; k++) {
                        // check better
                        P p2 = current[k];
                        int p2x = p2.x;
                        int p2y = p2.y;

                        int left2 = p2y == 0 ? (rev[p2x] ? N * N + 1 : 0) : g[p2x][p2y - 1];
                        int right2 = p2y == N - 1 ? (rev[p2x] ? 0 : N * N + 1) : g[p2x][p2y + 1];

                        if (!(Math.min(left2, right2) < v1 && v1 < Math.max(left2, right2))) continue;

                        long currentDist = dist2(v1, i, j, k, p2.x, p2.y);
                        long nextDist = dist2(v1, p2.x, p2.y, k, i, j);

                        if (nextDist < currentDist) {
                            // swap
                            g[i][j] = k;
                            g[p2.x][p2.y] = v1;

                            current[k].x = i;
                            current[k].y = j;

                            current[v1].x = p2x;
                            current[v1].y = p2y;

                            continue A;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                out.printf("%d ", g[i][j]);
            }
            out.println();
        }

    }

    long dist2(int v1, int x1, int y1, int v2, int x2, int y2) {
        long sum = 0;
        P origP1 = orig[v1];
        sum += (origP1.x - x1) * (origP1.x - x1) + (origP1.y - y1) * (origP1.y - y1);

        P origP2 = orig[v2];
        sum += (origP2.x - x2) * (origP2.x - x2) + (origP2.y - y2) * (origP2.y - y2);

        return sum;
    }

    int dist(int[] r1, int[] r2) {
        long sum = 0;
        long revSum = 0;
        for (int i = 0; i < N; i++) {
            int v = r1[i];
            int idx2 = Arrays.binarySearch(r2, v);
            sum += (i - idx2) * (i - idx2);
            revSum += (i - (N - 1 - idx2)) * (i - (N - 1 - idx2));
        }

        return sum <= revSum ? 1 : -1;
    }

    void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }


}
