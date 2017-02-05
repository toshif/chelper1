package fuku;

public class SquareScores {
    public double calcexpectation(int[] p, String s) {
        int M = 'z' - 'a' + 1;
        double[] ps = new double[M];
        for (int i = 0; i < M && p.length > i; i++) {
            ps[i] = 1.0 * p[i] / 100;
        }

        int N = s.length();
        char[] cs = s.toCharArray();

        double[][][] prob = new double[2][M][N+1];
        double[][][] exp = new double[2][M][N+1];

        if (cs[0] == '?') {
            for (int i = 0; i < M; i++) {
                prob[0][i][1] = ps[i];
                // exp[0][i][1] = ps[i];

            }
        } else {
            prob[0][cs[0]-'a'][1] = 1;
            // exp[0][cs[0]-'a'][1] = 1;
        }

        for (int i = 0; i < N-1; i++) {
            int now = i % 2;
            int next = (i+1) % 2;

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    prob[next][j][k] = 0;
                    exp[next][j][k] = 0;
                }
            }

            char nextChar = cs[i+1];

            for (int j = 0; j < M; j++) {
                char c = (char)('a' + j);
                for (int k = 1; k < N; k++) {
                    exp[now][j][k] += prob[now][j][k] * k;

                    if (nextChar != '?') {
                        if (c == nextChar) {
                            prob[next][nextChar - 'a'][k + 1] += prob[now][j][k];
                            exp[next][nextChar - 'a'][k + 1] += exp[now][j][k];

                        } else {
                            prob[next][nextChar - 'a'][1] += prob[now][j][k];
                            exp[next][nextChar - 'a'][1] += exp[now][j][k];
                        }
                    } else {
                        // can be a-z
                        for (int l = 0; l < M; l++) {
                            if (j == l) {
                                prob[next][l][k+1] += prob[now][j][k] * ps[l];
                                exp[next][l][k+1] += exp[now][j][k] * ps[l];
                            } else {
                                prob[next][l][1] += prob[now][j][k] * ps[l];
                                exp[next][l][1] += exp[now][j][k]  * ps[l];
                            }
                        }
                    }

                }
            }
        }

        double e = 0;
        for (int j = 0; j < M; j++) {
            for (int k = 0; k <= N; k++) {
                exp[(N-1)%2][j][k] += prob[(N-1)%2][j][k] * k;
                e += exp[(N-1)%2][j][k];
            }
        }

        return e;
    }
}
