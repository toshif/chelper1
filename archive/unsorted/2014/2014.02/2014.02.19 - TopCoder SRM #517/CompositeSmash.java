package fuku;

import java.util.ArrayList;
import java.util.List;

// System Test Passed
//
// Petr http://community.topcoder.com/stat?c=problem_solution&cr=10574855&rd=14542&pm=11535
//
public class CompositeSmash {
    public String thePossible(int N, int target) {
        if (target > N){
            return "No";
        }
        if (target == N){
            return "Yes";
        }

        if (N % target != 0){
            return "No";
        }

        List<Long> Nf = factor((long)N);
        List<Long> tf = factor((long)target);

        if ( tf.size() == 1 ){
            // prime number
            return "Yes";
        }

        if ( tf.size() == 2 && tf.get(0) == tf.get(1)){
            for (int i = 0; i < Nf.size(); i++) {
                if (Nf.get(i) != tf.get(0)){
                    return "No";
                }
            }
            return "Yes";
        }

        return "No";
    }

    static List<Long> factor(Long n) {
        List<Long> ret = new ArrayList<Long>();

        final long max = (long) Math.sqrt(n);
        long quotient = n;
        long divisor = 2;
        while (quotient >= divisor && divisor <= max) {
            if (quotient % divisor == 0) {
                ret.add(divisor);
                quotient /= divisor;
                continue;
            }

            divisor++;
        }
        if (quotient > 1) {
            ret.add(quotient);
        }

        return ret;
    }
}
