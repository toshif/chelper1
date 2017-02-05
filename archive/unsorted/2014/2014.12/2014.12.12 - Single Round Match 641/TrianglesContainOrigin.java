package fuku;

public class TrianglesContainOrigin {
    public long count(int[] x, int[] y) {
        int N = x.length;

        long cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {

                    int ax = x[i], ay = y[i], bx = x[j], by = y[j], cx = x[k], cy = y[k];

                    long cro1 = cro(ax, ay, bx, by);
                    long cro2 = cro(bx, by, cx, cy);
                    long cro3 = cro(cx, cy, ax, ay);

                    if (cro1 * cro2 >= 0 && cro2 * cro3 >= 0 && cro3 * cro1 >= 0) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    long cro(int ax, int ay, int bx, int by){
        long v1x = 0 - ax, v1y = 0 - ay;
        long v2x = bx - ax, v2y = by - ay;

        long cross = v1x * v2y - v2x * v1y;

        return cross;
    }
}
