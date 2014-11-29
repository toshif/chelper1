
package tc.p425_DI_2;

import java.util.*;

// passed sys test
// implemmeted after read the editorial
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
    int M = 0;

    int getMinimumMoves(String[] board){
        int pos = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ( board[i].charAt(j) == '*') {
                    pos += (1 << (5*i + j));
                    M++;
                }
            }
        }
        go(new P(pos, 0));

        while (!q.isEmpty()) {
            P p = q.pop();
            move(p);
            boolean done = dfs(p);
            if (done) {
                return p.turn;
            }
        }

        return 0;
    }

    void go(P p){
        Integer pos = Integer.valueOf(p.pos);
        if (visited.contains(pos)) return;

        q.add(p);
        visited.add(pos);
    }

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    void move(P p){
        int prev = p.pos;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ( isOn(prev, i, j) ) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (!within(nx) || !within(ny)) continue;
                        if (isOn(prev, nx, ny)) continue;

                        int pos = prev ^ (1 << (5*i + j)) ^ (1 << (5*nx + ny));
                        go(new P(pos, p.turn + 1));
                    }
                }
            }
        }
    }

    boolean isOn(int pos, int i, int j) {
        return ((1 << (5*i + j)) & pos) > 0;
    }

    boolean within(int i) {
        return (0 <= i && i < N);
    }

    int cnt = 0;
    boolean[][] visited_dfs;

    boolean dfs(P p){
        cnt = 0;
        visited_dfs = new boolean[N][N];

        A:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (isOn(p.pos, i, j)) {
                    dfs1(p, i, j);
                    break A;
                }
            }
        }

        return (cnt == M);
    }

    void dfs1(P p, int i, int j){
        visited_dfs[i][j] = true;
        cnt++;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if (!within(nx) || !within(ny)) continue;
            if (visited_dfs[nx][ny]) continue;

            if (isOn(p.pos, nx, ny)) {
                dfs1(p, nx, ny);
            }
        }
    }

}

