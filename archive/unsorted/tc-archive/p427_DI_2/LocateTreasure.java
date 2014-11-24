
package tc.p427_DI_2;

// passed sys test
// implemented after read the editorial
public class LocateTreasure {

    class P {
        int x;
        int y;
        int turn;

        public P(int x, int y, int turn) {
            this.x = x;
            this.y = y;
            this.turn = turn;
        }
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    // 0:direction, 1: kn
    P[][] m = new P[4][10];

    String location(int K, int multi){
        int turn = -1;

        int x = 0;
        int y = 0;
        int kn = 1;
        boolean found = false;
        while(K != 0) {
            K--;
            turn++;

            if (turn != 0) {
                kn *= multi;
                kn = f(kn);
            }

            x += dx[turn % 4] * kn;
            y += dy[turn % 4] * kn;

            System.err.println(x + " " + y);

            if (m[turn % 4][kn] == null || found){
                m[turn % 4][kn] = new P(x, y, turn);
            } else {
                // found the cycle
                found = true;

                P prev = m[turn % 4][kn];

                int x1  = x - prev.x;
                int y1  = y - prev.y;
                int turn1 = turn - prev.turn;

                K %= turn1;
            }
        }

        return x + " " + y;
    }

    int f(int x){
        return (x % 9 == 0) ? 9 : x % 9;
    }


}

