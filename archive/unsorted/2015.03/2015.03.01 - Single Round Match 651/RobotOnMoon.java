package fuku;

public class RobotOnMoon {
    public int longestSafeCommand(String[] board) {
        int N = board.length;
        int M = board[0].length();

        int sx = 0;
        int sy = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i].charAt(j) == 'S') {
                    sx = i; sy = j;
                }
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int tot = 0;
        A:
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 100; j++) {
                int x = sx + dx[i] * j;
                int y = sy + dy[i] * j;

                if ( x < 0 || N <= x || y < 0 || M <= y ) {
                    tot += (j-1);
                    continue A;
                }

                if (board[x].charAt(y) == '#') return -1;
            }
        }

        return tot;
    }
}
