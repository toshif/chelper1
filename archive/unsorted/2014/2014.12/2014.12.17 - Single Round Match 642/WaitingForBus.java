package fuku;

import java.util.LinkedList;
import java.util.List;

public class WaitingForBus {
    private int[] time;
    private int[] prob;
    private int s;
    int N;
    double sum = 0;

    public double whenWillBusArrive(int[] time, int[] prob, int s) {
        int N = time.length;
        double[] p = new double[s+1];
        p[0] = 1;

        for (int i = 0; i <= s; i++) {
            for (int j = 0; j < N; j++) {
                int np = prob[j];
                int t = time[j];

                if (i + t < s){
                    p[i+t] += p[i] * (1.0*np/100);
                } else {
                    sum += p[i] * (1.*np/100) * (i+t - s);
                }
            }
        }

        return sum;
    }

}
