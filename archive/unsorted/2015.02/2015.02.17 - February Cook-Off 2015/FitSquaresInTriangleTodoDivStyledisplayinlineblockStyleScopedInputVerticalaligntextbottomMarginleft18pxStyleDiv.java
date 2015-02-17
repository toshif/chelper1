package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class FitSquaresInTriangleTodoDivStyledisplayinlineblockStyleScopedInputVerticalaligntextbottomMarginleft18pxStyleDiv {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int B = in.nextInt();
        System.err.printf("B=%s\n", B);

        if (B <= 2){
            out.println(0);
            return;
        }

        int n = ( B - 2 ) / 2;
        out.println((n+1) * n / 2);
    }

}
