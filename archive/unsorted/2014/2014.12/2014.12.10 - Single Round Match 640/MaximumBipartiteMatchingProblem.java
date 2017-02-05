package fuku;

public class MaximumBipartiteMatchingProblem {
    public long solve(int n1, int n2, int ans, int d) {
        long N1 = n1;
        long N2 = n2;
        long ANS = ans;
        long D = d;

        long a1 = ANS;
        long b1 = ANS;
        long a2 = N1 - ANS;
        long b2 = N2 - ANS;

        long ret = 0;

        ret += a1 * N2;
        ret += b1 * N1;
        ret -= ANS;

        ret += a2 * ANS;
        ret += b2 * ANS;

        return ret;
    }
}
