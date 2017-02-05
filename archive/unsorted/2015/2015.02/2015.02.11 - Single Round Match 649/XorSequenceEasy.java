package fuku;

public class XorSequenceEasy {
    public int getmax(int[] A, int N) {
        int NA = A.length;
        String ns = Integer.toBinaryString(N);
        int M = ns.length();
        // System.err.printf("ns=%s, M=%s\n", ns, M);

        int totCnt = 0;
        for (int j = 0; j < NA; j++) {
            for (int k = j+1; k < NA; k++) {
                if (A[j] < A[k]) totCnt++;
            }
        }

        int totBit = 0;
        for (int i = 0; i < M; i++) {
            int bit = (1 << (M-1-i));
            int tmpBit = totBit ^ bit;

            int[] C = new int[NA];
            for (int j = 0; j < NA; j++) {
                C[j] = A[j] ^ tmpBit;
            }

            int cnt = 0;
            for (int j = 0; j < NA; j++) {
                for (int k = j+1; k < NA; k++) {
                    if (C[j] < C[k]) cnt++;
                }
            }

            if (cnt > totCnt) {
                totBit = tmpBit;
                totCnt = cnt;
            }
        }

        return totCnt;
    }
}
