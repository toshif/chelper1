package fuku;

public class BoardFolding {
    private int n;
    private int m;
    private String[] compressedPaper;
    private int[][] p;

    public int howMany(int N, int M, String[] compressedPaper) {
        n = N;
        m = M;
        this.compressedPaper = compressedPaper;

        p = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                p[i][j] = ((tonum(compressedPaper[i].charAt(j / 6))) >> (j % 6)) % 2;
            }
        }

        int ret = 1;

        for (int i = 0; i < 4; i++) {
            ret *= fold(0);
            rotate();
        }

        return ret;
    }

    void rotate(){
        int tn = n;
        n = m;
        m = tn;

        int[][] prev = p;
        p = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                p[j][m-i-1] = prev[i][j];
            }
        }
    }

    int tonum(char c){
        int r = 0;
// the characters '0'-'9' map to integers 0-9, 'a'-'z' map to 10-35,
// 'A'-'Z' map to 36-61, '#' maps to 62, and '@' maps to 63.
        if ('0' <= c && c <= '9') r = c - '0';
        if ('a' <= c && c <= 'z') r = c - 'a' + 10;
        if ('A' <= c && c <= 'Z') r = c - 'A' + 36;
        if (c == '#') r = 62;
        if (c == '@') r = 63;

        return r;
    }

    int fold(int top){
        int sum = 0;
        int remain = n - top;
        for (int i = 1; i <= (remain+1) / 2; i++) {
            // if ok
            if (check(top+i, i)) {
                sum += fold(i);
            }
        }
        return sum+1;
    }

    boolean check(int top, int size){
        for (int i = top-1; i >= (top - size); i--) {
            int ti = (top - i -1) + top;
            for (int j = 0; j < m; j++) {
                if (p[i][j] == p[ti][j]) {
                    // ok
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
