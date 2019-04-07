package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class QualificationRound2019B {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        String ans = solve2(in);
        out.println("Case #" + testNumber + ": " + ans);
    }

    private String solve2(MyReader in) {
        int P = in.nextInt();
        String s = in.nextLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ans.append(s.charAt(i) == 'S' ? 'E' : 'S');
        }
        return ans.toString();
    }

}
