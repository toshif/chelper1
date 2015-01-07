
package tc.p406_DI_2;

import java.util.LinkedList;
import java.util.List;

/**
 * impl after read the editorial
 *
 * sys test passed
 */
public class FoldThePaper {

    int getValue(String[] paper){
        int m = paper.length;
        int n = paper[0].split(" ").length;

        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] vs = paper[i].split(" ");
            for (int j = 0; j < vs.length; j++) {
                mat[i][j] = Integer.parseInt(vs[j]);
            }
        }


        boolean[] canm = new boolean[1<<m];
        boolean[] cann = new boolean[1<<n];

        // find the possible permutation for m
        List<Integer> v = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            v.add(1<<i);
        }
        rec(v, canm);
        List<List<Integer>> vm = new LinkedList<>();
        for (int i = 0; i < 1 << m; i++) {
            if (canm[i]) {
                vm.add(toList(i));
            }
        }

        // find the possible permutation for m
        v.clear();
        for (int i = 0; i < n; i++) {
            v.add(1<<i);
        }
        rec(v, cann);
        List<List<Integer>> vn = new LinkedList<>();
        for (int i = 0; i < 1 << n; i++) {
            if (cann[i]) {
                vn.add(toList(i));
            }
        }

        System.err.printf("vm=%s, vn=%s\n", vm.size(), vn.size());

        int ma = -1000_000_000;
        for (List<Integer> vvm : vm) {
            for (List<Integer> vvn : vn) {

                int sum = 0;
                for (Integer m1 : vvm) {
                    for (Integer n1 : vvn) {
                        sum += mat[m1][n1];
                    }
                }

                ma = Math.max(ma, sum);
            }
        }

        return ma;
    }

    void rec(List<Integer> v, boolean[] can){
        int vs = v.size();

        for (int i = 0; i < vs; i++) {
            can[v.get(i)] = true;

            //String s = Integer.toBinaryString(v.get(i));
            //System.err.printf("s=%s\n",s);
        }

        for (int i = 1; i < vs; i++) {
            // fold at i
            LinkedList<Integer> nv = new LinkedList<>();
            int len = Math.max(i, vs-i);
            for (int j = 0; j < len; j++) {
                int val = 0;
                // left
                if (i-1-j >= 0) {
                    val ^= v.get(i-1-j);
                }
                if (i+j < v.size()) {
                    val ^= v.get(i+j);
                }
                nv.add(val);
            }

            rec(nv, can);
        }
    }

    List<Integer> toList(int val){
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < 14; i++) {
            if ((val & (1<<i)) > 0) ret.add(i);
        }
        return ret;
    }

}

