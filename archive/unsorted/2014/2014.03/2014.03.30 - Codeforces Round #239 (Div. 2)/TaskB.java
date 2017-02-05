package fuku;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] cn = in.nextLine().toCharArray();
        char[] cm = in.nextLine().toCharArray();

        A:
        for (int i = 0; i < cm.length; i++) {
            char c = cm[i];
            for (int j = 0; j < cn.length; j++) {
                if (c == cn[j]) continue A;
            }

            out.print(-1);
            return;
        }

        Map<Character, Integer> n = new HashMap<>();
        for (int i = 0; i < cn.length; i++) {
            Character co = Character.valueOf(cn[i]);
            if (!n.containsKey(co)) n.put(co, 1);
            else n.put(co, n.get(co) + 1);
        }

        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < cm.length; i++) {
            Character co = Character.valueOf(cm[i]);
            if (!m.containsKey(co)) m.put(co, 1);
            else m.put(co, m.get(co) + 1);
        }

        int tot = 0;
        for(Map.Entry<Character, Integer> e:m.entrySet()){
            tot += Math.min(e.getValue(), n.get(e.getKey()));
        }

        out.print(tot);

    }
}
