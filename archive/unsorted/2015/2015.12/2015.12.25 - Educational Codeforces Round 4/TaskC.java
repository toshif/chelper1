package fuku;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Stack;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] cs = in.nextLine().toCharArray();
        Stack<Character> st = new Stack<>();
        int tot = 0;
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c == '<' || c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else {
                if (st.empty()) {
                    out.print("Impossible");
                    return;
                }
                Character a = st.pop();
                if (match(a, c)) {
                    continue;
                } else {
                    tot++;
                }
            }
        }
        if (!st.empty()) {
            out.print("Impossible");
            return;
        }

        out.println(tot);
    }

    boolean match(char a, char b) {
        if (a == '<' && b == '>') return true;
        if (a == '{' && b == '}') return true;
        if (a == '[' && b == ']') return true;
        if (a == '(' && b == ')') return true;
        return false;
    }
}
