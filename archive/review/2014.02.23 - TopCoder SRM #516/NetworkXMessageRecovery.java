package fuku;

/**
 * SRM 516 Div2-3
 *
 * A good problem to learn an implementation of Topological Sort
 *
 * http://ja.wikipedia.org/wiki/%E3%83%88%E3%83%9D%E3%83%AD%E3%82%B8%E3%82%AB%E3%83%AB%E3%82%BD%E3%83%BC%E3%83%88
 *
 * Problem:
 * http://community.topcoder.com/stat?c=problem_statement&pm=11239&rd=14541
 *
 * Editorial:
 * http://apps.topcoder.com/wiki/display/tc/SRM+516
 */
public class NetworkXMessageRecovery {
    public String recover(String[] messages) {
        String ret = "";

        while (true) {
            char best = '{';
            A:
            for (int i = 0; i < messages.length; i++) {
                if (messages[i].length() == 0) continue;

                char c = messages[i].charAt(0);
                for (int j = 0; j < messages.length; j++) {
                    for (int k = 1; k < messages[j].length(); k++) {
                        if (messages[j].charAt(k) == c) continue A;
                    }
                }
                
                best = (char) Math.min((int) c, (int) (best));
            }
            if (best == '{') {
                return ret;
            }

            ret += best;
            for (int i = 0; i < messages.length; i++) {
                if (messages[i].length() != 0 && messages[i].charAt(0) == best) messages[i] = messages[i].substring(1);
            }
        }

    }
}
