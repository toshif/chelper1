package fuku;
// System Test Passed
public class MissingParentheses {
    public int countCorrections(String par) {
        char[] c = par.toCharArray();
        boolean[] used = new boolean[c.length];

        int rTot = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ')') rTot++;
        }

        int tot = 0;
        int plus = 0;
        A:
        while (tot < rTot) {
            for (int i = 0; i < c.length; i++) {
                if (used[i]){
                    continue;
                }
                if (c[i] == ')'){
                    used[i] = true;
                    tot++;
                    for (int j = i-1; j >= 0; j--) {
                        if (c[j] == '(' && !used[j]){
                            used[j] = true;
                            continue A;
                        }
                    }
                    // if coundnt find
                    plus++;
                    continue A;
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' && !used[i]) plus++;
        }

        return plus;
    }
}
