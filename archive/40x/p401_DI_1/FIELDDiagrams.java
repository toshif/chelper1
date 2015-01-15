
package tc.p401_DI_1;

import java.util.HashMap;
import java.util.Map;

public class FIELDDiagrams {

    private int fieldOrder;

    long countDiagrams(int fieldOrder){
        this.fieldOrder = fieldOrder;
        return rec(0, fieldOrder)-1;
    }

    Map<Integer, Long> memo = new HashMap<>();

    long rec(int depth, int max){
        Integer key = Integer.valueOf((depth)*100 + max);
        if (memo.containsKey(key))
            return memo.get(key);

        int fmax = fieldOrder-(depth);
        long sum = 0;
        for (int i = 0; i <= Math.min(fmax, max); i++) {
            if (i == 0) sum++;
            else sum += rec(depth+1, i);
        }

        memo.put(key, sum);

        return sum;
    }

}

