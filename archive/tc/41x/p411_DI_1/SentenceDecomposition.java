
package tc.p411_DI_1;

import java.util.Arrays;

public class SentenceDecomposition {

    int INF = 100000007;

    int decompose(String sentence, String[] validWords){
        int N = sentence.length();
        int[] cost = new int[N+2];
        Arrays.fill(cost, INF);
        cost[0] = 0;

        for (int i = 0; i < N; i++) {
            if (cost[i] == INF) continue;

            for (int j = 0; j < validWords.length; j++) {
                String w = validWords[j];
                if (w.length() + i > N) continue;

                String t = sentence.substring(i, i + w.length());

                if (sortS(t).equals(sortS(w))){
                    int cos = 0;
                    for (int k = 0; k < w.length(); k++) {
                        if ( sentence.charAt(i+k) != w.charAt(k) ) cos++;
                    }

                    cost[i+w.length()] = Math.min(cost[i+w.length()], cost[i] + cos);
                }
            }
        }

        return cost[N] == INF ? -1 : cost[N];
    }

    String sortS(String s){
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        String ws = new String(cs);
        return ws;
    }

}

