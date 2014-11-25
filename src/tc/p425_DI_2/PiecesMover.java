
package tc.p425_DI_2;

import java.util.*;

public class PiecesMover {

    class P {
        int pos;
        int turn;

        public P(int pos, int turn) {
            this.pos = pos;
            this.turn = turn;
        }
    }

    Set<Integer> visited = new HashSet<>();
    LinkedList<P> q = new LinkedList<>();
    int N = 5;

    int getMinimumMoves(String[] board){
        int pos = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ( board[i].charAt(j) == '*') {
                    pos += (1 << (5*i + j));
                }
            }
        }


        int turn = 0;
        while (!q.isEmpty()) {
            P p = q.pop();

        }

        return 0;
    }

    void go(P p){
        q.add(p);
        visited.add(Integer.valueOf(p.pos));
    }

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    void move(P p){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

            }
        }
        for (int i = 0; i < 4; i++) {

        }
    }

}

