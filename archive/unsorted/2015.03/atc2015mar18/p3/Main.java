package atc2015mar18.p3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        new Solver().solve(in, out);
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();

            LinkedList<Integer>[] edges = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new LinkedList();
            }

            for (int i = 0; i < N - 1; i++) {
                Integer a = Integer.valueOf(in.next())-1;
                Integer b = Integer.valueOf(in.next())-1;

                edges[a].add(b);
                edges[b].add(a);
            }

            int cnt = 0;
            boolean[] visited = new boolean[N];
            PriorityQueue<Integer> q = new PriorityQueue();
            q.add(0);

            while(!q.isEmpty()) {
                Integer node = q.poll();
                visited[node] = true;
                cnt++;
                out.print((node+1));
                if (cnt != N) {
                    out.print(" ");
                }

                for (Integer node2 : edges[node]) {
                    if (visited[node2]) continue;

                    q.add(node2);
                }
            }

            out.println();
        }
    }

}
