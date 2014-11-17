
package tc.p422_DI_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// passed sys test
public class CavePassage {

    private int[] travelersWeights;
    private int[] travelersTimes;
    private String[] trustTable;
    private int bridgeStrength;

    int N;

    class P {
        int side; // 0: entrance, 1: exit
        int state; // state 2^13
        int time;

        public P(int side, int state, int time) {
            this.side = side;
            this.state = state;
            this.time = time;
        }
    }

    int minimalTime(int[] travelersWeights, int[] travelersTimes, String[] trustTable, int bridgeStrength){
        this.travelersWeights = travelersWeights;
        this.travelersTimes = travelersTimes;
        this.trustTable = trustTable;
        this.bridgeStrength = bridgeStrength;

        N = travelersWeights.length;
        int M = (1<<N)-1;

        canMove = new boolean[1<<N];
        speed = new int[1<<N];

        for (int m = 0; m < (1<<N); m++) {
            canMove[m] = _canMove(m);
            speed[m] = _speed(m);
        }

        int[][] timet = new int[2][1<<N];
        for (int i = 0; i < 2; i++) {
            Arrays.fill(timet[i], 987654321);
        }

        Queue<P> queue = new LinkedList<>();
        queue.add(new P(0, (1<<N)-1, 0));
        while(!queue.isEmpty()) {
            P p = queue.poll();
            int movable = p.state;
            int otherside = ~movable & M;
            for (int m = movable; m != 0; m = (m-1) & movable) {
                if (!canMove[m]) continue;

                int side2 = (p.side + 1) % 2;
                int state2 = otherside | m;
                int time2 = p.time + speed[m];

                if (timet[side2][state2] <= time2) {
                    // already achieved with a better time
                    continue;
                }
                timet[side2][state2] = time2;

                P p2 = new P(side2, state2, time2);
                queue.add(p2);
            }
        }

        if (timet[1][(1<<N)-1] == 987654321) return -1;

        return timet[1][(1<<N)-1];
    }

    boolean[] canMove;

    boolean _canMove(int m){
        int totW = 0;
        boolean trust = true;
        int numOfppl = 0;
        for (int i = 0; i < N; i++) {
            if ((m & (1 << i)) > 0) {
                numOfppl++;
                totW += travelersWeights[i];

                boolean atleastOneTrust = false;
                for (int j = 0; j < N; j++) {
                    if (i == j) continue;
                    if ((m & (1<<j)) > 0 && trustTable[i].charAt(j) == 'Y') atleastOneTrust = true;
                }

                if (!atleastOneTrust) trust = false;
            }
        }

        if (numOfppl > 1 && !trust) return false;

        return totW <= bridgeStrength;
    }

    int[] speed;

    int _speed(int m){
        int ma = 0;
        for (int i = 0; i < N; i++) {
            if ((m & (1 << i)) > 0) {
                ma = Math.max(ma, travelersTimes[i]);
            }
        }

        return ma;
    }

}

