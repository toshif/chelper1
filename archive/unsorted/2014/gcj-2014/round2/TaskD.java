package gcj.round2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author fuku
 */
public class TaskD {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskD.class.getResourceAsStream("D-small-attempt1.in");
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(new FileOutputStream("./out.txt"));

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + (i + 1));
            SolD solver = new SolD();
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i + 1) + ": " + ans);
            System.out.println("Case #" + (i + 1) + ": " + ans);
        }
        out.close();
    }
}

class SolD {

    int M;
    int N;
    List<String> S;

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        M = in.nextInt();
        N = in.nextInt();
        in.nextLine();
        S = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            S.add(in.nextLine());
        }

        List<List<Integer>> tries = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tries.add(new ArrayList<Integer>());
        }
        assign(0, 0, tries);

        String ans = ma + " " + m.get(Integer.valueOf(ma));
        return ans;
    }

    Map<Integer, Integer> m = new HashMap<>();
    int ma = 0;

    void assign(int a, int next, List<List<Integer>> tries) {

        if (a == M) {
            /*
            Collections.sort(tries, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    if (o1.size() - o2.size() == 0) {
                        if (o1.size() == 0) return 0;
                        return o1.get(0) - o2.get(0);
                    }
                    return o1.size() - o2.size();
                }
            });

            String t = "";
            for (int i = 0; i < N; i++) {
                t += tries.get(i);
            }
            set.add(t);
            */

            for (int i = 0; i < N; i++) {
                if ( tries.get(i).size() == 0 ) {
                    // invalid
                    return;
                }
            }

            System.out.printf("a=%s,next=%s, tries=%s\n", a, next, tries);

            // construct trie
            int totNodes = constr(tries);
            System.out.println("totNodes = " + totNodes);

            Integer k = Integer.valueOf(totNodes);
            if (!m.containsKey(k)){
                m.put(k, 0);
            }
            m.put(k, m.get(k) + 1);
            ma = Math.max(ma, totNodes);

            return;
        }

        for (int i = 0; i <= next; i++) {
            List<List<Integer>> cl = clone(tries);
            cl.get(i).add(a);
            assign(a + 1, next, cl);
        }

        if (next < N - 1) {
            List<List<Integer>> cl = clone(tries);
            cl.get(next + 1).add(a);
            assign(a + 1, next + 1, cl);
        }
    }

    int constr(List<List<Integer>> tries){
        int tot = 0;
        for (int i = 0; i < N; i++) {
            int cnt = createTrie(tries.get(i));
            tot += cnt;
        }
        return tot;
    }

    class Node {
        Node[] cs = new Node[30];
    }

    int createTrie(List<Integer> ss){
        int cnt = 1;
        Node root = new Node();
        for (Integer si : ss) {
            String sv = S.get(si);
            //System.out.println("sv = " + sv);
            Node now = root;
            for (int i = 0; i < sv.length(); i++) {
                char c = sv.charAt(i);
                if (now.cs[c - 'A'] == null) {
                    now.cs[c - 'A'] = new Node();
                    cnt++;
                }
                now = now.cs[c - 'A'];
            }
        }

        //System.out.println("cnt = " + cnt);

        return cnt;
    }

    List<List<Integer>> clone(List<List<Integer>> tries) {
        List<List<Integer>> newT = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> na = new ArrayList<>();
            newT.add(na);
            List<Integer> source = tries.get(i);
            for (Integer s : source) {
                na.add(s);
            }
        }
        return newT;
    }
}
