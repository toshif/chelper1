package gcj.qual;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author fuku
 */
public class TaskA {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = TaskA.class.getResourceAsStream("A-small-attempt0.in");
        Scanner in = new Scanner(inputStream);
        Task solver = new Task();

        PrintWriter out = new PrintWriter(new FileOutputStream("./out.txt"));

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("------------------");
            System.out.println("test " + i);
            String ans = solver.solve(i, in, out);
            out.println("Case #" + (i+1) + ": " + ans);
            System.out.println("Case #" + (i+1) + ": " + ans);
        }
        out.close();
    }
}

class Task {

    public String solve(int testNumber, Scanner in, PrintWriter out) {
        int first = in.nextInt();
        Set<Integer> s1 = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int v = in.nextInt();
                if (i + 1 == first) s1.add(Integer.valueOf(v));
            }
        }

        int second = in.nextInt();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int v = in.nextInt();
                if (i + 1 == second) s2.add(Integer.valueOf(v));
            }
        }

        s1.retainAll(s2);
        s2.retainAll(s1);

        String ans = "";
        if (s2.size() == 1) ans = "" + s2.iterator().next();
        else if (s2.size() == 0) ans = "Volunteer cheated!";
        else ans = "Bad magician!";

        return ans;
    }
}
