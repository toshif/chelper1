package fuku;

/**
 *
 */
public class PalindromfulString {
    private int N;
    private int M;
    private int K;

    public long count(int N, int M, int K) {
        this.N = N;
        this.M = M;
        this.K = K;

        return find(N, (char)('a'-1), "");
    }

    long find(int rem, char upto, String s){
        //System.out.println("s = " + s);
        if (rem == 0){
            // check if it has enough plaindrome

            int cnt = 0;
            A:
            for (int offset = 0; offset < s.length() && (M-1) + offset < N; offset++) {
                int first = 0 + offset;
                int last = (M-1) + offset;
                for (int i = 0; i < M / 2; i++) {
                    if (s.charAt(first) != s.charAt(last)){
                        continue A;
                    }

                    first++;
                    last--;
                }

                cnt++;
            }

            //System.out.printf("cnt = %s, upto=%s\n",cnt, upto);

            if (cnt >= K){
                long num = 1;
                for (int i = 0; i <= (upto - 'a'); i++) {
                    num *= (26-i);
                }

                //System.out.printf("num = %s\n",num);
                return num;
            } else return 0;
        }

        long tot = 0;
        tot += find(rem-1, (char)(upto+1), s+((char)(upto+1)));
        for (int i = 'a'; i <= upto; i++) {
            tot += find(rem-1, upto, s+(char)i);
        }

        return tot;
    }
}
