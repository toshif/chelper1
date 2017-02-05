package fuku;

import java.util.Arrays;

public class ColoringRectangle {
    private int width;

    public int chooseDisks(int width, int height, int[] red, int[] blue) {
        this.width = width;
        Arrays.sort(red);
        Arrays.sort(blue);

        double h = height / 2.0;

        double[] reds = new double[red.length];
        double[] blus = new double[blue.length];

        for (int i = 0; i < red.length; i++) {
            double r = red[i] / 2.0;
            double k = r * r - h * h;
            reds[red.length - i - 1] = k > 0 ? 2 * Math.sqrt(r * r - h * h) : -1;
        }
        for (int i = 0; i < blue.length; i++) {
            double r = blue[i] / 2.0;
            double k = r * r - h * h;
            blus[blue.length - i - 1] = k > 0 ? 2 * Math.sqrt(r * r - h * h) : -1;
        }

        System.out.println("reds = " + Arrays.toString(reds));
        System.out.println("blus = " + Arrays.toString(blus));

        int mi =  Math.min(place(reds, blus), place(blus, reds));
        if (mi == 1000_000_000) return -1;

        return mi;
    }

    int place(double[] a, double[] b){
        double w = width;

        int tot = 0;
        int N = Math.min(a.length, b.length);
        for (int i = 0; i < N; i++) {
            w -= a[i];
            tot++;

            if (a[i] < 0) return 1000_000_000;
            if (w <= 0) return tot;

            w -= b[i];
            tot++;

            if (b[i] < 0) return 1000_000_000;
            if (w <= 0) return tot;
        }

        if (a.length > N){
            w -= a[N];
            tot++;

            if (w <= 0) return tot;
        }

        return 1000_000_000;
    }
}
