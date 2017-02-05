package fuku;

import java.util.Arrays;

public class AB {
    public String createString(int N, int K) {
        for (int nb = 0; nb <= N; nb++) {
            int[] v = new int[N];
            Arrays.fill(v, 0);
            for (int i = 0; i < nb; i++) {
                v[i] = 1;
            }

            boolean ok = false;
            int cnt = 0;
            A:
            while(true) {
                boolean found = false;

                for (int i = 0; i < N-1; i++) {
                    if (v[i] == 1 && v[i+1] == 0) {
                        // BA
                        v[i] = 0;
                        v[i+1] = 1;
                        cnt++;
                        found = true;

                        if (cnt == K) {
                            ok = true;
                            break A;
                        }
                    }
                }

                if (!found) break;
            }

            if (ok) {
                char[] cs = new char[N];
                for (int i = 0; i < N; i++) {
                    if (v[i] == 0) cs[i] = 'A';
                    else cs[i] = 'B';
                }
                return new String(cs);
            }

        }

        return "";
    }
}
