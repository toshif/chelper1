package fuku;

/**
 * A good problem to learn Conditional Probability.
 *
 * SRM 515 2-3
 *
 * http://community.topcoder.com/stat?c=problem_statement&pm=11510&rd=14540
 *
 * http://apps.topcoder.com/wiki/display/tc/SRM+515
 *
 * System Test Passed
 */
public class NewItemShopTwo {

    int[] n = new int[2];
    int[][] T = new int[2][30];
    int[][] C = new int[2][30];
    double[][] P = new double[2][30];

    double getE(int off, int c){
        double e = 0.0;
        double p = 1;
        for (int i = 0; i < off; i++) {
            p -= P[c][i];
        }
        for (int i = off; i < n[c]; i++) {
            e += C[c][i] * P[c][i]/p;
        }
        return e;
    }

    public double getMaximum(String[] customers) {
        for (int i = 0; i < customers.length; i++) {
            String[] ss = customers[i].split(" ");
            for (int j = 0; j < ss.length; j++) {
                String[] s = ss[j].split(",");
                T[i][j] = Integer.parseInt(s[0]);
                C[i][j] = Integer.parseInt(s[1]);
                P[i][j] = Integer.parseInt(s[2]) * 0.01;
            }
            n[i] = ss.length;
        }

        double e = 0.0;
        int i1 = 0, i2 = 0;
        double p1 = 1.0, p2 = 1.0;
        for (int h = 0; h < 24; h++) {
            // customer 0
            if (h == T[0][i1]){
                double best = Math.max(C[0][i1], getE(i2, 1));
                e += P[0][i1] / p1 * p1 * p2 * best;
                p1 -= P[0][i1];
                i1++;
            }
            // customer 1
            if (h == T[1][i2]){
                double best = Math.max(C[1][i2], getE(i1, 0));
                e += P[1][i2] / p2 * p1 * p2 * best;
                p2 -= P[1][i2];
                i2++;
            }
        }

        return e;
    }
}
