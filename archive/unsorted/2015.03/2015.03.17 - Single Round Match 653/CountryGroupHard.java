package fuku;

import java.util.LinkedList;

public class CountryGroupHard {
    LinkedList<Integer> b;
    int N = 0;

    public String solve(int[] a) {
        b = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }

        while(b.size() > 0) {
            Integer f1 = b.get(0);
            if (f1 != 0) {
                for (int i = 0; i < f1; i++) {
                    b.removeFirst();
                }
            } else break;
        }

        if (b.size() == 0) {
            return "Sufficient";
        }

        while(b.size() > 0) {
            Integer f2 = b.getLast();
            if (f2 != 0) {
                for (int i = 0; i < f2; i++) {
                    b.removeLast();
                }
            } else break;
        }

        if (b.size() == 0) {
            return "Sufficient";
        }

        N = b.size();

        long tot = 0;
        for (int i = 1; i <= b.size(); i++) {
            tot += count(0, i);
        }

        if (tot == 1) {
            return "Sufficient";
        }

        return "Insufficient";
    }

    long count(int i, int num) {
        // System.err.printf("i=%s, num=%s\n", i, num);

        if (!isPossible(i, num)) return 0;

        long tot = 0;
        int i2 = i + num;

        if (i2 == N) return 1;

        for (int j = 1; j < (N - i2 + 2); j++) {
            tot += count(i2, j);
        }
        return tot;
    }

    boolean isPossible(int i, int num) {
        if (b.get(i) != 0) {
            if (b.get(i) != num) return false;
        }

        if (i + (num-1) > N-1) return false;

        for (int j = 0; j < num; j++) {
            Integer v = b.get(i + j);
            if (v != 0 && v != num) return false;
        }

        return true;
    }
}
