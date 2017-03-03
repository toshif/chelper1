package fuku;

import utils.io.MyReader;

import java.io.PrintWriter;

public class ACircleAndASquare {
    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int w = in.nextInt();
        int h = in.nextInt();
        int circleX = in.nextInt();
        int circleY = in.nextInt();
        int r = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        if (x1 > x3) {
            int xt = x3;
            int yt = y3;
            x3 = x1;
            y3 = y1;
            x1 = xt;
            y1 = yt;
        }

        boolean[][] g = new boolean[h][w];
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {

                // 1. is in the cricle ?
                {
                    int dx = Math.abs(x - circleX);
                    int dy = Math.abs(y - circleY);
                    int dd = dx * dx + dy * dy;
                    if (dd <= r * r) {
                        g[y][x] = true;
                    }
                }

                // 2. is in the square ?
                {
                    int x3t = x3 - x1;
                    int y3t = y3 - y1;

                    if (x3 == x1 && y3 == y1) {
                        if (x == x1 && y == y1) {
                            g[y][x] = true;
                        }
                        continue;
                    }

                    double d3 = Math.sqrt(x3t * x3t + y3t * y3t);

                    double theta = Math.asin(y3t / d3);
                    double rotateTheta = Math.PI / 4 - theta;

                    // square
                    double x2 = x3t * Math.cos(rotateTheta) - y3t * Math.sin(rotateTheta);
                    double y2 = x3t * Math.sin(rotateTheta) + y3t * Math.cos(rotateTheta);

                    // target point
                    double x4 = (x - x1) * Math.cos(rotateTheta) - (y - y1) * Math.sin(rotateTheta);
                    double y4 = (x - x1) * Math.sin(rotateTheta) + (y - y1) * Math.cos(rotateTheta);

                    double eps = 1E-10;
                    if (-eps < x4 && x4 < x2 + eps && -eps < y4 && y4 < y2 + eps) {
                        g[y][x] = true;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (g[y][x]) {
                    sb.append("#");
                } else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }
        out.print(sb.toString());
    }
}
