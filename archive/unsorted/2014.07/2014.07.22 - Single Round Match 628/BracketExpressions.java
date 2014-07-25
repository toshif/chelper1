package fuku;

import java.util.LinkedList;

public class BracketExpressions {
    char[] cs = {'(', ')', '[', ']', '{', '}'};
    private int cnt;
    private String expression;

    public String ifPossible(String expression) {
        this.expression = expression;
        cnt = 0;
        for (int i = 0; i < expression.length(); i++) {
            if ( expression.charAt(i) == 'X' ) cnt++;
        }

        boolean v = valid(0, new char[cnt]);

        if (v) {
            return "possible";
        }
        return "impossible";
    }

    boolean valid(int idx, char[] hold){
        if (idx == cnt){
            return check(hold);
        }

        for (int i = 0; i < cs.length; i++) {
            char[] ns = hold.clone();
            ns[idx] = cs[i];
            if ( valid(idx+1, ns) ) {
                return true;
            }
        }

        return false;
    }

    boolean check(char[] hold){
        char[] exp = expression.toCharArray();
        int idx = 0;
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == 'X'){
                exp[i] = hold[idx];
                idx++;
            }
        }

        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < exp.length; i++) {
            char c = exp[i];
            int ind = getIndex(c);

            if (stack.size() == 0){
                stack.add(c);
            } else {
                if (ind % 2 == 0) {
                    stack.add(c);
                } else {
                    char c1 = stack.getLast();
                    int prev = getIndex(c1);
                    if (prev == ind -1) {
                        stack.removeLast();
                    } else {
                        stack.add(c1);
                    }
                }
            }
        }

        return (stack.size() == 0);
    }

    int getIndex(char c){
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == c) return i;
        }
        return -1;
    }
}
